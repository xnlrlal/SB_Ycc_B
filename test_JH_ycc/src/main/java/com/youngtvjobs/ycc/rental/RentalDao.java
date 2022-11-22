package com.youngtvjobs.ycc.rental;

import java.util.List;

public interface RentalDao {
	
	List<RentalDto> select() throws Exception;
	List<RentalDto> selectview() throws Exception;
	List<RentalDto> selectAll() throws Exception;


}
