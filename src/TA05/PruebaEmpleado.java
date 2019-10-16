
package TA05;

public class PruebaEmpleado {
     //utilizamos el metodo Principal main
    public static void main(String[] args) {
        
        /* y luego creamos un objeto Empleado1 ingresamos los parametros 
            de acuerdo al constructor creado        
        */
        Empleado empleado1 = new Empleado("1234", "Edwin ", "Sistemas", 
                "afp", 10.5, 1500);
                
        System.out.println(" el empleado " + empleado1.nombre +
        "trabaja en el area de " + empleado1.area + " gana un sueldo"
        + " de: S/." + empleado1.sueldo + " ");
          
        System.out.println("El monto de la horas extras es: S/.  "
                + empleado1.montoExtra());
        System.out.println("El monto del Seguro del empleado es: S/.  "
                + empleado1.montoSeguro());
        System.out.println("El monto de Essaud del empleado es: S/.  " 
                + empleado1.montoEssalud());
        System.out.println("total descuento es: S/.  "
                + empleado1.montoDescuento());
        
        System.out.println(" el sueldo neto es: S/.  " 
                + empleado1.sueldoNeto());
             
    }
}