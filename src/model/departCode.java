/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luther
 */
public class departCode {
    private Integer dcNum;
    private String dcName;

    public departCode() {
    }

    public departCode(Integer dcNum, String dcName) {
        this.dcNum = dcNum;
        this.dcName = dcName;
    }

    public Integer getDcNum() {
        return dcNum;
    }

    public void setDcNum(Integer dcNum) {
        this.dcNum = dcNum;
    }

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }    
}
