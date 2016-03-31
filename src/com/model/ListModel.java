package com.model;

import com.dao.MemberDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sist on 2016-03-30.
 */
public class ListModel implements Model{

    @Override
    public List<MemberDTO> handlerRequest() throws Exception {
        List<MemberDTO> list=new ArrayList<>();
        list.add(new MemberDTO("정도전","남자","서울"));
        list.add(new MemberDTO("강씨","여자","서울"));
        list.add(new MemberDTO("이성계","남자","전주"));
        return list;
    }
}
