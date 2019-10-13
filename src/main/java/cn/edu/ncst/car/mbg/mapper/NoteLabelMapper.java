package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.NoteLabel;
import cn.edu.ncst.car.mbg.model.NoteLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoteLabelMapper {
    long countByExample(NoteLabelExample example);

    int deleteByExample(NoteLabelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoteLabel record);

    int insertSelective(NoteLabel record);

    List<NoteLabel> selectByExample(NoteLabelExample example);

    NoteLabel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NoteLabel record, @Param("example") NoteLabelExample example);

    int updateByExample(@Param("record") NoteLabel record, @Param("example") NoteLabelExample example);

    int updateByPrimaryKeySelective(NoteLabel record);

    int updateByPrimaryKey(NoteLabel record);
}