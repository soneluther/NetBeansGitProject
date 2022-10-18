/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luther
 */
public class classCode {
    private Integer ccID;
    private String ccNum, ccName;

    public classCode() {
    }

    public classCode(Integer ccID, String ccNum, String ccName) {
        this.ccID = ccID;
        this.ccNum = ccNum;
        this.ccName = ccName;
    }

    public Integer getCcID() {
        return ccID;
    }

    public void setCcID(Integer ccID) {
        this.ccID = ccID;
    }

    public String getCcNum() {
        return ccNum;
    }

    public void setCcNum(String ccNum) {
        this.ccNum = ccNum;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }    
}
