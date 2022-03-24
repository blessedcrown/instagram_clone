package com.instagram.clone.domain.post.service;

import com.instagram.clone.domain.post.dto.PostDto;
import com.instagram.clone.domain.post.dto.PostMapper;
import com.instagram.clone.domain.post.entity.Post;
import com.instagram.clone.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class PostServiceImpl implements PostService{

    private final PostMapper postMapper;
    private final PostRepository postRepository;

    @Override
    public Long create(PostDto.CreateRequest request) {
        Post saved = postRepository.save(postMapper.toEntity(request));
        return saved.getId();
    }

    @Override
    public Long update(PostDto.UpdateRequest request, Long id) throws Exception {
        Post post = postRepository.findById(id).orElseThrow(() -> new Exception("not found"));
        Post toUpdate = postMapper.toEntity(request);
        post.update(toUpdate);
        return id;
    }

    @Override
    public Post findById(Long id) throws Exception {
        return  postRepository.findById(id).orElseThrow(() -> new Exception("not found"));
    }

    @Override
    public void delete(Long id) throws Exception {
        Post toDelete = postRepository.findById(id).orElseThrow(() -> new Exception("not found"));
        postRepository.delete(toDelete);
    }
}
