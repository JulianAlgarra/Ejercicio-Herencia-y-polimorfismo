import java.util.*;

public class Main {
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        Scanner opcion= new Scanner(System.in);
        List<Empleado>lstEmpleado =new ArrayList<>();
        int op = 0;
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

        }
    }
}