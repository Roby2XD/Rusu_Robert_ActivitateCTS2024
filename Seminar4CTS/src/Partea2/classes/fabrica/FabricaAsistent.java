package Partea2.classes.fabrica;

import Partea2.classes.Asistent;
import Partea2.classes.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
