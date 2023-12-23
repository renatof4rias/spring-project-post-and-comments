package com.softelse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.course.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
