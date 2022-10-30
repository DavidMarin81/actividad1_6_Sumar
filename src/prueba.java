import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prueba {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un nombre:");
        String nombre = br.readLine();
        System.out.println("Su nombre es " + nombre);

    }

}
