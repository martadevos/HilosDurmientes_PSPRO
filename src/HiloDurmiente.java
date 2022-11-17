public class HiloDurmiente extends Thread{
    private String nombre;

    public HiloDurmiente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run(){
        for(;;){
            System.out.println("Soy el bucle " + nombre + " y estoy trabajando");
            try {
                Thread.sleep((long) ((Math.random()*10+1)*1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
