package com.levitsof.hibernate.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "social_media")
public class SocialMedia implements Serializable {
	@Id
	@Column(name = "idsocial_media")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSocialMedia;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "idsocial_media")
	private Set<TeacherSocialMedia> teacherSocialMedias;

	public SocialMedia() {
		super();
	}

	public SocialMedia(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Long getIdSocialMedia() {
		return idSocialMedia;
	}

	public void setIdSocialMedia(Long idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<TeacherSocialMedia> getTeacherSocialMedias() {
		return teacherSocialMedias;
	}

	public void setTeacherSocialMedias(Set<TeacherSocialMedia> teacherSocialMedias) {
		this.teacherSocialMedias = teacherSocialMedias;
	}

}
