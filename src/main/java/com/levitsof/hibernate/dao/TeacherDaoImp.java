package com.levitsof.hibernate.dao;

import java.util.List;

import com.levitsof.hibernate.model.Teacher;

public class TeacherDaoImp extends LevitsofSession implements TeacherDao {

	private LevitsofSession levitsofSession;
	public TeacherDaoImp() {
		levitsofSession = new LevitsofSession();
	}

	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub

	}

	public List<Teacher> findAllTeacher() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteTeacher(Long idTeacher) {
		// TODO Auto-generated method stub

	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub

	}

	public Teacher findTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	public Teacher findTeacherByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
