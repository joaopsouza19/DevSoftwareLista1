public interface Exercicio18 {
    
    public static void executar(){
        double nota1 = Prompt.lerDecimal("Informe a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Informe a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Informe a terceira nota: ");
        double mediah = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));
        Prompt.imprimir("A média harmônica do aluno é: " + mediah);
    }
}
