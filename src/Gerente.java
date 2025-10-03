
public class Gerente extends Empleado{

    private double bono_fijo;
    private int empleados_a_cargo;

    public Gerente() {
    }

    public Gerente(String id, String nombre, double salario_base, double bono_fijo, int empleados_a_cargo) {
        super(id, nombre, salario_base);
        this.bono_fijo = bono_fijo;
        this.empleados_a_cargo = empleados_a_cargo;
    }

    public double getBono_fijo() {
        return bono_fijo;
    }

    public void setBono_fijo(double bono_fijo) {
        this.bono_fijo = bono_fijo;
    }

    public int getEmpleados_a_cargo() {
        return empleados_a_cargo;
    }

    public void setEmpleados_a_cargo(int empleados_a_cargo) {
        this.empleados_a_cargo = empleados_a_cargo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Gerente{" +
                "bono_fijo=" + bono_fijo +
                ", empleados_a_cargo=" + empleados_a_cargo +
                '}';
    }

    public double incentivo_lidrazgo(){
        double incentivo=0;
        if (empleados_a_cargo>=10){
            incentivo+=(salario_base*0.05);
            return incentivo;
        } else {
            return incentivo;
        }
    }


    @Override
    public double obtener_salario(){
        double salario_total;
        salario_total= salario_base+ bono_fijo +incentivo_lidrazgo();
        return salario_total;
    }


    @Override
    public String info(){
        return "Gerente   " +super.info()+ " Bono fijo:"+bono_fijo +" Empleados a cargo:"+empleados_a_cargo+" Salario Total:"+obtener_salario();
    }
}


