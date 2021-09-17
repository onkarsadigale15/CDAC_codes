        import java.util.*;  
        public class Q4A1B {
        
        public static void main(String args[]){    
                     Scanner sc=new Scanner(System.in);
                     System.out.println("enter the number1=");
                     double n1=sc.nextDouble();
                     System.out.println("enter the number2=");
                     double n2=sc.nextDouble();
    
                //Print Double value  
                if(sc.hasNextDouble())
                {//n1=sc.nextDouble();
                    //n2=sc.nextDouble();
                    System.out.print("Found Double Value");  
               
double avg=(n1+n2)/2;
System.out.println("average of  numbers="+avg);
                     }  
                else{  
                    System.out.println("Error:Not Found Double Value");  
                System.exit(0);
                }  
                sc.close();

            }  
              
            }   
      

