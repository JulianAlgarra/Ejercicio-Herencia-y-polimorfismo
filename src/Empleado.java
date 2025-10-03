public class Empleado {

    protected String id;
    protected String nombre;
    protected double salario_base;

    public Empleado() {
    }

    public Empleado(String id, String nombre, double salario_base) {
        this.id = id;
        this.nombre = nombre;
        this.salario_base = salario_base;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario_base=" + salario_base +
                '}';
    }

    public double obtener_salario(){
        return salario_base;
    }

    public String info(){
        return "ID:"+id+ " Nombre:"+nombre+ " Salario Base:"+ salario_base;
    }


}
