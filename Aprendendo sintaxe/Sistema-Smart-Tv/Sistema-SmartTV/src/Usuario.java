public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv televisao = new SmartTv();

        System.out.println("A Televisão está ligada: " + televisao.ligada);
        System.out.println(" ");
        
        televisao.ligar();
        System.out.println("A televisão está ligada: " + televisao.ligada );
        System.out.println();
        
        
        System.out.println("Qual o Canal da Televisão: "+ televisao.canal);
        televisao.mudarCanal(13);
        televisao.aumentarCanal();
        televisao.aumentarCanal();
        televisao.aumentarCanal();
        televisao.diminuirCanal();
        System.out.println("O Canal atual da televisão: " + televisao.canal);
        System.out.println(" ");
        
        System.out.println("Qual o volume da Televisão: "+ televisao.volume);
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        System.out.println("O Volume Atual da televisão " + televisao.volume);




        
    }
}
