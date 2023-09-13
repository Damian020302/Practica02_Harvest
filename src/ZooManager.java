import rsrc.FileManager;
import java.util.Scanner;
public class ZooManager{
    private FileManager fm;
    private String trabajadoresDir = "trabajadores.csv";
    private String trabajadoresData = "Nombre,RFC,Apellido Paterno,Apellido Materno,Calle,Num Interior,Colonia,Telefono,Fecha Contratacion,Finalizacion Contrato,Fecha Nacimiento,Correo Electronico,Genero,Especialidad,Salario"; 
    
    public ZooManager(){
	fm = new FileManager();	
	//fm.read(trabajadoresDir);	
	//fm.write("holii",trabajadoresDir);
    }

    /**
     * metodo para añadir a un veterinario
     */
    public void addVeter(){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese su nombre: ");
	String a = scanner.nextLine();
	
	System.out.println("Ingrese su RFC: ");
	String b = scanner.nextLine();
	
	System.out.println("Ingrese su apellido paterno: ");
	String c = scanner.nextLine();
	
	System.out.println("Ingrese su apellido materno: ");
	String d = scanner.nextLine();
	
	System.out.println("Ingrese su calle: ");
	String e = scanner.nextLine();
	
	System.out.println("Ingrese su numero interior: ");
	int f = intCheck();
	
	System.out.println("Ingrese su colonia: ");
	String g = scanner.nextLine();
	
	System.out.println("Ingrese su telefono: ");
	int h = intCheck();

	System.out.println("Ingrese su fecha de contratación: ");
	String i = scanner.nextLine();
	
	System.out.println("Ingrese su fecha de finalización de contrato: ");
	String j = scanner.nextLine();
	
	System.out.println("Ingrese su fecha de nacimiento: ");
	String k = scanner.nextLine();
	
	System.out.println("Ingrese su correo electrónico: ");
	String l = scanner.nextLine();
	
	System.out.println("Ingrese su genero: ");
	String m = scanner.nextLine();
	
	System.out.println("Ingrese su especialidad: ");
	String n = scanner.nextLine();
	
	System.out.println("Ingrese su salario: ");
	int o = intCheck();

	fm.write(a + "," + b + "," + c + "," + d + "," + e + "," + f + "," + g + "," + h + "," + i + "," + j + "," + k + "," + l + "," + m + "," + n + "," + o, trabajadoresDir);
	
    }

    /**
     * metodo para obtener datos de todos los veterinarios
     */
    public void getVeter(){
	fm.readCsv(trabajadoresDir);
    }

    /**
     * añadir nombre de los datos en la primera fila de
     * la tabla
     * @param dataV - el nombre de los datos separados por ','
     * @param dir - directorio del archivo
     */
    public void resetDataValue(){
	//reseteando info de veterinarios
	fm.delete(trabajadoresDir);
	fm.write(trabajadoresData,trabajadoresDir);
	
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
