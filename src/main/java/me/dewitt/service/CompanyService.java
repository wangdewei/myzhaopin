package me.dewitt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import me.dewitt.dao.CompanyMapper;
import me.dewitt.pojo.Company;
import me.dewitt.pojo.CompanyExample;

@Service
public class CompanyService {
	
	@Resource
	CompanyMapper companyDao;
	
	public boolean insertCompany(Company company)
	{
		company.setPasswd(DigestUtils.md5DigestAsHex(company.getPasswd().getBytes()));
		if(1 == companyDao.insertSelective(company))
			return true;
		else
			return false;
	}
	
	public Company getCompanyByAccountAndPasswd(Company company)
	{
		company.setPasswd(DigestUtils.md5DigestAsHex(company.getPasswd().getBytes()));
		CompanyExample example = new CompanyExample();
		example.createCriteria().andAccountEqualTo(company.getAccount())
								.andPasswdEqualTo(company.getPasswd());
		List<Company> companys = companyDao.selectByExample(example);
		if(1 == companys.size())
			return companys.get(0);
		else
			return null;
	}
}
