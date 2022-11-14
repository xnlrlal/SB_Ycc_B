package com.youngtvjobs.ycc.course;

public class CoursePageResolver {
	
	private SearchItem sc;
	
	private int totalCnt;
	private final int NAV_SIZE = 10;
	private int totalPage;
	private int beginPage;
	private int endPage;
	private boolean showNext = false;
	private boolean showPrev = false;
	
	

	public CoursePageResolver(int totalCnt, SearchItem sc) {
		this.totalCnt = totalCnt;
		this.sc = sc;
	}

	

}
