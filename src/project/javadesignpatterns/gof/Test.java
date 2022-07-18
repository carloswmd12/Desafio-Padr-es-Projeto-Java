package project.javadesignpatterns.gof;

import project.javadesignpatterns.gof.facade.Facade;
import project.javadesignpatterns.gof.singleton.SingletonEager;
import project.javadesignpatterns.gof.singleton.SingletonLazy;
import project.javadesignpatterns.gof.singleton.SingletonLazyHolder;
import project.javadesignpatterns.gof.strategy.Comportamento;
import project.javadesignpatterns.gof.strategy.ComportamentoAgressivo;
import project.javadesignpatterns.gof.strategy.ComportamentoDefensivo;
import project.javadesignpatterns.gof.strategy.ComportamentoNormal;
import project.javadesignpatterns.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {

        // Singleton

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

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Carlos", "38401580");
    }

}
