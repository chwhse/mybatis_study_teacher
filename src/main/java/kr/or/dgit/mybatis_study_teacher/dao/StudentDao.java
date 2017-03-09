package kr.or.dgit.mybatis_study_teacher.dao;

import java.util.List;

import kr.or.dgit.mybatis_study_teacher.dto.Student;

public interface StudentDao {
	Student findStudentById(int studId);
	void insertStudent(Student student);
	void deleteStudent(int studId);
	List<Student> selelctStudentByAll();
}
