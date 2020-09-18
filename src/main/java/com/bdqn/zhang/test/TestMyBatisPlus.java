package com.bdqn.zhang.test;

import com.bdqn.zhang.mapper.DeptMapper;
import com.bdqn.zhang.pojo.Dept;
import com.bdqn.zhang.service.DeptService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestMyBatisPlus {

    @Test
    public void show(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptMapper deptMapper = (DeptMapper)context.getBean("deptMapper");
        deptMapper.insert(new Dept("学术部"));
    }

    @Test
    public void show2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = (DeptService)context.getBean("deptService");
        List<Dept> list = new ArrayList<Dept>();
        list.add(new Dept("学术部6"));
        list.add(new Dept("学术部7"));
        deptService.saveBatch(list);
    }
}
