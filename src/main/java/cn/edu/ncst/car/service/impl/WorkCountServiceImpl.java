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
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
    public Map<Object,Object> countOne(CountCondition countCondition) {


        Map<Object, Object> countResult = workCountDao.countWork(countCondition);
        int  countTotal = workCountDao.countTotal(countCondition);
        countResult.put("total",countTotal);
        return countResult;
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

        CountCondition countCondition = new CountCondition();
        countCondition.setEndTime(endTime);
        countCondition.setStartTime(startTime);



        List<CountResult> countResultList = new ArrayList<CountResult>();

        for (Integer integer : idList) {
            CountResult countResult = new CountResult();
            countResult.setId(integer);

            AuthUser authUser = authUserMapper.selectByPrimaryKey(integer);
            //根据管理员的id获取管理员的姓名
            String adminName = authUser.getUsername();
            countResult.setName(adminName);
            countCondition.setAdminName(adminName);
            countCondition.setAdminId(integer);
            //获取某位管理员的审核数量
            Map<Object,Object> workcount = countOne(countCondition);
            countResult.setWorkCount(workcount);
            countResultList.add(countResult);
        }
        return countResultList;
    }

}
