public class Exercicio13 {
    
    public static void executar(){
        double A = Prompt.lerDecimal("Informe o primeiro número real: ");
        double B = Prompt.lerDecimal("Informe o segundo número real: ");
        char operador = Prompt.lerLinha("Informe o operador (+, -, *, /): ").charAt(0);

        if(operador == '+'){
            Prompt.imprimir("O resultado da soma entre A e B é: " + (A + B));
        } else if(operador == '-'){
            Prompt.imprimir("O resultado da subtração entre A e B é: " + (A - B));
        } else if(operador == '*'){
            Prompt.imprimir("O resultado da multiplicação entre A e B é: " + (A * B));
        } else if(operador == '/' && A == 0){
            Prompt.imprimir("Erro divisão de zero");
        }  else if(operador == '/' && B == 0){
            Prompt.imprimir("Erro divisão de zero");
        }  else if(operador == '/' && A > 0){
            Prompt.imprimir("O resultado da divisão entre A e B é: " + (A / B));
        }  else if(operador == '/' && B > 0){
            Prompt.imprimir("O resultado da divisão entre A e B é: " + (A / B));
        } else {
            Prompt.imprimir("Operador não definido");
        }
    }
}

