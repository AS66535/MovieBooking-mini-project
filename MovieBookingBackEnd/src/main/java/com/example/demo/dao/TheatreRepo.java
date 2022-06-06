package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.modal.City;
import com.example.demo.modal.Theatre;


public interface TheatreRepo extends JpaRepository<Theatre,String> {

@Query("from Theatre")
public List<Theatre> oncat(String theatre);

Theatre findByTheatreName(String theatrename);



}