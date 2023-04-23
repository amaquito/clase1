public class Alumno {
    int id;
    String nombre;
    String apellido;

    public void mostrarNombre(){
        System.out.println("Hola, soy alumno y se decir mi nombre");

    }
    public void saberAprobado (double calficiacion){
        if(calficiacion >= 6){
            System.out.println("Aprobe la materia");
        }
        else {
            System.out.println("Uy no aprobo");
        }
    }
}
