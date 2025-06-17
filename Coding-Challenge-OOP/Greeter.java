public class Greeter {
    void greet(){
        System.out.println("Hi there!!");
    }
    public static void main(String[] args) {
        
        (new Greeter()).greet(); // Creating an instance of Greeter and calling the greet method
    }
}
