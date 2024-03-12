public class Exercicio11 {
    
    public static void executar(){
        int numero1 = Prompt.lerInteiro("Informe o primeiro número inteiro: ");
        int numero2 = Prompt.lerInteiro("Informe o segundo número inteiro: ");
        int numero3 = Prompt.lerInteiro("Informe o terceiro número inteiro: ");
        

        if((numero1 > numero2)&&(numero2 > numero3)){
            Prompt.imprimir("Os números em ordem crescente são: " + numero3 + ", " + numero2 + ", " + numero1);
        } else if((numero1 > numero2)&&(numero2 < numero3)){
            Prompt.imprimir("Os números em ordem crescente são: " + numero2 + ", " + numero3 + ", " + numero1);
        } else if((numero1 < numero2)&&(numero2 > numero3)&&(numero1 > numero3)){
            Prompt.imprimir("Os números em ordem crescente são: " + numero3 + ", " + numero1 + ", " + numero2);
        } else if((numero1 < numero2)&&(numero2 > numero3)&&(numero3 > numero1)){
            Prompt.imprimir("Os números em ordem crescente sãO: " + numero1 + ", " + numero3 + ", " + numero2);
        } else if((numero1 > numero2)&&(numero2 < numero3)&&(numero1 < numero3)){
            Prompt.imprimir("Os números em ordem crescente são: " + numero2 + ", " + numero1 + ", " + numero3);
        } else if((numero1 < numero2)&&(numero2 < numero3)){
            Prompt.imprimir("Os números em ordem crescente são: " + numero1 + ", " +  numero2 + ", " + numero3);
        } 
    }
}
