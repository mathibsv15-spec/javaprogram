public class Jun09AN{
    
    public static void isPrime(int num){
     int factors = 0;
     for (int i = 2; i<Math.sqrt(num); i++){
        if (num % i === 0){
            factors +=2;
        
        }
     }  
     if (factors > 0){
        System.out.println("Not");
     } 
    }
}