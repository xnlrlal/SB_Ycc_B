package com.youngtvjobs.ycc.course;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDaoImpl implements CourseDao{

	@Autowired
	private SqlSession session;
	private static String namespace = "com.youngtvjobs.ycc.course.courseMapper.";
	
	
	@Override
	public CourseDto select(Integer course_id) throws Exception {
		
		return session.selectOne(namespace + "selectCourselist", course_id);
	}

}
