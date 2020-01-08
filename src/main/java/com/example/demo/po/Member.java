package com.example.demo.po;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

/**
 * Created by 张康磊 on 2017/9/3.
 */
@Data
public class Member {
    @Id
    @GeneratedValue
    private int id;

    private Boolean deleted;

    private String name;

    private String password;

    public Member() {
    }
}
