package cn.edu.ncst.car.service;

import cn.edu.ncst.car.dto.EntireLicenseApplyInfo;
import cn.edu.ncst.car.dto.MainLicenseApplyInfo;
import cn.edu.ncst.car.mbg.model.LicenseApplyinfo;

import java.util.List;
import java.util.Map;

public interface AdminLicenseApplyService {

    /**
     * 查询所有的通行证申请
     * @return
     */
    List<MainLicenseApplyInfo> selectAll();

    /**
     *
     * 查看所有的企业用户通信证申请
     * @return
     */
    List<MainLicenseApplyInfo> selectCompanyLicense();

    /**
     * 查看所有的个人用户通行证申请
     * @return
     */
    List<MainLicenseApplyInfo> selectPersonLicense();

    /**
     * 根据状态码筛选位未处理的申请(0)、已通过的申请(1)、未通过的申请(2)
     * @param status
     * @return
     */
    List<MainLicenseApplyInfo> selectByStatus(Integer status);

    /**
     * 通过车牌号查询所有的申请
     * @return
     */
    List<MainLicenseApplyInfo> selectByPlateNo(String plateNo);


    /**
     * 根据account_identify表的id查看某个用户详细的认证申请信息
     * @return
     */
    Map<String,Object> selectOneApplyInfoById(Integer id);

    /**
     * 管理员审核某用户认证申请
     */
    void updateUserStatus(Integer id,Integer status,String comment,String token);

}
