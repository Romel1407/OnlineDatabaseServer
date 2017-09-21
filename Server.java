/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.lang.*;

/**
 *
 * @author tareq
 */

class ReadBba{
	public Scanner x;
	public String a;
        public String b;
        public String c;
        public String d;
        public int lc=1;
	public void openFile(){
		
		try{
			x= new Scanner(new File("bba.txt"));
		}
		catch(Exception e){
			System.out.println("Could not connet");
		}
	}
	public int SizeFile(){
		int ttl=0;
		while(x.hasNext()){
			a=x.next();
                        
                        b=x.next();
                        c=x.next();
                        d=x.next();
                        ttl++;
                }
            return ttl;
	}
	
	public void readFile(int len){
		
                
                
		while(x.hasNext()){
                       
			a=x.next();
                        
                        b=x.next();
                        c=x.next();
                        d=x.next();
                       
                        if(lc==len){
                            lc=1;
                            break;
                        }
                        lc++;
		}
	}
	public void closeFile(){
		x.close();
	}
 }

class ReadEee{
	public Scanner x;
	public String a;
        public String b;
        public String c;
        public String d;
        public int lc=1;
	public void openFile(){
		
		try{
			x= new Scanner(new File("eee.txt"));
		}
		catch(Exception e){
			System.out.println("Could not connet");
		}
	}
	public int SizeFile(){
		int ttl=0;
		while(x.hasNext()){
			a=x.next();
                        
                        b=x.next();
                        c=x.next();
                        d=x.next();
                        ttl++;
                }
            return ttl;
	}
	
	public void readFile(int len){
		
                
                
		while(x.hasNext()){
                       
			a=x.next();
                        
                        b=x.next();
                        c=x.next();
                        d=x.next();
                       
                        if(lc==len){
                            lc=1;
                            break;
                        }
                        lc++;
		}
	}
	public void closeFile(){
		x.close();
	}
 }

class ReadCse{
	public Scanner x;
	public String a;
        public String b;
        public String c;
        public String d;
        public int lc=1;
	public void openFile(){
		
		try{
			x= new Scanner(new File("cse.txt"));
		}
		catch(Exception e){
			System.out.println("Could not connet");
		}
	}
	public int SizeFile(){
		int ttl=0;
		while(x.hasNext()){
			a=x.next();
                        
                        b=x.next();
                        c=x.next();
                        d=x.next();
                        ttl++;
                }
            return ttl;
	}
	
	public void readFile(int len){		               
		while(x.hasNext()){
                       
			a=x.next();
                        
                        b=x.next();
                        c=x.next();
                        d=x.next();
                       
                        if(lc==len){
                            lc=1;
                            break;
                        }
                        lc++;
		}
	}
	public void closeFile(){
		x.close();
	}
 }

class Eee{
       
        public Formatter y;
       
	public void openFile(){
		
		try{
			
                        y= new Formatter(new BufferedWriter(new FileWriter("eee.txt", true)));
                        
		}
		catch(Exception e){
			System.out.println("Could not connet");
		}
	}
	
	public void addRecord(String a,String b,String c,String d){
		
                            y.format("%s%n",a);
                            y.format("%s%n",b);
                            y.format("%s%n",c);
                            y.format("%s%n",d);
		}
	
	public void closeFile(){
		y.close();
	}
}
class Bba{
       
        public Formatter y;
       
	public void openFile(){
		
		try{
			
                        y= new Formatter(new BufferedWriter(new FileWriter("bba.txt", true)));
                        
		}
		catch(Exception e){
			System.out.println("Could not connet");
		}
	}
	
	public void addRecord(String a,String b,String c,String d){
		
                            y.format("%s%n",a);
                            y.format("%s%n",b);
                            y.format("%s%n",c);
                            y.format("%s%n",d);
		}
	
	public void closeFile(){
            
		y.close();           
	}
 }

class Cse{
       
        public Formatter y;
       
	public void openFile(){
		
		try{
			
                        y= new Formatter(new BufferedWriter(new FileWriter("cse.txt", true)));
                        
		}
		catch(Exception e){
			System.out.println("Could not connet");
		}
	}
	
	public void addRecord(String a,String b,String c,String d){
		
                            y.format("%s%n",a);
                            y.format("%s%n",b);
                            y.format("%s%n",c);
                            y.format("%s%n",d);
		}
	
	public void closeFile(){
		y.close();
	}
 }

 class Read{
	public Scanner x;
        public int lc=1;
	public String a;
        public String b;
        public String c;
        public String d;
        
        public int mc=0;
	public void openFile(){
		
		try{
			x= new Scanner(new File("file.txt"));
      
		}
		catch(Exception e){
			System.out.println("Could not connet");
		}
	}
	
	public void readFile(String m){
                while(x.hasNext()){
			a=x.next();
                        
                        b=x.next();
                        c=x.next();
                        d=x.next();
                        
                        if(m.equals(a)){
                           mc=1;
                           break;
                        }
		}
	}
        
        public int SizeFile(){
		int ttl=0;
		while(x.hasNext()){
			a=x.next();
                        
                        b=x.next();
                        c=x.next();
                        d=x.next();
                        ttl++;
                }
            return ttl;
	}
        
        public void readFl(int len){
                   while(x.hasNext()){
                       
			a=x.next();
                        
                        b=x.next();
                        c=x.next();
                        d=x.next();
                       
                        if(lc==len){
                            lc=1;
                            break;
                        }
                        lc++;
		}
	}
        
	public void closeFile(){
		x.close();
	}
 }

class Write{
        
	public Formatter x;
 
	public int n=1,d=0;
	public void openFile(){
		
		try{
			x= new Formatter(new BufferedWriter(new FileWriter("file.txt", true)));
                       
		}
		catch(Exception e){
			System.out.println("Could not connet");
		}
	}
	
