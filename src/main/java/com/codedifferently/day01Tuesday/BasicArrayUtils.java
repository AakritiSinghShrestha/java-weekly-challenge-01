package com.codedifferently.day01Tuesday;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {

        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {

        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        int i;
        String[] temp = new String[stringArray.length];
        for(i=stringArray.length-1; i >= 0 ;i--){

            temp[stringArray.length-1-i] = stringArray[i];
           // System.out.println(temp[stringArray.length - 1-i]);
            }

        return temp ;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {

        String ch ="";
        for(int i=0;i<stringArray.length;i++){

          ch +=stringArray[i].charAt(0)+"";
            System.out.println(stringArray[i].charAt(0));
        }
        return ch;
    }
}
