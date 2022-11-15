import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.youngtvjobs.ycc.course.CourseDao;
import com.youngtvjobs.ycc.course.CourseDto;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"} )
public class CourseDaoImplTest2 {

	@Autowired
	private CourseDao courseDao;
	
	@Test
	public void insertDummyDataTest() throws Exception {
		courseDao.deleteAll();
		DateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		for (int i=1; i<=250; i++) {
			CourseDto courseDto = 
					new CourseDto(i, "이젠웹개발"+i, null, sdFormat.parse("2022-11-01"), sdFormat.parse("2022-11-30"), sdFormat.parse("2022-12-01"), sdFormat.parse("2023-01-31")
							, "월수금", "09:00~12:00", "모두", 100000, "웹개발과정"+i, "ezen", "201", "접수중");
			courseDao.insert(courseDto);
		}
	}
}
