import rsrc.FileManager;
import java.util.Scanner;
public class ZooManager{
    private FileManager fm;
    private String trabajadoresDir = "files/trabajadores.csv";
    private String trabajadoresData = "Nombre,RFC,Apellido Paterno,Apellido Materno,Calle,Num Interior,Colonia,Telefono,Fecha Contratacion,Finalizacion Contrato,Fecha Nacimiento,Correo Electronico,Genero,Especialidad,Salario";
    private String animalesDir = "files/animales.csv";
    private String animalesData = "nombre,especie,peso,altura,sexo,numJaula,alimentacion,indMedicas";
    private String biomasDir = "files/biomas.csv";
    private String biomasData = "ID,tipo,numJaulas,numCuidadores,numVeterinarios,numAnimales,serviciosAvisitantes";
    
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
     * metodo para mostrar datos de todos los veterinarios
     */
    public void getVeter(){
	fm.readCsv(trabajadoresDir);
    }

    /**
     * metodo para obtener datos de un veterinario en concreto
     * @param key - llave del veterinario, en este caso RFC
     */
    public void getVeter(String key){
	Scanner scanner = new Scanner(System.in);
	//el 2 es de la columna en que va a buscar comenzando del 0	
	System.out.println(fm.getCsvElem(trabajadoresDir,key,1));
	System.out.println("************************");
	System.out.println("(presiona Enter)");
	scanner.nextLine();
    }

    /**
     * metodo para editar datos de un veterinario en concreto
     * @param key - llave del veterinario a editar
     */
    public void editVeter(String key){
	Scanner scanner = new Scanner(System.in);
	String[] data = trabajadoresData.split(",");
	int choise = -1;	
	System.out.println("qué valor quieres editar?\n");
	for(int i=0; i<data.length; i++){
	    System.out.println(i+" - "+data[i]);
	}

	do{
	    choise = intCheck();
	    if(choise<0 || choise >= data.length){
		System.out.println("indices inválidos :x");
	    }
	}while(choise<0 || choise >= data.length);
	
	fm.editCsvElem(trabajadoresDir,key,1,choise);
	System.out.println("presiona Enter");
	scanner.nextLine();
    }

    /**
     * metodo para eliminar a un veterinario concreto
     * @param key - llave del veterinario a eliminar
     */
    public void deleteVeter(String key){
	Scanner scanner = new Scanner(System.in);
	fm.rmValue(trabajadoresDir,key,1);
	System.out.println("(presiona Enter)");
	scanner.nextLine();
    }

    /**
     * metodo para añadir un animal
     */
    public void addAnimal(){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Nombre del animal:");
	String a = scanner.nextLine();

	System.out.println("Especie:");
	String b = scanner.nextLine();
	
	System.out.println("Peso:");
	String c = scanner.nextLine();

	System.out.println("altura:");
	String d = scanner.nextLine();

	System.out.println("sexo:");
	String e = scanner.nextLine();

	System.out.println("numero de jaula:");
	int f = intCheck();

	System.out.println("alimentacion:");
	String g = scanner.nextLine();

	System.out.println("indicaciones medicas:");
	String h = scanner.nextLine();

	fm.write(a+","+b+","+c+","+d+","+e+","+f+","+g+","+h,animalesDir);
    }

    /**
     * metodo para obtener datos de un animal en concreto
     * @param key - llave del animal, en este caso su nombre
     */
    public void getAnimal(String key){
	Scanner scanner = new Scanner(System.in);
	//el 0 es de la columna en que va a buscar comenzando del 0	
	System.out.println(fm.getCsvElem(animalesDir,key,0));
	System.out.println("************************");
	System.out.println("(presiona Enter)");
	scanner.nextLine();
    }

    /**
     * metodo para editar datos de un animal en concreto
     * @param key - llave del animal a editar
     */
    public void editAnimal(String key){
	Scanner scanner = new Scanner(System.in);
	String[] data = animalesData.split(",");
	int choise = -1;	
	System.out.println("qué valor quieres editar?\n");
	for(int i=0; i<data.length; i++){
	    System.out.println(i+" - "+data[i]);
	}

	do{
	    choise = intCheck();
	    if(choise<0 || choise >= data.length){
		System.out.println("indices inválidos :x");
	    }
	}while(choise<0 || choise >= data.length);
	
	fm.editCsvElem(animalesDir,key,0,choise);
	System.out.println("presiona Enter");
	scanner.nextLine();
    }

    /**
     * metodo para eliminar a un animal concreto
     * @param key - llave del animal a eliminar
     */
    public void deleteAnimal(String key){
	Scanner scanner = new Scanner(System.in);
	fm.rmValue(animalesDir,key,0);
	System.out.println("(presiona Enter)");
	scanner.nextLine();
    }

    /**
     * metodo para añadir un animal
     */
    public void addBioma(){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("ID del bioma:");
	String a = scanner.nextLine();

	System.out.println("tipo de bioma:");
	String b = scanner.nextLine();
	
	System.out.println("numero de jaulas:");
	int c = intCheck();

	System.out.println("numero de cuidadores:");
	int d = intCheck();

	System.out.println("numero de veterinarios:");
	int e = intCheck();

	System.out.println("numero de animales:");
	int f = intCheck();
	
	System.out.println("servicios a los visitantes:");
	String g = scanner.nextLine();
	
	fm.write(a+","+b+","+c+","+d+","+e+","+f+","+g,biomasDir);
    }

    /**
     * metodo para obtener datos de un Bioma en concreto
     * @param key - llave del Bioma, en este caso su ID
     */
    public void getBioma(String key){
	Scanner scanner = new Scanner(System.in);
	//el 0 es de la columna en que va a buscar comenzando del 0	
	System.out.println(fm.getCsvElem(biomasDir,key,0));
	System.out.println("************************");
	System.out.println("(presiona Enter)");
	scanner.nextLine();
    }

    /**
     * metodo para editar datos de un bioma en concreto
     * @param key - llave del bioma a editar
     */
    public void editBioma(String key){
	Scanner scanner = new Scanner(System.in);
	String[] data = biomasData.split(",");
	int choise = -1;	
	System.out.println("qué valor quieres editar?\n");
	for(int i=0; i<data.length; i++){
	    System.out.println(i+" - "+data[i]);
	}

	do{
	    choise = intCheck();
	    if(choise<0 || choise >= data.length){
		System.out.println("indices inválidos :x");
	    }
	}while(choise<0 || choise >= data.length);
	
	fm.editCsvElem(biomasDir,key,0,choise);
	System.out.println("presiona Enter");
	scanner.nextLine();
    }

    /**
     * metodo para eliminar a un bioma concreto
     * @param key - llave del bioma a eliminar
     */
    public void deleteBioma(String key){
	Scanner scanner = new Scanner(System.in);
	fm.rmValue(biomasDir,key,0);
	System.out.println("(presiona Enter)");
	scanner.nextLine();
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

	//reseteando info de animales
	fm.delete(animalesDir);
	fm.write(animalesData,animalesDir);

	//reseteando info de biomas
	fm.delete(biomasDir);
	fm.write(biomasData,biomasDir);	
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
