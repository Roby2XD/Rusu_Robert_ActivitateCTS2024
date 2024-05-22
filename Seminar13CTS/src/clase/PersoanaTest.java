package clase;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnF() {
        Persoana pers1 = new Persoana("Simona","6021118520090");
        assertEquals(pers1.getSex(),"F");
    }

    @org.junit.Test
    public void getSexReturnM() {
        Persoana pers2 = new Persoana("Andrei","5021118520090");
        assertEquals(pers2.getSex(),"M");

    }

    @org.junit.Test
    public void getSexReturnLimitaInferioara() {
        Persoana pers3 = new Persoana("Andrei","1021118520090");
        assertEquals(pers3.getSex(),"M");

    }

    @org.junit.Test
    public void getSexCrossCheck() {
        String cnp = "1021118520090";
        Persoana pers3 = new Persoana("Andrei",cnp);
        String sex;
        if(Integer.valueOf(cnp.charAt(0))%2==0){
            sex=String.valueOf("F");
        }else{
            sex=String.valueOf("M");
        }
        assertEquals(pers3.getSex(),sex);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCNPStartWithNumberOutsideCases(){
        Persoana persoana = new Persoana("Andrei", "9021118520090");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCNPStartWithInvalidCharacter(){
        Persoana persoana = new Persoana("Andrei", "-021118520090");
        persoana.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorCNPIsEmptyString(){
        Persoana persoana = new Persoana("Andrei", " ");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
    public void getSexPerformance(){
        Persoana persoana = new Persoana("Andrei", "1293821039");
        persoana.getSex();
    }

    @org.junit.Test
    public void getSexCorrect() {
        Persoana pers1 = new Persoana("Simona","1293821039");
        assertEquals(1, pers1.getSex().length());
    }

    @org.junit.Test
    public void getSexCorrectByLetter() {
        Persoana pers1 = new Persoana("Simona","3293821039");
        boolean isCorrect = pers1.getSex().toLowerCase().equals("m") || pers1.getSex().toLowerCase().equals("f");
        assertTrue(isCorrect);
    }

    @org.junit.Test
    public void getSexOrder() {
        Persoana pers1 = new Persoana("Simona","1021118520090");
        Persoana pers2 = new Persoana("Simona","6021118520090");


        assertTrue(pers1.getSex().compareTo(pers2.getSex())>0);

    }

    @org.junit.Test
    public void getSexRange() {
        Persoana pers1 = new Persoana("Simona","8021118520090");
        assertEquals(true,pers1.getSex().equals("F"));


    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistance() {
        Persoana pers1 = new Persoana("Simona",null);
        pers1.getSex();


    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexCardinality() {
        Persoana pers1 = new Persoana("Simona","0000");
        pers1.getSex();


    }






}