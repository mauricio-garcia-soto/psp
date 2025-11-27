public class Tienda {
    int stock;
    public Tienda(int stock){
        this.stock=stock;
    }
   public int getStock(){
        return stock;
   }
   public void setStock(int stock){
        this.stock=stock;
   }
   public synchronized void comprarProducto(int cantidad){
        if (cantidad>stock){
            System.out.println("no se puede hacer la compra ");
        }
        else {
            stock-=cantidad;
            System.out.println("compra realizada stock restante: " +stock);
        }
   }
}
