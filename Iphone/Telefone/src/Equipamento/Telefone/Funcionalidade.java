package Equipamento.Telefone;

public class Funcionalidade implements Aparelho {

    @Override
    public void ligar() {
        System.out.println("Ligando o aparelho...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");;
    }
    
}
