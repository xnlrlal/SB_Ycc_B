package com.youngtvjobs.ycc.course;

import java.util.List;

public interface CourseDao {

//	List<CourseDto> selectCourselist(CourseDto courseDto) throws Exception;
//	CourseDto selectCourselist() throws Exception;
	List<CourseDto> selectCourselist() throws Exception;
	int insert(CourseDto courseDto);
}
