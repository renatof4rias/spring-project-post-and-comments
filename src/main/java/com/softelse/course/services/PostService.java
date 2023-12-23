package com.softelse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softelse.course.entities.Post;
import com.softelse.course.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public List<Post> findAll(){	
		return repository.findAll();
	}
	
	public Post findById(Long id) {
		Optional<Post> obj = repository.findById(id);
		return obj.get();
	}
	
	public Post insert(Post obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Post update(Long id, Post obj) {
		Post entity = repository.getReferenceById(id);
		updatedData(entity, obj);
		return repository.save(entity);
	}

	private void updatedData(Post entity, Post obj) {
		entity.setTitle(obj.getTitle());
		entity.setBody(obj.getBody());
	}
	
}
