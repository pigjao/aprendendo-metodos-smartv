public class SmartTv {
    boolean ligada = false;
    double canalDigital = 10.1;
    int volume = 30;

    public void ligar(){
        ligada = true;
        System.out.println("A tv está ligada!");
    }
    public void desligar(){
        ligada = false;
        System.out.println("A tv está desligada!");
    }
    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("O volume da tv agora é: " +  volume);
    }
    public void abaixarVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("O volume da tv agora é: " +  volume);
    }
    public void volumeMaximo (){
        volume = 100;
        System.out.println("O volume da tv está no máximo: " +  volume);
    }

    public void volumeMinimo (){
        volume = 0;
        System.out.println("O volume da tv está no mínimo: " +  volume);
    }

    public void subirCanal(){
        //canalDigital = canalDigital + 1;
        canalDigital++;
        System.out.println("O canal da tv agora é: " +  canalDigital);
    }
    public void descerCanal(){
        //canalDigital = canalDigital -1;
        canalDigital--;
        System.out.println("O canal da tv agora é: " +  canalDigital);
    }
    public void mudarCanal(double novoCanal){
        canalDigital = novoCanal;
        System.out.println("O canal da tv agora é: " +  canalDigital);
    }
}
