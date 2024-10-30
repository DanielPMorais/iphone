// iPhone.java
package model;

import services.*;

public class Iphone {
    private Multimidia multimidia;
    private Telefone telefone;
    private SafariBrowser navegador;
    private GoogleMaps mapas;
    private Calendario calendario;
    private Email email;
    private Fotos fotos;
    private Widgets widgets;

    public Iphone(Multimidia multimidia, Telefone telefone, SafariBrowser navegador, GoogleMaps mapas, 
                  Calendario calendario, Email email, Fotos fotos, 
                  Widgets widgets) {
        this.multimidia = multimidia;
        this.telefone = telefone;
        this.navegador = navegador;
        this.mapas = mapas;
        this.calendario = calendario;
        this.email = email;
        this.fotos = fotos;
        this.widgets = widgets;
    }

    public void tocarMusica() {
        multimidia.reproduzirMusica();
    }
    
    public void acessarArtistas() {
    	multimidia.acessarArtistas();
    }
    
    public void acessarListas() {
    	multimidia.acessarListas();
    }
    
    public void acessarMais() {
    	multimidia.acessarMais();
    }

    public void fazerLigacao(String numero) {
        telefone.fazerLigacao(numero);
    }

    public void abrirNavegador() {
        navegador.acessarNavegador();
    }

    public void buscarRota(String destino) {
        mapas.buscarRota(destino);
    }

    public void acessarCalendario() {
        calendario.acessarCalendario();
    }

    public void acessarEmail() {
        email.acessarEmail();
    }

    public void acessarFotos() {
        fotos.acessarFotos();
    }


    public void acessarWidgets() {
        widgets.acessarWidgets();
    }
}
