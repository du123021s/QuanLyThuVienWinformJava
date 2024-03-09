package model;

import javafx.scene.chart.PieChart;

import java.util.Date;
import java.util.List;

public class Employee {
    private String empID;
    private String empName;
    private String empPhone;
    private Date birthDay;
    private String empGender;
    private String empAddress;
    private Department department;
    private String empPosition;
    private String empSalary;
    private String empPass;
    private String empBarcode;
    private String empImg;
    private String empStatus;
    private List<Books> booksList;
    private List<Reader> readers;

    //contructor


    public Employee() {
    }
    public Employee(String empID, String empName, String empPhone, Date birthDay, String empGender, String empAddress, Department depID,
                    String empPossition, String empSalary, String empPass, String empBarcode, String empImg, String empStatus) {
        this.empID = empID;
        this.empName = empName;
        this.empPhone = empPhone;
        this.birthDay = birthDay;
        this.empGender = empGender;
        this.empAddress = empAddress;
        this.department = depID;
        this.empPosition = empPossition;
        this.empSalary = empSalary;
        this.empPass = empPass;
        this.empBarcode = empBarcode;
        this.empImg = empImg;
        this.empStatus = empStatus;
    }

    //get and set
    public String getEmpID() {
        return empID;
    }
    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Department getDepID() {
        return department;
    }

    public void setDepID(Department department) {
        this.department = department;
    }

    public String getEmpPossition() {
        return empPosition;
    }

    public void setEmpPossition(String empPossition) {
        this.empPosition = empPossition;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpPass() {
        return empPass;
    }

    public void setEmpPass(String empPass) {
        this.empPass = empPass;
    }

    public String getEmpBarcode() {
        return empBarcode;
    }

    public void setEmpBarcode(String empBarcode) {
        this.empBarcode = empBarcode;
    }

    public String getEmpImg() {
        return empImg;
    }

    public void setEmpImg(String empImg) {
        this.empImg = empImg;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }
}
