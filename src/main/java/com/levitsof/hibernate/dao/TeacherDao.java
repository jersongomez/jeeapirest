package com.levitsof.hibernate.dao;

import java.util.List;

import com.levitsof.hibernate.model.Teacher;

public interface TeacherDao {

	void saveTeacher(Teacher teacher);

	List<Teacher> findAllTeacher();

	void deleteTeacher(Long idTeacher);

	void updateTeacher(Teacher teacher);

	Teacher findTeacherById(Long idTeacher);

	Teacher findTeacherByName(String name);
}
