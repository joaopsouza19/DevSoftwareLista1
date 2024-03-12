public class Exercicio10 {
    
    public static void executar(){
        double numero = Prompt.lerDecimal("Informe um número de 1 a 5: ");
        if(numero == 1){
            Prompt.imprimir("O número informado é um.");
        } else if(numero == 2){
            Prompt.imprimir("O número informado é dois.");
        } else if(numero == 3){
            Prompt.imprimir("O número informado é três.");
        } else if(numero == 4){
            Prompt.imprimir("O número informado é quatro.");
        } else if(numero == 5){
            Prompt.imprimir("O número informado é cinco.");
        } else {
            Prompt.imprimir("Número inválido.");
        }
    }
}
