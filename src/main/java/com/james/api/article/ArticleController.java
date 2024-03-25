package com.james.api.article;

import java.sql.SQLException;
import java.util.List;

public class ArticleController {

    private static ArticleController instance = new ArticleController();

    private ArticleServiceImpl service;

    public static ArticleController getInstance() {
        return instance;
    }

    public ArticleController() {
        this.service = ArticleServiceImpl.getInstnace();
    }

    public List<?> findAll() throws SQLException {
        return service.findAll();
    }
}
