public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("volume Atual : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status - TV ligada ? " + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Novo canal : " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo canal : " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo canal : " + smartTv.canal);

        smartTv.escolherCanal(20);
        System.out.println("Novo canal : " + smartTv.canal);

    }


}
