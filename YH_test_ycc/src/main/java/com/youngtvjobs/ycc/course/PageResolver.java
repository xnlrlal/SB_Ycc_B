package com.youngtvjobs.ycc.course;

public class PageResolver {
	
	private SearchItem sc;
	
	private int totalCnt;				//寃뚯떆臾� 珥� 媛��닔
	//private int pageSize = 10;			//�븳 �럹�씠吏��떦 寃뚯떆臾� 媛��닔
	public final int NAV_SIZE = 10;		//page navigation size
	
	private int totalPage; 				//�쟾泥� �럹�씠吏� 媛��닔
	//private int page;					//�쁽�옱 �럹�씠吏� 
	
	private int beginPage;				//�솕硫댁뿉 蹂댁뿬以� 泥� �럹�씠吏�
	private int endPage;				//�솕硫댁뿉 蹂댁뿬以� 留덉�留� �럹�씠吏� 
	private boolean showNext = false;	//�씠�썑瑜� 蹂댁뿬以꾩� �뿬遺� (endPage==totalPage �씠硫� showNext�뒗 false )
	private boolean showPrev = false;	//�씠�쟾�쓣 蹂댁뿬以꾩� �뿬遺� (beginPage==1�씠 �븘�땲硫� showPrev�뒗 true)
	
	public PageResolver() {
	}
	
	public PageResolver(SearchItem sc) {
//		super();
		this.sc = sc;
	}

	public PageResolver(int totalCnt, Integer page) {
		this(totalCnt, new SearchItem(page, 10));
	}
	
	public PageResolver(int totalCnt, Integer page, Integer pageSize) {
		this(totalCnt, new SearchItem(page, pageSize));
	}
	
	public PageResolver(int totalCnt, SearchItem sc) {
		this.totalCnt = totalCnt;
		this.sc = sc;
		
		doPaging(totalCnt, sc);
	}
	
	public void doPaging(int totalCnt, SearchItem sc) {
		this.totalPage = totalCnt / sc.getPageSize() + (totalCnt % sc.getPageSize() == 0 ? 0 : 1); //(�럹�씠吏� �궡鍮꾧쾶�씠�뀡�쓽)�쟾泥� �럹�씠吏� 媛��닔
		this.sc.setPage(Math.min(sc.getPage(), totalPage));		//�쁽�옱page媛� totalPage蹂대떎 �겕吏� �븡�쓬 //�쟾泥� �럹�씠吏� 媛��닔(totalPage)媛� 10�씠�씪 �븷 �븣 �쁽�옱page�뒗 1~10�궗�씠�뿬�빞 �븿
		this.beginPage = (this.sc.getPage()-1) / NAV_SIZE * NAV_SIZE + 1;	//泥� �럹�씠吏� �닽�옄  11 -> 11, 10 -> 1, 15 -> 11
		this.endPage = Math.min(this.beginPage + this.NAV_SIZE - 1, totalPage);
		this.showPrev = beginPage != 1;
		this.showNext = endPage != totalPage;		
	}
	
	
	public void print() {
		System.out.println("page = " + sc.getPage());
		System.out.print(showPrev ? "PREV " : "");
		
		for(int i=beginPage; i<=endPage; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println(showNext ? " NEXT" : "");
	}

	

	@Override
	public String toString() {
		return "PageResolver [sc=" + sc + ", totalCnt=" + totalCnt + ", totalPage=" + totalPage + ", beginPage="
				+ beginPage + ", endPage=" + endPage + ", showNext=" + showNext + ", showPrev=" + showPrev + "]";
	}

	public SearchItem getSc() {
		return sc;
	}

	public void setSc(SearchItem sc) {
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



















