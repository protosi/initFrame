package com.hopeland;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hopeland.service.TestService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest 
{
	@Autowired
	TestService testService;
	
	@Test
	public void test()
	{
		List<com.hopeland.domain.Test> list = testService.selectAll();
		
		System.out.println(list.size());
		
	}
	
	@Test
	public void insert()
	{
		com.hopeland.domain.Test test = new com.hopeland.domain.Test();
		test.setTest_name("insert test");
		test.setReg_admin("admin");
		test.setReg_date("2019-11-07 00:00:01");
		test.setIs_active(1);
		testService.insert(test);
	}
}
