public class Exercicio20 {
    
    public static void executar(){
        double velocidadeM = Prompt.lerDecimal("Informe a velocidade média do carro durante a viagem: ");
        double tempoV = Prompt.lerDecimal("Informe o tempo em horas gasto para fazer a viagem: ");
        double distancia = velocidadeM * tempoV;
        double qtdLitros = distancia / 12;
        Prompt.imprimir("A quantidade gasta em litros nessa viagem foi de: " + qtdLitros);
    }
}
