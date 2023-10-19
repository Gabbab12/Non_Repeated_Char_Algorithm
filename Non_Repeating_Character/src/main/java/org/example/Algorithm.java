package org.example;

public class Algorithm {
    public static char NonRepeatingCharacter(String arr){
        int a = arr.length();

        for (int i = 0; i < a; i++){
            char currentChar = arr.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < a; j++){
                if (i != j && currentChar == arr.charAt(j)){
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated){
                return currentChar;
            }
        }
        return 'O';
    }
    public static void main(String[] args){
        String arr = "excellent";
        char a = NonRepeatingCharacter(arr);
        if (a != 'O'){
            System.out.println(a);
        }else{
            System.out.println("No nonrepeated character was found");
        }
    }
}
