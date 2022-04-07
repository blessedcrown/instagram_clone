package com.instagram.clone.domain.post.service;

import com.instagram.clone.domain.post.dto.PostDto;
import com.instagram.clone.domain.post.entity.Post;

public interface PostService {

    public Post create(PostDto.CreateRequest request) throws Exception;

    public Post update(PostDto.UpdateRequest request, Long id) throws Exception;

    public Post findById(Long id) throws Exception;

    public void delete(Long id) throws Exception;
}
