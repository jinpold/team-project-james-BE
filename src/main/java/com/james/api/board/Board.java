package com.james.api.board;
import com.james.api.article.Article;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name="board")

public class Board {
    @Id
    @Column(name = "board_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @Column(name = "board_name")
    private String boardName;

    @Column(name = "board_type")
    private String boardType;


    @Builder(builderMethodName = "builder")
    public Board(int id, String boardName, String boardType) {
        this.id = id;
        this.boardName = boardName;
        this.boardType = boardType;
    }
}
