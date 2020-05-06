package com.coffee.a3;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.coffee.entity.Student;
import com.google.gson.Gson;

@WebServlet("/GetStudent")
public class GetStudent extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{		
		int id = Integer.valueOf(req.getParameter("id"));		
		Gson result = new Gson();
		//http://localhost:8080/Mybatis/GetStudent?id=20200001
		// 查询测试, MyBatis.factory 是一个全局的工厂实例
		SqlSession session = MyBatis.factory.openSession();
		try  {
			Student row = session.selectOne("com.coffee.test.getStudent", id);
			if(row != null)
			{
				resp.setCharacterEncoding("UTF-8");
				resp.setContentType("text/html");
				resp.getWriter().print( result.toJson(row));
				
			}
			else
			{
				resp.sendError(404);
				return;
			}
		}finally {
			session.close();
		}
		// 应答
		
	}

}
