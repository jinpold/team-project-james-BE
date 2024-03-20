package com.james.api.board;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name="board")

public class Board {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String boardname;
    private String boardType;

    @Builder(builderMethodName = "builder")
    public Board(int id, String boardname, String boardType) {
        this.id = id;
        this.boardname = boardname;
        this.boardType = boardType;
    }
}
