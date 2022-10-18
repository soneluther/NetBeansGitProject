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
import model.accountSubject;
import model.assetsClass;
import model.classCode;
import model.companyCode;
import model.departCode;

/**
 *
 * @author tp558
 */
public class assetsNumDao implements implDao {

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
    public List queryTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //query assets_classification
    public List queryAC() {
        Connection conn = implDao.connectDB();
        String SQL = "select * from assets_classification";

        List<assetsClass> acList = new ArrayList<>();
        assetsClass assetsClass;

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                assetsClass = new assetsClass(
                        rs.getInt("acID"),
                        rs.getString("ac_Num"),
                        rs.getString("ac_Name"),
                        rs.getBoolean("ac_set")
                );
                
                acList.add(assetsClass);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(assetsNumDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return acList;
    }

    //query company_code
    public List queryCPC() {
        Connection conn = implDao.connectDB();
        String SQL = "select * from company_code";

        List<companyCode> cpcList = new ArrayList<>();
        companyCode companyCode;

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                companyCode = new companyCode(
                        rs.getInt("comID"),
                        rs.getString("com_Num"),
                        rs.getString("com_Name")
                );

                cpcList.add(companyCode);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(assetsNumDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cpcList;
    }

    //query accounting_subjects
    public List queryAS() {
        Connection conn = implDao.connectDB();
        String SQL = "select * from accounting_subjects";

        List<accountSubject> asList = new ArrayList<>();
        accountSubject accountSubject;

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                accountSubject = new accountSubject(
                        rs.getInt("asID"),
                        rs.getString("as_Num"),
                        rs.getString("as_Name")
                );

                asList.add(accountSubject);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(assetsNumDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return asList;
    }

    //query classification_code
    public List queryCLC() {
        Connection conn = implDao.connectDB();
        String SQL = "select * from classification_code";

        List<classCode> clcList = new ArrayList<>();
        classCode classCode;

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                classCode = new classCode(
                        rs.getInt("ccID"),
                        rs.getString("cc_Num"),
                        rs.getString("cc_Name")
                );

                clcList.add(classCode);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(assetsNumDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clcList;
    }

    //query classification_code by accounting_subjects
    public List queryCLC(String ASNum) {
        Connection conn = implDao.connectDB();
        String SQL = "select * from classification_code where as_Num = ?";

        List<classCode> clcList = new ArrayList<>();
        classCode classCode;

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, ASNum);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                classCode = new classCode(
                        rs.getInt("ccID"),
                        rs.getString("cc_Num"),
                        rs.getString("cc_Name")
                );

                clcList.add(classCode);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(assetsNumDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clcList;
    }

    //query department_code
    public List queryDPC() {
        Connection conn = implDao.connectDB();
        String SQL = "select * from department_code";

        List<departCode> dpcList = new ArrayList<>();
        departCode departCode;

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                departCode = new departCode(
                        rs.getInt("dc_Num"),
                        rs.getString("dc_Name")
                );

                dpcList.add(departCode);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(assetsNumDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dpcList;
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
