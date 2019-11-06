package cn.edu.ncst.car.service;

import cn.edu.ncst.car.dto.CountCondition;

public interface WorkCountService {

    /**
     * 统计一位管理员的工作审核数量
     * @return
     */
    int countOne(CountCondition countCondition);








}
