import java.util.*;
public class COmp {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int t = in.nextInt();
      for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                if (i%3 ==0 || i%5 == 0){
              sum=sum+i;  
            }
            }
            System.out.println(sum);
        }
       
}
}
    

