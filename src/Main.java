
    public class Main {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5,"Edward","Valladares");

        System.out.println("El Alumno " + alu2.getNombre() + " tiene como ID " + alu2.getId() );

        alu1.setId(35);
        alu1.setApellido("Maquito");
        alu1.setNombre("Arturo");
        System.out.println("__________________________");
        System.out.println("El Alumno " + alu1.getNombre() + " tiene como ID " + alu1.getId() );
        System.out.println("----------------------------------------");
        alu2.setId(40);
        System.out.println("El Alumno " + alu2.getNombre() + " tiene como ID " + alu2.getId() );
    }
}