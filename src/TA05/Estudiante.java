
package TA05;

import java.util.Scanner;

/**
 *
 * @author luudwin
 */
public class Estudiante {
   // declaramos las variables codigo, nombre y especialidad como string privado,
        
    private String codigo;
    private String nombre;
    private String especialidad;
      
    // utilizando metodos get y set para cadavariable privado    
    public String getCodigo(){
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public Estudiante(String codigo, String nombre, String especialidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
        //creamos el metodo main 
        
    public static void main(String[] args) {
        	
        // Importamos la clase Scanner para leer valores por entrada
        // Creamos un obejeto entrada para almacenar los datos ingresados 
        Scanner entrada = new Scanner(System.in);
        /*  declarando nota1, nota2 ,nota3, nota4 de tipo double
            asi como la variable promedio y variable menor nota
        */
        double menor, nota1, nota2, nota3, nota4;
        double promedio;
        // pedimos al usuario ingresar las cuatro notas por teclado
        System.out.print("digite el valor de nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.print("digite el valor de nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.print("Ingrese el valor de nota 3: ");
        nota3 = entrada.nextDouble();
        System.out.print("Ingrese el valor de nota 4: ");
        nota4 = entrada.nextDouble();
        
        // Utilizamos estructuras de control "if" para conparar cada nota ingresada
        menor=nota1;        
        if(menor>nota2)
            menor=nota2;
        if(menor>nota3)
            menor=nota3;
        if(menor>nota4)
            menor=nota4;
       /* La siguiente instuccion es para calcular el promedio de las notas
          sin considerar la menor nota.  
      */
        promedio=(nota1+nota2+nota3+nota4-menor)/3;
        // finalmente mostra mos el resultado en pantalla
        System.out.println("La menor nota es : " + menor);
        System.out.println("El promedio es: : " + promedio);
        
    }
}
