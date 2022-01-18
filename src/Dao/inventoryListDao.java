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
import model.inventoryList;

/**
 *
 * @author luther
 */
public class inventoryListDao implements implDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(new inventoryListDao().query(2156154));
        inventoryList inventoryList = new inventoryListDao().queryCheck(String.valueOf(2168177));
        System.out.println(inventoryList.getInv_Id()+"\t"+inventoryList.getInv_Num()+"\t"+inventoryList.getInv_Name());
    }

    @Override
    public void add(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String query(Integer id) {
        Connection conn = implDao.connectDB();
        //String SQL = "select * from inventory_list where inv_id=?";
        String SQL = "select * from inventory_list where inv_Num like ?";

        String show = "";

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                show = rs.getString("company_Name") + "\t"
                        + rs.getString("department_Name") + "\t"
                        + rs.getString("inv_Num");
            }

        } catch (SQLException ex) {
            Logger.getLogger(inventoryListDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return show;
    }

    @Override
    public List queryTalbe() {
        Connection conn = implDao.connectDB();
        String SQL = "select * from inventory_list";

        List<inventoryList> inv_list = new ArrayList<>();
        inventoryList inventoryList;
        
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                inventoryList = new inventoryList(
                        rs.getInt("inv_Id"),
                        rs.getInt("inv_Quantity"),
                        rs.getString("company_Name"),
                        rs.getString("department_Name"),
                        rs.getString("inv_Num"),
                        rs.getString("purchase_data"),
                        rs.getString("inv_Name"),
                        rs.getString("inv_Model"),
                        rs.getString("inv_location"),
                        rs.getString("inv_keeper"),
                        rs.getString("inv_Remark")
                );

                inv_list.add(inventoryList);
            }

        } catch (SQLException ex) {
            Logger.getLogger(inventoryListDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return inv_list;
    }
    
    public inventoryList queryCheck(String invNum){
        Connection conn = implDao.connectDB();
        String SQL = "select * from inventory_list where 1=1 ";
        inventoryList inventoryList=null;
        if(invNum !=""){
            SQL+="and inv_Num like ? order by inv_Num";
            invNum+="%";
        }             
                     
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, invNum);
            ResultSet rs = ps.executeQuery();
            
            if(rs.last()) {
                inventoryList = new inventoryList(
                        rs.getInt("inv_Id"),
                        rs.getInt("inv_Quantity"),
                        rs.getString("company_Name"),
                        rs.getString("department_Name"),
                        rs.getString("inv_Num"),
                        rs.getString("purchase_data"),
                        rs.getString("inv_Name"),
                        rs.getString("inv_Model"),
                        rs.getString("inv_location"),
                        rs.getString("inv_keeper"),
                        rs.getString("inv_Remark")
                );

            }

        } catch (SQLException ex) {
            Logger.getLogger(inventoryListDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return inventoryList;
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
