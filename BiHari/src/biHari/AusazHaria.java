package biHari;


class Ausazharia extends Thread {
    public Ausazharia(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int valorAleatorio = (int) (Math.random() * 100) + 1;
            System.out.println(getName() + " - Ausa zebakia: " + valorAleatorio);
        }
        System.out.println(getName() + " amaitu da.");
    }
}