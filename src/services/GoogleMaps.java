package services;

import interfaces.NavegadorInternet;

public class GoogleMaps implements NavegadorInternet {
    public void buscarRota(String destino) {
        System.out.println("Buscando rota para " + destino + "...");
    }

    public void mostrarLocalizacao() {
        System.out.println("Exibindo localização atual...");
    }

	@Override
	public void acessarEmail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acessarNavegador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarRota() {
		// TODO Auto-generated method stub
		
	}
}