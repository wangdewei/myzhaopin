package me.dewitt.dao;

import java.util.List;
import me.dewitt.pojo.Industry;
import me.dewitt.pojo.IndustryExample;
import org.apache.ibatis.annotations.Param;

public interface IndustryMapper {
    int countByExample(IndustryExample example);

    int deleteByExample(IndustryExample example);

    int deleteByPrimaryKey(String industryName);

    int insert(Industry record);

    int insertSelective(Industry record);

    List<Industry> selectByExample(IndustryExample example);

    int updateByExampleSelective(@Param("record") Industry record, @Param("example") IndustryExample example);

    int updateByExample(@Param("record") Industry record, @Param("example") IndustryExample example);
}