public class SmartTv{
    boolean ligada = false;
    int volume = 10;
    int canal = 1;

    public void ligar(){
        ligada = true;
        System.out.println("Ligando a televisão");
    }
    
    public void desligar(){
        ligada=false;
        System.out.println("Desligando a televisão");
    }
    
    public void aumentarVolume(){
        System.out.println("Aumentando em 1 o volume da Televisão para : " + volume++);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo em 1 o volume da Televisão para : " + volume);

    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando em 1 o Canal da televisão para: " + canal );
        
    }
    
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo em 1 o Canal da televisão para: " + canal);
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o Canal da televisão para: " + novoCanal);
    }

}
