/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luther
 */
public class inventoryList {

    Integer inv_Id, inv_Quantity;
    String company_Name, department_Name, inv_Num, purchase_data, inv_Name, inv_Model, inv_location, inv_keeper, inv_Remark;

    public inventoryList() {
    }

    public inventoryList(Integer inv_Id, Integer inv_Quantity, String company_Name, String department_Name, String inv_Num, String purchase_data, String inv_Name, String inv_Model, String inv_location, String inv_keeper, String inv_Remark) {
        this.inv_Id = inv_Id;
        this.inv_Quantity = inv_Quantity;
        this.company_Name = company_Name;
        this.department_Name = department_Name;
        this.inv_Num = inv_Num;
        this.purchase_data = purchase_data;
        this.inv_Name = inv_Name;
        this.inv_Model = inv_Model;
        this.inv_location = inv_location;
        this.inv_keeper = inv_keeper;
        this.inv_Remark = inv_Remark;
    }

    public Integer getInv_Id() {
        return inv_Id;
    }

    public void setInv_Id(Integer inv_Id) {
        this.inv_Id = inv_Id;
    }

    public Integer getInv_Quantity() {
        return inv_Quantity;
    }

    public void setInv_Quantity(Integer inv_Quantity) {
        this.inv_Quantity = inv_Quantity;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getDepartment_Name() {
        return department_Name;
    }

    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }

    public String getInv_Num() {
        return inv_Num;
    }

    public void setInv_Num(String inv_Num) {
        this.inv_Num = inv_Num;
    }

    public String getPurchase_data() {
        return purchase_data;
    }

    public void setPurchase_data(String purchase_data) {
        this.purchase_data = purchase_data;
    }

    public String getInv_Name() {
        return inv_Name;
    }

    public void setInv_Name(String inv_Name) {
        this.inv_Name = inv_Name;
    }

    public String getInv_Model() {
        return inv_Model;
    }

    public void setInv_Model(String inv_Model) {
        this.inv_Model = inv_Model;
    }

    public String getInv_location() {
        return inv_location;
    }

    public void setInv_location(String inv_location) {
        this.inv_location = inv_location;
    }

    public String getInv_keeper() {
        return inv_keeper;
    }

    public void setInv_keeper(String inv_keeper) {
        this.inv_keeper = inv_keeper;
    }

    public String getInv_Remark() {
        return inv_Remark;
    }

    public void setInv_Remark(String inv_Remark) {
        this.inv_Remark = inv_Remark;
    }

}
