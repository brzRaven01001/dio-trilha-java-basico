public class OperadoresTernarios {
    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 6;
        int resultado = a == b ? 1 : 0;
        
        System.out.println(resultado);
    }
}

/*
  O Operador de Condição Ternária é uma forma resumida para definir uma condição e escolher 
  por um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma condição 
  IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.
  O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:
  <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
 */