public class HiloTrabajo extends Thread {
    private int threadId;
    private int n;
    private int m;
    public HiloTrabajo(int threadId,int n, int m) {
        this.threadId = threadId;
        this.n = n;
        this.m = m;
    }

    @Override
    public void run() {
        for (int i = threadId;i<n;i+=m){
            System.out.println("hilo" +threadId+"indice"+i);
        }
    }
}
