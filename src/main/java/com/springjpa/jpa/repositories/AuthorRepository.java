package com.springjpa.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.jpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    
}
