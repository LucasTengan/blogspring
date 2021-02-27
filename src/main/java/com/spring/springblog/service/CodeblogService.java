package com.spring.springblog.service;

import com.spring.springblog.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
