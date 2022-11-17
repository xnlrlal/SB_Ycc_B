package com.youngtvjobs.ycc.course;

import java.util.List;

public interface CourseDao {
	
	List<CourseDto> selectCourselist() throws Exception;
	int deleteAll() throws Exception;
	int insert(CourseDto dto) throws Exception;
}
