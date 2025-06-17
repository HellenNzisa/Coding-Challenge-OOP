import java.util.*;
class HelloTillStop{
Scanner sc = new Scanner(System.in);

    void showHello(){
        String choice;
        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next();
        while(choice.equals("h")){
            System.out.println("Hello");
            choice = sc.next();
        }
    }
    public static void main(String[] args) {
        HelloTillStop obj = new HelloTillStop(); 
        obj.showHello(); 
    }
}