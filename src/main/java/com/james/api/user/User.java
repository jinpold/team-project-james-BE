package com.james.api.user;
import com.james.api.account.Account;
import com.james.api.article.Article;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "writer")
    private List<Article> article;

    @Column
    private String username;
    @Column
    private String password;
    @Column(name = "check_Password")
    private String checkPassword;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String job;
    @Column
    private double height;
    @Column
    private double weight;

    @Builder(builderMethodName = "builder")
    public User(Long id, String username, String password, String checkPassword,
                String name, String phone, String job, double height, double weight) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.checkPassword = checkPassword;
        this.name = name;
        this.phone = phone;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }
}