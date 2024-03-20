package com.james.api.article;
import com.james.api.User.User;
import com.james.api.common.AbstractService;
import com.james.api.enums.Messenger;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ArticleServiceImpl extends AbstractService implements ArticleService {

    private ArticleRepository articleRepository;
    private static ArticleServiceImpl instnace = new ArticleServiceImpl();

    private ArticleServiceImpl() {
        this.articleRepository = ArticleRepository.getInstance();
    }
    public static ArticleServiceImpl getInstnace() {
        return instnace;
    }
    @Override
    public List<?> findAll() throws SQLException {
        return articleRepository.findAll();
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


