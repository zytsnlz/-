package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.LicenseApplyinfo;
import cn.edu.ncst.car.mbg.model.LicenseApplyinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseApplyinfoMapper {
    long countByExample(LicenseApplyinfoExample example);

    int deleteByExample(LicenseApplyinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LicenseApplyinfo record);

    int insertSelective(LicenseApplyinfo record);

    List<LicenseApplyinfo> selectByExample(LicenseApplyinfoExample example);

    LicenseApplyinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LicenseApplyinfo record, @Param("example") LicenseApplyinfoExample example);

    int updateByExample(@Param("record") LicenseApplyinfo record, @Param("example") LicenseApplyinfoExample example);

    int updateByPrimaryKeySelective(LicenseApplyinfo record);

    int updateByPrimaryKey(LicenseApplyinfo record);
}