package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.PassLicenseType;
import cn.edu.ncst.car.mbg.model.PassLicenseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PassLicenseTypeMapper {
    long countByExample(PassLicenseTypeExample example);

    int deleteByExample(PassLicenseTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PassLicenseType record);

    int insertSelective(PassLicenseType record);

    List<PassLicenseType> selectByExample(PassLicenseTypeExample example);

    PassLicenseType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PassLicenseType record, @Param("example") PassLicenseTypeExample example);

    int updateByExample(@Param("record") PassLicenseType record, @Param("example") PassLicenseTypeExample example);

    int updateByPrimaryKeySelective(PassLicenseType record);

    int updateByPrimaryKey(PassLicenseType record);
}