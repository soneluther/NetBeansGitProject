/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.assetsClass;

/**
 *
 * @author tp558
 */
public class assetsClassDao implements implDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void add(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String query(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List queryTalbe() {
        Connection conn = implDao.connectDB();
        String SQL = "select * from assets_classification";

        List<assetsClass> acList = new ArrayList<>();
        assetsClass assetsClass;
        
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                assetsClass = new assetsClass(
                        rs.getInt("acID"),
                        rs.getString("ac_Num"),
                        rs.getString("ac_Name")
                );
                
                acList.add(assetsClass);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(assetsClassDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return acList;
    }

    @Override
    public void update(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
