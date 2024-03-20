package com.james.api.User;
import com.james.api.enums.Messenger;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
public interface UserService {
    String addUsers();
    String count();
    Map<String, ?> getUserMap();
    String login(User user);
    String updatePassword(User user);
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);
    Map<String, ?> findUsersByJobFromMap(String job);
    Map<String, ?> findUsersByNameFromMap(String name);
    List<?> findUsers () throws SQLException;
    Messenger createTable() throws SQLException;;
    Messenger deleteTable () throws SQLException;
    Messenger insertData(User user) throws SQLException;

}
