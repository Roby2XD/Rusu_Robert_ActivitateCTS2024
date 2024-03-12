package Partea2.classes.fabrica;

import Partea2.classes.Medic;
import Partea2.classes.PersonalSpital;

public class FabricaMedic implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
