public class Exercicio15 {
    
    public static void executar(){
        double p1x1 = Prompt.lerDecimal("Informe o valor de p1(x1): ");
        double p1y1 = Prompt.lerDecimal("Informe o valor de p1(y1)");
        double p2x2 = Prompt.lerDecimal("Informe o valor de p2(x2): ");
        double p2y2 = Prompt.lerDecimal("Informe o valor de p2(y2): ");
        double distancia = Math.sqrt(((p2x2 - p1x1) * (p2x2 - p1x1)) + ((p2y2 - p1y1) * (p2y2 - p1y1)));
        Prompt.imprimir("A distância entre eles é de: " + distancia);
    }
}
