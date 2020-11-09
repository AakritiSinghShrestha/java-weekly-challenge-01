package com.codedifferently.day03Thursday;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int total =0;
        for(int i=0;i<=intArray.length-1;i++){
            total +=intArray[i];
        }
        return total;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product=1;
        for(int i=0;i<=intArray.length-1;i++){
            product *=intArray[i];
            }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double avg=0;
        double sum=0;
        for(int i=0;i<=intArray.length-1;i++){
            sum +=intArray[i];
        }
        avg =sum/intArray.length;
        return avg;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int large=0;
        for(int i=0;i<=intArray.length-1;i++){
            if(intArray[i]>large){
                large = intArray[i];
            }
        }
        return large;
    }
}
