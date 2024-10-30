package interfaces;
public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao();
    void enviarSms(String mensagem);
    void receberSms();
    void acessarCalendario();
    void acessarFotos();
}