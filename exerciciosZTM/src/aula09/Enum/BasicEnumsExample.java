package aula09.Enum;

public class BasicEnumsExample {
    public static void main(String[] args) {
    /*    for(int i = 0; i< Weekday.values().length; i++){
            System.out.println(i+1 + "º dia da semana é " + Weekday.values());
        }*/

        for(Weekday day : Weekday.values()){
            System.out.println(day);
        }
    }
}
