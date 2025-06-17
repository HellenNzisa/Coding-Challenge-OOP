public class Variables {
    void showInterest(){
        double amount;
        double interest;
       
        amount = 1000.0; 
        System.out.println("Enter the amount: " + amount);

        interest=3.0;
        amount = amount*(interest+100.0)/100.0;
        System.out.println("The amount after a year is: " + amount);

        amount =amount*(interest+100.0)/100.0;
        System.out.println("The amount after two years is: " + amount);
    }
    
    public static void main(String[] args) {
        Variables obj = new Variables(); 
        obj.showInterest(); 
    }
}
