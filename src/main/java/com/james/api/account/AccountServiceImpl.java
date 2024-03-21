package com.james.api.account;
import com.james.api.User.User;
import com.james.api.common.AbstractService;
import com.james.api.enums.Messenger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountServiceImpl extends AbstractService<Account> implements AccountService {

    private static AccountServiceImpl instance = new AccountServiceImpl();

    List<Account> accounts;

    private AccountServiceImpl() {
        this.accounts = new ArrayList<>();
    }

    public static AccountServiceImpl getInstance() {
        return instance;
    }

    @Override
    public String deposit(Account account) {
        return null;
    }

    @Override
    public String withdraw(Account account) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }


    @Override
    public Messenger save(Account account) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Optional<Account> findById(long id) {
        return Optional.empty();
    }

    @Override
    public String count() {
        return "";
    }

    @Override
    public Optional<Account> getOne(String id) {
        return Optional.empty();
    }

    @Override
    public String delete(Account account) {
        return null;
    }

    @Override
    public String deleteAll() {
        return null;
    }

    @Override
    public Boolean existsById(long id) {
        return null;
    }

    @Override
    public Messenger insertMenuData(User user) throws SQLException {
        return null;
    }

}
