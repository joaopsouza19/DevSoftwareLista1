public class Exercicio17 {
    
    public static void executar(){
        double nota1 = Prompt.lerDecimal("Informe a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Informe a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Informe a terceira nota: ");
        double peso1 = Prompt.lerDecimal("Informe o peso da primeira nota: ");
        double peso2 = Prompt.lerDecimal("Informe o peso da segunda nota: ");
        double peso3 = Prompt.lerDecimal("Informe o peso da terceira nota: ");
        double mediap = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        Prompt.imprimir("A média ponderada do aluno é: " + mediap);
    }
}
