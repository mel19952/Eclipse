
public class Principal {
    public static void main(String[] args) {
        Trigonometria trigonometria = new Trigonometria(0.5); // Crea un objeto Trigonometria con un valor de 0.5
        double seno = trigonometria.getSeno();
        double coseno = trigonometria.getCoseno();
        
        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);
    }
}

