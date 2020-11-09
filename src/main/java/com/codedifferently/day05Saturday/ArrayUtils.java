package com.codedifferently.day05Saturday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count =0;
        for(Object number:objectArray){
            if(number == objectToCount){
                count +=1;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        List<Object> result = new ArrayList<>(Arrays.asList(objectArray));
        for(int i=0;i<result.size();i++){
            if(result.get(i)==objectToRemove){
                result.remove(result.get(i));
            }
        }
        //it is converting arraylist to array
        return result.toArray();
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count=0;
        int number=0;
        int highNumber=0;


        for(int i = 0;i <=objectArray.length-1 ;i++){
            count =1;
             for(int j=i+1;j<=objectArray.length-1;j++) {
                 if (objectArray[i] == objectArray[j]) {
                     count++;
                 } else {
                     count =0;
                 }
             }
            if(count>number){
                number=count;
                highNumber = (int) objectArray[i];
            }

        }
        return highNumber;
    }



    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int leastCommonNumber=0;
        int number=objectArray.length-1;
        int count=1;
        Arrays.sort(objectArray);
        for(int i=0;i<objectArray.length-1;i++){
            if(objectArray[i]==objectArray[i+1]){
                count++;
            }else{
                if(count<number){
                    number=count;
                    leastCommonNumber = (int) objectArray[i];
                }
                count = 1;
            }
        }
        return leastCommonNumber;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        List<Object> result1 = new ArrayList<>(Arrays.asList(objectArray));
         for(int i=0;i<=objectArrayToAdd.length-1;i++){
             result1.add(objectArrayToAdd[i]);
         }
        //converting arraylist to array
        return result1.toArray();
    }
}
