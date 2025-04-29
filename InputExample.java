import java.util.Scanner;
public class InputExample {
 Scanner scanner =new Scanner(System.in);
   
 public void readNameAndAge(){
    String name;
    int age;
    System.out.print("Name? ");
    name = scanner.next();

    System.out.print("Age? ");
    age = scanner.nextInt();

    System.out.println("Hello "+name+",you are "+age+" springs young. YAYYYYY!!");
 }
    public static void main(String[] args) {
        InputExample obj = new InputExample(); 
        obj.readNameAndAge(); 
    }
}
