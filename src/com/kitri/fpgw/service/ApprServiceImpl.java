package com.kitri.fpgw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitri.fpgw.dao.ApprDao;

@Service
public class ApprServiceImpl implements ApprService {

	@Autowired
	private ApprDao ApprDao;
	
	@Override
	public int settlementnocnt() {
		// TODO Auto-generated method stub
		return ApprDao.settlementnocnt();
	}

}
