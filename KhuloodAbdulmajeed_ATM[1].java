/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khuloodabdulmajeed_atm;

import java.util.Scanner;

/**
Name:Khulood Khalid Abdulmajeed
ID: 441009999
GROUP:14
Lab#8
 */
import java.util.Scanner;
public class KhuloodAbdulmajeed_ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);
        System.out.println("ATM Simulation Program");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Inquiry");
        System.out.println("4.Exit");
        System.out.println("Enter your choice (from 1to 4):");
        char NumberChoice= get.next().charAt(0);
        double balance = 6000;
        switch(NumberChoice){
            case '1':
                System.out.println("Enter the amount of money you would like to withdraw: (No more than 5000SR in a day):");
                int WithdrawMoney = get.nextInt();
                if (WithdrawMoney>=5000){
                    System.out.println("Sorry, You cannot withdraw more than 5000 SR in a day");
                }else {
                    double NewBalance = balance - WithdrawMoney;
                    System.out.println("You can get your money now. Your new balance is "+NewBalance+"SR");
                }break;
            case'2':
                System.out.println("Enter the amount of money you would like to deposit: Enter your money in the specified space:");
                int DepositMoney = get.nextInt();
                balance = balance +DepositMoney;
                System.out.println("Your new balance is: "+balance);
                break;
            case'3':
                System.out.println("Your new balance is: "+balance);
                break;
            case '4':
                System.out.println("Good Bye,, Thanks for using this ATM");
                break;
            default:
                System.out.println("Wrong Choice!!!");
        }
    }
    
}
