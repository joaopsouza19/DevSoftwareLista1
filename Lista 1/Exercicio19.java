public class Exercicio19 {
    
    public static void executar(){
        double raio = Prompt.lerDecimal("Informe o raio do cilindro: ");
        double altura = Prompt.lerDecimal("Informe a altura do cilindro: ");
        double volumeC = 3.14 * (raio * raio) * altura;
        Prompt.imprimir("O volume do cilindro é de: " + volumeC);
    }
}
