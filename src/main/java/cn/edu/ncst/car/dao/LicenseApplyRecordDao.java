package cn.edu.ncst.car.dao;

import cn.edu.ncst.car.dto.LicenseApplyRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseApplyRecordDao {


    /**
     * 显示用户通行证审核记录
     * @param userId
     * @return
     */
    List<LicenseApplyRecord> selectLicenseApplyRecord(Integer userId);
}
