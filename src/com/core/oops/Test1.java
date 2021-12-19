package com.core.oops;
public class Test1 {    
    
    static Boolean param1 ;
    public static void main(String[] args) {          
        System.out.println(bool1());
    }    
    
    public static String bool1(){
        if(param1)
            return "ONE";
        else
            return "TWO"; 
    }
}