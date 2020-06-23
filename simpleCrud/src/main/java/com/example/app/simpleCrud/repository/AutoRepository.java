package com.example.app.simpleCrud.repository;

import com.example.app.simpleCrud.entity.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutoRepository extends JpaRepository<Auto , Integer> {

}
