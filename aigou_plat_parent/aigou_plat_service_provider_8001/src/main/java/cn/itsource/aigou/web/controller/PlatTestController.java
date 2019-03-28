package cn.itsource.aigou.web.controller;

import cn.itsource.common.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/plat")
public class PlatTestController {

    @RequestMapping("/xmz")
    public AjaxResult test() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "xmz");
        return AjaxResult.me().setSuccess(false).setMsg("操作错误").setObject(map);
    }
}
