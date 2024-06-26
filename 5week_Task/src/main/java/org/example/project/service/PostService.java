package org.example.project.service;

import jakarta.transaction.Transactional;
import org.example.project.Repository.MemberRepository;
import org.example.project.Repository.PostRepository;
import org.example.project.domain.Member;
import org.example.project.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }
    @Transactional
    public Post registerPost(Post post) {
        return postRepository.save(post);
    }
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }
}
