package biHari;

// TODO: Auto-generated Javadoc
/**
 * The Class Taula7Hari.
 */
class Taula7Hari extends Thread {
    
    /**
     * Instantiates a new taula 7 hari.
     *
     * @param izena, gure hariaren izena
     */
    public Taula7Hari(String izena) {
        super(izena);
    }

    /**
     * Hasi.
     */
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " - 7 x " + i + " = " + (7 * i));
        }
        System.out.println(getName() + " amaitu da.");
    }
}