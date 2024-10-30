package app;

import model.Iphone;
import services.*;

public class Main {
    public static void main(String[] args) {
        Multimidia multimidia = new Multimidia();
        Telefone telefone = new Telefone();
        SafariBrowser navegador = new SafariBrowser();
        GoogleMaps mapas = new GoogleMaps();
        Calendario calendario = new Calendario();
        Email email = new Email();
        Fotos fotos = new Fotos();
        Widgets widgets = new Widgets();

        Iphone iphone = new Iphone(multimidia, telefone, navegador, mapas, calendario, 
                                   email, fotos, widgets);

        iphone.tocarMusica();
        iphone.fazerLigacao("123456789");
        iphone.abrirNavegador();
        iphone.buscarRota("Rua dos Bobos, 0");
        iphone.acessarArtistas();
        iphone.acessarCalendario();
        iphone.acessarEmail();
        iphone.acessarFotos();
        iphone.acessarListas();
        iphone.acessarMais();
        iphone.acessarWidgets();
    }
}
