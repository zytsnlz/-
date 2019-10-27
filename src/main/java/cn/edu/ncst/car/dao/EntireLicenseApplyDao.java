package cn.edu.ncst.car.dao;

import cn.edu.ncst.car.dto.EntireLicenseApplyInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface EntireLicenseApplyDao {
    /**
     * 审查某一条个人用户申请
     * @param id
     * @return
     */
    EntireLicenseApplyInfo selectByIdPerson(Integer id);

    /**
     * 审查某一条企业用户申请
     * @param id
     * @return
     */
    EntireLicenseApplyInfo selectByIdCompany(Integer id);
}
