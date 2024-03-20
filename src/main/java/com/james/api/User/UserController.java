package com.james.api.User;
import com.james.api.enums.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@CrossOrigin(origins = "http://localhost:3000") //1번 문 열어주기
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/login")
        public Map<String, ?> login(@RequestBody Map<String, ?> paraMap){
        Map<String,String> map = new HashMap<>();
        String username = (String) paraMap.get("username");
        String password = (String) paraMap.get("password");
        System.out.println("리퀘스트가 가져온 ID : " +username);
        System.out.println("리퀘스트가 가져온 PW : " +password);

        map.put("username", username);
        map.put("password", password);
        return map;
    }

    public Map<String, ?> save(@RequestBody Map<String, ?> paraMap) throws SQLException {
        System.out.println("\"아이디, 비밀번호, 비밀번호확인, 이름, 전화번호, 폰번호, 주소, 직업을 입력하세요\"");
        return null;
    }

    public List<User> findAll() {
        return null;
    }

    public Map<String, ?> findById(@RequestBody Map<String, ?> paraMap) {
        return null;
    }

    public Map<String, ?> updatePassword(@RequestBody Map<String, ?> paraMap) {

        return null;
    }

    public Map<String, ?> deleteUser(@RequestBody Map<String, ?> paraMap) {
        return null;
    }

    public Map<String, ?> existsById(@RequestBody Map<String, ?> paraMap) {
        return null;
    }

    public Map<String, ?> findUsersByName(@RequestBody Map<String, ?> paraMap) {
        return null;
    }

    public Map<String, ?> findUsersByNameFromMap(@RequestBody Map<String, ?> paraMap) {
        return null;
    }

    public Map<String, ?> findUsersByJob(@RequestBody Map<String, ?> paraMap) {
        return null;
    }

    public Map<String, ?> count() {
        return null;
    }

    public Map<String, ?> getOne(@RequestBody Map<String, ?> paraMap) {
        return null;
    }

    public Map<String, ?> getUserMap() {
        return null;
    }
    public Map<String, ?> findUsers() throws SQLException {
        return null;
    }
    public Messenger createTable() throws SQLException {
        return null;
    }
    public Messenger deleteTable() throws SQLException {
        return null;
    }
    public Messenger insertData(Scanner sc) throws SQLException {
        return null;
    }
    public void sqlClose() throws SQLException {
        return;
    }
}
