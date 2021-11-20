package com.elakkiya.Encapsulation;

import java.util.Arrays;

public class College {


    public static void main(String[] args) {

        Test test = new Test();

        System.out.println(test.getCollegeName());

        test.setDeptName(test.getDeptName());
        System.out.println("Departments to choose  " + Arrays.toString(test.getDeptName()));

        String [] deptName = test.getDeptName();
        for(int i=0;i<deptName.length;i++)
            System.out.println(deptName[i]);
    }

}
