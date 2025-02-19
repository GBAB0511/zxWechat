package com.zbkj.service.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zbkj.common.model.camper.Camper;
import com.zbkj.common.page.CommonPage;
import com.zbkj.common.request.PageParamRequest;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wrg
 * @since 2024-12-23
 */
public interface ICamperService extends IService<Camper> {

    /**
     * 添加营员信息
     * @param camper
     * @return
     */
    int addCamper(Camper camper);

    /**
     * 修改营员信息
     */
    int updateCamper(Camper camper);
    /**
     * 删除营员信息
     */
    int deleteCamper(Integer id);
    /**
     * 查询营员列表
     */
    List<Camper> getCamperList(Integer userId);


    public Camper getByCamperId(Integer addressId);

    CommonPage<Camper> getAllCamperList(PageParamRequest pageParamRequest);
}
