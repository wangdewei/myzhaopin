package me.dewitt.dao;

import java.util.List;
import me.dewitt.pojo.JobDetail;
import me.dewitt.pojo.JobDetailExample;
import me.dewitt.pojo.JobDetailWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface JobDetailMapper {
    int countByExample(JobDetailExample example);

    int deleteByExample(JobDetailExample example);

    int insert(JobDetailWithBLOBs record);

    int insertSelective(JobDetailWithBLOBs record);

    List<JobDetailWithBLOBs> selectByExampleWithBLOBs(JobDetailExample example);

    List<JobDetail> selectByExample(JobDetailExample example);

    int updateByExampleSelective(@Param("record") JobDetailWithBLOBs record, @Param("example") JobDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") JobDetailWithBLOBs record, @Param("example") JobDetailExample example);

    int updateByExample(@Param("record") JobDetail record, @Param("example") JobDetailExample example);
}