
public class Grafico {
    private int espessura;
    private int deslocamento; //O quanto a função está para direita
    private float t1, t2;     //Intervalo
    private IntefaceFuncao funcao;

    public Grafico(int espessura, int deslocamento, float t1, float t2, IntefaceFuncao funcao ) {
        this.espessura = espessura;
        this.deslocamento = deslocamento;
        this.t1 = t1;
        this.t2 = t2;
        this.funcao = funcao;
    }

    void geraGrafico(){
        float x = t1;

        while (x < t2) {
            if(geradorPontos(x)!=" ") {
                System.out.println(geradorEspaco(x)+"!"+geradorPontos(x) + "!");
            }

            x += 0.1f;
        }
    }

    public String geradorPontos(float x){
        float i = 0;
        String pontos = "";

        while (i < Math.abs(funcao.resultado(x))) {
            pontos += "*";
            i += 1f / espessura;
        }
        return pontos;

    }

    public String geradorEspaco(float x){  //Espaços anteriores aos pontos
        String espaco = "";


        for(int i=0 ; i< deslocamento; i++){
            espaco += " ";
        }

        if(funcao.resultado(x) > 0){
            float i = 0;
            while( i < 1f){
                espaco += " ";
                i+= 1f/espessura ;
            }
        }else {
            float i = 0;
            while( i < (1 + funcao.resultado(x))){
                espaco += " ";
                i+= 1f/espessura;
            }
        }

        return espaco;
    }
}
