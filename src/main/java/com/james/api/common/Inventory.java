package com.james.api.common;

import java.util.ArrayList;

public class Inventory<T> {
    private ArrayList<T> inventory; // 원래 있는걸 감싸는걸 랩핑이라고함.

    public Inventory(ArrayList<T> inventory) {
        this.inventory = new ArrayList<>();
    }

    public void add(T t){ //추가
        inventory.add(t);
    }

    public T remove(int i){ //삭제
        return inventory.remove(i);
    }

    public boolean contains(T t){
        return inventory.contains(t);
    }

    public T get (int i){
        return inventory.get(i);
    }

    public void clear(){  //
        inventory.clear();
    }
}


