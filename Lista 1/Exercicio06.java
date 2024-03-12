public class Exercicio06 {
    
    public static void executar(){
        double tempC = Prompt.lerDecimal("Informe a temperatura em grau Celsius: ");
        double tempF = (9 * tempC + 160) / 5;
        Prompt.imprimir("A temperatura informada convertida é de: " + tempF);
    }

}
