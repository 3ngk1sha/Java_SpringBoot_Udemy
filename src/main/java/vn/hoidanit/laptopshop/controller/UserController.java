package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {
    // private UserService userService;

    // public UserController(UserService userService) {
    // this.userService = userService;
    // }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        // String test = this.userService.handlerHello();
        // model.addAttribute("engkisha", test);
        model.addAttribute("employee", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") User user, Model model) {
        System.out.println(user);
        return "hello";

    }

}
