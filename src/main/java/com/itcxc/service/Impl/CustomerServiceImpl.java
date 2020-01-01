package com.itcxc.service.Impl;

import com.itcxc.mapper.CustomerMapper;
import com.itcxc.pojo.Customer;
import com.itcxc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public Customer ById(int id){
        Customer customer = customerMapper.ById(id);
        return customer;
    }
}
