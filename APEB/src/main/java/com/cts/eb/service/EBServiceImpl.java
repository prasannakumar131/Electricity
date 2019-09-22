package com.cts.eb.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.eb.bo.EBBO;
import com.cts.eb.dao.EBDAO;
import com.cts.eb.dto.EBDTO;

@Service
public class EBServiceImpl  implements EBService{
	@Autowired
	private EBDAO dao;

	@Override
	public EBDTO registerCustormer(EBDTO ebdto) {
		int result=0;
		int price=0;
		EBDTO ebdtoResult=null;
		EBBO ebbo=null;
		int units=ebdto.getUnits();
		
		if(units<50) {
			price=units*0;	
		}
		else if(units>=50 && units<100 ){
			price=units*1;
		}
		else if(units>=100 && units<200) {
			price=100+((units-100)*2);
		}
		else if(units>=200 && units<500) {
			price=500+((units-200)*5);
		}
		else {
			price=2950+7050;
		}
		
		ebdto.setBillAmount(price);
		ebbo=new EBBO();
		BeanUtils.copyProperties(ebdto, ebbo);
		result=dao.saveCustomer(ebbo);
		ebdtoResult=new EBDTO();
		if(result==0) {
			return ebdtoResult;
		}else {
			BeanUtils.copyProperties(ebdto, ebdtoResult);
			return ebdtoResult;
		}
	}

}
