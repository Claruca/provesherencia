public class TestPersona {
    public static void main (String[] args){

        System.out.println(Persona.contador);

        Persona pep = new Persona("Pep", "Perez", "43195461");
        Alumne jose = new Alumne("Jose", "Garcia", "45121");

        jose.setNom("Jose");
        System.out.println(jose.getNom());
        System.out.println(Persona.contador);

        pep.queSom();
        jose.queSom();

        System.out.println(jose);

        System.out.println(jose instanceof Persona);

        Concursant miquel = new Alumne("Miquel", "C", "4512");
        miquel.concursar();



    }

}
