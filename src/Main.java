public class Main {
    public static void main(String[] args) {
        new HiloDurmiente("Primer hilo").start();
        new HiloDurmiente("Segundo hilo").start();
        new HiloDurmiente("Tercer hilo").start();
        new HiloDurmiente("Cuarto hilo").start();
        new HiloDurmiente("Quinto hilo").start();
    }
}