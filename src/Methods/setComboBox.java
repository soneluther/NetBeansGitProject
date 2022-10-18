/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Methods;

import Dao.assetsNumDao;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import model.accountSubject;
import model.assetsClass;
import model.classCode;
import model.companyCode;
import model.departCode;

/**
 *
 * @author luther
 */
public interface setComboBox {

    static void check(JComboBox JComboBox, JLabel JLabel) {
        if (JComboBox.getSelectedIndex() >= 0) {
            String[] clc = JComboBox.getSelectedItem().toString().split(" ");
            JLabel.setText(clc[0]);
        } else {
            JLabel.setText("");
        }
    }

    static JComboBox setJCBItem(JComboBox JComboBox) {
        JComboBox.removeAllItems();

        ArrayList<departCode> dpcList = (ArrayList<departCode>) new assetsNumDao().queryDPC();

        dpcList.forEach(dpc -> {
            JComboBox.addItem(dpc.getDcName());
        });

        JComboBox.setSelectedIndex(-1);

        return JComboBox;
    }

    static void setInvCode_JBItem(JComboBox AC_Check, JComboBox CPC_Check, JComboBox AS_Check, JComboBox CLC_Check, JComboBox CPN_Add, JComboBox dpc_add) {
        //set JComboBox_AC_Check
        AC_Check.removeAllItems();
        ArrayList<assetsClass> acList = (ArrayList<assetsClass>) new assetsNumDao().queryAC();

        acList.forEach(ac -> {
            if(ac.getAcSet())
                AC_Check.addItem(ac.getAcNum() + " " + ac.getAcName());                     
        });
        AC_Check.setSelectedIndex(-1);

        //set JComboBox_CPC_Check
        CPC_Check.removeAllItems();
        ArrayList<companyCode> cpcList = (ArrayList<companyCode>) new assetsNumDao().queryCPC();

        cpcList.forEach(cpc -> {
            CPC_Check.addItem(cpc.getComNum() + " " + cpc.getComName());
        });
        CPC_Check.setSelectedIndex(-1);

        //set JComboBox_AS_Check
        AS_Check.removeAllItems();
        ArrayList<accountSubject> asList = (ArrayList<accountSubject>) new assetsNumDao().queryAS();

        asList.forEach(as -> {
            AS_Check.addItem(as.getAsNum() + " " + as.getAsName());
        });
        AS_Check.setSelectedIndex(-1);

        //set JComboBox_CLC_Check        
        CLC_Check.setSelectedIndex(-1);

        //set JComboBox_CPN_Add
        CPN_Add.removeAllItems();

        cpcList.forEach(cpc -> {
            CPN_Add.addItem(cpc.getComName());
        });
        CPN_Add.setSelectedIndex(-1);

        //set JComboBox_dpc_add
        dpc_add.removeAllItems();

        ArrayList<departCode> dpcList = (ArrayList<departCode>) new assetsNumDao().queryDPC();

        dpcList.forEach(dpc -> {
            dpc_add.addItem(dpc.getDcName());
        });

        dpc_add.setSelectedIndex(-1);

    }

    static void setInvAdd_JBItem(JComboBox CPN_Add, JComboBox dpc_add) {
        //set JComboBox_CPN_Add
        CPN_Add.removeAllItems();
        ArrayList<companyCode> cpcList = (ArrayList<companyCode>) new assetsNumDao().queryCPC();

        cpcList.forEach(cpc -> {
            CPN_Add.addItem(cpc.getComName());
        });
        CPN_Add.setSelectedIndex(-1);

        //set JComboBox_dpc_add
        dpc_add.removeAllItems();

        ArrayList<departCode> dpcList = (ArrayList<departCode>) new assetsNumDao().queryDPC();

        dpcList.forEach(dpc -> {
            dpc_add.addItem(dpc.getDcName());
        });

        dpc_add.setSelectedIndex(-1);

    }

    static void setCLC_CheckByAS_Check(JComboBox CLC_Check, JLabel ASNum) {
        if (CLC_Check.getItemCount() > 0) {
            CLC_Check.removeAllItems();
        }

        if (!ASNum.getText().equals("")) {
            ArrayList<classCode> clcList = (ArrayList<classCode>) new assetsNumDao().queryCLC(ASNum.getText());

            clcList.forEach(clc -> {
                CLC_Check.addItem(clc.getCcNum() + " " + clc.getCcName());
            });
        }
    }

}
