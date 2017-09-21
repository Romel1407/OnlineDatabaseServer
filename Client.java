/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliserver;

import java.io.IOException;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author tareq
 */
public class Client {
    public static void main(String args[]) throws UnknownHostException,IOException{
        int num1,num2,num3,num4,num5=0,sr=0;
        int x;
        String temp1;
        String useless;
        String temp2=new String();
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("127.0.0.1",1342);
        Scanner sc1 = new Scanner(s.getInputStream());
        System.out.println("Enter your password:");
        num1=sc.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(num1);
        num2=sc1.nextInt();
       while(true){
            if(num2==1){
                System.out.println("Logged In");
                num3=1;
                p.println(num3);
                break;
            }
            else{
                 System.out.println("INVALID PASSWORD!");
                 System.out.println("Enter your password:");
                 num1=sc.nextInt();
                 p.println(num1);
                 num2=sc1.nextInt();
            }
        
        //Console     
       } 
        System.out.println("WELCOME!");
        while(true){
        System.out.println("---------------------Menu---------------------");
        System.out.println("");
        System.out.println("1. Search Students Record by Id");
        System.out.println("2. Students Data Entry");
        System.out.println("3. Generate Report by Department");
        System.out.println("4. View All Students Record");
        System.out.println("5. Exit");
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println("Enter choice:"); 
        x=sc.nextInt();
        switch(x){
            //Search Student
            case 1: 
                num5=1;
                p.println(num5);
               
                System.out.println("Enter ID:");
                num2=sc.nextInt();
                System.out.println(num2);
                p.println(num2);
                sr=sc1.nextInt();
             
                if(sr==1){
                System.out.println("Student ID : "+sc1.next()); 
                System.out.println("Name : "+sc1.next()); 
                
                System.out.println("Semester : "+sc1.next()); 
                System.out.println("Department : "+sc1.next()); 
                sr=sc1.nextInt();
                
                continue;
                }
                else
                System.out.println("No Such ID Recorded in the Database"); 
                
                break;
            //Student record entry    
            case 2:
                num5=2;
                p.println(num5);
                useless=sc1.next();
                System.out.println("Enter ID:");
                num2=sc.nextInt();
                p.println(num2);
                System.out.println("Enter NAME:");
                p.println(sc.next());
                System.out.println("Enter SEMESTER:");
                p.println(sc.nextInt());
                System.out.println("Enter DEPARTMENT:");
                p.println(sc.next());
                break;
            //Report generate by the department    
            case 3:
                num5=3;
                p.println(num5);
               
                System.out.println("Enter Department Name:");
                temp1=sc.next();
                p.println(temp1);
                sr=sc1.nextInt();
                p.println("no");
                System.out.println("Report for "+temp1);
                System.out.println("Total "+sr+" Records Found!");
                for(int i=1;i<=sr;i++){
                    System.out.println("Record "+i+" :");
                    System.out.println("-------------"); 
                    System.out.println("Student ID : "+sc1.next()); 
                    System.out.println("Name : "+sc1.next()); 
                
                    System.out.println("Semester : "+sc1.next()); 
                    System.out.println("Department : "+sc1.next()); 
                    System.out.println(); 
                   
                } 
                break;
            //View Students record     
            case 4:
                num5=4;
                p.println(num5);
               
                
                sr=sc1.nextInt();
                p.println("no");
               
                System.out.println("Total "+sr+" Records Found!");
                for(int i=0;i<sr;i++){
                    System.out.println("Student ID : "+sc1.next()); 
                    System.out.println("Name : "+sc1.next()); 
                
                    System.out.println("Semester : "+sc1.next()); 
                    System.out.println("Department : "+sc1.next()); 
                } 
                
                break;
            //Exit
            case 5:
                num5=5;
                p.println(num5);
                System.exit(0);
                break;
           
            default:
                System.out.println("Wrong Input!!");               
            }
        }
    }
}

