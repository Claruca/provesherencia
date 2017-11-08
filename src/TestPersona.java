public class TestPersona {
    public static void main (String[] args){

        Persona pep = new Persona("Pep", "Perez", "43195461");
        Alumne jose = new Alumne("Jose", "Garcia", "45121");

        jose.setNom("Jose");
        System.out.println(jose.getNom());
        jose.getNota();
        pep.queSom();
        jose.queSom();

        System.out.println(jose);

        System.out.println(jose instanceof Persona);


    }

}
