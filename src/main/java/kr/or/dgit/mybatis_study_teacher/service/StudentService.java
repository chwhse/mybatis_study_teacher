package kr.or.dgit.mybatis_study_teacher.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_study_teacher.dao.StudentDao;
import kr.or.dgit.mybatis_study_teacher.dto.Student;
import kr.or.dgit.mybatis_study_teacher.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final StudentService instance = new StudentService();

	public static StudentService getInstance() {
		return instance;
	}
	
	private StudentService(){}
	
	public List<Student> selectStudentByAll(){
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
	//	sqlSession.close();
		return studentDao.selelctStudentByAll();
		
	}
}
