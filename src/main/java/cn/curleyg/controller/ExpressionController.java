package cn.curleyg.controller;

import cn.curleyg.domain.School;
import cn.curleyg.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 城南花已开<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2022/5/2 17:25 <br>
 * @Author: Wang
 */
@Controller
@RequestMapping("/exp")
public class ExpressionController {
    /***
     * @Description: 变量表达式：${...}使用
     * @Param: [model]
     * @Return: java.lang.String
     * @Author: Wang
     * @Date: 2022/5/2 17:26
    */
    @RequestMapping("/var1")
    public String hello(Model model,Integer id){
        System.out.println(id);
        //添加简单属性
        model.addAttribute("name","wang");

        //添加对象属性
        User user = new User();
        user.setId(5);
        user.setName("wang");
        user.setAge(18);
        user.setAddress("杭州");
        //对象属性的值
        user.setSchool(new School("杭州第一中学","杭州"));
        model.addAttribute("user",user);
        return "var1";
    }

    @RequestMapping("/link")
    public String link(Model model){
        model.addAttribute("openurl","/var1");
        return "link";
    }
}
