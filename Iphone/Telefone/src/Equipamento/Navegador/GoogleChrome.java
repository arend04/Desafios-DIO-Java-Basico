package Equipamento.Navegador;

public class GoogleChrome implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionandoNovaPagina() {
        System.out.println("Adicionando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    

}
