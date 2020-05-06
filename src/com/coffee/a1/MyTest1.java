package com.coffee.a1;

import java.io.InputStream;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.AbstractDocument.LeafElement;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.coffee.entity.LeaveEvent;
import com.coffee.entity.Student;

public class MyTest1 {

	public static void main(String[] args) throws Exception {
		// 创建 SqlSessionFactory
		String resource = "mybatis-config.xml";
		// InputStream inputStream = Resources.getResourceAsStream(resource);
		Reader reader = null;
		reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(reader);

		// 获取 Session
		SqlSession session = sqlSessionFactory.openSession();
		// // 使用简化的try-with-resources语法，等效于try..finally语句,jdk1.8版本支持
		// try (SqlSession session = sqlSessionFactory.openSession()) {}
		// 执行查询
		try {
			///得到单条记录
//			Student row = session.selectOne("com.coffee.test.getStudent",
//					20200001);
//			if (row != null)
//				System.out.println(row.id + "," + row.name + "," + row.sex
//						+ "," + row.phone + "," + row.birthday);
//
//			// /得到多条记录 (0条或N条)
//			List<Student> rows = session.selectList(
//					"com.coffee.test.getStudent2", 1);
//			System.out.println("得到多条记录 (0条或N条) 记录数: " + rows.size());
//			
//			// 不需要指定参数的情况
//			rows = session.selectList("com.coffee.test.getStudent3");
//			System.out.println("不需要指定参数的情况 记录数: " + rows.size());	
//			
//			// 指定多个参数的情况
//			Map<String,Object> params = new HashMap<String, Object>();
//			params.put("sex", 1);
//			params.put("name", "%刘%");
//			
//			rows = session.selectList("com.coffee.test.getStudent4", params);
//			System.out.println("记录数: " + rows.size());
//			
//			//返回map
//			Map map = session.selectOne("com.coffee.test.getStudent5", 20200001);
//			System.out.println("返回map");
//			//返回map jdk1.7不支持
//			List<Student> rows1 = session.selectList("com.coffee.test.getStudent6", 0);
//			for (Student s : rows1) {
//				System.out.println(s.name+s.id);
//			}
			
			///特殊符号使用
//			HashMap<String,Object> map1 = new HashMap<String, Object>();
//			map1.put("from", 20200002);
//			map1.put("to", 20200008);
//			
//			List<Student> rows2 = session.selectList("com.coffee.test.getStudent7", map1);
//			for(Student s : rows2 )
//			{
//				System.out.println(s.id + "\t, " + s.name);
//			}
			
			///插入操作
//			Student stu = new Student();
//			stu.id = 20200255;
//			stu.name = "刘德华";
//			stu.sex = true;
//			stu.phone = "1381000000";
//			stu.birthday=new SimpleDateFormat("yyyy-MM-dd").parse("2020-08-09");
//			
//			session.insert("com.coffee.test.insertStudent", stu);
//			session.commit(); // 因为默认开启了事务，所以要commit()一下
			
			///插入map操作
//			HashMap<String,Object> map2 = new HashMap<String, Object>();
//			map2.put("id", 20190202);
//			map2.put("name", "杨玉环");
//			map2.put("sex", false);
//			map2.put("phone", "13600000001");
//			session.insert("com.coffee.test.insertStudent2", map2);
//			session.commit(); // 因为默认开启了事务，所以要commit()一下
			
			//自增主键调用
//			LeaveEvent leaveEvent = new LeaveEvent();
//			leaveEvent.setStuId(20200001);
//			leaveEvent.setDaysFrom(new Date(2000-1900,8-1,21));
//			leaveEvent.setDaysTo(new Date(2020-1900,9-1,11));
//			leaveEvent.setType((byte) 1);
//			leaveEvent.setReason("测试");
//			session.insert("com.coffee.test.insertLeaveEvent", leaveEvent);
//			System.out.println("新记录的ID： " + leaveEvent.getId());
//			session.commit(); // 因为默认开启了事务，所以要commit()一下
			
			//update
//			HashMap<String,Object> map3 = new HashMap<String, Object>();
//			map3.put("id", 20200001);
//			map3.put("phone", "13810011118");
//			map3.put("birthday", "2011-05-05");
//			int affectedRows = session.update("com.coffee.test.updateStudent", map3);
//			System.out.println("受影响的行数: " + affectedRows);
//			session.commit(); // 因为默认开启了事务，所以要commit()一下
			
			//delete
		//	HashMap<String,Object> map4 = new HashMap<String, Object>();
			//map4.put("id",22222222);
		int	affectedRows = session.delete("com.coffee.test.deleteStudent", 5535677);
			System.out.println("受影响的行数: " + affectedRows);
			session.commit(); // 因为默认开启了事务，所以要commit()一下
		} finally {
			session.close();
		}

		System.out.println("Exit");
	}

}
