package com.youngtvjobs.ycc.rental;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalServiceImpl implements RentalService{
	
	@Autowired
	RentalDao rentalDao;

	@Override//날짜, 장소 선택하면 해당 장소 예약현황 보여주는 기능
	public List<RentalDto> viewRentalPlace() throws Exception {
		return rentalDao.selectview();
	}

	@Override//select에 DB에서 값 넣는 기능 
	public List<RentalDto> selectRentalPlace() throws Exception {
		return rentalDao.select();
	}

	@Override
	public List<RentalDto> getList(Integer prental_id) throws Exception {
		return rentalDao.selectAll();
	}
	
}
	