package com.james.api.menu;

import com.james.api.enums.Messenger;

import java.sql.SQLException;
import java.util.List;

public interface MenuService {
    Messenger insertMenuData(Menu menu) throws SQLException;
    Messenger createMenuTable() throws SQLException;
    Messenger deleteMenuTable() throws SQLException;
    void insertMenus() throws SQLException;
    List<?> selectTable() throws SQLException;
    Messenger returnMessenger() throws SQLException;
    Menu returnOneMenu() throws SQLException;
    List<?> returnAllMenus()throws SQLException;
}