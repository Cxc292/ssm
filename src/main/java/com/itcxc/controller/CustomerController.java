package com.itcxc.controller;

import com.itcxc.pojo.Customer;
import com.itcxc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "ById")
    public String  ById(Model model, int id){
        System.out.println("从页面获取的id是:"+id);
        Customer customer = customerService.ById(id);
        System.out.println("666666666");
        model.addAttribute("customer",customer);
        return "info";
    }


}
