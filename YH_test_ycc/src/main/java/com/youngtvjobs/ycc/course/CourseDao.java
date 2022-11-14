package com.youngtvjobs.ycc.course;

import java.util.List;
import java.util.Map;

public interface CourseDao {

	List<CourseDto> selectCourselist(SearchItem sc) throws Exception;
	int insert(CourseDto courseDto) throws Exception;
	int searchResultCnt(SearchItem sc) throws Exception;
}
