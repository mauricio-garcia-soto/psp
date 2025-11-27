import java.util.ArrayList;

public class PrincipalTienda {

   public static void main  (String args[]){
       Tienda tienda= new Tienda(10);
       ArrayList<ClienteTienda> clientes= new ArrayList<>();
       ClienteTienda cliente= new ClienteTienda(tienda,4);
       clientes.add(cliente);
       ClienteTienda cliente2= new ClienteTienda(tienda,2);
       clientes.add(cliente2);
       Thread hilos[]= new Thread[clientes.size()];
       for (int i =0; i<clientes.size();i++){
           hilos[i]=new Thread(clientes.get(i));
           hilos[i].start();
       }
       for (int i =0; i<hilos.length;i++){
           try {
               hilos[i].join();
           } catch (Exception e) {
               throw new RuntimeException(e);
           }

       }
   }

}
