package com.james.api.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box<T> {
    private Map<String, T> box;

    private List<String> box2;

    public Box() {
        this.box = new HashMap<>();
    }

    public T put(String key, T value) {
        return box.put(key, value);
    }

    public T get(String key) {
        return box.get(key);
    }

    public int size() {
        return box.size();
    }

    public void put(List<String> keys, Inventory<T> values) {
        box = new HashMap<>(); // 다른로직이랑 섞일까봐 생성자 새로 생성함
        for(int i =0; i<box.size(); i++){ // 람다 리스트 2개 담는 방법
            box.put(keys.get(i), values.get(i));
        }
        box.forEach((k, v)-> System.out.println(String.format("%s: %s", k, v)));
        // 람다식 출력

    }


}
