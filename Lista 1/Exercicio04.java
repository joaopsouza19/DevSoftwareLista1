public class Exercicio04 {
    
    public static void executar(){
        double numero1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double numero2 = Prompt.lerDecimal("Digite o segundo número: ");
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        Prompt.imprimir("Resultado da soma: " + soma);
        Prompt.imprimir("Resultado da subtração: " + subtracao);
        Prompt.imprimir("Resultado da multiplicação: " + multiplicacao);
        Prompt.imprimir("Resultado da divisão: " + divisao);

    }
}
