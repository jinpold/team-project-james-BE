package com.james.api.common;
import com.james.api.User.User;
import com.james.api.enums.Messenger;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public abstract class AbstractService <T> {
    public abstract Messenger save (T t);

    public abstract List<T> findAll() throws SQLException;

    public abstract Optional<T> findById(long id); // id = 머신이 사용하는 숫자 아이디

    public abstract String count();

    public  abstract  Optional<T> getOne(String id); // id = 사람이 쓰는 영문 아이디

    public  abstract  String delete(T t);

    public  abstract  String deleteAll();

    public  abstract  Boolean existsById(long id);


    public abstract Messenger insertMenuData(User user) throws SQLException;
}
