package com.soecode.lyf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2017/6/1.
 */
@Controller
public class CommonController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    private String index(Model model) {
        return "index";// WEB-INF/jsp/"list".jsp
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    private String indexMe(Model model) {
        model.addAttribute("name", "Yeying");
        return "index";// WEB-INF/jsp/"list".jsp
    }
}
