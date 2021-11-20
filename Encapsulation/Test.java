package com.elakkiya.Encapsulation;

public class Test {

    private static  String collegeName = "K S Rangasamy College of Technology";
    private String [] deptName = new String[]{"IT","CSE","EEE","MECH","ECE","AUTO","AERO","EI"};


    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        Test.collegeName = collegeName;
    }

    public String [] getDeptName() {
        return deptName;
    }

    public void setDeptName(String[] deptName) {
        this.deptName = deptName;

    }


}
