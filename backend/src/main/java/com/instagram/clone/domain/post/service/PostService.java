package com.instagram.clone.domain.post.service;

import com.instagram.clone.domain.post.dto.PostDto;
import com.instagram.clone.domain.post.entity.Post;

public interface PostService {

    public Long create(PostDto.CreateRequest request);

    public Long update(PostDto.UpdateRequest request, Long id) throws Exception;

    public Post findById(Long id) throws Exception;

    public void delete(Long id) throws Exception;
}
