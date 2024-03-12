public class Exercicio09 {

    public static void executar(){
        double numeroA = Prompt.lerDecimal("Informe o número A: ");
        double numeroB = Prompt.lerDecimal("Informe o número B: ");

        if(numeroA == numeroB){
            Prompt.imprimir("Os números são iguais.");
        } else if(numeroA > numeroB){
            Prompt.imprimir("Os números são diferentes, e o maior numero é o A.");
        } else {
            Prompt.imprimir("Os números são diferentes, e o maior número é o B.");
        }
    }
    
}
