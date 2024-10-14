public class Greetings{
    public static String greeting(String name){
        return "hello, " + name + " how are you?";
    }
    
    public static void testGreetings(String name, String expected){
        String result = greeting(name);
        
        System.out.println("name: " + name + " expected: " + expected + " result: " + result);
            
        if (result.equals(expected))
        {
            System.out.println("YAY!");
        } 
        else
        {
            System.out.println("BOOHOO!");
        }
    }
     public static void main(String[] args){
         testGreetings("Annie", "hello, Annie how are you?");
         testGreetings("Bob", "hello, Bob how are you?");
         testGreetings("Jim", "hello, Jim how are you?");
     }
         
  }
