// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;  


class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter decimal number");  
        int dec = sc.nextInt();
        System.out.println(toHex(dec));  
    }
    
    public static String toHex(int decimal){    
     int rem;  
     String hex="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(decimal>0)  
     {  
       rem=decimal%16;   
       hex=hexchars[rem]+hex;   
       decimal=decimal/16;  
     }  
    return hex;  
}    
}
