package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class StudentMarks {

 public static int graderange(int num,int ar[]){
        Scanner sc=new Scanner((System.in));
        int num_students;
        int grade;
        int stuGrades[];

        num_students=num;
        stuGrades=ar;

        for(int i=0;i<num_students;i++){


                  if(stuGrades[i]>=0&&stuGrades[i]<=100)
                  {}
                  else{
                      System.out.println("grade is not between 0 to 100");
                      return 0;
                  }



        }   return 1;


    }
}
