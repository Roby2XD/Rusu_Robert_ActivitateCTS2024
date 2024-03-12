package Partea1;

import Partea1.classes.PersonalSpital;
import Partea1.classes.fabrica.FabricaPersonal;
import Partea1.classes.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        try {
            PersonalSpital medic = fabricaPersonal.createPersonal(TipPersonal.MEDIC, "Popescu Maria", 5000);
            PersonalSpital asistent = fabricaPersonal.createPersonal(TipPersonal.ASISTENT, "Popinciuc", 3000);
            PersonalSpital brancardier = fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER, "Anghel", 4000);
            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}