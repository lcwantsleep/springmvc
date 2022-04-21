package com.xuxu.mvc.contreller;

import com.xuxu.mvc.Bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class ParamController {
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("un"+username+"pw"+password);
        return "success";
    }
    @RequestMapping("/testparam")
    public String testParam(@RequestParam(value="user_name",defaultValue="hehe") String username,
                            String password,
                            String[] hobby
                           ) {
        System.out.println("username:" + username + ",password:" + password + ",hobby:" + Arrays.toString(hobby));
        return "success";
    }
    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }
}
