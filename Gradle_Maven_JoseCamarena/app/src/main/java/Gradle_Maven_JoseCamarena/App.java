
package Gradle_Maven_JoseCamarena;
import org.apache.commons.math3.primes.Primes;
public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int x1 = 17;
        int x2 = 18;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("El driver funciona");
            if (Primes.isPrime(x1)) {
                System.out.println("El número " + x1 + " és primo");
            } else {
                System.out.println("El número " + x1 + " no és primo");
            }
            if (Primes.isPrime(x2)) {
                System.out.println("El número " + x2 + " és primo");
            } else {
                System.out.println("El número " + x2 + " no és primo");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error en el driver de la BD");
            System.out.println("Error: " + e.getMessage());
        }
    }

}
