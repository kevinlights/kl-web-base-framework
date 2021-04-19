package com.gjh.learn.base.controller;

import com.gjh.learn.base.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * created on 2021/4/19
 *
 * @author kevinlights
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Kevin");
        Map<String, String> maps = new HashMap<>();
        maps.put("a", "1");
        maps.put("b", "2");
        maps.put("c", "3");
        model.addAttribute("maps", maps);

        model.addAttribute("array", Arrays.asList(new String[]{"aaa", "bbb", "ccc"}));

        User user = new User();
        user.setName("Kevin");
        user.setPassword("123");
        model.addAttribute("user", user);
        return "index";
    }
}
