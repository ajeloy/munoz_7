package gestorArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestorTextos {

    /**
     * Lee y devuelve un texto solo con sus líneas pares.
     *
     * @param Ubicacion del texto de tipo String.
     * @return Texto sin líneas impares de tipo String.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String leerTexto1(String ubicacionTexto) throws FileNotFoundException, IOException {
        File f = new File(ubicacionTexto);
        if (f.exists()) {
            String linea;
            String mensaje = "";
            FileReader fr = new FileReader(ubicacionTexto);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            while ((linea = br.readLine()) != null) {
                br.readLine();
                mensaje = mensaje + linea + "\n";

            }
            return mensaje;
        }
        return "nada";
    }

    /**
     * Lee un texto y lo devuelve sin saltos de línea.
     *
     * @param Ubicación del texto de tipo String.
     * @return Texto en línea recta de tipo String.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String leerTexto2(String ubicacionTexto) throws FileNotFoundException, IOException {
        File f = new File(ubicacionTexto);
        if (f.exists()) {
            String linea;
            String mensaje = "";
            FileReader fr = new FileReader(ubicacionTexto);
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                mensaje = mensaje + linea;
            }
            return mensaje;
        }
        return "nada";
    }
}
