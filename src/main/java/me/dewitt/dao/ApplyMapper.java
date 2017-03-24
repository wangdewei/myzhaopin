package me.dewitt.dao;

import java.util.List;
import me.dewitt.pojo.ApplyExample;
import me.dewitt.pojo.ApplyKey;
import org.apache.ibatis.annotations.Param;

public interface ApplyMapper {
    int countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(ApplyKey key);

    int insert(ApplyKey record);

    int insertSelective(ApplyKey record);

    List<ApplyKey> selectByExample(ApplyExample example);

    int updateByExampleSelective(@Param("record") ApplyKey record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") ApplyKey record, @Param("example") ApplyExample example);
}