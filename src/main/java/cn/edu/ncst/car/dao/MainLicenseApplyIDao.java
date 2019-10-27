package cn.edu.ncst.car.dao;

import cn.edu.ncst.car.dto.MainLicenseApplyInfo;
import org.springframework.stereotype.Repository;
import sun.applet.Main;

import java.util.List;


@Repository
public interface MainLicenseApplyIDao {
    /**
     * 查询所有的用户通行证申请
     * @return
     */
    List<MainLicenseApplyInfo> selectAll();

    /**
     * 根据状态码筛选通行证申请
     * @param status
     * @return
     */
    List<MainLicenseApplyInfo> selectByStatus(Integer status);

    /**
     * 根据车牌号查询用户通行证申请
     * @param plateNo
     * @return
     */
    List<MainLicenseApplyInfo> selectByPlateNo(String plateNo);

    /**
     * 查看所有的企业用户通行证申请
     * @return
     */
    List<MainLicenseApplyInfo> selectCompanyLicense();

    /**
     * 查看所有的个人用户通行证申请
     * @return
     */
    List<MainLicenseApplyInfo> selectPersonLicense();

}
