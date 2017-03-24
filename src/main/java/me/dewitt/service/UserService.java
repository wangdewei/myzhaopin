package me.dewitt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import me.dewitt.dao.UserMapper;
import me.dewitt.pojo.User;
import me.dewitt.pojo.UserExample;

@Service
public class UserService {
	
	@Resource
	UserMapper userDao;
	
	public boolean insertUser(User user)
	{
		user.setPasswd(DigestUtils.md5DigestAsHex(user.getPasswd().getBytes()));
		if(userDao.insertSelective(user) == 1)
			return true;
		else
			return false;
	}
	
	public User getUserByUsernameAndPasswd(User user)
	{
		user.setPasswd(DigestUtils.md5DigestAsHex(user.getPasswd().getBytes()));
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(user.getUserName())
								.andPasswdEqualTo(user.getPasswd());
		List<User> users = userDao.selectByExample(example); 
		if(users.size() == 1)
			return users.get(0);
		else
			return null;
	}
}
