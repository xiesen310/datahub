package com.github.controller;

import com.github.common.base.PublicResultConstant;
import com.github.config.ResponseHelper;
import com.github.config.ResponseModel;
import com.github.entity.Business;
import com.github.service.IBusinessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 谢森
 * @date 2020/4/25 22:31
 */
@RestController
@RequestMapping("/business")
@Api(value = "业务 API", protocols = "http")
public class BusinessController {

    @Autowired
    private IBusinessService businessService;

    @ApiOperation(
            value = "添加业务",
            produces = "application/json, application/xml",
            consumes = "application/json, application/xml",
            response = ResponseModel.class
    )
    @PostMapping
    public ResponseModel addBusiness(Business business) {
        return ResponseHelper.buildResponseModel(businessService.save(business));
    }

    @ApiOperation(
            value = "获取业务详细信息",
            produces = "application/json, application/xml",
            consumes = "application/json, application/xml",
            response = ResponseModel.class
    )
    @GetMapping(value = "/{businessId}")
    public ResponseModel getById(@PathVariable("businessId") String businessId) {
        return ResponseHelper.buildResponseModel(businessService.getById(businessId));
    }

    @ApiOperation(
            value = "删除业务",
            produces = "application/json, application/xml",
            consumes = "application/json, application/xml",
            response = ResponseModel.class
    )
    @DeleteMapping(value = "/{businessId}")
    public ResponseModel deleteRole(@PathVariable("businessId") String businessId) {
        businessService.removeById(businessId);
        return ResponseHelper.buildResponseModel(PublicResultConstant.SUCCEED);
    }

    @ApiOperation(
            value = "获取所有业务",
            produces = "application/json, application/xml",
            consumes = "application/json, application/xml",
            response = ResponseModel.class
    )
    @GetMapping("/all")
    public ResponseModel<List<Business>> getAllBusiness() {
        return ResponseHelper.buildResponseModel(businessService.list());
    }

    @PutMapping
    public ResponseModel updateRole(Business business) throws Exception{
        businessService.updateById(business);
        return ResponseHelper.buildResponseModel(PublicResultConstant.SUCCEED);
    }

}
