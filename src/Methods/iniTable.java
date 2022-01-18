/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Methods;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author luther
 */
public interface iniTable {
    
    static void iniInvListTable(JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        JTableHeader th = table.getTableHeader();
        th.setFont(new Font("新細明體", Font.BOLD, 18));
        ((DefaultTableCellRenderer)th.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0; i<model.getColumnCount(); i++){
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
    }
    
    //顯示清單
    static void showTable(JTable table, Object[] o){
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        model.addRow(o);        
    }
    
}
