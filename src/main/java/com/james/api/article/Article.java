package com.james.api.article;

import com.james.api.board.Board;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name = "article")

public class Article {
    @Id
    @Column(name = "article_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "board")
    private List<Board> boards;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String writer;

    @Column(name = "register_date")
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
