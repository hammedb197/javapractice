import java.util.Scanner;
class add{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int numberOne;
       int numberTwo;
       int sum;
       System.out.println("Enter first number: ");
       numberOne = input.nextInt();

       System.out.println("Enter secoond number: ");
       numberTwo = input.nextInt();
       sum = numberOne + numberTwo;
       System.out.println(sum);

       if ( numberOne == numberTwo )
       System.out.printf( "%d == %d\n", numberOne, numberTwo );
       if ( numberOne != numberTwo )
       System.out.printf( "%d != %d\n", numberOne, numberTwo );
       if ( numberOne < numberTwo )
       System.out.printf( "%d < %d\n", numberOne, numberTwo );

    }


}