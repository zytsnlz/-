package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.dao.WorkCountDao;
import cn.edu.ncst.car.dto.CountAllCondition;
import cn.edu.ncst.car.dto.CountCondition;
import cn.edu.ncst.car.dto.CountResult;
import cn.edu.ncst.car.mbg.mapper.AuthUserMapper;
import cn.edu.ncst.car.mbg.mapper.AuthUserRoleRelationMapper;
import cn.edu.ncst.car.mbg.model.AuthUser;
import cn.edu.ncst.car.mbg.model.AuthUserRoleRelation;
import cn.edu.ncst.car.mbg.model.AuthUserRoleRelationExample;
import cn.edu.ncst.car.service.UmsAdminService;
import cn.edu.ncst.car.service.WorkCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WorkCountServiceImpl implements WorkCountService {

    @Autowired
    WorkCountDao workCountDao;
    @Autowired
    UmsAdminService umsAdminService;
    @Autowired
    AuthUserMapper authUserMapper;
    @Autowired
    AuthUserRoleRelationMapper authUserRoleRelationMapper;

    @Override
    public int countOne(CountCondition countCondition) {

        String adminName = countCondition.getAdminName();
        //根据姓名获取管理员的id
        AuthUser authUser = umsAdminService.getAdminByUsername(adminName);
        if(authUser==null){
            return -1;
        }
        int adminId = authUser.getId();
        countCondition.setAdminId(adminId);
        int count = workCountDao.countWork(countCondition);
        return count;
    }

    @Override
    public List<CountResult> countAll(CountAllCondition countAllCondition) {

        AuthUserRoleRelationExample authUserRoleRelationExample = new AuthUserRoleRelationExample();
        AuthUserRoleRelationExample.Criteria criteria = authUserRoleRelationExample.createCriteria();
        criteria.andRoleIdEqualTo(3);
        List<AuthUserRoleRelation> list = authUserRoleRelationMapper.selectByExample(authUserRoleRelationExample);
        //获取所有的管理员的id
        List<Integer> idList = new ArrayList<>();
        for (AuthUserRoleRelation authUserRoleRelation : list) {
            idList.add(authUserRoleRelation.getUserId());
        }

        Date startTime = countAllCondition.getStartTime();
        Date endTime = countAllCondition.getEndTime();
        Integer recordType = countAllCondition.getRecordType();

        CountCondition countCondition = new CountCondition();
        countCondition.setEndTime(endTime);
        countCondition.setStartTime(startTime);
        countCondition.setRecordType(recordType);

        CountResult countResult = new CountResult();
        List<CountResult> countResultList = new ArrayList<>();

        for (Integer integer : idList) {

            countResult.setId(integer);

            AuthUser authUser = authUserMapper.selectByPrimaryKey(integer);
            //根据管理员的id获取管理员的姓名
            String adminName = authUser.getUsername();
            countResult.setName(adminName);
            countCondition.setAdminName(adminName);
            countCondition.setAdminId(integer);
            //获取某位管理员的审核数量
            int workcount = countOne(countCondition);
            countResult.setWorkCount(workcount);

            countResultList.add(countResult);
        }
        return countResultList;
    }

}
