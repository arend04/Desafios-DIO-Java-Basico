package Equipamento.Musica;

public class Musica implements ReprodutorMusica {

    @Override
    public void tocar() {
        System.out.println("Tocando música selecionada");;
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música...");
    }
    

}