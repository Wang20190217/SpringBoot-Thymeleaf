package cn.curleyg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 城南花已开<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2022/5/2 16:46 <br>
 * @Author: Wang
 */
@Controller
@RequestMapping("/wang")
public class HelloController {
    /**
     * @Description: Model可以存放数据，最终存放在request作用域
     * @Param: [model]
     * @Return: java.lang.String 表示试图
     * @Author: Wang
     * @Date: 2022/5/2 16:47
    */
    @RequestMapping("/hello")
    public String hello(Model model){
      //添加数据
        model.addAttribute("name","wang");
        return "index";
    }

    @RequestMapping("/http")
    public String hello(HttpServletRequest httpServletRequest){
        //添加数据
        httpServletRequest.setAttribute("name","request");
        return "index";
    }
}
