package com.dao;

/**
 * Created by sist on 2016-03-31.
 */
public class MemberDTO {
    private String name;
    private String gender;
    private String addr;

    public MemberDTO(String name, String gender, String addr){
        this.name=name;
        this.gender=gender;
        this.addr=addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
