public class ClienteTienda implements Runnable {
    Tienda tienda;
    int cantidad;

    public ClienteTienda(Tienda tienda, int cantidad) {
        this.tienda = tienda;
        this.cantidad = cantidad;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda t1) {
        this.tienda = t1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
    tienda.comprarProducto(cantidad);

    }
}
