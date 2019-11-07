package com.hopeland.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hopeland.domain.Test;

@Mapper
public interface TestMapper 
{
	public List<Test> selectAll();
	
	public int insert(Test test);
}
