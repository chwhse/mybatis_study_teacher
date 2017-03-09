package mybatis_study_teacher;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_study_teacher.dto.Student;
import kr.or.dgit.mybatis_study_teacher.service.StudentService;

public class StudentDaoTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testSelectStudentByAll() {
		List<Student> lists = studentService.selectStudentByAll();
		for(Student s : lists){
			System.out.println(s);
		}
		Assert.assertNotNull(lists);
	}
/*	@Test
	public void testInsertStudent() {
		Student student = new Student(4, "조시은", "chwhse@gmail.com", new Date());
		
		int res = studentService.insertStudent(student);
		
		Assert.assertEquals(1, res);
	}*/

}
