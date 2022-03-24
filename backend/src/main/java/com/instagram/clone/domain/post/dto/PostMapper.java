package com.instagram.clone.domain.post.dto;

import com.instagram.clone.domain.post.entity.Post;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    public Post toEntity(PostDto.CreateRequest request) {
        return Post.builder()
                .content(request.getContent())
                .build();
    }

    public Post toEntity(PostDto.UpdateRequest request) {
        return Post.builder()
                .id(request.getId())
                .content(request.getContent())
                .build();
    }
    public PostDto.CreateResponse toCreateResponse(Post post) {
        return PostDto.CreateResponse.builder()
                .id(post.getId())
                .content(post.getContent())
                .build();
    }

    public PostDto.UpdateResponse toUpdateResponse(Post post) {
        return PostDto.UpdateResponse.builder()
                .id(post.getId())
                .content(post.getContent())
                .lastModifiedDate(post.getLastModifiedDate())
                .build();
    }

    public PostDto.DetailResponse toDetailResponse(Post post) {
        return PostDto.DetailResponse.builder()
                .id(post.getId())
                .content(post.getContent())
                .createdDate(post.getCreatedDate())
                .lastModifiedDate(post.getLastModifiedDate())
                .build();
    }
}
