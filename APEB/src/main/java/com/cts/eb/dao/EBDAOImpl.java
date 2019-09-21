package com.cts.eb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.eb.bo.EBBO;
import com.cts.eb.dto.EBDTO;

@Repository
public class EBDAOImpl implements EBDAO {
	private final static String INSERT_QRY="INSERT INTO EBILL SERVNO,CUSNAME,ADDRESS,MOBILE,EMAIL,UNITS,PRICE";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int saveCustomer(EBBO ebbo) {
		int result=jt.update(INSERT_QRY,ebbo.getServiceNo(),ebbo.getCustomerName(),ebbo.getAddress(),ebbo.getMobile(),ebbo.getEmail(),ebbo.getBillAmount());
		return result;
	}

}
