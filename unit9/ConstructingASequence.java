import java.util.*;

public class ConstructingASequence{
    public static int[] ConstructingASequence(int n){
        int[] Fibonacci = new int[n]; 
        //ArrayList<Integer> Fibonacci = new ArrayList<Integer>();
        Fibonacci[0] = 1;
        Fibonacci[1] = 1;
        for(int i = 0; i<n-2; i++){
            Fibonacci[i+2] = Fibonacci[i] + Fibonacci[i+1];
            
            
            
        }
        //int[] chosenList = Fibonacci;
        return Fibonacci;
    }
    public static void main(String[] args)
         
     {
        
       for(int value: ConstructingASequence(7)) {
        System.out.println(value);
       }
           
       for(int value: ConstructingASequence(10)) {
        System.out.println(value);
       }
        
    
      for(int value: ConstructingASequence(5)) {
        System.out.println(value);
      }
          
     for(int value: ConstructingASequence(2)) {
        System.out.println(value);
     }
        }
       }
     

    

 