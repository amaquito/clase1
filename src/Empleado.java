public class Empleado extends Alumno {

    double sueldo;
    String cargo;
    String area;

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", area='" + area + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public Empleado(int id, String nombre, String apellido, double sueldo, String cargo, String area) {
        super(id, nombre, apellido);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.area = area;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
