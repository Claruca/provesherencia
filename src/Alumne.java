public class Alumne extends Persona implements Concursant {

    public void concursar() {
        System.out.println("Estic concursant");
    }
    public String getEmail() {
        return this.getNom().toLowerCase() + "@iesemilidarder.com";
    }
    public String getEmail(String domini){
        return this.getNom() + "@domini.es";
    }


    public float nota;

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }


    public Alumne(String nom, String llinatges, String dni) {
        super(nom, llinatges, dni);

        super.queSom();
    }


    @Override
    public String toString() {
        return this.getNom() + " " + this.getLlinatges();
    }

    public void queSom() {
        super.queSom();
        System.out.println("Som un Alumne");


    }
}

