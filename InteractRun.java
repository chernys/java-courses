import java.util.Scanner;

public class InteractRun {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (exit.equals("yes")) {
                System.out.println("Enter first argument:");
                String first = reader.next();
                System.out.println("Enter second argument:");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result is " + calc.getResult());
                calc.clearResult();
                System.out.println("Exit: yes/no");
                exit = reader.next();
            }
        }
        finally {
            reader.close();
        }
    }
}