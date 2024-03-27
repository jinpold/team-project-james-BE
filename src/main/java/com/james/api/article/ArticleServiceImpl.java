package com.james.api.article;
import com.james.api.user.User;
import com.james.api.common.AbstractService;
import com.james.api.enums.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ArticleServiceImpl extends AbstractService implements ArticleService {

    private final ArticleRepository repository;
    @Override
    public List<Article> findAll() throws SQLException {
        return repository.findAll();
    }
    @Override
    public Messenger save(Object o) {
        return null;
    }

    @Override
    public Optional findById(long id) {
        return Optional.empty();
    }

    @Override
    public String count() {
        return null;
    }

    @Override
    public Optional getOne(String id) {
        return Optional.empty();
    }

    @Override
    public String delete(Object o) {
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


