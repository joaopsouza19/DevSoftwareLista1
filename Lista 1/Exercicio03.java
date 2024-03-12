public class Exercicio03 {
    
    public static void executar(){
        int A = Prompt.lerInteiro("Digite o primeiro número inteiro A: ");
        int B = Prompt.lerInteiro("Digite o segundo número inteiro B: ");
        if(A > B){
            Prompt.imprimir("O número A é maior!");
        } else if(A < B){
            Prompt.imprimir("O número B é maior!");
        } else if(A == B){
            Prompt.imprimir("A sequência de números informados é inválida!");
        }

    }
}
