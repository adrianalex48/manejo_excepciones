import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcesadorCalificiaciones {

    public static void main(String[] args) throws IOException {

        BufferedReader lector =
        new BufferedReader(
                new FileReader("calificaciones.txt")
        );

        String linea = new String();
        try (
                BufferedReader lector =
                        new BufferedReader(
                                new FileReader("calificaciones.txt")
                        )
        ) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                System.out.println(linea);
            }
        } catch (IOException e) {

            System.err.println(
                    "Error al leer el archivo: "
                    + e.getMessage()
);
        }



        lector.close();
    }


}




