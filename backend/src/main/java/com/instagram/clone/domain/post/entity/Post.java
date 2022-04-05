package com.instagram.clone.domain.post.entity;

import com.instagram.clone.domain.BaseEntity;
import com.instagram.clone.domain.picture.entity.Picture;
import com.instagram.clone.domain.reply.entity.Reply;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Post extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POST_ID")
    private Long id;

    @Column(nullable = false)
    private String content;

    @OneToMany(mappedBy = "post")
    private final List<Reply> replies = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private final List<Picture> pictures = new ArrayList<>();

    public void update(Post post) {
        this.content = post.getContent();
    }
}
