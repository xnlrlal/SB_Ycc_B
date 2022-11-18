package com.youngtvjobs.ycc.board;

import java.util.Date;
import java.util.Objects;

import org.springframework.web.util.UriComponentsBuilder;

public class BoardDto {

	//inq_board
	private String inq_cate;
	private Integer inq_id;
	private String inq_title;
	private String inq_content;
	private Date inq_date;
	private boolean inq_YN;
	
	//article
	private Integer article_id;
	private Date article_date;
	private String artilce_contents;
	private String article_board_type;
	private String user_id;
	private String article_title;
	
	public BoardDto() {
		// TODO Auto-generated constructor stub
	}

	
	
	public BoardDto(Integer article_id, Date article_date, String artilce_contents, String article_board_type,
			String user_id, String article_title) {
		super();
		this.article_id = article_id;
		this.article_date = article_date;
		this.artilce_contents = artilce_contents;
		this.article_board_type = article_board_type;
		this.user_id = user_id;
		this.article_title = article_title;
	}



	public BoardDto(String inq_cate, Integer inq_id, String inq_title, String inq_content, Date inq_date,
			boolean inq_YN, Integer article_id, Date article_date, String artilce_contents, String article_board_type,
			String user_id, String article_title) {
		super();
		this.inq_cate = inq_cate;
		this.inq_id = inq_id;
		this.inq_title = inq_title;
		this.inq_content = inq_content;
		this.inq_date = inq_date;
		this.inq_YN = inq_YN;
		this.article_id = article_id;
		this.article_date = article_date;
		this.artilce_contents = artilce_contents;
		this.article_board_type = article_board_type;
		this.user_id = user_id;
		this.article_title = article_title;
	}

//	public String getQueryString() {
//		return getQueryString(article_board_type);
//	}
//	
//	// ?page=10&pageSize=10&option=A&keyword=title
//	public String getQueryString(String article_board_type) {
//		return UriComponentsBuilder.newInstance()	
//				.queryParam("type", article_board_type)
//				.build().toString();
//	}
	
	
	
//	private Integer article_id;
//	private Date article_date;
//	private String artilce_contents;
//	private String article_board_type;
//	private String user_id;
//	private String article_title;
//	public String getQueryString() {
//		return getQueryString(page);
//	}
	
	// ?page=10&pageSize=10&option=A&keyword=title
//	public String getQueryString(Integer page) {
//		return UriComponentsBuilder.newInstance()	//��ü ����
//				.queryParam("page", page)
//				.queryParam("pageSize", pageSize)
//				.queryParam("option", option)
//				.queryParam("keyword", keyword)
//				.build().toString();
//	}
	
	
	
	public String getInq_cate() {
		return inq_cate;
	}

	public void setInq_cate(String inq_cate) {
		this.inq_cate = inq_cate;
	}

	public Integer getInq_id() {
		return inq_id;
	}

	public void setInq_id(Integer inq_id) {
		this.inq_id = inq_id;
	}

	public String getInq_title() {
		return inq_title;
	}

	public void setInq_title(String inq_title) {
		this.inq_title = inq_title;
	}

	public String getInq_content() {
		return inq_content;
	}

	public void setInq_content(String inq_content) {
		this.inq_content = inq_content;
	}

	public Date getInq_date() {
		return inq_date;
	}

	public void setInq_date(Date inq_date) {
		this.inq_date = inq_date;
	}

	public boolean isInq_YN() {
		return inq_YN;
	}

	public void setInq_YN(boolean inq_YN) {
		this.inq_YN = inq_YN;
	}

	public Integer getArticle_id() {
		return article_id;
	}

	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}

	public Date getArticle_date() {
		return article_date;
	}

	public void setArticle_date(Date article_date) {
		this.article_date = article_date;
	}

	public String getArtilce_contents() {
		return artilce_contents;
	}

	public void setArtilce_contents(String artilce_contents) {
		this.artilce_contents = artilce_contents;
	}

	public String getArticle_board_type() {
		return article_board_type;
	}

	public void setArticle_board_type(String article_board_type) {
		this.article_board_type = article_board_type;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(article_board_type, article_date, article_id, article_title, artilce_contents, inq_YN,
				inq_cate, inq_content, inq_date, inq_id, inq_title, user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardDto other = (BoardDto) obj;
		return Objects.equals(article_board_type, other.article_board_type)
				&& Objects.equals(article_date, other.article_date) && Objects.equals(article_id, other.article_id)
				&& Objects.equals(article_title, other.article_title)
				&& Objects.equals(artilce_contents, other.artilce_contents) && inq_YN == other.inq_YN
				&& Objects.equals(inq_cate, other.inq_cate) && Objects.equals(inq_content, other.inq_content)
				&& Objects.equals(inq_date, other.inq_date) && Objects.equals(inq_id, other.inq_id)
				&& Objects.equals(inq_title, other.inq_title) && Objects.equals(user_id, other.user_id);
	}
	
	
}
