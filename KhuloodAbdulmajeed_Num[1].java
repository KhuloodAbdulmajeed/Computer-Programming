/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khuloodabdulmajeed_atm;

/**
Name:Khulood Khalid Abdulmajeed
ID: 441009999
GROUP:14
Lab#8
 */
import java.util.Scanner;
public class KhuloodAbdulmajeed_Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter three-digit integer number: ");
        int ThreeNum = get.nextInt();
        int FirstNum = ThreeNum/100; //(a)bc
        int ThirdNum = ThreeNum%10; //ab(c)
        int SecondNum = (ThreeNum-(FirstNum*100+ThirdNum))/10; //a(b)c
        int Num11to19 = ThreeNum%100;
        System.out.println(Num11to19);
        String FirstDigit;//(a)bc
        String SecondDigit;//a(b)c
        String ThirdDigit;//ab(c)
        String Digit11to19;//a(bc)
        
        switch (FirstNum){
            case 0:
                FirstDigit ="";
                break;
            case 1:
                FirstDigit = " One hundred ";
                break;
            case 2:
                FirstDigit = " Two hundred ";
                break;
            case 3:
                FirstDigit = " Three hundred ";
                break;
            case 4:
                FirstDigit = " Four hundred ";
                break;
            case 5:
                FirstDigit = " Five hundred ";
                break;
            case 6:
                FirstDigit = " Six hundred ";
                break;
            case 7:
                FirstDigit = " Seven hundred ";
                break;
            case 8:
                FirstDigit = " Eight hundred ";
                break;
            case 9:
                FirstDigit = " Nine hundred ";
                break;
            default:
                FirstDigit = " Wrong input ";
                break;}
        
        if (Num11to19<=20 && Num11to19>=11){
                    switch (Num11to19){
                        case 11:
                          Digit11to19 = " eleven ";
                          break;
                        case 12:
                          Digit11to19 = " twelve ";
                          break;
                        case 13:
                          Digit11to19 = " thirteen ";
                          break;
                        case 14:
                          Digit11to19 = " fourteen ";
                          break;
                        case 15:
                          Digit11to19 = " fifteen ";
                          break;
                        case 16:
                          Digit11to19 = " sixteen ";
                          break;
                        case 17:
                          Digit11to19 = " seventeen ";
                          break;
                        case 18:
                          Digit11to19 = " eighteen ";
                          break;
                        case 19:
                          Digit11to19 = " nineteen ";
                          break;
                        default:
                          Digit11to19 = " Wrong input ";
                           }
                    System.out.println("The entered number is"+FirstDigit+Digit11to19);}
        else {
            switch (ThirdNum){
                case 0:
                    ThirdDigit ="";
                    break;
                case 1:
                    ThirdDigit = " one  ";
                    break;
                case 2:
                    ThirdDigit = " two ";
                    break;
                case 3:
                    ThirdDigit = " three ";
                    break;
                case 4:
                    ThirdDigit = " four ";
                    break;
                case 5:
                    ThirdDigit = " five ";
                    break;
                case 6:
                    ThirdDigit = " six ";
                    break;
                case 7:
                    ThirdDigit = " seven ";
                    break;
                case 8:
                    ThirdDigit = " eight ";
                    break;
                case 9:
                    ThirdDigit = " nine ";
                    break;
                default:
                    ThirdDigit = " Wrong input ";
                    break;}
        
        switch (SecondNum){
            case 0:
                SecondDigit = "";
                break;
                
            case 2:
                SecondDigit = " twenty ";
                break;
            case 3:
                SecondDigit = " thirty ";
                break;
            case 4:
                SecondDigit = " forty ";
                break;
            case 5:
                SecondDigit = " fifty ";
                break;
            case 6:
                SecondDigit = " sixty ";
                break;
            case 7:
                SecondDigit = " seventy ";
                break;
            case 8:
                SecondDigit = " eighty ";
                break;
            case 9:
                SecondDigit = " ninety ";
                break;
            default:
                SecondDigit = " Wrong input ";
                break;}
        
        
        System.out.println("The entered number is"+FirstDigit+SecondDigit+ThirdDigit);}
            
               
    
        
        
        
          
        
    
    
    }      
        
}
    

