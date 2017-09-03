package com.example.demo.po;

import javax.persistence.*;

/**
 * Created by 张康磊 on 2017/9/3.
 */
@Entity
public class Member {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String password;

    public Member(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
