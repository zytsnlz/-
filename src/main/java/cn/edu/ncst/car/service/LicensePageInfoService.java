package cn.edu.ncst.car.service;

import cn.edu.ncst.car.dto.MainLicenseApplyInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

public interface LicensePageInfoService {

    /**
     * 通行证申请分页信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<MainLicenseApplyInfo> licenseApplyPageInfo(int pageNum, int pageSize);

    /**
     * 根据状态码筛选得到的通行证申请分页信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<MainLicenseApplyInfo> byStatusPageInfo(int pageNum, int pageSize,int status);

    /**
     * 根据车牌号筛选得到的通行证申请分页信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<MainLicenseApplyInfo> byPlateNoPageInfo(int pageNum, int pageSize,String plateNo);

    /**
     * 个人用户通行证申请分页信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<MainLicenseApplyInfo> personLicensePageInfo(int pageNum,int pageSize);

    /**
     *  企业用户通行证申请分页信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<MainLicenseApplyInfo> companyLicensePageInfo(int pageNum,int pageSize);


}
