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
	String key = "";
	while(choice!=0){
	    System.out.println("\n***** MENU *****");
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
	    case 1://añadiendo veterinario
		zm.addVeter();break;
	    case 2://añadiendo un animal
		zm.addAnimal();break;
	    case 3://añadiendo un bioma
		zm.addBioma();break;
	    case 4://obteniendo datos de un veterinario
		System.out.println("ingrese el RFC");
		key = lnRd.nextLine();
		zm.getVeter(key);break;
	    case 5://obteniendo datos de un animal
		System.out.println("ingrese el nombre del animal");
		key = lnRd.nextLine();
		zm.getAnimal(key);break;
	    case 6://obteniendo datos de un animal
		System.out.println("ingrese el ID del bioma");
		key = lnRd.nextLine();
		zm.getBioma(key);break;
	    case 7://editando informacion de veterinario
		System.out.println("ingrese el RFC");
		key = lnRd.nextLine();
		zm.editVeter(key);break;
	    case 8://editando informacion de un animal
		System.out.println("ingrese el nombre del animal");
		key = lnRd.nextLine();
		zm.editAnimal(key);break;
	    case 9://editando informacion de un bioma
		System.out.println("ingrese el ID del bioma");
		key = lnRd.nextLine();
		zm.editBioma(key);break;
	    case 10://eliminando un veterinario
		System.out.println("ingrese el RFC");
		key = lnRd.nextLine();
		zm.deleteVeter(key);break;
	    case 11://eliminando un animal
		System.out.println("ingrese el nombre del animal");
		key = lnRd.nextLine();
		zm.deleteAnimal(key);break;
	    case 12://eliminando un bioma
		System.out.println("ingrese el ID del bioma");
		key = lnRd.nextLine();
		zm.deleteBioma(key);break;
	    case 13://reseteando archivos csv
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
