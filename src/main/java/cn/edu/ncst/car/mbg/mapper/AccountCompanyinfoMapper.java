package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.AccountCompanyinfo;
import cn.edu.ncst.car.mbg.model.AccountCompanyinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountCompanyinfoMapper {
    long countByExample(AccountCompanyinfoExample example);

    int deleteByExample(AccountCompanyinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountCompanyinfo record);

    int insertSelective(AccountCompanyinfo record);

    List<AccountCompanyinfo> selectByExampleWithBLOBs(AccountCompanyinfoExample example);

    List<AccountCompanyinfo> selectByExample(AccountCompanyinfoExample example);

    AccountCompanyinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountCompanyinfo record, @Param("example") AccountCompanyinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") AccountCompanyinfo record, @Param("example") AccountCompanyinfoExample example);

    int updateByExample(@Param("record") AccountCompanyinfo record, @Param("example") AccountCompanyinfoExample example);

    int updateByPrimaryKeySelective(AccountCompanyinfo record);

    int updateByPrimaryKeyWithBLOBs(AccountCompanyinfo record);

    int updateByPrimaryKey(AccountCompanyinfo record);
}