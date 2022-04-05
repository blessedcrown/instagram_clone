package com.instagram.clone.domain.picture.repository;

import com.instagram.clone.domain.picture.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long> {
    List<Picture> findAllByPostId(Long postId);
}
