package com.test.alumno.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.alumno.repository.Alumno;

public interface AlumnoDAO extends JpaRepository<Alumno, Integer> {

}
