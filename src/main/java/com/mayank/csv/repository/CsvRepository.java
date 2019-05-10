package com.mayank.csv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mayank.csv.model.User;

@Repository
public interface CsvRepository extends JpaRepository<User, Integer> {

}
