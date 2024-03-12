package Partea2.classes.fabrica;

import Partea2.classes.Infirmier;
import Partea2.classes.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
