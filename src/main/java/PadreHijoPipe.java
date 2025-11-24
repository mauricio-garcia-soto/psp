import java.io.*;

public class PadreHijoPipe {
    public static void main(String[] args) {
        try {
            // Comando para lanzar el proceso hijo
            ProcessBuilder pb = new ProcessBuilder("java", "HijoPipe");
            pb.redirectErrorStream(true);

            // Iniciar el proceso hijo
            Process hijo = pb.start();

            // Salida del padre -> Entrada del hijo
            OutputStream os = hijo.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            // Entrada del hijo -> Salida del padre
            InputStream is = hijo.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            // Enviar mensaje al hijo
            pw.println("Hola hijo, soy tu padre!");
            pw.flush(); // asegurarse de que se envía el mensaje

            // Leer respuesta del hijo
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Padre recibe: " + linea);
            }

            hijo.waitFor(); // esperar a que el hijo termine
            System.out.println("Comunicación terminada.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
