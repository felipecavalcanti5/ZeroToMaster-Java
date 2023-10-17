package aula03.writingAndUsingMethodsInJava.exer02;

public class Adder {

    public static void main(String[] args) {
        adder(10,20);
    }
    public static void adder(int A, int B){
        int sum = A + B;
        System.out.println("Soma = " + sum);
    }
}
