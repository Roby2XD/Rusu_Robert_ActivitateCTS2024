package decorator.Spital;

public class Diagnostic implements DiagnosticAbstract{
    private String numeDiagnostic;
    private String simptome;
    private boolean necesitaSpitalizare;

    public String getNumeDiagnostic() {
        return numeDiagnostic;
    }

    public String getSimptome() {
        return simptome;
    }

    public boolean isNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }

    public Diagnostic(String numeDiagnostic, String simptome, boolean necesitaSpitalizare) {
        this.numeDiagnostic = numeDiagnostic;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("Numele diagnosticului: "+this.numeDiagnostic+
                " care are simptomele: "+this.simptome+" si "+((necesitaSpitalizare)?" ":" nu ")+
                " necesita spitalizare");
    }
}
