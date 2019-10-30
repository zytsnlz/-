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
    int getLicenseNextId(int id);



}
