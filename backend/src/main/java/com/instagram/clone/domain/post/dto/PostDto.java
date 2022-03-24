package com.instagram.clone.domain.post.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public abstract class PostDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class CreateRequest {
        private String content;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    public static class CreateResponse {
        private Long id;
        private String content;
        private LocalDateTime createdDate;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class UpdateRequest {
        private Long id;
        private String content;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    public static class UpdateResponse {
        private Long id;
        private String content;
        private LocalDateTime lastModifiedDate;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    public static class DetailResponse {
        private Long id;
        private String content;
        private LocalDateTime createdDate;
        private LocalDateTime lastModifiedDate;
    }
}
