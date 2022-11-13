package com.youngtvjobs.ycc.course;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

	@RequestMapping("/course/search")
	public String courseSearch(Model m, HttpServletRequest request) {
		
//		List<CourseDto> list = courseService.getSearchResultPage();
//		m.addAttribute("list", list);
		//하기

		
		return "/course/courseSearch";
	}
	
	@RequestMapping("/course/detail")
	public String coursedetail() {
		return "/course/coursedetail";
	}
	
	@RequestMapping("/course/courseinfo")
	public String courseinfo() {
		return "/course/courseinfo";
	}
	
	@RequestMapping("/course/schedule")
	public String courseSchedule() {
		return "/course/courseSchedule";
	}

	@RequestMapping("/course/regcomplete")
	public String courseRegComplete() {
		return "/course/courseRegComplete";
	}
}