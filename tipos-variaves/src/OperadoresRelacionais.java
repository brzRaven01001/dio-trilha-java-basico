public class OperadoresRelacionais {
    public static void main(String[] args) {
        // Declarando uma variável String e inicializando diretamente
        String nomeUm = "Lucas";

        // Criando uma nova String explicitamente com o operador 'new'
        // Em Java, o 'new' é utilizado para criar um novo objeto na memória, mesmo que já exista outro com o mesmo conteúdo.
        String nomeDois = new String("Lucas");

        // Comparando o conteúdo das duas Strings
        // O método '.equals' compara se o conteúdo dos objetos é igual (não se são o mesmo objeto na memória)
        System.out.println(nomeUm.equals(nomeDois)); // Retorna true porque os conteúdos são iguais

        // Comparando se são o MESMO objeto
        System.out.println(nomeUm == nomeDois); // Retorna false, pois são objetos diferentes na memória



        int numero1 = 1;
        int numero2 = 2;

        // Verificando se numero1 é igual a numero2
        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("a nossa condicao e verdadeira!");
        }
        
        System.out.println("Numero 1 e igual a numero 2? " + simNao);

        // Verificando se numero1 é diferente de numero2
        simNao = numero1 != numero2;
        System.out.println("Numero 1 e diferente de numero 2? " + simNao);

        // Verificando se numero1 é maior que numero2
        simNao = numero1 > numero2;
        System.out.println("Numero 1 e maior que o numero 2? " + simNao);
    }
}

/* 
Explicação dos operadores relacionais e comparações de objetos em Java:

- Os operadores relacionais avaliam a relação entre duas variáveis ou expressões.
- Eles retornam um valor booleano como resultado:

    ==  -> Verifica se dois valores são IGUAIS
    !=  -> Verifica se dois valores são DIFERENTES
    >   -> Verifica se o valor da esquerda é MAIOR que o da direita
    >=  -> Verifica se o valor da esquerda é MAIOR OU IGUAL ao da direita
    <   -> Verifica se o valor da esquerda é MENOR que o da direita
    <=  -> Verifica se o valor da esquerda é MENOR OU IGUAL ao da direita

Sobre comparação de objetos:

- O operador '==' compara se duas referências apontam para o MESMO objeto na memória.
- O método '.equals' compara se o CONTEÚDO de dois objetos é igual.

Exemplo:
    String nomeUm = "Lucas";
    String nomeDois = new String("Lucas");

    nomeUm == nomeDois    // false -> objetos diferentes na memória
    nomeUm.equals(nomeDois) // true -> conteúdos iguais

Observação:
- Strings literais (ex: "Lucas") são armazenadas no String Pool do Java e podem compartilhar referência automaticamente.
- Usar 'new' força a criação de um novo objeto, mesmo que o conteúdo seja igual.
*/
