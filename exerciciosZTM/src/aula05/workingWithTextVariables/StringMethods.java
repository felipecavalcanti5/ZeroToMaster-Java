package aula05.workingWithTextVariables;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello, World!";

        System.out.println("length: " + str1.length());
        System.out.println("toUpper: "+str1.toUpperCase());
        System.out.println("toLower: "+str1.toLowerCase());
        System.out.println("substring: "+str1.substring(7, 12));
        //System.out.println(str1.substring(0, 6) + " Java");
        System.out.println("replace: "+str1.replace("World", "Java"));
        System.out.println(str1);

    }
}
