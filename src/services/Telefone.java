package services;

import interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {
   
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    
    public void receberLigacao() {
        System.out.println("Recebendo ligação...");
    }

   
    public void enviarSms(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }

    
    public void receberSms() {
        System.out.println("Recebendo SMS...");
    }

	@Override
	public void acessarCalendario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acessarFotos() {
		// TODO Auto-generated method stub
		
	}
}