package org.kuneo.stex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class StexPageController {
  
  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public String test(Model model) {
      model.addAttribute("msg","サンプルメッセージ！");
      return "index";
  }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String login(Model model) {
      return "login";
  }

}