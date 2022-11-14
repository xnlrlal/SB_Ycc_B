package com.youngtvjobs.ycc.course;

import java.util.List;
import java.util.Map;

public interface CourseService {

	int getSearchResultCnt(SearchItem sc) throws Exception;

	List<CourseDto> getSearchResultPage(SearchItem sc) throws Exception;

}
