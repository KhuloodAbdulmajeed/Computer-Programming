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
public class KhuloodAbdulmajeed_Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        
        System.out.print("Enter the first number (days in a week, between 1 and 7):");
        int Day = get.nextInt();
        String FirstNum;
        
        System.out.print("Enter the second number (days in a month, between 1 and 31):");
        int SecondNum = get.nextInt();
        
        System.out.print("Enter the third number (month in a year, between 1 and 12):");
        int Month = get.nextInt();
        String ThirdNum;
       
        System.out.print("Enter the fourth number that represents the year: ");
        int FourthNum = get.nextInt();
        switch(Day){
            case 1:
                FirstNum = "Sunday";
                break;
            case 2:
                FirstNum = "Monday";
                break;
            case 3:
                FirstNum = "Tuseday";
                break;
            case 4:
                FirstNum = "Wednesday";
                break;
                      
            case 5:
                FirstNum = "Thursday";
                break;
            case 6:
                FirstNum = "Friday";
                break;
                      
            case 7:
                FirstNum = "Saturday";
                break;
            default:
                FirstNum = "Wrong date!!!";}
        
        
        switch (Month){
                    case 1:
                      if (Day<=31 && Day>=1){
                      ThirdNum = "January"; } 
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 2:
                        if (Day<=29 && Day>=1){
                        ThirdNum = "February";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 3:
                      
                      if (Day<=31 && Day>=1){
                        ThirdNum = "March";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 4:
                      
                      if (Day<=30 && Day>=1){
                        ThirdNum = "April";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 5:
                      
                      if (Day<=31 && Day>=1){
                        ThirdNum = "May";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 6:
                      
                      if (Day<=30 && Day>=1){
                       ThirdNum = "June";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 7:
                      
                      if (Day<=31 && Day>=1){
                       ThirdNum = "July";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 8:
                      
                      if (Day<=31 && Day>=1){
                       ThirdNum = "August";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 9:
                      
                      if (Day<=30 && Day>=1){
                       ThirdNum = "September";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 10:
                      
                      if (Day<=31 && Day>=1){
                        ThirdNum = "October";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 11:
                      
                      if (Day<=30 && Day>=1){
                       ThirdNum = "November";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    case 12:
                      
                      if (Day<=31 && Day>=1){
                       ThirdNum = "December";}
                      else{
                          ThirdNum = "Wrong Month!!!";}
                      break;
                    default:
                      ThirdNum = "Wrong Input for month";
                      break; }
        System.out.println("The DATE is: "+ FirstNum +" "+SecondNum+" of "+ThirdNum+", "+FourthNum);
            
                
        
       
        
        
        
        
        
        
            
        }
    }
    

