package com.kitri.fpgw.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ApprDaoImpl implements ApprDao {

	@Autowired
	private SqlSessionTemplate SqlSessionTemplate;
	
	@Override
	public int settlementnocnt() {
		// TODO Auto-generated method stub
		return SqlSessionTemplate.selectOne("settlementnocnt");
	}

}
