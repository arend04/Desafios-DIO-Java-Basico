package Iphone;

import Equipamento.Musica.ReprodutorMusica;
import Equipamento.Navegador.NavegadorInternet;
import Equipamento.Telefone.Aparelho;

public class Iphone implements ReprodutorMusica, NavegadorInternet, Aparelho {

   

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música para tocar no Iphone");
        
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música no Iphone");
               
    }

    @Override
    public void pausar() {
        System.out.println("Iphone com a música pausada");
        
    }

    @Override
    public void adicionandoNovaPagina() {
        System.out.println("Adicionando nova página de internet no Iphone");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página de internet no Iphone");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página de internet no Iphone");
        
    }

     @Override
    public void ligar() {
        System.out.println("Ligar utilizando o Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atender o Iphone");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz do Iphone");
        
    }

       
}
