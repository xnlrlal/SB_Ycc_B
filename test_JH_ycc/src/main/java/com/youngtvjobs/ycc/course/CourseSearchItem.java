package com.youngtvjobs.ycc.course;

import static java.lang.Math.max;
import static java.lang.Math.min;

import org.springframework.web.util.UriComponentsBuilder;

public class CourseSearchItem {
	
	public static final int DEFAULT_PAGE_SIZE = 10;
	public static final int MIN_PAGE_SIZE = 5;
	public static final int MAX_PAGE_SIZE = 50;
	
	private Integer page = 1;
	private Integer pageSize = DEFAULT_PAGE_SIZE;
	private String option = "";
	private String keyword = "";
	private Integer offset;
	
	public CourseSearchItem() {
		// TODO Auto-generated constructor stub
	}

	public CourseSearchItem(Integer page, Integer pageSize) {
		this(page, pageSize, "", "");
	}
	
	public CourseSearchItem(Integer page, Integer pageSize, String option, String keyword) {
		//super();
		this.page = page;
		this.pageSize = pageSize;
		this.option = option;
		this.keyword = keyword;
	}
	
	public String getQueryString() {
		return getQueryString(page);
	}
	
	// ?page=10&pageSize=10&option=A&keyword=title
	public String getQueryString(Integer page) {
		return UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				.queryParam("pageSize", pageSize)
				.queryParam("option", option)
				.queryParam("keyword", keyword)
				.build().toString();
	}	
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = max(MIN_PAGE_SIZE, min(this.pageSize, MAX_PAGE_SIZE));
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getOffset() {
		int result = (page-1)*pageSize;
		if (result < 0) result = 0;
		return result;
	}

	@Override
	public String toString() {
		return "CourseSearchItem [page=" + page + ", pageSize=" + pageSize + ", option=" + option + ", keyword="
				+ keyword + ", offset=" + offset + "]";
	}
		

}
