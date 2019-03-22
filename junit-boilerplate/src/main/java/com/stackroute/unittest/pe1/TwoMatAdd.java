package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class TwoMatAdd {

    public static  int[] matadd(int mat1[],int mat2[],int m,int n){


        int sum[]=new int[m*n];


        for(int i=0;i<m*n;i++){

           sum[i]=mat1[i]+mat2[i];

        }
     return sum;
    }
}
