package com.softelse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softelse.course.entities.Comment;
import com.softelse.course.repositories.CommentRepository;

@Service
public class CommentService {

	@Autowired
	private CommentRepository repository;
	
	
	public List<Comment> findAll(){
		return repository.findAll();
	}
	
	public Comment findById(Long id) {
		Optional<Comment> obj = repository.findById(id);
		return  obj.get();
	}
	
	public Comment insert(Comment obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Comment update(Long id, Comment obj) {
		Comment entity = repository.getReferenceById(id);
		updatedData(entity, obj);
		return repository.save(entity);
	}

	private void updatedData(Comment entity, Comment obj) {
		entity.setText(obj.getText());
	}
}
