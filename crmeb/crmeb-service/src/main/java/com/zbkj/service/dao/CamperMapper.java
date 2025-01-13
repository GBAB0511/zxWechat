package com.zbkj.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zbkj.common.model.camper.Camper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wrg
 * @since 2024-12-23
 */
@Mapper
public interface CamperMapper extends BaseMapper<Camper> {

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

    Camper selectOneCamper(Integer id);
}
