package com.james.api.menu;

import com.james.api.enums.Messenger;

import java.sql.SQLException;
import java.util.List;

public class MenuController{
    MenuServiceImpl menuService;

    public MenuController() {
        this.menuService = MenuServiceImpl.getInstance();
    }

    private static MenuController instance = new MenuController();

    public static MenuController getInstance() {
        return instance;
    }

    public Messenger insertMenuData(Menu menu) throws SQLException {
        return menuService.insertMenuData(menu);
    }

    public Messenger createMenuTable() throws SQLException {
        return menuService.createMenuTable();
    }

    public Messenger deleteMenuTable() throws SQLException {
        return menuService.deleteMenuTable();
    }

    public void insertMenus() throws SQLException {
        menuService.insertMenus();
    }

    public List<?> selectTable() throws SQLException {
        return menuService.selectTable();
    }

    public Messenger returnMessenger() throws SQLException {
        Messenger m = menuService.returnMessenger();
        return m;
    }

    public Menu returnOneMenu() throws SQLException {
        Menu m = menuService.returnOneMenu();
        return m;
    }

    public List<?> returnAllMenus() throws SQLException{
        List<?> ls = menuService.returnAllMenus();
        return ls;
    }
}