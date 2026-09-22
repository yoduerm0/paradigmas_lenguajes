class Calculadora {
    private int numero;

    public Calculadora (int numero) {
        this.numero = numero;
    }

    public long factorial() {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return numero;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5);
        System.out.printIn("Factorial de " + calc.getNumero() + "=" + calc.factorial());
    }
}