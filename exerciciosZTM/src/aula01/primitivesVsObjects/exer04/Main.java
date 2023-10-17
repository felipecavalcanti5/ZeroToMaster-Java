package aula01.primitivesVsObjects.exer04;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);

        modifyNumber(number);
        System.out.println(number);

    }

    public static void modifyNumber(int num){
        num = num * 2;
    }
}

/*
* Explanation: We can observe that the value of number did not change
* even after modifying it in the modifyNumber method.
* This is because Java uses pass-by-value, and the value of the primitive
* gets copied.*/
