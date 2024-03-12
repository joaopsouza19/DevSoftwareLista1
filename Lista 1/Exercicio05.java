public class Exercicio05 {

    public static void executar(){
        double A = Prompt.lerDecimal("Digite o número A: ");
        double B = Prompt.lerDecimal("Digite o número B: ");
        double valorA = B;
        double valorB = A;
        Prompt.imprimir("Valor original de A: " + A);
        Prompt.imprimir("Valor original de B: " + B);
        Prompt.imprimir("Valor trocado de A: " + valorA);
        Prompt.imprimir("Valor trocado de B: " + valorB);

    }
    
}
