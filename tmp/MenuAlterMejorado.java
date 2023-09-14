import java.io.*;
import java.util.*;

public class MenuAlterMejorado {

    private static final String CSV_FILE1 = "trabajadores.csv";
    private static final String CSV_FILE2 = "animales.csv";
    private static final String CSV_FILE3 = "biomas.csv";

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
		    System.out.println("Bienvenido al sistema de registro del zoológico Huitziltepec\n\n"+
				        "Presione 0 si desea salir de la interfaz. \n" +
 			            "Presione 1 si desea agregar a un veterinario a la base de datos.\n" +
			            "Presione 2 si desea agregar a un animal a la base de datos. \n"+
			            "Presione 3 si desea agregar un bioma a la base de datos. \n"+
                        "Presione 4 si desea consultar a un veterinario.\n" +
			            "Presione 5 si desea consultar a un animal. \n"+
			            "Presione 6 si desea consultar un bioma. \n"+
                        "Presione 7 si desea editar la informacion de un veterinario.\n" +
			            "Presione 8 si desea editar la informacion de un animal. \n"+
			            "Presione 9 si desea editar la informacion de un bioma. \n"+
                        "Presione 10 si desea eliminar la informacion de un veterinario de la base de datos.\n" +
			            "Presione 11 si desea eliminar la informacion de un animal de la base de datos. \n"+
			            "Presione 12 si desea eliminar la informacion de un bioma de la base de datos. \n");
	

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 0:
                    System.out.println("Vuelva pronto");
                    scanner.close();
                    System.exit(0);
                case 1:
                    anadirInformacionEmpleado(scanner);
                    break;
                case 2:
                    anadirInformacionAnimal(scanner);
                    break;
                case 3:
                    anadirInformacionBioma(scanner);
                    break;
                case 4:
                    consultarInformacionEmpleado();
                    break;
                case 5:
                    consultarInformacionAnimal();
                    break;
                case 6:
                    consultarInformacionBioma();
                    break;
                case 7:
                    editarInformacionEmpleado(scanner);
                    break;
                case 8:
                    editarInformacionAnimal(scanner);
                    break;
                case 9:
                    editarInformacionBioma(scanner);
                    break;
                case 10:
                    eliminarInformacionEmpleado(scanner);
                    break;
                case 11:
                    eliminarInformacionAnimal(scanner);
                    break;
                case 12:
                    eliminarInformacionBioma(scanner);
                    break;
                default:
                    System.out.println("Opción invalida. Por favor intente de nuevo");
            }
        }
    }

    private static void anadirInformacionEmpleado(Scanner scanner) {
        try {
            FileWriter csvWriter = new FileWriter(CSV_FILE1, true); // Append mode

            System.out.print("Ingrese su nombre: ");
            String a = scanner.nextLine();

            System.out.print("Ingrese su RFC: ");
            String b = scanner.nextLine();

            System.out.print("Ingrese su apellido paterno: ");
            String c = scanner.nextLine();

            System.out.print("Ingrese su apellido materno: ");
            String d = scanner.nextLine();

            System.out.print("Ingrese su calle: ");
            String e = scanner.nextLine();

            System.out.print("Ingrese su numero interior: ");
            int f = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese su colonia: ");
            String g = scanner.nextLine();

            System.out.print("Ingrese su telefono: ");
            int h = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese su fecha de contratación: ");
            String i = scanner.nextLine();

            System.out.print("Ingrese su fecha de finalización de contrato: ");
            String j = scanner.nextLine();

            System.out.print("Ingrese su fecha de nacimiento: ");
            String k = scanner.nextLine();

            System.out.print("Ingrese su correo electrónico: ");
            String l = scanner.nextLine();

            System.out.print("Ingrese su genero: ");
            String m = scanner.nextLine();

            System.out.print("Ingrese su especialidad: ");
            String n = scanner.nextLine();

            System.out.print("Ingrese su salario: ");
            int o = scanner.nextInt();

            csvWriter.append(a + "," + b + "," + c + "," + d + "," + e + "," + f + "," + g + "," + h + "," + i + "," + j + "," + k + "," + l + "," + m + "," + n + "," + o + "\n");
            csvWriter.close();

            System.out.println("Information added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void anadirInformacionAnimal(Scanner scanner) {
        try {
            FileWriter csvWriter = new FileWriter(CSV_FILE2, true); // Append mode

            System.out.print("Ingrese el nombre del animal: ");
            String a = scanner.nextLine();

            System.out.print("Ingrese la especie: ");
            String b = scanner.nextLine();

            System.out.print("Ingrese el peso: ");
            String c = scanner.nextLine();

            System.out.print("Ingrese la altura: ");
            String d = scanner.nextLine();

            System.out.print("Ingrese el sexo: ");
            String e = scanner.nextLine();

            System.out.print("Ingrese el numero de jaula en el que se encuentra: ");
            int f = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese su alimentacion: ");
            String g = scanner.nextLine();

            System.out.print("Ingrese sus indicaciones medicas: ");
            String h = scanner.nextLine();

            csvWriter.append(a + "," + b + "," + c + "," + d + "," + e + "," + f + "," + g + "," + h + "\n");
            csvWriter.close();

            System.out.println("Information added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void anadirInformacionBioma(Scanner scanner) {
        try {
            FileWriter csvWriter = new FileWriter(CSV_FILE3, true); // Append mode

            System.out.print("Ingrese el tipo de bioma: ");
            String a = scanner.nextLine();

            System.out.print("Ingrese el numero de jaulas: ");
            int b = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el numero de cuidadores: ");
            int c = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el numero de veterinarios: ");
            int d = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el numero de animales: ");
            int e = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese los servicios a los visitantes: ");
            String f = scanner.nextLine();

            csvWriter.append(a + "," + b + "," + c + "," + d + "," + e + "," + f + "\n");
            csvWriter.close();

            System.out.println("Information added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void consultarInformacionEmpleado() {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE1));
            String line;

            System.out.println("\nLista de informacion:\n");
            while ((line = csvReader.readLine()) != null) {
                String[] trabajadores = line.split(",");
                System.out.println("Nombre: " + trabajadores[0] + "\nRFC: " + trabajadores[1] + "\nApellido paterno: " + trabajadores[2] + "\nApellido materno: " + trabajadores[3] + "\nCalle: " + trabajadores[4] + "\nNúmero interior: " + trabajadores[5] + "\nColonia: " + trabajadores[6] + "\nTeléfono: " + trabajadores[7] + "\nFecha de contratación: " + trabajadores[8] + "\nFecha de finalización de contrato: " + trabajadores[9] + "\nFecha de nacimiento: " + trabajadores[10] + "\nCorreo electrónico: " + trabajadores[11] + "\nGénero: " + trabajadores[12] + "\nEspecialidad: " + trabajadores[13] + "\nSalario: " + trabajadores[14] + "\n");
            }

            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void consultarInformacionAnimal() {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE2));
            String line;

            System.out.println("\nLista de informacion:\n");
            while ((line = csvReader.readLine()) != null) {
                String[] animales = line.split(",");
                System.out.println("Nombre: " + animales[0] + "\nEspecie: " + animales[1] + "\nPeso: " + animales[2] + "\nAltura: " + animales[3] + "\nSexo: " + animales[4] + "\nNumero de jaula: " + animales[5] + "\nAlimentación: " + animales[6] + "\nIndicaciones medicas: " + animales[7] + "\n");
            }

            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void consultarInformacionBioma() {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE3));
            String line;

            System.out.println("\nLista de informacion:\n");
            while ((line = csvReader.readLine()) != null) {
                String[] biomas = line.split(",");
                System.out.println("Tipo de bioma: " + biomas[0] + "\nNumero de jaulas: " + biomas[1] + "\nNumero de cuidadores: " + biomas[2] + "\nNumero de veterimarios: " + biomas[3] + "\nNumero de animales: " + biomas[4] + "\nServicios a visitantes: " + biomas[5] + "\n");
            }

            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void editarInformacionEmpleado(Scanner scanner) {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE1));
            ArrayList<String> lines = new ArrayList<>();
            String line;

            System.out.print("Enter the name of the person to edit: ");
            String editName = scanner.nextLine();

            while ((line = csvReader.readLine()) != null) {
                String[] trabajadores = line.split(",");
                if (trabajadores[0].equals(editName)) {

                    System.out.print("Ingrese su nombre: ");
                    String newA = scanner.nextLine();

                    System.out.print("Ingrese su RFC: ");
                    String newB = scanner.nextLine();

                    System.out.print("Ingrese su apellido paterno: ");
                    String newC = scanner.nextLine();

                    System.out.print("Ingrese su apellido materno: ");
                    String newD = scanner.nextLine();

                    System.out.print("Ingrese su calle: ");
                    String newE = scanner.nextLine();

                    System.out.print("Ingrese su numero interior: ");
                    int newF = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese su colonia: ");
                    String newG = scanner.nextLine();

                    System.out.print("Ingrese su telefono: ");
                    int newH = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese su fecha de contratación: ");
                    String newI = scanner.nextLine();

                    System.out.print("Ingrese su fecha de finalización de contrato: ");
                    String newJ = scanner.nextLine();

                    System.out.print("Ingrese su fecha de nacimiento: ");
                    String newK = scanner.nextLine();

                    System.out.print("Ingrese su correo electrónico: ");
                    String newL = scanner.nextLine();

                    System.out.print("Ingrese su genero: ");
                    String newM = scanner.nextLine();

                    System.out.print("Ingrese su especialidad: ");
                    String newN = scanner.nextLine();

                    System.out.print("Ingrese su salario: ");
                    int newO = scanner.nextInt();                    

                    line = newA + "," + newB + "," + newC + "," + newD + "," + newE + "," + newF + "," + newG + "," + newH + "," + newI + "," + newJ + "," + newK + "," + newL + "," + newM + "," + newN + "," + newO;
                    System.out.println("\nInformacion actualizada\n");
                }

                lines.add(line);
            }

            csvReader.close();

            FileWriter csvWriter = new FileWriter(CSV_FILE1, false); // Overwrite the file
            for (String updatedLine : lines) {
                csvWriter.append(updatedLine + "\n");
            }
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void editarInformacionAnimal(Scanner scanner) {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE2));
            ArrayList<String> lines = new ArrayList<>();
            String line;

            System.out.print("Ingrese el nombre del animal para editar su informacion: ");
            String editName = scanner.nextLine();

            while ((line = csvReader.readLine()) != null) {
                String[] trabajadores = line.split(",");
                if (trabajadores[0].equals(editName)) {

                    System.out.print("Ingrese el nombre del animal: ");
                    String newA = scanner.nextLine();

                    System.out.print("Ingrese la especie: ");
                    String newB = scanner.nextLine();

                    System.out.print("Ingrese el peso: ");
                    String newC = scanner.nextLine();

                    System.out.print("Ingrese la altura: ");
                    String newD = scanner.nextLine();

                    System.out.print("Ingrese el sexo: ");
                    String newE = scanner.nextLine();

                    System.out.print("Ingrese el numero de jaula en el que se encuentra: ");
                    int newF = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese su alimentacion: ");
                    String newG = scanner.nextLine();

                    System.out.print("Ingrese sus indicaciones medicas: ");
                    String newH = scanner.nextLine();                   

                    line = newA + "," + newB + "," + newC + "," + newD + "," + newE + "," + newF + "," + newG + "," + newH;
                    System.out.println("\nInformacion actualizada\n");
                }

                lines.add(line);
            }

            csvReader.close();

            FileWriter csvWriter = new FileWriter(CSV_FILE2, false); // Overwrite the file
            for (String updatedLine : lines) {
                csvWriter.append(updatedLine + "\n");
            }
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void editarInformacionBioma(Scanner scanner) {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE3));
            ArrayList<String> lines = new ArrayList<>();
            String line;

            System.out.print("Ingrese el nombre del animal para editar su informacion: ");
            String editName = scanner.nextLine();

            while ((line = csvReader.readLine()) != null) {
                String[] trabajadores = line.split(",");
                if (trabajadores[0].equals(editName)) {

                    System.out.print("Ingrese el tipo de bioma: ");
                    String newA = scanner.nextLine();

                    System.out.print("Ingrese el numero de jaulas: ");
                    int newB = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el numero de cuidadores: ");
                    int newC = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el numero de veterinarios: ");
                    int newD = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el numero de animales: ");
                    int newE = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese los servicios a los visitantes: ");
                    String newF = scanner.nextLine();                  

                    line = newA + "," + newB + "," + newC + "," + newD + "," + newE + "," + newF;
                    System.out.println("\nInformacion actualizada\n");
                }

                lines.add(line);
            }

            csvReader.close();

            FileWriter csvWriter = new FileWriter(CSV_FILE3, false); // Overwrite the file
            for (String updatedLine : lines) {
                csvWriter.append(updatedLine + "\n");
            }
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void eliminarInformacionEmpleado(Scanner scanner) {

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE1));
            ArrayList<String> lines = new ArrayList<>();
            String line;

            System.out.print("Igrese el nombre de la persona que quiere eliminar: ");
            String deleteName = scanner.nextLine();

            while ((line = csvReader.readLine()) != null) {
                String[] trabajadores = line.split(",");
                if (!trabajadores[0].equals(deleteName)) {
                    lines.add(line);
                } else {
                    System.out.println("\nIformacion borrada\n");
                }
            }

            csvReader.close();

            FileWriter csvWriter = new FileWriter(CSV_FILE1, false); // Overwrite the file
            for (String remainingLine : lines) {
                csvWriter.append(remainingLine + "\n");
            }
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void eliminarInformacionAnimal(Scanner scanner) {

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE2));
            ArrayList<String> lines = new ArrayList<>();
            String line;

            System.out.print("Igrese el nombre del animal que quiere eliminar: ");
            String deleteName = scanner.nextLine();

            while ((line = csvReader.readLine()) != null) {
                String[] animales = line.split(",");
                if (!animales[0].equals(deleteName)) {
                    lines.add(line);
                } else {
                    System.out.println("\nIformacion borrada\n");
                }
            }

            csvReader.close();

            FileWriter csvWriter = new FileWriter(CSV_FILE2, false); // Overwrite the file
            for (String remainingLine : lines) {
                csvWriter.append(remainingLine + "\n");
            }
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void eliminarInformacionBioma(Scanner scanner) {

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE3));
            ArrayList<String> lines = new ArrayList<>();
            String line;

            System.out.print("Igrese el nombre del tipo de bioma que quiere eliminar: ");
            String deleteName = scanner.nextLine();

            while ((line = csvReader.readLine()) != null) {
                String[] biomas = line.split(",");
                if (!biomas[0].equals(deleteName)) {
                    lines.add(line);
                } else {
                    System.out.println("\nIformacion borrada\n");
                }
            }

            csvReader.close();

            FileWriter csvWriter = new FileWriter(CSV_FILE3, false); // Overwrite the file
            for (String remainingLine : lines) {
                csvWriter.append(remainingLine + "\n");
            }
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
