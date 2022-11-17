package com.youngtvjobs.ycc.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	
	@Autowired
	CourseDao courseDao;
	
	
	@RequestMapping("/course/search")
	public String courseSearch(Model m){
		try {
		
			List<CourseDto> list = courseDao.selectCourselist();
			m.addAttribute("list", list);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

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