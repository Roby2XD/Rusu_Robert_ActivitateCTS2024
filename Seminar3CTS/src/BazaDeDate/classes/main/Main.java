package BazaDeDate.classes.main;

import BazaDeDate.classes.ConexiuneBazaDeDate;
import sustinereExamen.Student;
import sustinereExamen.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("Baza1",20,"link1");
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance("Baza2",50,"link2");

        conexiune1.setNumeBaza("NumeBazaNoua");
        conexiune2.setNumeBaza("NumeBazaNoua2");

        System.out.println(conexiune1);
        System.out.println(conexiune2);

        System.out.println("-----------------------");
        System.out.println("-----------------------");

        Student student1 = new Student(123, "Pop Denis", "popdenis23@stud.ase.ro",3);
        Student student2 = new Student(126, "Pop Maria", "popmaria23@stud.ase.ro",3);
        Student student3 = new Student(526, "Popescu Denis", "popescudenis23@stud.ase.ro",3);
        Student student4 = new Student(986, "Popescu Diana", "popescuddiana23@stud.ase.ro",3);


        SustinereExamen examenPOO = new SustinereExamen("POO");
        SustinereExamen examenCTS = new SustinereExamen("cts");

        examenPOO.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student2);
        examenPOO.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student3);
        examenPOO.inregistrareStudent(student4);
        examenPOO.inregistrareStudent(student2);


    }
}
