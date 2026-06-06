public class Main {
    /**
     * Das Hauptprogramm (main-Methode):
     * Alles, was ausgeführt werden soll,
     * muss in diese Methode eingefügt werden.
     * Objekte erstellen, Methoden aufrufen, ...
     *
     * Das Hauptprogramm wird automatisch
     * gestartet, wenn du auf 'Play' drückst.
     */
    public static void main() {
        System.out.println(">>> Main.main()");
        World world = new World(1000, 1000);
        Hund hund = new Hund();
        Mensch mensch = new Mensch(hund);
        mensch.gassiGehen();
        System.out.println("<<< Main.main()");
    }

} /*
   * // main()-Methode starten
   * Main.main();
   */