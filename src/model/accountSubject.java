/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luther
 */
public class accountSubject {
    private Integer asID;
    private String asNum, asName;

    public accountSubject() {
    }

    public accountSubject(Integer asID, String asNum, String asName) {
        this.asID = asID;
        this.asNum = asNum;
        this.asName = asName;
    }

    public Integer getAsID() {
        return asID;
    }

    public void setAsID(Integer asID) {
        this.asID = asID;
    }

    public String getAsNum() {
        return asNum;
    }

    public void setAsNum(String asNum) {
        this.asNum = asNum;
    }

    public String getAsName() {
        return asName;
    }

    public void setAsName(String asName) {
        this.asName = asName;
    }   
}
