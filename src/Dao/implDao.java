/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author luther
 */
public interface implDao {

    //連接資料庫
    static Connection connectDB() {
        String URL = "jdbc:mysql://localhost:3306/easyway_manager?useUnicode=true&characterEncoding=utf-8";
        String user = "root";
        String password = "1234";
        String driver = "com.mysql.jdbc.Driver";
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    //新增
    void add(Object o);

    //查詢
    String query(Integer id);

    List queryTable();

    //修改
    void update(Object o);

    //刪除
    //void delete(Object o);
    void delete(Integer id);

}
