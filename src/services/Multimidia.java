package services;

import interfaces.ReprodutorMusical;

public class Multimidia implements ReprodutorMusical {

    public void reproduzirVideo() {
        System.out.println("Reproduzindo vídeo...");
    }

 
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    public void acessarArtistas() {
        System.out.println("Acessando lista de artistas...");
    }

    public void acessarListas() {
        System.out.println("Acessando listas de músicas...");
    }


    public void acessarMais() {
        System.out.println("Acessando seção Mais...");
    }

    
}