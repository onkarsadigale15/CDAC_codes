import java.util.*;  
public class Q4A1 {    
    public static void main(String args[]){       
            Scanner scan = new Scanner(System.in);  
            System.out.print("Enter some value: ");           
            if(scan.hasNextDouble())  
            {    System.out.print("Enter some value: ");           
            double n1=scan.nextDouble();
            double n2=scan.nextDouble();
                System.out.print("Found Double Value");  
           
double avg=(n1+n2)/2;
System.out.println("average of  numbers="+avg); 
            }                     
            else if (scan.hasNext())  
            {  
                System.out.println("Error :Please Entered the Double Value.");  
              System.out.println("You entered: " + scan.next());  
            }  
            scan.close();  
        }    
}  