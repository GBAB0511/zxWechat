package com.zbkj.admin.controller;




import com.zbkj.common.model.camper.Camper;
import com.zbkj.common.page.CommonPage;
import com.zbkj.common.request.PageParamRequest;
import com.zbkj.common.response.CommonResult;
import com.zbkj.service.service.ICamperService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/api/admin/camper")
public class CamperController {
    @Resource
    private ICamperService service;
    @RequestMapping("/add")
    @PreAuthorize("hasAuthority('admin:product:update')")
    public CommonResult<String> addCamper(@RequestBody Camper camper) {
        if (service.addCamper(camper)>0){
            return CommonResult.success();
        }
       return CommonResult.failed();
    }

    @RequestMapping("/update")
    @PreAuthorize("hasAuthority('admin:product:update')")
    public CommonResult<String> updateCamper(@RequestBody Camper camper) {
        if (service.updateCamper(camper)>0){
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    @RequestMapping("/delete")
    @PreAuthorize("hasAuthority('admin:product:update')")
    public CommonResult<String> deleteCamper(@RequestParam(value = "id") Integer id) {
        if (service.deleteCamper(id)>0){
            return CommonResult.success();
        }
        return CommonResult.failed();
    }
    @RequestMapping("/list")
    @PreAuthorize("hasAuthority('admin:product:update')")
    public CommonResult<List<Camper>>getCamperList(Integer userId) {

        return CommonResult.success(service.getCamperList(userId));
    }
    @RequestMapping("/getById")
    @PreAuthorize("hasAuthority('admin:product:update')")
    public CommonResult<Camper> getByCamperId(@RequestParam("camperId") Integer camperId) {
        return CommonResult.success(service.getByCamperId(camperId));
    }

    @RequestMapping(value = "/getCamperList" , method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('admin:product:update')")
    public CommonResult<CommonPage<Camper>> getAllCamperList(@RequestBody PageParamRequest pageParamRequest) {
        return CommonResult.success(service.getAllCamperList(pageParamRequest));
    }
}
