import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        System.out.println("\n\n\t******** Welcome to Calculator *********");
        System.out.println("****** Enter 0 to exit the Programn ******\n\n");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Square");
        System.out.println("Enter 6 for Cube");
        System.out.println("Enter 7 for Squareroot");
        System.out.println("Enter 8 for Power");
        System.out.println("Enter 9 for Factorial");
        int Choice;
        double a = 0, b = 0;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("\n\nEnter you Choice : ");
            Choice = sc.nextInt();
            if ((Choice >= 1 && Choice <= 4) || Choice == 8) {
                System.out.println("Enter the Value of a : ");
                a = sc.nextInt();
                System.out.println("Enter the value of b : ");
                ;
                b = sc.nextInt();
            } else if (Choice == 0) {
                System.out.println("\n\n******** Thank you for using this program ********");
                System.exit(0);
            } else {
                System.out.println("Enter the value of a : ");
                a = sc.nextInt();
            }

            switch (Choice) {
                case 1:
                    result = a + b;

                    System.out.println("Addition of the " + a + " and " + b + " is = " + result);
                    break;
                case 2:
                    result = a - b;

                    System.out.println("Substraction of the " + a + " and " + b + " is = " + result);
                    break;
                case 3:
                    result = a * b;

                    System.out.println("Multiplication of the " + a + " and " + b + " is = " + result);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Division by zero is not allow!!! ");
                    } else {
                        result = a / b;

                        System.out.println("Division of the " + a + " and " + b + " is = " + result);
                    }
                    break;
                case 5:
                    result = a * a;

                    System.out.println("Square of the " + a + " is = " + result);
                    break;
                case 6:
                    result = a * a * a;

                    System.out.println("Cube of the " + a + " is = " + result);
                    break;
                case 7:
                    if (a >= 0) {
                        result = Math.sqrt(a);
                        System.out.println("Squareroot of the " + a + " is = " + result);
                    } else {
                        System.out.println("Squareroot of negative numeber is not real ");
                    }

                    break;
                case 8:
                    result = Math.pow(a, b);

                    System.out.println("Result of the a^b is = " + result);
                    break;
                case 9:
                    if (a < 0) {
                        System.out.println("Factorial is only defind for non-negative number!!!");
                    } else {
                        double fact = 1;

                        for (int i = 1; i <= a; i++) {

                            fact = fact * i;

                        }
                        result = fact;
                        System.out.println("Factorial of the " + a + " is = " + result);
                    }
                    break;

                default:

                    System.out.println("Entered Choice is not correct!!! (Try Again)");
                    break;
            }
        }

    }
}