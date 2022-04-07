package com.instagram.clone.domain.post.service;

import com.instagram.clone.domain.picture.entity.Picture;
import com.instagram.clone.domain.picture.handler.FileHandler;
import com.instagram.clone.domain.post.dto.PostDto;
import com.instagram.clone.domain.post.dto.PostMapper;
import com.instagram.clone.domain.post.entity.Post;
import com.instagram.clone.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class PostServiceImpl implements PostService{

    private final PostMapper postMapper;
    private final PostRepository postRepository;
    private final FileHandler fileHandler;

    @Override
    public Post create(PostDto.CreateRequest request) throws Exception {
        Post post = postMapper.toEntity(request);
        List<Picture> pictures = fileHandler.parseFileInfo(request.getFiles());
        if (pictures.isEmpty()) {
            //DTO에 nullable false 지정 해줘야 한다
        }
        else {
            post.attachPictures(pictures);
        }
        Post saved = postRepository.save(post);
        return saved;
    }

    @Override
    public Post update(PostDto.UpdateRequest request, Long id) throws Exception {
        Post post = postRepository.findById(id).orElseThrow(() -> new Exception("not found"));
        Post toUpdate = postMapper.toEntity(request);
        post.update(toUpdate);
        return post;
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
