package com.james.api.menu;

import com.james.api.enums.Messenger;

import java.sql.SQLException;
import java.util.List;

public class MenuServiceImpl implements MenuService{

    MenuRepository menuRepository;

    public MenuServiceImpl() {
        this.menuRepository = menuRepository.getInstance();
    }

    private static MenuServiceImpl instance = new MenuServiceImpl();

    public static MenuServiceImpl getInstance() {
        return instance;
    }

    @Override
    public Messenger insertMenuData(Menu menu) throws SQLException {
        return menuRepository.insertMenuData(menu);
    }

    @Override
    public Messenger createMenuTable() throws SQLException {
        return menuRepository.createMenuTable();
    }

    @Override
    public Messenger deleteMenuTable() throws SQLException {
        return menuRepository.deleteMenuTable();
    }

    @Override
    public void insertMenus() throws SQLException {
        String[] categories = {"navigate", "user", "account", "article", "board", "soccer"};
        String[][] menus = {{"x", "usr", "acc", "cwl", "art", "bbs","scc"},
                {"x", "mk", "joi", "log", "cat", "ch-pw", "rm",
                        "ls-a", "ls-n", "ls-job", "cnt"},
                {"x", "mk", "touch", "with", "depo", "bal", "rm", "cat", "ls-a"},
                {"x", "mk"},
                {"x", "mk"},
                {"x", "mk"},
        };
        for(int i = 0; i < menus.length; i++)
            for(int j = 0; j < menus[i].length; j++)
                menuRepository.insertMenus(Menu.builder().category(categories[i]).item(menus[i][j]).build());
    }
    @Override
    public List<?> selectTable() throws SQLException {
        return menuRepository.selectTable();
    }
    @Override
    public Messenger returnMessenger() throws SQLException {
        Messenger m = menuRepository.returnMessenger();
        return m;
    }

    @Override
    public Menu returnOneMenu() throws SQLException {
        Menu m = menuRepository.returnOneMenu();
        return m;
    }

    @Override
    public List<?> returnAllMenus() throws SQLException {
        List<?> ls = menuRepository.returnAllMenus();
        return ls;
    }
}


