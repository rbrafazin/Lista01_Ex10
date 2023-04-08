import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é %.1f°F", f);

        sc.close();

    }
}
