package com.bdqn.zhang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bdqn.zhang.mapper.DeptMapper;
import com.bdqn.zhang.pojo.Dept;
import com.bdqn.zhang.service.DeptService;
import org.springframework.stereotype.Service;

@Service("deptService")
public class DepServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {
}
