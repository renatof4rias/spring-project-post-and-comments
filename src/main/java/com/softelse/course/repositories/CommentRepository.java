package com.softelse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.course.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
