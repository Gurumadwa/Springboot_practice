package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entity.Posts;

public interface PostsRepository extends JpaRepository<Posts, Integer>{

}
