package com.model;

import com.dao.MemberDTO;

import java.util.List;

/**
 * Created by sist on 2016-03-31.
 */
public interface Model {
    public List<MemberDTO> handlerRequest() throws Exception;
}
