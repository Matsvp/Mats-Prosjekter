
public class variable {
    public static void main(String[] args) {

        int age = 30;
        int year = 2025;
        int quantity = 1;
        
        double price = 19.99;
        double gpa = 3.5;
        double temprature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Mats VP";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Your avarage letter garde is " + grade);

        System.out.println("Your chouice is a " + color + " " + year + " " + " " + car);
        System.out.println("The price is: " + currency + price);

       if(forSale){
        System.out.println("There is a " + car + " for sale ");
       } 
       else{
        System.out.println("The " + car + "  is not for sale ");
       }

        
    }

}
