package com.hopeland;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
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
}
