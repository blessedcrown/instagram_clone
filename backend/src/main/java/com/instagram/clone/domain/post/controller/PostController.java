package com.instagram.clone.domain.post.controller;

import com.instagram.clone.domain.post.dto.PostDto;
import com.instagram.clone.domain.post.entity.Post;
import com.instagram.clone.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/post", consumes = "multipart/form-data", produces = "application/json; charset=UTF8")
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody PostDto.CreateRequest request) throws Exception {
        Post post = postService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) throws Exception {
        Post post = postService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(post);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody PostDto.UpdateRequest request) throws Exception {
        Post post = postService.update(request, id);
        return ResponseEntity.status(HttpStatus.OK).body(post);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws Exception{
        postService.delete(id);
    }


}
