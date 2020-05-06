/**
 * <p>Title: hello.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-5-13  
* @version 1.0  
 */
package com.coffee.a2;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.coffee.entity.tbl_user;



/**
 * @author coffeeliu
 *
 */
public class hello {

	/**
	 * @param args
	 */
	 private static final Logger LOG = Logger.getLogger(com.coffee.a2.hello.class);  
	public static void main(String[] args) {
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
		tbl_user temp = session.selectOne("findById", 2);
	LOG.error(temp.getName());
		//System.out.println(temp.getName());
		session.close();

	}

}
