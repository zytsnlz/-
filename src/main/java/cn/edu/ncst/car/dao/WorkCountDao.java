package cn.edu.ncst.car.dao;

import cn.edu.ncst.car.dto.CountCondition;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *工作量的统计功能
 */
@Repository
public interface WorkCountDao {


    /**
     * 计算某个管理员对各种通行证的分别的处理数量
     * @param countCondition
     * @return
     */
    @MapKey("pass_license_type")
     Map<Object,Object> countWork(CountCondition countCondition);

    /**
     * 计算某个管理员总的处理记录数量
     * @param countCondition
     * @return
     */
    int countTotal(CountCondition countCondition);

}
