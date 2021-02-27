package com.spring.springblog.service.serviceImplement;

import com.spring.springblog.model.Post;
import com.spring.springblog.repository.PostRepository;
import com.spring.springblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CodeblogServiceImplement implements CodeblogService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        Optional<Post> postProcurado = postRepository.findById(id);
        if(postProcurado.isPresent()) return postProcurado.get();

        return null;
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
