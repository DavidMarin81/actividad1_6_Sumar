import java.io.*;
import java.util.Scanner;

public class actividad7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String cadena = "";

        File directorio = new File("out\\production\\actividad7LeerCadenas");
        ProcessBuilder pb = new ProcessBuilder("java", "actividad7LeerCadenas");
        pb.directory(directorio);

        Process p;
        while (!salir) {
            p = pb.start();

            System.out.println("Introduce una cadena:");
            cadena = sc.nextLine();

            OutputStream os = p.getOutputStream();
            os.write((cadena + "\n").getBytes());
            os.flush();

            InputStream is = p.getInputStream();
            is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1)
                System.out.print((char) c);
            if (cadena.equals("*")) {
                salir = true;
            }
        }


    }
}
