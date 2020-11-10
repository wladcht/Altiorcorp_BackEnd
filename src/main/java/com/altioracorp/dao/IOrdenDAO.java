package com.altioracorp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altioracorp.model.Orden;

public interface IOrdenDAO extends JpaRepository<Orden, Integer>{

}
