import java.util.HashMap;
import java.util.Map;

public class MapaDeNumerosChave {

    private Map<Integer, String> mapa = new HashMap<>();

    public MapaDeNumerosChave() {
        mapa.put(0,"zero");
        mapa.put(1,"um");
        mapa.put(2,"dois");
        mapa.put(3,"três");
        mapa.put(4,"quatro");
        mapa.put(5,"cinco");
        mapa.put(6,"seis");
        mapa.put(7,"sete");
        mapa.put(8,"oito");
        mapa.put(9,"nove");
        mapa.put(10,"dez");
        mapa.put(11,"onze");
        mapa.put(12,"doze");
        mapa.put(13,"treze");
        mapa.put(14,"quatorze");
        mapa.put(15,"quinze");
        mapa.put(16,"dezesseis");
        mapa.put(17,"dezessete");
        mapa.put(18,"dezoito");
        mapa.put(19,"dezenove");
        mapa.put(20,"vinte");
        mapa.put(30,"trinta");
        mapa.put(40,"quarenta");
        mapa.put(50,"cinquenta");
        mapa.put(60,"sessenta");
        mapa.put(70,"setenta");
        mapa.put(80,"oitenta");
        mapa.put(90,"noventa");
        mapa.put(100,"cento");
        mapa.put(200,"duzentos");
        mapa.put(300,"trezentos");
        mapa.put(400,"quatrocentos");
        mapa.put(500,"quinhentos");
        mapa.put(600,"seiscentos");
        mapa.put(700,"setecentos");
        mapa.put(800,"oitocentos");
        mapa.put(900,"novecentos");
    }

    public String getNome(Integer numero){
        return mapa.get(numero);
    }
    
    public boolean existeNoMapa(Integer numero){
        return mapa.containsKey(numero);
    }
}
