package com.youngtvjobs.ycc.course;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	
	@Autowired
	CourseService courseService;

	@RequestMapping("/course/courseSearch")
	public String courseSearch(Model m, HttpServletRequest request, SearchItem sc) {

	
		if(!loginCheck(request)) {
			return "redirect:/member/loginForm?toURL=" + request.getRequestURL();
		}
		try {
			int totalCnt = courseService.getSearchResultCnt(sc);
			m.addAttribute("totalCnt", totalCnt);
			
			CoursePageResolver pageResolver = new CoursePageResolver(totalCnt, sc);
			
			List<CourseDto> list = courseService.getSearchResultPage(sc);
			m.addAttribute("list", list);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "/course/courseSearch";
	}
	
	private boolean loginCheck(HttpServletRequest request) {
		// 1. 세션을 얻고
		HttpSession session = request.getSession(false); // false 는 session이 없어도 따로 생성 X
		// 2. 세션에 id가 있는지 확인 후 있으면 true로 반환
		return session != null && session.getAttribute("id") != null;
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