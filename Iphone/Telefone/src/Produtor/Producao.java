package Produtor;

import Equipamento.Musica.ReprodutorMusica;
import Equipamento.Navegador.NavegadorInternet;
import Equipamento.Telefone.Aparelho;
import Iphone.Iphone;
import javax.swing.JOptionPane;

/* Classe para teste das saídas */

public class Producao {
    public static void main(String[] args){
        Iphone iphone = new Iphone();
        ReprodutorMusica reprodutorMusica = (ReprodutorMusica) iphone;
        Aparelho aparelho = (Aparelho) iphone;
        NavegadorInternet navegadorInternet = (NavegadorInternet) iphone;

        System.out.println("Musica");
        reprodutorMusica.selecionarMusica();
        reprodutorMusica.tocar();
        reprodutorMusica.pausar();
        System.out.println("Executando funcionalidades de Música");

        System.out.println("Aparelho");
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        System.out.println("Executando funcionalidades do Aparelho Telefônico");

        System.out.println("Navegador de Internet");
        navegadorInternet.adicionandoNovaPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina();
        System.out.println("Executando o Navegador de Internet");

        JOptionPane.showMessageDialog(null,  "Seu Iphone está funcionado corretamente");

    }
    
}
