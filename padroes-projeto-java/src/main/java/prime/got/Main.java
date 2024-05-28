package prime.got;

import prime.got.facade.Facade;
import prime.got.singleton.SingletonEager;
import prime.got.singleton.SingletonLazy;
import prime.got.singleton.SingletonLazyHolder;
import prime.got.strategy.*;

public class Main {

    public static void main(String[] args) {

        // testes de Singleton
/*
        SingletonLazy lazy = SingletonLazy.getInstancia();//variação 1
        System.out.println(" endereço de memoria: " + lazy);
        lazy = SingletonLazy.getInstancia();//variação 2
        System.out.println(" endereço de memoria: " + lazy);

        SingletonEager eager = SingletonEager.getInstancia();//variação 1
        System.out.println(" endereço de memoria: " + eager);
        eager = SingletonEager.getInstancia();//variação 2
        System.out.println(" endereço de memoria: " + eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();//variação 1
        System.out.println(" endereço de memoria: " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();//variação 2
        System.out.println(" endereço de memoria: " + lazyHolder);


        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();//instacia da caracteristica 1
        Comportamento normal = new ComportamentoNormal();//instacia da caracteristica 2
        Comportamento agressivo = new ComportamentoAgressivo();//instacia da caracteristica 3

        Robo robo = new Robo();//instancia do objeto
        robo.setComportamento(normal);//nova atribuição ao objeto
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);//nova atribuição ao objeto
        robo.mover();
        robo.setComportamento(agressivo);///nova atribuição ao objeto
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(normal);//nova atribuição ao objeto
        robo.mover();

        // Facade
*/
        Facade facade = new Facade();
        facade.migrarCliente("Umberto", "30132014");
    }
}