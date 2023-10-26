
public class Trigonometria {
    private double valor;

    public Trigonometria(double valor) {
        this.valor = valor;
    }

    public double getSeno() {
        return Math.sin(valor);
    }

    public double getCoseno() {
        return Math.cos(valor);
    }

    // Getter y Setter para el atributo 'valor'
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
