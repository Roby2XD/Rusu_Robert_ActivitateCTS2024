package sustinereExamen;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private String nume;
    Map<Integer, Student> listaStudenti = new HashMap<>();

    public SustinereExamen(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void inregistrareStudent(Student student){
        if(listaStudenti.containsKey(student.getId())){
            System.out.println("Studentul "+student.getNume()+" a sustinut examenul");
        }else {
            listaStudenti.put(student.getId(), student);
            System.out.println("Studentul "+student.getNume()+" sustine examenul");
        }
    }
}
