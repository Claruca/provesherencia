public class Alumne extends Persona {
    public String getEmail() {
        return this.getNom().toLowerCase() + "@iesemilidarder.com";
    }





    public Alumne(String nom, String llinatges, String dni) {
        super(nom, llinatges, dni);
        this.getNota();
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

