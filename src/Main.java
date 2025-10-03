import java.util.*;

public class Main {
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        Scanner opcion= new Scanner(System.in);
        Scanner datos= new Scanner(System.in);
        List<Empleado>lstEmpleado =new ArrayList<>();
        int op = 9;
        while (op !=0){

            System.out.println("===Sistema de nomina Techmarket===");
            System.out.println("1. Registrar Vendedor");
            System.out.println("2. Registrar Gerente");
            System.out.println("3. Listar Empleados");
            System.out.println("4. Calcular nomina total");
            System.out.println("5. Mostrar empleado con mayor salario");
            System.out.println("6. Calcular salario promedio");
            System.out.println("7. Buscar empleado por ID");
            System.out.println("8. Mostrar cantidad de empleados y vendedores");
            System.out.println("0. Salir");
            op= opcion.nextInt();

            switch (op){
                case 0 :
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    System.out.print("ID: ");
                    String idV = datos.next();
                    System.out.print("Nombre: ");
                    String nombreV = datos.next();
                    System.out.print("Salario base: ");
                    double baseV = datos.nextDouble();
                    System.out.print("Ventas mensuales: ");
                    double ventas = datos.nextDouble();
                    System.out.print("Porcentaje comisión (ej: 5 para 5%): ");
                    double comision = datos.nextDouble();

                    Empleado v1 = new Vendedor(idV, nombreV, baseV, ventas, comision);
                    lstEmpleado.add(v1);
                    System.out.println("Vendedor registrado.");
                    break;
                case 2:
                    System.out.print("ID: ");
                    String idG = datos.next();
                    System.out.print("Nombre: ");
                    String nombreG = datos.next();
                    System.out.print("Salario base: ");
                    double baseG = datos.nextDouble();
                    System.out.print("Bono fijo: ");
                    double bono = datos.nextDouble();
                    System.out.print("Empleados a cargo: ");
                    int aCargo = datos.nextInt();

                    Empleado g1 = new Gerente(idG, nombreG, baseG, bono, aCargo);
                    lstEmpleado.add(g1);
                    System.out.println("Gerente registrado.");

                    break;
                case 3:
                    for (Empleado e:lstEmpleado){
                        System.out.println(e.info());
                    }
                    break;
                case 4:
                    double total = 0;
                    for (Empleado e : lstEmpleado) {
                        total += e.obtener_salario();
                    }
                    System.out.println("Nómina total: " + total);
                    break;
                case 5:
                    Empleado max = lstEmpleado.getFirst();
                    for (Empleado e : lstEmpleado) {
                        if (e.obtener_salario() > max.obtener_salario()) {
                            max = e;
                        }
                    }
                    System.out.println("Empleado con mayor salario:" + max.info());
                    break;
                case 6:
                    double total_salarios = 0;
                    for (Empleado e : lstEmpleado) {
                        total_salarios += e.obtener_salario();
                    }
                    System.out.println("Salario Promedio =" +(total_salarios/ lstEmpleado.size()));
                    break;
                case 7:
                    Scanner buscar_cuenta =new Scanner(System.in);
                    String buscar;
                    System.out.println("Ingrese el ID del empleado que desea buscar");
                    buscar = buscar_cuenta.next();
                    Empleado p;
                    for (Empleado c :lstEmpleado){
                        if (lstEmpleado.isEmpty()){
                            System.out.println("No hay ninguna cuenta");
                        }else if (c.getId().equalsIgnoreCase(buscar)){
                            p=c;
                            System.out.println("Empleado encontrado: "+p.info());
                        }
                    }
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        }
    }
}