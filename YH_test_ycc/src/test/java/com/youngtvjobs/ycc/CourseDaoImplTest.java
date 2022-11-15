package com.youngtvjobs.ycc;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.youngtvjobs.ycc.course.CourseDao;
import com.youngtvjobs.ycc.course.CourseDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class CourseDaoImplTest {
	
	@Autowired
	private CourseDao courseDao;
	
	@Test
	public void insertTest() throws Exception{
		
		for(int i=1; i<=151; i++) {
			CourseDto courseDto = new CourseDto(i, "���� ���ʹ�"+i, "", new Date(), new Date(), new Date(), new Date(), "��, ��, ��", "07:00 ~ 7:50", "����", 89000, "���� ���ʹ� �����Դϴ�.", "jiho", "1", "����ȣ");
			courseDao.insert(courseDto);
		}
		
	}

}
