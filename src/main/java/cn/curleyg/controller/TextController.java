package cn.curleyg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 城南花已开<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2022/5/2 22:25 <br>
 * @Author: Wang
 */
@Controller
@RequestMapping("/text")
public class TextController {

    @RequestMapping("/wenben")
    public String hello(Model model){
        //添加数据
        model.addAttribute("info","java语言");
        model.addAttribute("n1","Go语言");
        model.addAttribute("n2","C语言");
        return "text";
    }
}
