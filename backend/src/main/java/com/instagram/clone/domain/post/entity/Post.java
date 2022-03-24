package com.instagram.clone.domain.post.entity;

import com.instagram.clone.domain.BaseEntity;
import com.instagram.clone.domain.reply.entity.Reply;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
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
    private List<Reply> replies = new ArrayList<>();
}
