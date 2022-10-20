import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

            System.out.println("A tv está ligada? " + smartTv.ligada);
            System.out.println("O volume atual da TV é: " + smartTv.volume);
            System.out.println("O canal atual da TV é: " + smartTv.canalDigital);

            smartTv.aumentarVolume();
            smartTv.mudarCanal(8.1);
            smartTv.desligar();
            smartTv.ligar();
            smartTv.subirCanal();
            smartTv.subirCanal();
            smartTv.abaixarVolume();
            smartTv.descerCanal();
            smartTv.volumeMaximo();
            



    }
}