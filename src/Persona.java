public class Persona {
    public String nom;
    private String llinatges;
    private String dni;

    //Atribut static, no canvia amb la classe(parescut al main)
    public static int contador;

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
        contador++;
        }

    public Persona(String nom, String llinatges, String dni) {
            contador++;
            this.nom = nom;
            this.llinatges = llinatges;
            this.dni = dni;

        }

    public void queSom() {
        System.out.println("Som una persona");
    }


}
