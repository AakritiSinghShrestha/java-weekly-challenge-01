package com.codedifferently.day04Friday;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        //It converting interger into string.
        String reverse = Integer.toString(val);
        String reverseNumber="";
        for(int i=reverse.length()-1;i>=0;i--){
            reverseNumber +=reverse.charAt(i);
        }

        return Integer.parseInt(reverseNumber);
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
     boolean evenNumber=false;
     if(val%2 == 0){
         evenNumber = true;
     }
        return evenNumber;
    }
}
