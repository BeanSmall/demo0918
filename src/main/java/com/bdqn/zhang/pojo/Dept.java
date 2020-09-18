package com.bdqn.zhang.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "dept")
public class Dept {
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField(value = "dname")
    private  String dname;

    public Dept(String dname) {
        this.dname = dname;
    }
}
