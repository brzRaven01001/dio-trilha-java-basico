public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);
    }
}


/*
Em Java, operadores unários são aqueles que operam sobre um único operando. 
Alguns exemplos incluem o operador de incremento ( ++ ), o operador de decremento ( -- ), 
o operador de sinal positivo ( + ) e o operador de sinal negativo ( - ). 

Detalhes:

    Incremento ( ++ ):
    Aumenta o valor de uma variável em 1. Pode ser prefixado ( ++x ) ou pós-fixado ( x++ ). 

Decremento ( -- ):
Diminui o valor de uma variável em 1. Também pode ser prefixado ( --x ) ou pós-fixado ( x-- ). 
Sinal Positivo ( + ):
Indica que um valor é positivo, embora em Java números são positivos por padrão. 
Sinal Negativo ( - ):
Nega o valor de um número
 */