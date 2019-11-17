package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.MessageInform;
import cn.edu.ncst.car.mbg.model.MessageInformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageInformMapper {
    long countByExample(MessageInformExample example);

    int deleteByExample(MessageInformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageInform record);

    int insertSelective(MessageInform record);

    List<MessageInform> selectByExample(MessageInformExample example);

    MessageInform selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageInform record, @Param("example") MessageInformExample example);

    int updateByExample(@Param("record") MessageInform record, @Param("example") MessageInformExample example);

    int updateByPrimaryKeySelective(MessageInform record);

    int updateByPrimaryKey(MessageInform record);
}