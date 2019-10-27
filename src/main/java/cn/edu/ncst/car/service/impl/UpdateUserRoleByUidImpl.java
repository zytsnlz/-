package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.mbg.mapper.AuthUserRoleRelationMapper;
import cn.edu.ncst.car.mbg.model.AuthUserRoleRelation;
import cn.edu.ncst.car.mbg.model.AuthUserRoleRelationExample;
import cn.edu.ncst.car.service.UpdateUserRoleByUid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpdateUserRoleByUidImpl implements UpdateUserRoleByUid {

    @Autowired
    AuthUserRoleRelationMapper userRoleRelationMapper;

    @Override
    public void updateUserRoleByUid(Integer userId, Integer userType) {

        AuthUserRoleRelationExample roleRelationExample = new AuthUserRoleRelationExample();
        AuthUserRoleRelationExample.Criteria criteria = roleRelationExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<AuthUserRoleRelation> list = userRoleRelationMapper.selectByExample(roleRelationExample);
        AuthUserRoleRelation authUserRoleRelation = list.get(0);
        authUserRoleRelation.setRoleId(userType);
        userRoleRelationMapper.updateByExample(authUserRoleRelation,roleRelationExample);
    }

    @Override
    public int selectUserRoleByUid(Integer uid) {

        AuthUserRoleRelationExample roleRelationExample = new AuthUserRoleRelationExample();
        AuthUserRoleRelationExample.Criteria criteria = roleRelationExample.createCriteria();
        criteria.andUserIdEqualTo(uid);
        List<AuthUserRoleRelation> list = userRoleRelationMapper.selectByExample(roleRelationExample);
        AuthUserRoleRelation authUserRoleRelation = list.get(0);
        int roleId = authUserRoleRelation.getRoleId();
        return roleId;
    }


}
