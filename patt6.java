import java.util.*;
public class patt6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=i;j<=2*i-1;j++){
               System.out.print(j);
                          for(int k=2*i-1;k>=1;k--){
               
               System.out.print(k);
           }
           }


           
           System.out.println();  
       }
       }/*
        for(int i=n;i>=1;i--){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=2*i-1;j++){
               System.out.print("*");
           }
           System.out.println();  
       }*/
    }
