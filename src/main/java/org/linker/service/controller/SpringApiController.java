package org.linker.service.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RWM
 * @date 2018/11/6
 */
@RestController
@RequestMapping("/spring")
@Api(description = "微服务相关接口")
public class SpringApiController {

    @GetMapping("/cloud")
    @ApiOperation("微服务查询")
    public String springcloud() {
        return "Spring Cloud!";
    }
}
