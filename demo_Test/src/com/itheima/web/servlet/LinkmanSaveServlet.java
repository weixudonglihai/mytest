package com.itheima.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.domain.Linkman;

import com.itheima.service.LinkmanService;

/**
 */
public class LinkmanSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Linkman linkman = new Linkman();
			BeanUtils.populate(linkman, request.getParameterMap());
			LinkmanService service = new LinkmanService();
			
			int row = service.link(linkman);
			
			if(row>0){
				//登录成功
				request.getSession().setAttribute("row", row);
				request.getRequestDispatcher("linkmansave.jsp").forward(request, response);
			}else{
				//登录失败
				request.getRequestDispatcher("linkmansave.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
