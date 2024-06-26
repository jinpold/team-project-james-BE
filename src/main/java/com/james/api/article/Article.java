package com.james.api.article;
import com.james.api.board.Board;
import com.james.api.product.Product;
import com.james.api.user.User;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name = "articles")

public class Article {
    @Id
    @Column(name = "article_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "article")
    private List<Board> board;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User writer;
    @Column
    private String title;
    @Column
    private String content;
//    private String writer;

    @Column(name = "register_date")
    private String registerDate;

    @Builder(builderMethodName = "builder")
    public Article(Long id, String title, String content, User writer, String registerDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.registerDate = registerDate;
    }
}
