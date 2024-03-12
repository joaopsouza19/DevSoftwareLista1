public class Exercicio16 {
    
    public static void executar(){
        double nota1 = Prompt.lerDecimal("Informe a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Informe a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Informe a terceira nota: ");
        double media = (nota1 + nota2 + nota3) / 3;
        Prompt.imprimir("A média aritmética do aluno é: " + media);
    }
}
