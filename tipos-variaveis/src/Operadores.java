public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        //não retorna nada, pq as duas opcoes precisariam ser vedadeiras ou falsas. Ter o mesmo resultado desejado. (0 e 1)
        if (condicao1 && condicao2) {
            System.out.println("As duas opções são verdadeiras");
        }
        //Aparece, pq ou é falso, ou verdadeiro. Só precisa ser uma das opções (0 ou 1)
        else if(condicao1 || condicao2){
            System.out.println("Uma das opções é verdadeira");
        }

        System.out.println("Fim");
    }
}
