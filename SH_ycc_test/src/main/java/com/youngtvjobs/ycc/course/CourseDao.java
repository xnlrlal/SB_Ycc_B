package com.youngtvjobs.ycc.course;

import java.util.List;

public interface CourseDao {

	int searchResultCnt(SearchItem sc) throws Exception;

	List<CourseDto> searchSelectPage(SearchItem sc) throws Exception;

	
}
