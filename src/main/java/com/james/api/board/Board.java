package com.james.api.board;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})


public class Board {

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
