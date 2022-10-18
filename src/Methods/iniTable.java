/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Methods;

import Dao.inventoryListDao;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import model.inventoryList;

/**
 *
 * @author luther
 */
public interface iniTable {

    static void iniInvListTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        JTableHeader th = table.getTableHeader();
        th.setFont(new Font("新細明體", Font.BOLD, 18));
        ((DefaultTableCellRenderer) th.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < model.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(dtcr);
        }

        TableColumn col1 = table.getColumnModel().getColumn(0);
        col1.setPreferredWidth(80);
        TableColumn col2 = table.getColumnModel().getColumn(1);
        col2.setPreferredWidth(100);
        TableColumn col3 = table.getColumnModel().getColumn(2);
        col3.setPreferredWidth(150);
        TableColumn col4 = table.getColumnModel().getColumn(3);
        col4.setPreferredWidth(100);
        TableColumn col5 = table.getColumnModel().getColumn(4);
        col5.setPreferredWidth(150);
        TableColumn col6 = table.getColumnModel().getColumn(5);
        col6.setPreferredWidth(200);
        TableColumn col7 = table.getColumnModel().getColumn(6);
        col7.setPreferredWidth(150);
        TableColumn col8 = table.getColumnModel().getColumn(7);
        col8.setPreferredWidth(50);
        TableColumn col9 = table.getColumnModel().getColumn(8);
        col9.setPreferredWidth(200);
        TableColumn col10 = table.getColumnModel().getColumn(9);
        col10.setPreferredWidth(100);
        TableColumn col11 = table.getColumnModel().getColumn(10);
        col11.setPreferredWidth(200);

        model.setRowCount(0);
        table.setAutoCreateRowSorter(true);
    }
    
    static void iniListTB(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        JTableHeader th = table.getTableHeader();
        th.setFont(new Font("新細明體", Font.BOLD, 14));
        ((DefaultTableCellRenderer) th.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < model.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(dtcr);
        }
        
        table.setRowHeight(30);

        TableColumn col1 = table.getColumnModel().getColumn(0);
        col1.setPreferredWidth(80);
        col1.setHeaderValue("ID");
        TableColumn col2 = table.getColumnModel().getColumn(1);
        col2.setPreferredWidth(100);
        col2.setHeaderValue("公司別");
        TableColumn col3 = table.getColumnModel().getColumn(2);
        col3.setPreferredWidth(150);
        col3.setHeaderValue("所屬部門");
        TableColumn col4 = table.getColumnModel().getColumn(3);
        col4.setPreferredWidth(120);
        col4.setHeaderValue("資產編號");
        TableColumn col5 = table.getColumnModel().getColumn(4);
        col5.setPreferredWidth(150);
        col5.setHeaderValue("資產名稱");
        TableColumn col6 = table.getColumnModel().getColumn(5);
        col6.setPreferredWidth(350);
        col6.setHeaderValue("規格型號");
        
        model.setRowCount(0);
        table.setAutoCreateRowSorter(true);
    }

    //顯示清單
    static void showTable(JTable table, Object[] o) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.addRow(o);
    }

    static void setTable(JTable table) {
        iniInvListTable(table);

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        ArrayList<inventoryList> inv_List = (ArrayList<inventoryList>) new inventoryListDao().queryTable();
        Object[] o = new Object[11];        
        
        inv_List.stream().map(inv -> {
            o[0] = String.format("%04d", inv.getInv_Id());
            return inv;
        }).map(inv -> {
            o[1] = inv.getCompany_Name();
            return inv;
        }).map(inv -> {
            o[2] = inv.getDepartment_Name();
            return inv;
        }).map(inv -> {
            o[3] = inv.getInv_Num();
            return inv;
        }).map(inv -> {
            o[4] = inv.getPurchase_data();
            return inv;
        }).map(inv -> {
            o[5] = inv.getInv_Name();
            return inv;
        }).map(inv -> {
            o[6] = inv.getInv_Model();
            return inv;
        }).map(inv -> {
            o[7] = inv.getInv_Quantity();
            return inv;
        }).map(inv -> {
            o[8] = inv.getInv_location();
            return inv;
        }).map(inv -> {
            o[9] = inv.getInv_keeper();
            return inv;
        }).map(inv -> {
            o[10] = inv.getInv_Remark();
            return inv;
        }).forEachOrdered(_item -> {
            model.addRow(o);
        });
        
    }

}
