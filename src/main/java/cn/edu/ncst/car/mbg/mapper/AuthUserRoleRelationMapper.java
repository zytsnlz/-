package cn.edu.ncst.car.mbg.mapper;

import cn.edu.ncst.car.mbg.model.AuthUserRoleRelation;
import cn.edu.ncst.car.mbg.model.AuthUserRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthUserRoleRelationMapper {
    long countByExample(AuthUserRoleRelationExample example);

    int deleteByExample(AuthUserRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthUserRoleRelation record);

    int insertSelective(AuthUserRoleRelation record);

    List<AuthUserRoleRelation> selectByExample(AuthUserRoleRelationExample example);

    AuthUserRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuthUserRoleRelation record, @Param("example") AuthUserRoleRelationExample example);

    int updateByExample(@Param("record") AuthUserRoleRelation record, @Param("example") AuthUserRoleRelationExample example);

    int updateByPrimaryKeySelective(AuthUserRoleRelation record);

    int updateByPrimaryKey(AuthUserRoleRelation record);
}