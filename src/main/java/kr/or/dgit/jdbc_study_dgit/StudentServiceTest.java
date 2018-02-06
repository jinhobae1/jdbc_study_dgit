package kr.or.dgit.jdbc_study_dgit;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.hamcrest.core.IsNot;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdbc_study.dto.Student;
import kr.or.dgit.jdbc_study_dgit.service.StudentService;

public class StudentServiceTest {
	private  static StudentService service;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = StudentService.getInstance();
		
	}

	@After
	public void tearDown() throws Exception {
		service = null;
	}

	@Test
	public void testFindAllStudents() {
		List<Student> list = service.findAllStudents();
		Assert.isNonEmpty(list);
		
	}

}
