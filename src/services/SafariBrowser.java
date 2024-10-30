package services;

import interfaces.NavegadorInternet;

public class SafariBrowser implements NavegadorInternet {
    
    public void acessarEmail() {
        System.out.println("Acessando o email...");
    }

    
    public void acessarNavegador() {
        System.out.println("Abrindo o navegador...");
    }

	@Override
	public void buscarRota() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarLocalizacao() {
		// TODO Auto-generated method stub
		
	}
}