package com.james.api.User;

import com.james.api.enums.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    @Override
    public String addUsers() {
        return null;
    }

    @Override
    public String count() {
        return null;
    }

    @Override
    public Map<String, ?> getUserMap() {
        return null;
    }

    @Override
    public String login(User user) {
        return null;
    }

    @Override
    public String updatePassword(User user) {
        return null;
    }

    @Override
    public List<?> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<?> findUsersByJob(String job) {
        return null;
    }

    @Override
    public Map<String, ?> findUsersByJobFromMap(String job) {
        return null;
    }

    @Override
    public Map<String, ?> findUsersByNameFromMap(String name) {
        return null;
    }

    @Override
    public List<?> findUsers() throws SQLException {
        return null;
    }

    @Override
    public Messenger createTable() throws SQLException {
        return null;
    }

    @Override
    public Messenger deleteTable() throws SQLException {
        return null;
    }

    @Override
    public Messenger insertData(User user) throws SQLException {
        return null;
    }
}
