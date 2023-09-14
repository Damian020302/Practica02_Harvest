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
	System.out.println("información añadida");
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

    /**
     * metodo para buscar un key en una fila de un archivo csv
     * @param key - llave que va a buscar
     * @param c - columna en donde se va a fijar
     */
    public String getCsvElem(String dir, String key, int c){
	String form = "";
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
		    if(entities[c].equals(key)){
			System.out.println("************************");
			System.out.println("Encontrado: ");
			for(int k=0; k<data.length; k++){
			    form += data[k]+": "+entities[k]+"\n";
			}
			
			return form;
		    }
		}		
		i++;
	    }	    
	    
	}catch(Exception e){
	    System.out.println("error: "+e);
	}
	form = "Dato no encontrado :C";
	return form;
    } 

    /**
     * metodo para editar un elemento en concreto de un archivo csv
     * @param dir - directorio del archivo
     * @param key - llave a buscar
     * @param c - clumna de la key
     * @param cE - columna del elemento a cambiar
     */
    public void editCsvElem(String dir, String key, int c, int cE){
	Scanner scanner = new Scanner(System.in);
	String tmpDir = "tmp.csv";//directorio de archivo temp
	int verif = 0;//para verificar si se encontró la llave
	try{
	    BufferedReader bf = new BufferedReader(new FileReader(dir));
	    String entrie = "";
	    String[] data = new String[1];
	    int i = 0;//iterador de lineas del archivo csv
	    int j = 0;//verificador de la primera fila
	    while((entrie=bf.readLine()) != null){
		if(j==0){
		    //asignando nombre de los datos (primera linea del archivo)
		    System.out.println("creando archivo tmp");
		    write(entrie,tmpDir);
		    data = entrie.split(",");
		    j=-1;
		}else{		    
		    String[] entities = entrie.split(",");		    
		    if(entities[c].equals(key)){
			verif = 1;//se encontró la llave
			System.out.println("************************");
			System.out.println("Encontrado: ");
			for(int k=0; k<data.length; k++){
			    System.out.println(data[k]+": "+entities[k]); 
			}
			String newValue = "";
			System.out.println("\nNuevo valor");
			newValue = scanner.nextLine();
			entities[cE] = newValue;//cambiando el valor
			String newLine = entities[0];
			for(int l=1; l<entities.length; l++){
			    newLine += ","+entities[l];
			}
			write(newLine,tmpDir);
		    }else{
			write(entrie,tmpDir);
		    }
		}		
		i++;
	    }	    
	    
	}catch(Exception e){
	    System.out.println("error: "+e);
	}
	File original = new File(dir);
	File tmpFile = new File(tmpDir);
	tmpFile.renameTo(original);
	if(verif==0){System.out.println("\nNO SE ENCONTRARON COINCIDENCIAS :C");}
    }

    /**
     * metodo para eliminar una fila completa del archivo dada la key;
     * @param dir - directorio del archivo
     * @param key - llave a buscar
     * @param c - columna de la llave
     */
    public void rmValue(String dir, String key, int c){
	Scanner scanner = new Scanner(System.in);
	String tmpDir = "tmp.csv";//directorio de archivo temp
	int verif = 0;//para verificar si se encontró la llave
	try{
	    BufferedReader bf = new BufferedReader(new FileReader(dir));
	    String entrie = "";
	    String[] data = new String[1];
	    int i = 0;//iterador de lineas del archivo csv
	    int j = 0;//verificador de la primera fila
	    while((entrie=bf.readLine()) != null){
		if(j==0){
		    //asignando nombre de los datos (primera linea del archivo)
		    System.out.println("creando archivo tmp");
		    write(entrie,tmpDir);
		    data = entrie.split(",");
		    j=-1;
		}else{		    
		    String[] entities = entrie.split(",");		    
		    if(entities[c].equals(key)){
			verif = 1;//se encontró la llave
			System.out.println("************************");
			System.out.println("Encontrado: ");
			for(int k=0; k<data.length; k++){
			    System.out.println(data[k]+": "+entities[k]); 
			}
			System.out.println("\nElemento borrado");
		    }else{
			write(entrie,tmpDir);
		    }
		}		
		i++;
	    }	    
	    
	}catch(Exception e){
	    System.out.println("error: "+e);
	}
	File original = new File(dir);
	File tmpFile = new File(tmpDir);
	tmpFile.renameTo(original);
	if(verif==0){System.out.println("\nNO SE ENCONTRARON COINCIDENCIAS :C");}
    }
    
    /**metodo para borrar un archivo*/
    public void delete(String dir){
	File archivo = new File(dir);
	archivo.delete();
    }
    
}
