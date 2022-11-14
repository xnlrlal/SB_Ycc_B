package com.youngtvjobs.ycc.course;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDaoImpl implements CourseDao {
	
	@Autowired
	private SqlSession session;
	private static String namespace = "com.youngtvjobs.ycc.course.CourseMapper.";
	
	@Override
	public List<CourseDto> selectCourselist() throws Exception {
		return session.selectList(namespace + "selectCourselist");
	}

	@Override
	public int insert(CourseDto courseDto) {
		return session.insert(namespace + "insert", courseDto);
	}

//	@Override
//	public List<CourseDto> selectCourselist(CourseDto courseDto) throws Exception {
//		return session.selectList(namespace + "selectCourselist", courseDto);
//	}


	


}
