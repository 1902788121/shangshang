package com.atguigu.crowd.funding.text;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.crowd.funding.entity.Employee;
import com.atguigu.crowd.funding.mapper.EmployeeMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:mybatis/spring-persist-datasource.xml"})
public class CrowdTest {
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testDataSource() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}
	@Autowired
	private EmployeeMapper employeeMapper;
	@Test
	public void testSaveEmployee(){
		 employeeMapper.insert(new Employee(null,"bobo","12345","heigui",32,null,null,null,null));
	}
}
