package kr.or.dgit.mybatis_study_teacher.dao;

import java.util.List;

import kr.or.dgit.mybatis_study_teacher.dto.Student;

public interface StudentDao {
	int insertStudent(Student student);
	List<Student> selelctStudentByAll();
}
