public class TiposVariaveis  {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500; //Forma correta para definir milhares.
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Recurso cast, pego um tipo mais
        // abrangente e converte para um tipo mais específico no qual é o tipo correspondente.
    }
}
