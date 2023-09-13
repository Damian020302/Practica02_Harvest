/**
 * Práctica 02. Fundamentos de Base de Datos.
 * Implementa el menú que permite interactuar con el usuario.
 * @author yuznhio sierra 413085014
 * @version 01
 */

import java.util.Scanner;



public class Menu {

	/**
    * Evalua si un dato recibido es un entero.
    * @param msn1 primer mensaje del método.
    * @param msn 2 segundo mensaje del método.
    * @return numero recibido.
    */
	public int getInt (String msn1, String msn2){
		int num = 0;
		boolean indicador3 = true;
		do {
		    Scanner scan = new Scanner(System.in);
		    System.out.println(msn1);
		    if (scan.hasNextInt()){
		        num = scan.nextInt();
			    indicador3 = false;
		    }    
		    else System.out.println(msn2);
		} while (indicador3);
		return num;
	}


	/**
    * Evalua si un dato recibido es un String.
    * @param msn1 primer mensaje del método.
    * @param msn 2 segundo mensaje del método.
    * @return string recibido.
    */
	public String getString (String msn1, String msn2){
		String cadena = "";
		boolean indicador3 = true;
		do {
		    Scanner scan = new Scanner(System.in);
		    System.out.print(msn1);
		    if (scan.hasNextLine()){
		        cadena = scan.nextLine();
			    indicador3 = false;
		    }    
		    else System.out.println(msn2);
		} while (indicador3);
		return cadena;
	}

	/**
	* Recibe del usuario la información del veterinario.
	*/
	public String[] getDatosVeterinario(){
		String a = "nombre: ";
		String b = "RFC: ";
		String c = "apellido paterno: ";
		String d = "apellido materno: ";
		String e = "calle: ";
		String f = "Número interior: ";
		String g = "Colonia: ";
		String h = "Teléfono: ";
		String i = "Fecha de contratación:";
		String j = "Fecha de finalización de contrato: ";
		String k = "Fecha de nacimiento: ";
		String l = "Correo electrónico: ";
		String m = "Género: ";
		String n = "Especialidad: ";
		String o = "Salario: ";
		String[] datos = {a,b,c,d,e,f,g,h,i,j,k,l,m,n};
		return datos;
	}



	public static void main(String[]args){

		Menu ob1 = new Menu();
		
		String a = "Bienvenido al sistema de registro del zoológico Huitziltepec\n\n"+
				   "Presione 0 si desea salir de la interfaz. \n" +
 			       "Presione 1 si desea agregar a un veterinario a la base de datos.\n" +
			       "Presione 2 si desea agregar a un animal a la base de datos. \n"+
			       "Presione 3 si desea agregar un bioma a la base de datos. \n"+
			       "Presione 4 si desea modificar los datos de un veterinario. \n";
		String b = "Opción invalida. Por favor intente de nuevo. \n";
		boolean indicador1 = true;
		String msn1;
		String msn2;
		int num;
		int flag;
		boolean resultado2;
		String resultado3;


		do {
		    flag = ob1.getInt(a,b);
			switch (flag){
		    case 0: 
			    indicador1=false;
		            break;
		    case 1:
		    	System.out.println ("\nIntroduzca los datos solicitados");
				String[] datosVet = ob1.getDatosVeterinario();
				for (int i=0; i < datosVet.length; i++ ){
					if (datosVet[i].equals("Número interior: ")){
						num = ob1.getInt(datosVet[i],b);
					} else{
						msn1 = ob1.getString(datosVet[i],b);
					}
				}
				System.out.println ("\nSe han ingresado los datos proporcionados\n");
				break;

			case 2: 
			 
			    System.out.println("Ok...");
			    break; 

			case 3:
				System.out.println("Ok...");
			    break;

			case 4:
				System.out.println("Ok...");
			    break;

			default: System.out.println(b);
			    break;
			}
		    
		} while (indicador1);
		
	}
}
