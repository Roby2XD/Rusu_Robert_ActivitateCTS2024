package Partea2.classes.fabrica;

import Partea2.classes.Brancardier;
import Partea2.classes.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
