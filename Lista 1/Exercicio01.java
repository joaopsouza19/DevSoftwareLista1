public class Exercicio01 {

    public static void executar() {

        double numero = Prompt.lerDecimal("Digite o numero: ");
        if (numero > 10) {
            Prompt.imprimir("Número maior do que 10!");
        } else if (numero <= 10) {
            Prompt.imprimir("Número menor ou igual a 10!");
        }

    }

}