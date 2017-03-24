package me.dewitt.dao;

import java.util.List;
import me.dewitt.pojo.Resume;
import me.dewitt.pojo.ResumeExample;
import me.dewitt.pojo.ResumeWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface ResumeMapper {
    int countByExample(ResumeExample example);

    int deleteByExample(ResumeExample example);

    int deleteByPrimaryKey(Integer resumeId);

    int insert(ResumeWithBLOBs record);

    int insertSelective(ResumeWithBLOBs record);

    List<ResumeWithBLOBs> selectByExampleWithBLOBs(ResumeExample example);

    List<Resume> selectByExample(ResumeExample example);

    ResumeWithBLOBs selectByPrimaryKey(Integer resumeId);

    int updateByExampleSelective(@Param("record") ResumeWithBLOBs record, @Param("example") ResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") ResumeWithBLOBs record, @Param("example") ResumeExample example);

    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByPrimaryKeySelective(ResumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ResumeWithBLOBs record);

    int updateByPrimaryKey(Resume record);
}