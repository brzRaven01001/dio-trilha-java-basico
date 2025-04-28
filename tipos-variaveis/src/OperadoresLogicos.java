public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Verifica se ambas as condições são verdadeiras (Operador Lógico "E" - &&)
        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condicoes sao verdadeiras");
        }

        // Verifica se pelo menos uma das condições é verdadeira (Operador Lógico "OU" - ||)
        if (condicao1 || condicao2) {
            System.out.println("Uma das condicoes e verdadeira!");
        }

        // Mensagem final, independente das condições anteriores
        System.out.println("Fim");
    }
}

/* 
Operadores Lógicos em Java

Os operadores lógicos permitem combinar duas ou mais expressões booleanas (verdadeiro/falso) em uma expressão mais complexa.

Principais operadores:

    &&  -> Operador Lógico "E" (AND)
            A expressão será verdadeira somente se ambas as condições forem verdadeiras.
            Exemplo: (condicao1 && condicao2)

    ||  -> Operador Lógico "OU" (OR)
            A expressão será verdadeira se pelo menos uma das condições for verdadeira.
            Exemplo: (condicao1 || condicao2)

Notas:
- Operadores lógicos são muito usados em estruturas de decisão (if, while, etc.).
- É importante usar parênteses para deixar as expressões claras e evitar ambiguidades.

Exemplo adicional:
    if (condicao1 && condicao2) { ... }  // Executa se as duas forem verdadeiras
    if (condicao1 || condicao2) { ... }  // Executa se pelo menos uma for verdadeira
*/
