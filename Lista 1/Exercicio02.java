public class Exercicio02 {

    public static void executar(){
        double numero1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double numero2 = Prompt.lerDecimal("Digite o segundo número: ");
        double soma = numero1 + numero2;
        Prompt.imprimir("Resultado da soma: " + soma);
    }
}