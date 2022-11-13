package com.youngtvjobs.ycc.course;

import java.util.List;

public interface CourseService {

	int getsearchResultCnt(SearchItem sc) throws Exception;
	List<CourseDto> getsearchResultPage(SearchItem sc) throws Exception;
}
