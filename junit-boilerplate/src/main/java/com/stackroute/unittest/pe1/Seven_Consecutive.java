package com.stackroute.unittest.pe1;

import java.util.*;
public class Seven_Consecutive {
    public  static String isconsecutive(int num[]){
        Scanner sc=new Scanner(System.in);
               int count;
               int y=1;
               int type;
               if(num[1]>num[0])
                   type=1;
               else
                   type=0;
               if(type==1){
                   for(int k=1;k<7;k++){
                       if(!(num[k]==1+num[k-1])){
                           y=0;
                           break;
                       }

                   } }
                   else{

                       for(int k=1;k<7;k++){
                           if(!(num[k]+1==num[k-1])){
                               y=0;
                               break;
                           }

                       }
                   }
        if(y==1)
           return "yes";
        else
            return "no";
               }


    }
