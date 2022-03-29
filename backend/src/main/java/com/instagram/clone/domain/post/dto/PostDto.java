package com.instagram.clone.domain.post.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public abstract class PostDto {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class CreateRequest {
        private String content;
    }

    @Data
    @Builder
    @AllArgsConstructor
    public static class CreateResponse {
        private Long id;
        private String content;
        private LocalDateTime createdDate;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class UpdateRequest {
        private Long id;
        private String content;
    }

    @Data
    @Builder
    @AllArgsConstructor
    public static class UpdateResponse {
        private Long id;
        private String content;
        private LocalDateTime lastModifiedDate;
    }

    @Data
    @Builder
    @AllArgsConstructor
    public static class DetailResponse {
        private Long id;
        private String content;
        private LocalDateTime createdDate;
        private LocalDateTime lastModifiedDate;
    }
}
