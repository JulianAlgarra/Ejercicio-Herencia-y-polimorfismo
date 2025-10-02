public class Vendedor extends Empleado{

    private double ventas_mensuales;
    private double porcentaje_comision;

    public Vendedor() {
    }

    public Vendedor(String id, String nombre, double salario_base, double ventas_mensuales, double porcentaje_comision) {
        super(id, nombre, salario_base);
        this.ventas_mensuales = ventas_mensuales;
        this.porcentaje_comision = porcentaje_comision;
    }

    public double getVentas_mensuales() {
        return ventas_mensuales;
    }

    public void setVentas_mensuales(double ventas_mensuales) {
        this.ventas_mensuales = ventas_mensuales;
    }

    public double getPorcentaje_comision() {
        return porcentaje_comision;
    }

    public void setPorcentaje_comision(double porcentaje_comision) {
        this.porcentaje_comision = porcentaje_comision;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ventas_mensuales=" + ventas_mensuales +
                ", porcentaje_comision=" + porcentaje_comision +
                '}';
    }
}

