package one.arend.gof;

import one.arend.gof.facade.Facade;
import one.arend.gof.singleton.SingletonEager;
import one.arend.gof.singleton.SingletonLazy;
import one.arend.gof.singleton.SingletonLazyHolder;
import one.arend.gof.strategy.Comportamento;
import one.arend.gof.strategy.ComportamentoAgressivo;
import one.arend.gof.strategy.ComportamentoDefensivo;
import one.arend.gof.strategy.ComportamentoNormal;
import one.arend.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {
        /*Singleton */
        System.out.print("\nTestes do Singleton:\n\n");
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        /*Strategy*/
        System.out.print("\nTestes do Strategy:\n\n");

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(normal); 
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        /*Facade*/
        System.out.print("\nTestes do Facade:\n\n");

        Facade facade = new Facade();
		facade.migrarCliente("Aline", "93025680");

        
    }
    
}
