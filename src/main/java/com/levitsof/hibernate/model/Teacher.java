package com.levitsof.hibernate.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {

	@Id
	@Column(name = "idteacher")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTeacher;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany(mappedBy = "teacher") // se saca de la referencia de course
	private Set<Course> courses;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idteacher")
	private Set<TeacherSocialMedia> teacherSocialMedias;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Long getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(Long idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Set<TeacherSocialMedia> getTeacherSocialMedias() {
		return teacherSocialMedias;
	}

	public void setTeacherSocialMedias(Set<TeacherSocialMedia> teacherSocialMedias) {
		this.teacherSocialMedias = teacherSocialMedias;
	}

}
