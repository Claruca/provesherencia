public class Persona {
    public String nom;
    private String llinatges;
    private String dni;


    public String getNom() {
        return nom;
    }

    public String getLlinatges() {
        return llinatges;
    }

    public String getDni() {
        return dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLlinatges(String llinatges) {
        this.llinatges = llinatges;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Persona() {
        super.toString();
        }

    public Persona(String nom, String llinatges, String dni) {
            this.nom = nom;
            this.llinatges = llinatges;
            this.dni = dni;

        }

    public void queSom() {
        System.out.println("Som una persona");
    }


}