	public void addRecord(String a,String b,String c,String d){
		
			
			x.format("%s%n",a);
			x.format("%s%n",b);
			x.format("%s%n",c);
			x.format("%s%n",d);                                             
		}
	
	public void closeFile(){
		x.close();
	}
 }

class Clients{
   int[] myArray = new int[5];
  
    public Clients(){
       int i=0;
       for(i=0;i<5;i++){
          myArray[i]=1000+i;
         
       } 
    } 
    
    public int match(int num){
        int a=num;
        int c=0;
        int i=0;
        for(i=0;i<5;i++){
           if(myArray[i]==a){
               c=1;
               break;
           }
        }
        return c;
    }

}

public class Server {
    public static void main(String[] args) throws IOException {
        int num,j=0,res,sr=0,br,len=2,po=0;
        Write w = new Write();
        Cse cs = new Cse();
        Eee ee = new Eee();
        Bba bb = new Bba();
        Read R = new Read();
        ReadEee rcs1=new ReadEee();
        ReadCse rcs=new ReadCse();
        ReadBba rcs2=new  ReadBba();
        String ids=new String();
        String name1=new String();
        String dep,sem,no;
        
        Clients c = new Clients();
        ServerSocket so = new ServerSocket(1342);
        Socket ss = so.accept();
        PrintStream p = new PrintStream(ss.getOutputStream());
        Scanner sc= new Scanner(ss.getInputStream());
        while(true){
            num=sc.nextInt();
            if(num==1){
                break;
            }
            res=c.match(num);
            p.println(res); 
       }    
       while(true){
            num=sc.nextInt();
            System.out.println(num);
            if(num==1){
                
                num=sc.nextInt();
                ids=Integer.toString(num);
                System.out.println(num);
                R.openFile();
                R.readFile(ids);
                System.out.println("Value"+R.mc);
  
                if(R.mc==1){
                        sr=1;
                        System.out.println("SrInside"+sr);    
                        p.println(sr);
                        ids=R.a;
                        System.out.println("ID: "+sr);
                        p.println(ids);
                        name1=R.b;
                        p.println(name1);
                        sem=R.c;
                        p.println(sem); 
                        dep=R.d;
                        System.out.println("DEPT. "+dep);
                        p.println(dep);
                        sr=0;
                       
                        
                }
                   
                System.out.println("Sr"+sr);    
                
            
               if(sr!=1){
                   System.out.println(sr);  
                   p.println(sr);}
               R.closeFile();
               continue;
                
            }  
       
            if(num==2){
               
                w.openFile();
                p.println("no");
                ids=sc.next();
                System.out.println(ids);
                name1=sc.next();
                System.out.println(name1);
                no=sc.next();
                System.out.println(no);
                dep=sc.next();
                
                System.out.println(dep);
                w.addRecord(ids,name1,no,dep);
                if(dep.equals("cse")||dep.equals("CSE")){
                    cs.openFile();
                    cs.addRecord(ids,name1,no,dep);
                    cs.closeFile();
                }
                if(dep.equals("bba")||dep.equals("BBA")){
                    bb.openFile();
                    bb.addRecord(ids,name1,no,dep);
                    bb.closeFile();
                }
                if(dep.equals("eee")||dep.equals("EEE")){
                    ee.openFile();
                    ee.addRecord(ids,name1,no,dep);
                    ee.closeFile();
                }
                
             
                w.closeFile();
            }
            if(num==3){
                int leng=1;
                System.out.println(len);
                dep=sc.next(); 
                 System.out.println(dep);
               
                if(dep.equals("cse")||dep.equals("CSE")){
                    rcs.openFile();
                    int ttl=rcs.SizeFile();
                    p.println(ttl);
                    no=sc.next();
                    for(int i=0;i<ttl;i++){
                        rcs.openFile();
                        rcs.readFile(leng);
                       
                        leng++;
                        
                        p.println(rcs.a);
                        p.println(rcs.b);
                        p.println(rcs.c);
                        p.println(rcs.d);
                        
                    }
                }
                if(dep.equals("eee")||dep.equals("EEE")){
                    System.out.println(dep);
                    rcs1.openFile();
                    int ho=rcs1.SizeFile();
                    p.println(ho);
                    no=sc.next();
                    for(int i=0;i<ho;i++){
                        rcs1.openFile();
                        rcs1.readFile(leng);
                       
                        leng++;
                        
                        p.println(rcs1.a);
                        p.println(rcs1.b);
                        p.println(rcs1.c);
                        p.println(rcs1.d);
                        
                    }
                }
                if(dep.equals("bba")||dep.equals("BBA")){
                    System.out.println(dep);
                    rcs2.openFile();
                    int hor=rcs2.SizeFile();
                    p.println(hor);
                    no=sc.next();
                    for(int u=0;u<hor;u++){
                        rcs2.openFile();
                        rcs2.readFile(leng);
                       
                        leng++;
                        
                        p.println(rcs2.a);
                        p.println(rcs2.b);
                        p.println(rcs2.c);
                        p.println(rcs2.d);
                        
                    }
                }
                
            }
             if(num==4){
               int n=1;
                R.openFile();
                 System.out.println("msg");
                 int io=R.SizeFile();
                 p.println(io);
                    no=sc.next();
                 for(j=0;j<io;j++){
                        R.openFile();
                        R.readFl(n);
                       
                        n++;
                        
                        p.println(R.a);
                        p.println(R.b);
                        p.println(R.c);
                        p.println(R.d);
                        
                    }             
            }
             if(num==5){
                 break;
             }
       }   
    }    
    
}
