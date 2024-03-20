package com.james.api.common;
import java.io.IOException;
import java.util.Map;

public abstract class AbstractRepository {
    // abstract class 클래스이름 {
    public abstract Map<String, ?> save(Map<String, ?> paraMap) throws IOException;

    public abstract Map<String, ?> saveMelon(Map<String, ?> paraMap) throws IOException;
    // abstract 반환타입 메소드이름();
}
