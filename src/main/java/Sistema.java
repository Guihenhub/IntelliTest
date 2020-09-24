public class Sistema {

    public static void main(String[] args) {
        IntefaceFuncao sin = (x) -> Math.sin(x);
        IntefaceFuncao cos = (x) -> Math.cos(x);
        IntefaceFuncao reta = (x) -> (Math.abs(5*x));


        System.out.println("Seno");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        Grafico g_seno = new Grafico(30,10,0, 10, sin);
        g_seno.geraGrafico();

        System.out.println("Cos");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        Grafico g_cos= new Grafico(40, 0,0, 10, cos);
        g_cos.geraGrafico();

        System.out.println("Reta");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        Grafico g_reta= new Grafico( 8, 32,-2, 2, reta);
        g_reta.geraGrafico();

    }


}
