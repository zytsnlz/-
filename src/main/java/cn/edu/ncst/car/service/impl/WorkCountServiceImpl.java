package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.dao.WorkCountDao;
import cn.edu.ncst.car.dto.CountCondition;
import cn.edu.ncst.car.service.WorkCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkCountServiceImpl implements WorkCountService {

    @Autowired
    WorkCountDao workCountDao;

    @Override
    public int countOne(CountCondition countCondition) {

        int count = workCountDao.countWork(countCondition);
        return count;
    }
}
