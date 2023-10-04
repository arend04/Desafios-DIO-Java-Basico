package one.arend.gof.singleton;

/*
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 */

/*Essa implementação do Singleton combina a eficiência da inicialização preguiçosa 
(a instância é criada apenas quando necessário) com a garantia de que a inicialização seja segura 
e eficiente devido à classe interna InstanceHolder. Essa abordagem é considerada uma das melhores 
práticas para implementar o Singleton em Java, pois lida automaticamente com a inicialização preguiçosa 
e garante que a instância seja criada de forma segura em ambientes concorrentes sem a necessidade de 
sincronização explícita. */

public class SingletonLazyHolder {

    private static class InstanceHolder {

        public static SingletonLazyHolder instancia = new SingletonLazyHolder();    
        
    }

    private SingletonLazyHolder(){
        super();

    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
    
}
