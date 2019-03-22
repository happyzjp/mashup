package com.stackroute.unittest.pe1;

import java.util.*;
public class Place_vowel {



    public static  String[]  rmvVowel(String arg[]){
        int m;
        String plc;
        String place[];
        char c;

        m=arg.length;
        place=arg;


        for(int i=0;i<m;i++){

            plc=""+place[i].charAt(0);
            for(int j=1;j<place[i].length();j++){
                c=place[i].charAt(j);
            if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')){
                plc+=c;
                }


        }  place[i]=plc;

        }
        return place;
}
}
