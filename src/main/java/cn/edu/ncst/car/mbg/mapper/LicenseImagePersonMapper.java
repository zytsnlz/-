package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.LicenseImagePerson;
import cn.edu.ncst.car.mbg.model.LicenseImagePersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseImagePersonMapper {
    long countByExample(LicenseImagePersonExample example);

    int deleteByExample(LicenseImagePersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LicenseImagePerson record);

    int insertSelective(LicenseImagePerson record);

    List<LicenseImagePerson> selectByExample(LicenseImagePersonExample example);

    LicenseImagePerson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LicenseImagePerson record, @Param("example") LicenseImagePersonExample example);

    int updateByExample(@Param("record") LicenseImagePerson record, @Param("example") LicenseImagePersonExample example);

    int updateByPrimaryKeySelective(LicenseImagePerson record);

    int updateByPrimaryKey(LicenseImagePerson record);
}