package com.youngtvjobs.ycc.rental;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RentalController{

	@Autowired
	RentalService rentalService;


	//독서실 대여
	@RequestMapping("/rental/studyroom")
	public String studyRoom()
	{
		return "rental/studyRoom";
	}
	//사물함 안내
	@RequestMapping("/rental/locker")
	public String lockerinfo()
	{
		return "rental/lockerinfo";
	}
	//사물함 신청
	@RequestMapping("/rental/locker/reservation")
	public String locker()
	{
		return"rental/locker";
	}
	
	//대관신청
	@GetMapping("/rental/place")
	public String rentalPlace(Model m, HttpServletRequest request)
	{
		//로그인 확인
		if(!logincheck(request)) 
			return "redirect:/login?toURL="+request.getRequestURL();
		
		//dto에서 장소 이름들 받아오는 부분
		try {
			List<RentalDto> placelist = rentalService.selectRentalPlace();
			m.addAttribute("placelist", placelist);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "rental/place";
	}
	
	@GetMapping("/rental/place/{prental_id}")
	@ResponseBody
	public ResponseEntity<List<RentalDto>> list(Integer prental_id) {
		List<RentalDto> list = null;
		
		try {
			list = rentalService.getList(prental_id);
			
			System.out.println("list : " + list);
			return new ResponseEntity<List<RentalDto>>(list, HttpStatus.OK);		//200
			
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<RentalDto>>(HttpStatus.BAD_REQUEST);	//400
		}
		
	}
	
	
	private boolean logincheck(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		return session != null && session.getAttribute("id") != null;
	}
	
}
