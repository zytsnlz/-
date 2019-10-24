package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.AuthRolePermissionRelation;
import cn.edu.ncst.car.mbg.model.AuthRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRolePermissionRelationMapper {
    long countByExample(AuthRolePermissionRelationExample example);

    int deleteByExample(AuthRolePermissionRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthRolePermissionRelation record);

    int insertSelective(AuthRolePermissionRelation record);

    List<AuthRolePermissionRelation> selectByExample(AuthRolePermissionRelationExample example);

    AuthRolePermissionRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthRolePermissionRelation record, @Param("example") AuthRolePermissionRelationExample example);

    int updateByExample(@Param("record") AuthRolePermissionRelation record, @Param("example") AuthRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(AuthRolePermissionRelation record);

    int updateByPrimaryKey(AuthRolePermissionRelation record);
}