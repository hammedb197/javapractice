import java.util.Scanner;

class product{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int numberThree;
        int product;
        
        System.out.println("Entere the  first  number: ");
        numberOne = input.nextInt();
        System.out.println("Enter th second number: ");
        numberTwo = input.nextInt();
        System.out.println("Enter thne third number: ");
        numberThree = input.nextInt();

        product = numberOne * numberTwo * numberThree;
        System.out.println(product);
    }
}