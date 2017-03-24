package me.dewitt.dao;

import java.util.List;
import me.dewitt.pojo.JobApply;
import me.dewitt.pojo.JobApplyExample;
import me.dewitt.pojo.JobApplyWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface JobApplyMapper {
    int countByExample(JobApplyExample example);

    int deleteByExample(JobApplyExample example);

    int insert(JobApplyWithBLOBs record);

    int insertSelective(JobApplyWithBLOBs record);

    List<JobApplyWithBLOBs> selectByExampleWithBLOBs(JobApplyExample example);

    List<JobApply> selectByExample(JobApplyExample example);

    int updateByExampleSelective(@Param("record") JobApplyWithBLOBs record, @Param("example") JobApplyExample example);

    int updateByExampleWithBLOBs(@Param("record") JobApplyWithBLOBs record, @Param("example") JobApplyExample example);

    int updateByExample(@Param("record") JobApply record, @Param("example") JobApplyExample example);
}