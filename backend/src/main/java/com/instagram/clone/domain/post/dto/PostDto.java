package com.instagram.clone.domain.post.dto;

import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Component
public abstract class PostDto {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class CreateRequest {
        private String content;
        private List<MultipartFile> files;
    }

    @Data
    @Builder
    @AllArgsConstructor
    public static class CreateResponse {
        private Long id;
        private String content;
        private LocalDateTime createdDate;
        private List<MultipartFile> files;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class UpdateRequest {
        private Long id;
        private String content;
        private List<MultipartFile> files;
    }

    @Data
    @Builder
    @AllArgsConstructor
    public static class UpdateResponse {
        private Long id;
        private String content;
        private LocalDateTime lastModifiedDate;
        private List<MultipartFile> files;
    }

    @Data
    @Builder
    @AllArgsConstructor
    public static class DetailResponse {
        private Long id;
        private String content;
        private LocalDateTime createdDate;
        private LocalDateTime lastModifiedDate;
        private List<MultipartFile> files;
    }
}
