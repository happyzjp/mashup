package com.stackroute.unittest.pe1;

import java.util.*;
public class DateWeek {

    public static  String getdate(){
        String a,b;
        Date dt=new Date();
 a=dt.getDate()+1-dt.getDay()+"/"+dt.getMonth()+"/"+(dt.getYear()+1900);
       b=dt.getDate()+(7-dt.getDay())+"/"+dt.getMonth()+"/"+(dt.getYear()+1900);
       return a+" "+b;

    }
}
