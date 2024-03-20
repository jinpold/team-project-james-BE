package com.james.api.menu;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class Menu {
    private Long id;
    private String item;
    private String category;
    @Builder(builderMethodName = "builder")
    public Menu(Long id, String item, String category) {
        this.id = id;
        this.item = item;
        this.category = category;
    }
}