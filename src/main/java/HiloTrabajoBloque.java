public class HiloTrabajoBloque extends Thread {
    public int threadId;
    public int inicio;
    public int terminar;
    public HiloTrabajoBloque(int threadId, int inicio, int terminar) {
        this.threadId = threadId;
        this.inicio = inicio;
        this.terminar = terminar;
    }
    @Override
    public void run() {
        for (int i=inicio; i<terminar; i++) {
            System.out.println("hilo " +threadId+" indice "+i);
        }
    }
}
