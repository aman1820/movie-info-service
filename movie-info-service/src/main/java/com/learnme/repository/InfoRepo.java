package com.learnme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnme.model.Movie;

@Repository
public interface InfoRepo extends JpaRepository<Movie, String> {

}
