package com.youngtvjobs.ycc.course;

public class PageResolver {
	
	private CourseSearchItem sc;
	
	private int totalCnt;
	public final int NAV_SIZE =10;
	
	private int totalPage;
	
	private int beginPage;
	private int endPage;
	private boolean showNext = false;
	private boolean showPrev = false;
	
	public PageResolver(int totalCnt, Integer page) {
		this(totalCnt, new CourseSearchItem(page, 10));
	}

	public PageResolver(int totalCnt, Integer page, Integer pageSize) {
		this(totalCnt, new CourseSearchItem(page, pageSize));
	}
	
	public PageResolver(int totalCnt, CourseSearchItem sc) {
		this.totalCnt = totalCnt;
		this.sc = sc;
		
		doPaging(totalCnt, sc);
	}

	private void doPaging(int totalCnt, CourseSearchItem sc) {
		this.totalPage = totalCnt / sc.getPageSize() + (totalCnt % sc.getPageSize() == 0 ? 0 : 1);
		this.sc.setPage(Math.min(sc.getPage(), totalPage));
		this.beginPage = (this.sc.getPage()-1) / NAV_SIZE * NAV_SIZE + 1;
		this.endPage = Math.min(this.beginPage + this.NAV_SIZE - 1, totalPage);
		this.showPrev = beginPage != 1;
		this.showNext = endPage != totalPage;
	}
	
//	public void print() {
//		System.out.println("page = " + sc.getPage());
//		System.out.println(showPrev ? "PREV " : "");
//		
//		for (int i=beginPage; i<=endPage; i++)
//			System.out.println(i + " ");
//		
//		System.out.println(showNext ? " NEXT" : "");
//	}

	@Override
	public String toString() {
		return "PageResolver [sc=" + sc + ", totalCnt=" + totalCnt + ", totalPage=" + totalPage + ", beginPage="
				+ beginPage + ", endPage=" + endPage + ", showNext=" + showNext + ", showPrev=" + showPrev + "]";
	}

	public CourseSearchItem getSc() {
		return sc;
	}

	public void setSc(CourseSearchItem sc) {
		this.sc = sc;
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getBeginPage() {
		return beginPage;
	}

	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isShowNext() {
		return showNext;
	}

	public void setShowNext(boolean showNext) {
		this.showNext = showNext;
	}

	public boolean isShowPrev() {
		return showPrev;
	}

	public void setShowPrev(boolean showPrev) {
		this.showPrev = showPrev;
	}

	public int getNAV_SIZE() {
		return NAV_SIZE;
	}
	
}
