

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.youngtvjobs.ycc.course.CourseDao;
import com.youngtvjobs.ycc.course.CourseDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DBConnectionTestT1
{	
	//데이터베이스 커넥션 테스트
	@Test
	public void springJdbcConnectionTest1() throws SQLException
	{
		ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");

		DataSource ds = ac.getBean(DataSource.class);
		// 1) 데이터베이스의 연결을 얻음.
		Connection conn = ds.getConnection();

		 //괄호안의 조건식이 true면 테스트 성공, 아니면 실패
		assertTrue(conn != null);
	}
	
	@Autowired 
	private CourseDao courseDao;
	
	@Test
	public void insertDummyDataTest() throws Exception {
		courseDao.deleteAll();
		DateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
		
		for (int i = 1; i<=50; i++) {
			CourseDto courseDto = 
					new CourseDto(i, "수영 기초반"+i, "photo", sdformat.parse("2022-11-01"), sdformat.parse("2022-11-30"), sdformat.parse("2022-12-01"), sdformat.parse("2022-12-31"), "화 목 토", "09:00 ~ 10:00", "성인", 98000, "수영 배우기", "admin", "pool");
			
			courseDao.insert(courseDto);
		}
	}
}