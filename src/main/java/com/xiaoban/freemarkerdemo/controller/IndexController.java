package com.xiaoban.freemarkerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoban
 * @version 1.0.0
 * @create 2021/04/09 - 14:52
 */
@Controller
@RequestMapping("")
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        List<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        String name = "xiaoban";
        model.addAttribute("name",name);
        model.addAttribute("names",names);
        return "index";
    }
}
