package Lesson6;


public class Program113 {
    public static void main(String[] args) {
       for(int n=2; n <= 20; n++){
        prime(n);
       }
    }

    private static double prime(int n) {  
            int i,m=0,flag=0;      
            m=n/2;      
            if(n==0||n==1){  
             System.out.println(n+" ");      
            }else{  
             for(i=2;i<=m;i++){      
              if(n%i==0){      
               System.out.println(n+" ");      
               flag=1;      
               break;      
              }      
             }      
             if(flag==0)  { System.out.println(n+"<"); }  
            }//end of else  
            return flag;
         
    }
}
 