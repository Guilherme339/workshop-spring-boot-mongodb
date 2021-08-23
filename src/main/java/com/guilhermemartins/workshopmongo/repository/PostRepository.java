package com.guilhermemartins.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.guilhermemartins.workshopmongo.domain.Post;
import com.guilhermemartins.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
