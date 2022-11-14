package com.youngtvjobs.ycc.course;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseDao courseDao;

	@Override
	public int getSearchResultCnt(SearchItem sc) throws Exception {
		return courseDao.searchResultCnt(sc);
	}

	@Override
	public List<CourseDto> getSearchResultPage(SearchItem sc) throws Exception {
		return courseDao.selectCourselist(sc);
	}

}
