package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.AuthPermission;
import cn.edu.ncst.car.mbg.model.AuthPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthPermissionMapper {
    long countByExample(AuthPermissionExample example);

    int deleteByExample(AuthPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthPermission record);

    int insertSelective(AuthPermission record);

    List<AuthPermission> selectByExample(AuthPermissionExample example);

    AuthPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuthPermission record, @Param("example") AuthPermissionExample example);

    int updateByExample(@Param("record") AuthPermission record, @Param("example") AuthPermissionExample example);

    int updateByPrimaryKeySelective(AuthPermission record);

    int updateByPrimaryKey(AuthPermission record);
}