package one.arend.gof.singleton;

/*O padrão Singleton é um dos padrões de projeto mais comuns em engenharia de software e é usado para garantir 
que uma classe tenha apenas uma instância e forneça um ponto de acesso global para essa instância. 
Isso é útil em situações em que você deseja controlar o acesso a recursos compartilhados, como conexões
 de banco de dados, caches ou configurações globais. A abordagem de inicialização preguiçosa economiza 
 recursos, pois a instância só é criada quando realmente necessária.*/

public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy(){
		super();

	}

	public static SingletonLazy getInstancia(){
		if(instancia == null){
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
}