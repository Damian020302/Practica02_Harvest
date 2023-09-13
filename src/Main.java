import java.util.Scanner;
public class Main{
    public static void main(String[] holi){
	menu();
    }

    /**metodo menu*/
    public static void menu(){
	Scanner lnRd = new Scanner(System.in);
	ZooManager zm = new ZooManager();
	int choice = -1;
	while(choice!=0){
	    System.out.println("***** MENU *****");
	    System.out.println("0 - Salir");
	    System.out.println("1 - Agregar veterinario");
	    System.out.println("2 - Agregar un animal");
	    System.out.println("3 - Agregar un bioma");
	    System.out.println("4 - consultar veterinario");
	    System.out.println("5 - consultar animal");
	    System.out.println("6 - consultar bioma");
	    System.out.println("7 - editar información de veterinario");
	    System.out.println("8 - editar información de animal");
	    System.out.println("9 - editar información de bioma");
	    System.out.println("10 - eliminar información de veterinario");
	    System.out.println("11 - eliminar información de animal");
	    System.out.println("12 - eliminar información de bioma");
	    System.out.println("13 - reiniciar archivos csv");
	    System.out.println("\nSelecciona una opción: ");
	    choice = intCheck();

	    switch(choice){
	    case 0:System.out.println("Adiós :c");break;
	    case 1:
		zm.addVeter();break;
	    case 2:;break;
	    case 3:;break;
	    case 4:
		zm.getVeter();break;
	    case 5:;break;
	    case 6:;break;
	    case 7:;break;
	    case 8:;break;
	    case 9:;break;
	    case 10:;break;
	    case 11:;break;
	    case 12:;break;
	    case 13:
		zm.resetDataValue();break;
	    default:
		System.out.println("Opción invalida D: (presiona Enter)");
		lnRd.nextLine();
		break;
	    }
	}
	
    }

    /**
     * metodo para leer un entero (robusto)
     * @return - entero seleccionado por usuario
     */
    public static int intCheck(){
	Scanner intRd = new Scanner(System.in);
	int result = 0;
	int error = 0;
	do{
	    try{
		result = intRd.nextInt();
		error=0;
	    }catch(Exception ex){
		System.out.println("parametro inválido");
		error=1;
		intRd.nextLine();
	    }
	}while(error==1);	
	return result;
    }
    
}
