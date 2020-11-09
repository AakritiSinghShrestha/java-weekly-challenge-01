package com.codedifferently.day02Wednesday;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String words[]=str.split("\\s");
        String capitalizedWord="";
            for(String w:words){
                String firstWord = w.substring(0,1);
                String remainingWord = w.substring(1);
                capitalizedWord +=firstWord.toUpperCase()+remainingWord+" ";
 }
        return capitalizedWord.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
       String temp ="";
for(int i=str.length()-1;i>=0;i--){
    temp += str.charAt(i);
}

        return temp;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {

        String[] words =  str.split("\\s");
        String reverseWord = "";
        for(String w:words){
            for(int i=w.length()-1;i>=0;i--){
                reverseWord += w.charAt(i);
            }
            reverseWord +=" ";

        }
        return reverseWord.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
            String temp="";
            String reverseWord = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                temp += str.charAt(i);
            }

            String[] result = temp.split("\\s");

            for(String w: result){
            reverseWord += w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase()+" ";
        }

        return reverseWord.trim();
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String[] words = str.split("\\n");
        String notRemoveWord="";
            for(String w:words){
                notRemoveWord = w.substring(1,str.length()-1);
                System.out.println(notRemoveWord);
        }
        return notRemoveWord;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {


        String words = "";
        for(char i=0;i<=str.length()-1;i++){
           if(Character.isLowerCase(str.charAt(i))){
               words +=  (Character.toUpperCase(str.charAt(i)));
           }
           else{
               words += (Character.toLowerCase(str.charAt(i)));
           }

        }
        System.out.println(words);
        return words;
    }
}
