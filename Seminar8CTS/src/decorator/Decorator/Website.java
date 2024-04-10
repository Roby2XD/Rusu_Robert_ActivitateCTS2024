package decorator.Decorator;

import decorator.Spital.DiagnosticAbstract;

public class Website extends Decorator{
    public Website(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("Pe site ul web a fost afisat"
                + super.diagnostic.getNumeDiagnostic()+" cu simptomele "+super.getSimptome()+" si "
                +(super.isNecesitaSpitalizare()? "":"nu "+" aveti nevoie de spitalizare"));
    }
}
