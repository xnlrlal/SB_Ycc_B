package com.youngtvjobs.ycc.course;

import java.sql.Date;

public class CourseDto {
	
	private int course_id;
	private String course_nm;
	private String course_image;
	private Date course_reg_start_date;
	private Date course_reg_end_date;
	private Date course_start_date;
	private Date course_end_date;
	private String course_day;
	private String course_time; //구글링
	private String course_target;
	private int course_cost;
	private String course_info;
	private String user_id;
	private String croom_id;
	
	public CourseDto() {
		// TODO Auto-generated constructor stub
	}

	public CourseDto(int course_id, String course_nm, String course_image, Date course_reg_start_date,
			Date course_reg_end_date, Date course_start_date, Date course_end_date, String course_day,
			String course_time, String course_target, int course_cost, String course_info, String user_id,
			String croom_id) {
		//super();
		this.course_id = course_id;
		this.course_nm = course_nm;
		this.course_image = course_image;
		this.course_reg_start_date = course_reg_start_date;
		this.course_reg_end_date = course_reg_end_date;
		this.course_start_date = course_start_date;
		this.course_end_date = course_end_date;
		this.course_day = course_day;
		this.course_time = course_time;
		this.course_target = course_target;
		this.course_cost = course_cost;
		this.course_info = course_info;
		this.user_id = user_id;
		this.croom_id = croom_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_nm() {
		return course_nm;
	}

	public void setCourse_nm(String course_nm) {
		this.course_nm = course_nm;
	}

	public String getCourse_image() {
		return course_image;
	}

	public void setCourse_image(String course_image) {
		this.course_image = course_image;
	}

	public Date getCourse_reg_start_date() {
		return course_reg_start_date;
	}

	public void setCourse_reg_start_date(Date course_reg_start_date) {
		this.course_reg_start_date = course_reg_start_date;
	}

	public Date getCourse_reg_end_date() {
		return course_reg_end_date;
	}

	public void setCourse_reg_end_date(Date course_reg_end_date) {
		this.course_reg_end_date = course_reg_end_date;
	}

	public Date getCourse_start_date() {
		return course_start_date;
	}

	public void setCourse_start_date(Date course_start_date) {
		this.course_start_date = course_start_date;
	}

	public Date getCourse_end_date() {
		return course_end_date;
	}

	public void setCourse_end_date(Date course_end_date) {
		this.course_end_date = course_end_date;
	}

	public String getCourse_day() {
		return course_day;
	}

	public void setCourse_day(String course_day) {
		this.course_day = course_day;
	}

	public String getCourse_time() {
		return course_time;
	}

	public void setCourse_time(String course_time) {
		this.course_time = course_time;
	}

	public String getCourse_target() {
		return course_target;
	}

	public void setCourse_target(String course_target) {
		this.course_target = course_target;
	}

	public int getCourse_cost() {
		return course_cost;
	}

	public void setCourse_cost(int course_cost) {
		this.course_cost = course_cost;
	}

	public String getCourse_info() {
		return course_info;
	}

	public void setCourse_info(String course_info) {
		this.course_info = course_info;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCroom_id() {
		return croom_id;
	}

	public void setCroom_id(String croom_id) {
		this.croom_id = croom_id;
	}

	@Override
	public String toString() {
		return "CourseDto [course_id=" + course_id + ", course_nm=" + course_nm + ", course_image=" + course_image
				+ ", course_reg_start_date=" + course_reg_start_date + ", course_reg_end_date=" + course_reg_end_date
				+ ", course_start_date=" + course_start_date + ", course_end_date=" + course_end_date + ", course_day="
				+ course_day + ", course_time=" + course_time + ", course_target=" + course_target + ", course_cost="
				+ course_cost + ", course_info=" + course_info + ", user_id=" + user_id + ", croom_id=" + croom_id
				+ "]";
	}
	
	
	

}
