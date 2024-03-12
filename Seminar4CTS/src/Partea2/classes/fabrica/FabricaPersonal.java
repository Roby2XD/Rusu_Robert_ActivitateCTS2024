package Partea2.classes.fabrica;

import Partea2.classes.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);
}
