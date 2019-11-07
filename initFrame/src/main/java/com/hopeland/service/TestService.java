package com.hopeland.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopeland.domain.Test;
import com.hopeland.mapper.TestMapper;

@Service
public class TestService 
{
	@Autowired
	TestMapper mapper;
	
	public List<Test> selectAll()
	{
		return mapper.selectAll();
	}
	
}
