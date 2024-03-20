package com.james.api.article;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {

    private static ArticleRepository instance;

    static {
        try {
            instance = new ArticleRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection connection;
    private ArticleRepository() throws SQLException {

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jamesdb",
            "james",
            "password");
    }
    public static ArticleRepository getInstance() {
    return instance;
}
    public List<?> findAll() throws SQLException {
        List<Article> ls= new ArrayList<>();
        String sql = "select * from articles";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            do {
                ls.add(Article.builder()
                                .id(rs.getLong("id"))
                                .content(rs.getString("Title"))
                                .writer(rs.getString("Writer"))
                                .registerDate(rs.getString("register_date"))
                                .build());
            } while (rs.next());
        }else{
            System.out.println("NO Data");
        }
        rs.close();
        pstmt.close();
        connection.close();
        return ls;
    }
}
