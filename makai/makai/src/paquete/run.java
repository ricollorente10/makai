package paquete;

import java.util.Scanner;

public class run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        capitan cap = null;
        velero vel = null;
        yate yat = null;
        
        System.out.print("NUMERO DE EMBARCACIONES A REGISTRAR: ");
        int cantidad = scanner.nextInt();
        
        boolean seguir = true;
        
        Object[] obj = new Object[cantidad];
        int pos = 0;
        
        while (seguir) {
            System.out.println("----------------------------------------------------");
            System.out.print("INGRESE EL NOMBRE DEL CAPITAN: ");
            String nombre_capitan = scanner.next();
            System.out.print("INGRESE EL APELLIDO DEL CAPITAN: ");
            String apellido_capitan = scanner.next();
            System.out.print("INGRESE LA MATRICULA DE NAVEGACION DEL CAPITAN: ");
            String matricula_capitan = scanner.next();
            System.out.println("----------------------------------------------------");
            
            cap = new capitan(nombre_capitan.toUpperCase(), apellido_capitan.toUpperCase(), matricula_capitan.toUpperCase());

            System.out.println("INGRESE EL NUMERO CORRESPONDIENTE AL REGISTRO:\n"
                    + "1. VELERO.\n"
                    + "2. YATE.");
            int opcion = scanner.nextInt();

            System.out.print("INGRESE EL PRECIO BASE: ");
            double precio_base = scanner.nextDouble();
            System.out.print("INGRESE EL AÑO DE FABRICACION: ");
            int fabricacion = scanner.nextInt();
            System.out.print("INGRESE LA ESLORA: ");
            double eslora = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.print("INGRESE LA CANTIDAD DE MASTILES: ");
                    int cantidad_mastiles = scanner.nextInt();
                    vel = new velero(cap, precio_base, fabricacion, eslora, cantidad_mastiles);
                    obj[pos] = vel;
                    break;
                case 2:
                    System.out.print("INGRESE LA CANTIDAD DE CAMAROTES: ");
                    int cantidad_camarotes = scanner.nextInt();
                    yat = new yate(cap, precio_base, fabricacion, eslora, cantidad_camarotes);
                    obj[pos] = yat;
                    break;
                default: System.err.println("OPCION NO VALIDA.");
            }
            
            pos++;
            cantidad--;

            if (cantidad == 0) {
                seguir = false;
            }

        }
        
        for (Object object : obj) {
            System.out.println(object.toString());
        }
        
    }
}
