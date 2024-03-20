package com.james.api.article;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name = "article")

public class Article {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String registerDate;

    @Builder(builderMethodName = "builder")
    public Article(long id, String title, String content, String writer, String registerDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.registerDate = registerDate;
    }
}
