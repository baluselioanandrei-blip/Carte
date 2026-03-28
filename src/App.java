public class App {
    public static void main(String[] args) {
        Carte c1 = new Carte(100);
        Carte c2 = new Carte(100);
        Carte c3 = new Carte(200);

        System.out.println(c1.esteIdentica(c2));
        System.out.println(c1.esteIdentica(c3));
    }
}