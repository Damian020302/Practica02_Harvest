package rsrc;
import java.io.*;
import java.util.*;

public class FileManager{
    /**
     * metodo para leer un documento dado un directorio
     * @param dir - directorio del documento
     */
    public void read(String dir){
	try{
	    BufferedReader bf = new BufferedReader(new FileReader(dir));
	    String entrie = "";
	    while((entrie=bf.readLine()) != null){
		System.out.println(entrie);
	    }
	}catch(Exception e){
	    System.out.println("error: "+e);
	}
    }
    
    /**
     * metodo para agregar una linea al archivo;
     * @param ln - linea a agregar
     */
    public void write(String ln, String dir){
	Scanner scanner = new Scanner(System.in);
	try{
	    FileWriter fw = new FileWriter(dir, true);
	    fw.append(ln+"\n");
	    fw.close();
	}catch(Exception e){
	    System.out.println("error: "+e);
	}
	System.out.println("información añadida (presiona Enter)");
	scanner.nextLine();
    }

    /**
     * metodo para leer un archivo y mostrar los datos en lista
     * (formato csv) con el valor de los datos en la primera linea
     * @param dir - directorio del archivo
     * @param n - numero de datos (columnas)
     */
    public void readCsv(String dir){
	Scanner scanner = new Scanner(System.in);
	try{
	    BufferedReader bf = new BufferedReader(new FileReader(dir));
	    String entrie = "";
	    String[] data = new String[1];
	    int i = 0;//iterador de lineas del archivo csv
	    int j = 0;//verificador de la primera fila
	    
	    while((entrie=bf.readLine()) != null){
		if(j==0){
		    //asignando nombre de los datos (primera linea del archivo)
		    data = entrie.split(",");
		    j=-1;
		}else{
		    String[] entities = entrie.split(",");
		    for(int k=0; k<data.length; k++){
			System.out.println(data[k]+": "+entities[k]);
		    }
		}
		System.out.println("************************");
		i++;
	    }
	    
	    System.out.println("(presiona Enter)");
	    scanner.nextLine();
	    
	}catch(Exception e){
	    System.out.println("error: "+e);
	}
    }

    /**metodo para borrar un archivo*/
    public void delete(String dir){
	File archivo = new File(dir);
	archivo.delete();
    }
    
}
