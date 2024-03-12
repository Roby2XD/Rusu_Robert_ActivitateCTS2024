package Partea1.classes.fabrica;

import Partea1.classes.*;

public class FabricaPersonal {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, int salariu) throws Exception{
        switch (tipPersonal){
            case MEDIC:
                Medic medic = new Medic(nume,salariu);
                return medic;
            case ASISTENT:
                Asistent asistent = new Asistent(nume, salariu);
                return  asistent;
            case BRANCARDIER:
                Brancardier brancardier = new Brancardier(nume, salariu);
                return brancardier;
            case INFIRMIER:
                return new Infirmier(nume, salariu);

            default:throw new Exception("Exceptie");
        }
    }
}
