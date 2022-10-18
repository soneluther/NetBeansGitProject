/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luther
 */
public class companyCode {
    private Integer comID;
    private String comNum, comName;

    public companyCode() {
    }

    public companyCode(Integer comID, String comNum, String comName) {
        this.comID = comID;
        this.comNum = comNum;
        this.comName = comName;
    }

    public Integer getComID() {
        return comID;
    }

    public void setComID(Integer comID) {
        this.comID = comID;
    }

    public String getComNum() {
        return comNum;
    }

    public void setComNum(String comNum) {
        this.comNum = comNum;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }   
}
