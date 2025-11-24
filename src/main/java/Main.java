import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("introduce la cantidad de trabajo");
        int n = teclado.nextInt();
        teclado.nextLine();
        System.out.println("introduce la cantidad de hilos");
        int m = teclado.nextInt();
        teclado.nextLine();
        Thread[] hilos = new Thread[m];
        for (int i=0;i<m;i++){
            hilos[i]= new HiloTrabajo(i,n,m);
            hilos[i].start();
        }
        for (int i=0;i<m;i++){
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        }
    }
