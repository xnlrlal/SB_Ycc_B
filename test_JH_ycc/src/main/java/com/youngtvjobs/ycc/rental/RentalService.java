package com.youngtvjobs.ycc.rental;

import java.util.List;


public interface RentalService {
	
	List<RentalDto> selectRentalPlace() throws Exception;
	List<RentalDto> viewRentalPlace() throws Exception;
	List<RentalDto> getList(Integer prental_id) throws Exception;
	

}
