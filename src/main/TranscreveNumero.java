public class TranscreveNumero {

    private MapaDeNumerosChave mapaDeNumerosChave;

    public TranscreveNumero(MapaDeNumerosChave mapaDeNumerosChave) {
        this.mapaDeNumerosChave = mapaDeNumerosChave;
    }

    public String transcreve(Integer numero){
        if(numero == 100){
            return "cem";
        }

        if(this.mapaDeNumerosChave.existeNoMapa(numero)){
            return this.mapaDeNumerosChave.getNome(numero);
        }

        if(numero > 100){
            int centena = numero / 100;
            centena = centena * 100;

            String nomeCentena = this.mapaDeNumerosChave.getNome(centena);
            String nomeDezena = this.transcreve(numero - centena);
            return nomeCentena + " e " + nomeDezena;
        }

        int dezena = numero / 10;
        dezena = dezena * 10;
        String nomeDezena = this.mapaDeNumerosChave.getNome(dezena);

        int unidade = numero - dezena;
        String nomeUnidade = this.mapaDeNumerosChave.getNome(unidade);

        return nomeDezena + " e " + nomeUnidade;
    }
}
