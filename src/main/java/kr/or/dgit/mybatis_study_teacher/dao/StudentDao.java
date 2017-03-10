package kr.or.dgit.mybatis_study_teacher.dao;

import java.util.List;

import kr.or.dgit.mybatis_study_teacher.dto.Student;

public interface StudentDao {
	
	List<Student> selelctStudentByAll();
	int insertStudent(Student student);
	int insertStudentWithPhone(Student student);//typehandler예제
	Student SelectStudentByNo(int studId);
	int updateStudent(Student student); 
	int deleteStudent(int studNo);
	
}
