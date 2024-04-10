package decorator.Main;

import decorator.Decorator.AplicatieMobila;
import decorator.Decorator.Decorator;
import decorator.Decorator.Website;
import decorator.Spital.Diagnostic;
import decorator.Spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diganostic = new Diagnostic("Raceala","Rosu in gat", false);
        diganostic.printeazaDiagnostic();

        Decorator decorator = new AplicatieMobila(diganostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnostic();

        Decorator webSite = new Website(diganostic);
        webSite.afiseazaOnline();;
        webSite.printeazaDiagnostic();
    }
}