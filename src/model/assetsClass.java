/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tp558
 */
public class assetsClass {
    Integer acID;
    String acNum, acName;

    public assetsClass() {
    }

    public assetsClass(Integer acID, String acNum, String acName) {
        this.acID = acID;
        this.acNum = acNum;
        this.acName = acName;
    }

    public Integer getAcID() {
        return acID;
    }

    public void setAcID(Integer acID) {
        this.acID = acID;
    }

    public String getAcNum() {
        return acNum;
    }

    public void setAcNum(String acNum) {
        this.acNum = acNum;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }
}
