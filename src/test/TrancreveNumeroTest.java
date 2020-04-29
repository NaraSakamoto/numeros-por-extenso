import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrancreveNumeroTest {


    @Test
    public void deveRetornarONomePqNumeroEhMenorQueDez(){
        Integer numero = 8;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("oito", nomeNumero);
    }

    @Test
    public void deveRetornarONomePqNumeroEhMaiorQueDez(){
        Integer numero = 11;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("onze", nomeNumero);
    }

    @Test
    public void deveRetornarONomePqNumeroEhMaiorQueVinte(){
        Integer numero = 21;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("vinte e um", nomeNumero);
    }

    @Test
    public void deveRetornarONomePqNumeroEhMaiorQueCinquenta(){
        Integer numero = 53;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("cinquenta e três", nomeNumero);
    }

    @Test
    public void deveRetornarONomeQueEstaPreviamenteNoMapa(){
        Integer numero = 50;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("cinquenta", nomeNumero);
    }

    @Test
    public void deveRetornarONomeDo201(){
        Integer numero = 201;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("duzentos e um", nomeNumero);
    }

    @Test
    public void deveRetornarONomeDo346(){
        Integer numero = 346;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("trezentos e quarenta e seis", nomeNumero);
    }

    @Test
    public void deveRetornarONomeDo102(){
        Integer numero = 102;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("cento e dois", nomeNumero);
    }

    @Test
    public void deveRetornarONomeDo135(){
        Integer numero = 135;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("cento e trinta e cinco", nomeNumero);
    }

    @Test
    public void deveRetornarONomeDo100(){
        Integer numero = 100;
        TranscreveNumero transcreveNumero = new TranscreveNumero(new MapaDeNumerosChave());

        String nomeNumero = transcreveNumero.transcreve(numero);

        Assertions.assertEquals("cem", nomeNumero);
    }
}
