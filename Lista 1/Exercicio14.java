public class Exercicio14 {
    
    public static void executar(){
        double a1 = Prompt.lerDecimal("Informe o valor de a1 (primeiro termo da progressão aritmética): ");
        double n = Prompt.lerDecimal("Informe o valor de n (n-ésimo termo): ");
        double r = Prompt.lerDecimal("Informe o valor da r (razão): ");
        double an = a1 + (n - 1) * r;
        Prompt.imprimir("O n-ésimo termo de uma progressão aritmética é: " + an);
    }
}
