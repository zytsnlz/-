package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.LicenseImageCompany;
import cn.edu.ncst.car.mbg.model.LicenseImageCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseImageCompanyMapper {
    long countByExample(LicenseImageCompanyExample example);

    int deleteByExample(LicenseImageCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LicenseImageCompany record);

    int insertSelective(LicenseImageCompany record);

    List<LicenseImageCompany> selectByExample(LicenseImageCompanyExample example);

    LicenseImageCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LicenseImageCompany record, @Param("example") LicenseImageCompanyExample example);

    int updateByExample(@Param("record") LicenseImageCompany record, @Param("example") LicenseImageCompanyExample example);

    int updateByPrimaryKeySelective(LicenseImageCompany record);

    int updateByPrimaryKey(LicenseImageCompany record);
}