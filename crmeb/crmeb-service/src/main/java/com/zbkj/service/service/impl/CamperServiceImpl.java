package com.zbkj.service.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.zbkj.common.model.camper.Camper;
import com.zbkj.common.model.order.StoreOrder;
import com.zbkj.common.page.CommonPage;
import com.zbkj.common.request.PageParamRequest;
import com.zbkj.service.dao.CamperMapper;
import com.zbkj.service.service.ICamperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wrg
 * @since 2024-12-23
 */
@Service
public class CamperServiceImpl extends ServiceImpl<CamperMapper, Camper> implements ICamperService {

    @Resource
    private  CamperMapper camperMapper;

    public int addCamper(Camper camper) {
        return camperMapper.insert(camper);
    }

    @Override
    public int updateCamper(Camper camper) {
        return camperMapper.updateById(camper);
    }

    @Override
    public int deleteCamper(Integer id) {
        return camperMapper.deleteById(id);
    }

    @Override
    public List<Camper> getCamperList(Integer userId) {
        // 使用 LambdaQueryWrapper 进行条件查询
        return camperMapper.selectList(new LambdaQueryWrapper<Camper>()
                .eq(userId != null, Camper::getUserId, userId));
    }


    @Override
    public CommonPage<Camper> getAllCamperList(PageParamRequest pageParamRequest ) {
        // 开启分页
        PageHelper.startPage(pageParamRequest.getPage(), pageParamRequest.getLimit());

        // 创建查询条件构造器
        LambdaQueryWrapper<Camper> lqw = new LambdaQueryWrapper<>();

        // 查询列表
        List<Camper> camperList = camperMapper.selectList(lqw);

        // 使用分页工具封装返回结果
        return CommonPage.restPage(camperList);
    }

    @Override
    public Camper getByCamperId(Integer addressId) {
        LambdaQueryWrapper<Camper> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Camper::getId, addressId);
//        lambdaQueryWrapper.eq(UserAddress::getIsDel, false);
        return camperMapper.selectOne(lambdaQueryWrapper);
    }
}
