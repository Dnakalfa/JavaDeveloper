public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 100;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        
    }
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume ++;
    }
    public void diminuirVolume() {
        volume --;
    }

}
