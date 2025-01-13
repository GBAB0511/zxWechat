package com.zbkj.front.controller;




import com.zbkj.common.model.camper.Camper;
import com.zbkj.common.response.CommonResult;
import com.zbkj.service.service.ICamperService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wrg
 * @since 2024-12-23
 */
@RestController
@RequestMapping("/camper")
public class CamperController {
    @Resource
    private ICamperService service;
    @RequestMapping("/add")
    public CommonResult<String> addCamper(@RequestBody Camper camper) {
        if (service.addCamper(camper)>0){
            return CommonResult.success();
        }
       return CommonResult.failed();
    }

    @RequestMapping("/update")
    public CommonResult<String> updateCamper(@RequestBody Camper camper) {
        if (service.updateCamper(camper)>0){
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    @RequestMapping("/delete")
    public CommonResult<String> deleteCamper(@RequestParam(value = "id") Integer id) {
        if (service.deleteCamper(id)>0){
            return CommonResult.success();
        }
        return CommonResult.failed();
    }
    @RequestMapping("/list")
    public CommonResult<List<Camper>>getCamperList(Integer userId) {

        return CommonResult.success(service.getCamperList(userId));
    }
}
