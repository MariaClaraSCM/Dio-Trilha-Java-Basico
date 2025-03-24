import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        // Criando um Scanner para entrada do usuário
        //Scanner scanner = new Scanner(System.in);

        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Em qual canal está? " + smartTv.canal);
        System.out.println("Qual é o volume? " + smartTv.volume);

        // Aumentando e diminuindo o volume 
        smartTv.aumentarVolume();
        System.out.println("Qual é o volume agora? " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Qual é o volume agora? " + smartTv.volume);


        //Ligando e desligando a TV
        smartTv.ligar();
        System.out.println("A tv está ligada agora? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A tv está ligada agora? " + smartTv.ligada);

        // Mudando de canal
        smartTv.aumentarCanal();
        System.out.println("O canal atual é: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("O canal atual é " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual é: " + smartTv.canal);


        //teste que pode estar errado
        /*
        System.out.print("Digite o número do canal: ");
        int canalDigitado = scanner.nextInt();
        smartTv.mudarCanal(canalDigitado);
        System.out.println("Você mudou para o canal: " + canalDigitado);
        */
    
    }
}
