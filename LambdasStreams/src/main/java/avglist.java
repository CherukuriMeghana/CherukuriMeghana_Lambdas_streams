import java.util.*; 
import java.util.stream.IntStream; 
  
class avglist { 
  
    public static void main(String[] args) 
    { 
        IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8,10);  
        OptionalDouble obj1 = stream.average(); 
        if (obj1.isPresent()) { 
            System.out.println(obj1.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    }
}