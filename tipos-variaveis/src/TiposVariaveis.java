public class TiposVariaveis  {
    public static void main(String[] args) throws Exception {
        // Estudar tipos primitivos
        // Estudar classe string que representa texto na aplicação

        String meuNome = "MURILO LEONE FERNANDES";

        double salarioMinimo = 2500; //Forma correta para definir milhares.
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Recurso cast, pego um tipo mais
        // abrangente e converte para um tipo mais específico no qual é o tipo correspondente.

        // variásveis constanstes são definidar pela palavra reservada final.
        final double VALOR_DE_PI = 3.14;
    }
}
