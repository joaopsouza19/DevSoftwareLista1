public class Exercicio07 {
    
    public static void executar(){
        double numero = Prompt.lerDecimal("Informe um número: ");
        if(numero >= 100 && numero <= 200){
            Prompt.imprimir("O número esta no intervalo entre 100 e 200");
        } else{
            Prompt.imprimir("O número está fora do intervalo");
        }
    }
}
