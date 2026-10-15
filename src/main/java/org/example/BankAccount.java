package org.example;

public class BankAccount {

  private String accountHolder;
  private  String accountNumber;
  private  double balance;

    BankAccount(String accountHolder,String accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
      void deposit(double amount){
        if(amount>0){
            System.out.println("The Amount of :R"+amount+" have been Deposited Successfully");
            balance=balance+amount;

        }
        else {
            System.out.println("Invalid Amount!");
        }

    }
    void withdraw(double amount){

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: R" + amount);
        }
    }
    void getBalance(){
        System.out.println("The available balance is :R"+balance);
    }
}
