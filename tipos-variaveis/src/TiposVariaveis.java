public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Aqui, numero continua sendo uma variavel que pode ser alterada
        int numero = 5;

        numero = 10;

        System.out.println("O número é: " + numero);

        //Aqui, a variavel numero se torna uma constante, assim, não pode ser mudada, alterada.
        /*final int NUMERO = 5;

        System.out.println("O número é: " + NUMERO);*/
    }
}
