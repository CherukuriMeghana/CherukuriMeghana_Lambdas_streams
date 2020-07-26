import java.util.stream.Stream; 
  
class filter { 
  
    public static void main(String[] args) 
    { 
        Stream<String> stream = Stream.of("avg", "ace", "apple", "mango"); 
        stream.filter(s -> s.startsWith("a") && s.length()==3)
        .forEach(System.out::println); 
    } 
} 