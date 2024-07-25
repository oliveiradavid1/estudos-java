public class ControleDeFluxo {

    public static void main(String[] args) {
        
        //estruturas condicionais

        double saldo = 25.0;
        double valorSolicitado = 28.2;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

        }else
            System.out.println("saldo insuficiente !");

        System.out.println(saldo);
    }
    
    public static void swichs (String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}

}
