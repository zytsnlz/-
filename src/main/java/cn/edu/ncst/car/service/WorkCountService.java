package cn.edu.ncst.car.service;

import cn.edu.ncst.car.dto.CountAllCondition;
import cn.edu.ncst.car.dto.CountCondition;
import cn.edu.ncst.car.dto.CountResult;

import java.util.List;
import java.util.Map;

public interface WorkCountService {

    /**
     * 统计某一位管理员的工作审核数量
     * @return
     */
    Map<Object,Object> countOne(CountCondition countCondition);

    /**
     * 统计所有的管理员的工作审核数量
     * @param countAllCondition
     * @return
     */
    List<CountResult> countAll(CountAllCondition countAllCondition);


}
