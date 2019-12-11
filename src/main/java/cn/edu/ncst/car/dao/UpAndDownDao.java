package cn.edu.ncst.car.dao;

import org.springframework.stereotype.Repository;

/**
 * 实现查看当条未处理记录的上一条和下一条功能
 */
@Repository
public interface UpAndDownDao {
    /**
     * 获取当前未处理的用户认证申请记录的上一条记录的id
     * @param id
     * @return
     */
    int getApplyPreviousId(int id);


    /**
     * 获取当前未处理的用户认证申请记录的下一条记录的id
     * @param id
     * @return
     */
    int getApplyNextId(int id);

    /**
     * 获取当前未处理的通行证申请记录的上一条记录的id
     * @param id
     * @return
     */
    int getLicensePreviousId(int id);


    /**
     * 获取当前未处理的通行证申请记录的下一条记录的id
     * @param id
     * @return
     */
    int LicenseNextId(int id);

    /**
     * 获取当前未处理的用户认证申请记录的上一条记录的id
     * @param id
     * @return
     */
    int ApplyPreviousId(int id);


    /**
     * 获取当前未处理的用户认证申请记录的下一条记录的id
     * @param id
     * @return
     */
    int ApplyNextId(int id);

    /**
     * 获取当前未处理的通行证申请记录的上一条记录的id
     * @param id
     * @return
     */
    int LicensePreviousId(int id);


    /**
     * 获取当前未处理的通行证申请记录的下一条记录的id
     * @param id
     * @return
     */
    int getLicenseNextId(int id);


    /**
     * 获取所有的未处理的用户认证申请中的第一条记录的id
     * @return
     */
    int getFirstUnApplyId();

    /**
     * 获取所有的未处理的用户认证申请中的最后一条记录的id
     * @return
     */
    int getLastUnApplyId();

    /**
     * 获取所有的未处理的通行证申请中的第一条记录的id
     * @return
     */
    int getFirstUnLicenseId();

    /**
     * 获取所有的未处理的通行证申请中的最后一条记录的id
     * @return
     */
    int getLastUnLicenseId();

    /**
     * 获取所有的用户认证申请中的第一条记录的id
     * @return
     */
    int getFirstApplyId();

    /**
     * 获取所有的用户认证申请中最后一条记录的id
     * @return
     */
    int getLastApplyId();

    /**
     * 获取所有的通行证申请中第一条记录的id
     * @return
     */
    int getFirstLicenseId();

    /**
     * 获取所有的通行证申请中最后一条记录的id
     * @return
     */
    int getLastLicenseId();

    /**
     * 获取未处理的通行证数量
     * @return
     */
    int getUnlicenseNumber();


}
