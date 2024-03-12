public class Exercicio08 {
    
    public static void executar(){
        double numero = Prompt.lerDecimal("Informe um número: ");
        if(numero >= 50){
            Prompt.imprimir("O número informado é igual ou maior que 50.");
        } else {
            Prompt.imprimir("O número informado é menor que 50.");
        }
    }
}
