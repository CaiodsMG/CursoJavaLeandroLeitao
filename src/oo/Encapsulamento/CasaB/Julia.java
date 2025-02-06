package oo.Encapsulamento.CasaB;

import oo.Encapsulamento.CasaA.Ana;

public class Julia {


    Ana sogra = new Ana();

    void TesteAcessos(){
        // System.out.println(sogra.segredo); private
        // System.out.println(sogra.facoDentroDeCasa); // package
        // System.out.println(sogra.formaDeFalar); // protected
        System.out.println(sogra.todosSabem);

    }
}
