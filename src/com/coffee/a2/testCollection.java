/**
 * <p>Title: testCollection.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-5-23  
* @version 1.0  
 */
package com.coffee.a2;

import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.coffee.entity.tbl_user;
import com.coffee.entity.tbl_visit;



/**
 * @author coffeeliu
 *
 */
public class testCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "mybatis-config.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		try{
			List<tbl_user> ap=session.selectList("selectVisit"); 
			for(tbl_user temp:ap) {
				System.out.println("用户名="+temp.getName());
				for(tbl_visit oneVisit:temp.getVisitList())
				{
					System.out.println("登录时间="+ new SimpleDateFormat("yyyy-MM-dd HH:mm:dd").format(oneVisit.getVisitdate())+
							"登录IP="+oneVisit.getVisitIP());
				}	
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}	
	}

}
