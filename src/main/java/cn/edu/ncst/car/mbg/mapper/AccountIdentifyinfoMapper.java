package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.AccountIdentifyinfo;
import cn.edu.ncst.car.mbg.model.AccountIdentifyinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountIdentifyinfoMapper {
    long countByExample(AccountIdentifyinfoExample example);

    int deleteByExample(AccountIdentifyinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountIdentifyinfo record);

    int insertSelective(AccountIdentifyinfo record);

    List<AccountIdentifyinfo> selectByExample(AccountIdentifyinfoExample example);

    AccountIdentifyinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountIdentifyinfo record, @Param("example") AccountIdentifyinfoExample example);

    int updateByExample(@Param("record") AccountIdentifyinfo record, @Param("example") AccountIdentifyinfoExample example);

    int updateByPrimaryKeySelective(AccountIdentifyinfo record);

    int updateByPrimaryKey(AccountIdentifyinfo record);
}