package com.james.api.user;
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

    private final UserRepository repository;

    @PostMapping("/api/login")
    public Map<String, ?> login(@RequestBody Map<?, ?> paraMap) {
        Map<String, Messenger> map = new HashMap<>();
        String username = (String) paraMap.get("username");
        String password = (String) paraMap.get("password");
        User optUser = repository.findByUsername(username).orElse(null);
        if (optUser == null) {
            map.put("message", Messenger.FAIL);


        } else if (!optUser.getPassword().equals(password)) {
            map.put("message", Messenger.WRONG_PASSWORD);

        } else {
            map.put("message", Messenger.SUCCESS);
        }
        return map; // Response.data = ResposeBody
    }

    @PostMapping(path="/api/user")
    public Map<String, ?>join(@RequestBody Map<String, ?> paraMap){
        String strHeight = String.valueOf(paraMap.get("height"));
        String strWeight = String.valueOf(paraMap.get("weight"));

        User newUser = repository.save(User.builder()
                .username((String) paraMap.get("username"))
                .password((String) paraMap.get("password"))
                .checkPassword((String) paraMap.get("checkPassword"))
                .name((String) paraMap.get("name"))
                .phone((String) paraMap.get("phone"))
                .job((String) paraMap.get("job"))
                .height(Double.parseDouble(strHeight))
                .weight(Double.parseDouble(strWeight))
                .build());
        System.out.println("DB에 저장된 User 정보:" + newUser);
        Map<String, Messenger> map = new HashMap<>();
        map.put("result", Messenger.SUCCESS);
        return map;
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
