package com.xuxu.mvc.contreller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.RequestWrapper;

@Controller
//@RequestMapping("/test")
public class RequestMappingCon {
    @org.springframework.web.bind.annotation.RequestMapping(
            value={"/testRequestMapping","/test"},
    method = {RequestMethod.GET,RequestMethod.POST})
    public String testRequestMapping(){ return "success"; }
    @RequestMapping("/testRest/{id}/{name}")
    public String testRest(@PathVariable("id") String id,@PathVariable("name") String username){
        System.out.println("id:"+id+"username"+username);
        return "success";
    }
}

