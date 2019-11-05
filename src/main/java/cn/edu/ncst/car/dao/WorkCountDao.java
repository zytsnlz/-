package cn.edu.ncst.car.dao;

import cn.edu.ncst.car.dto.CountCondition;
import org.springframework.stereotype.Repository;

/**
 *工作量的统计功能
 */
@Repository
public interface WorkCountDao {

    /**
     * 根据countCondition中的条件来进行统计
     * 查看某一个管理员的处理审核数量
     * @param countCondition
     * @return
     */
     int countWork(CountCondition countCondition);


}
