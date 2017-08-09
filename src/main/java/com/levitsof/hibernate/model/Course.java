package com.levitsof.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course implements Serializable {

	@Id
	@Column(name = "idcourse")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCourse;

	@Column(name = "namecourse")
	private String nombre;

	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "idteacher")
	private Teacher teacher;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Long getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
