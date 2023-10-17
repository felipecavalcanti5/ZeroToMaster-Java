package aula02.controlFlow.exer01.main;

import aula02.controlFlow.exer01.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 123456;
        account.accountHolder = "Felipe";
        account.balance = 1000.00;

        System.out.println(account.accountNumber);
        System.out.println(account.accountHolder);
        System.out.println(account.balance);


    }
}
