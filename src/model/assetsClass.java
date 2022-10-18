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
    private Integer acID;
    private String acNum, acName;
    private Boolean acSet;

    public assetsClass() {
    }

    public assetsClass(Integer acID, String acNum, String acName) {
        this.acID = acID;
        this.acNum = acNum;
        this.acName = acName;
    }

    public assetsClass(Integer acID, String acNum, String acName, Boolean acSet) {
        this.acID = acID;
        this.acNum = acNum;
        this.acName = acName;
        this.acSet = acSet;
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

    public Boolean getAcSet() {
        return acSet;
    }

    public void setAcSet(Boolean acSet) {
        this.acSet = acSet;
    }  
}
