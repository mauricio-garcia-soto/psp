import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("introduce la cantidad de trabajo");
        int n = teclado.nextInt();
        teclado.nextLine();
        System.out.println("introduce la cantidad de hilos");
        int m = teclado.nextInt();
        teclado.nextLine();
        Thread hilos[]= new Thread[m];
        int bloque =(n+m-1)/m;
        for (int i=0;i<m;i++){
            int inicio=i*bloque;
            int terminar= Math.min(inicio+bloque,n);
            if (inicio>=n){
                terminar=inicio;
            }
            hilos[i]= new HiloTrabajoBloque(i,inicio,terminar);
            hilos[i].start();


        }
        for (int i=0;i<m;i++){
            try {
                hilos[i].join();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
