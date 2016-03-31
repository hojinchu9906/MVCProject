package com.controller;

import com.dao.MemberDTO;
import com.model.ListModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by sist on 2016-03-30.
 */
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String cmd=req.getRequestURI();
            System.out.println(cmd);
            /*
                 http://localhost:8080/MVCProject/list.do
                                                  ========
             */

            cmd=cmd.substring(req.getContextPath().length()+1,cmd.lastIndexOf('.'));

            String jsp="";

            //list.do
            if(cmd.equals("list")){
                ListModel listModel=new ListModel();
                List<MemberDTO> list=listModel.handlerRequest();

                req.setAttribute("list",list);;
                jsp="view/list.jsp";
            }

            RequestDispatcher requestDispatcher=req.getRequestDispatcher(jsp);
            requestDispatcher.forward(req,resp);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}






































