package com.springjpa.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.jpa.models.Video;

public interface VideoRepository  extends JpaRepository<Video,  Integer>{

}
