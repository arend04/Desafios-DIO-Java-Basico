package one.arend.gof.singleton;

/*Essa implementação do Singleton é eficiente em termos de inicialização e segura para ambientes 
de thread único. No entanto, deve-se observar que a inicialização ansiosa pode consumir recursos de memória, 
pois a instância é criada mesmo que possa não ser usada imediatamente. Portanto, essa abordagem é 
recomendada quando a criação da instância é barata e você deseja garantir a inicialização imediata.
Uma desvantagem é que, se você nunca usar a instância durante a execução do programa, ainda assim ela 
será criada, o que pode ser um desperdício de recursos em algumas situações. Portanto, a escolha entre 
inicialização ansiosa (eager) e inicialização preguiçosa (lazy) depende dos requisitos específicos 
do seu aplicativo. */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();

    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
    
}
