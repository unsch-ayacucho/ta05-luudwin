
package TA05;

/* creamos la clase empleados e implementamos los preocedimintos y metodos
    a calcular

*/
public class Empleado {
    // Declarando Variables;
    String codigo;
    String nombre;
    String area;
    String seguro;
    double horasExtras;
    double sueldo;
  
// valores comunes para todos los objetos
private final double snp = 0.13;
private final  double essalud = 0.3;
private final double afp = 0.11;
    
// constructor    
public Empleado (String codigo, String nombre, String area, String seguro, 
        double horasExtras, double sueldo){
    
    this.codigo = codigo;
    this.nombre =nombre;
    this.area= area;
    this.seguro=seguro;
    this.sueldo=sueldo;
    this.horasExtras=horasExtras;
    
        }            
    // asignando metodos pararealizar el calculo
    // calculando el monto extra
    public double montoExtra(){
     return sueldo*horasExtras/240;
        }
    // calculando el monto del seguro
    public double montoSeguro(){
        if(seguro.equalsIgnoreCase("AFP"))
                  return sueldo*afp;
        if(seguro.equalsIgnoreCase("SNP"))
         return sueldo*snp;
     return 0;
        }
        // calculando el monto de Essalud;
 
    public double montoEssalud(){
        return sueldo*essalud;
        }
        // calculando el monto de los descuentos
    public double montoDescuento(){
        return montoSeguro()+ montoEssalud();
        }
       // calculando el monto del sueldo bruto
        public double sueldoBruto(){
     return sueldo + montoExtra();
        }
        // calculando el sueldo neto
    public double sueldoNeto(){
         return sueldoBruto()-montoDescuento();
        }  
       
   
}
