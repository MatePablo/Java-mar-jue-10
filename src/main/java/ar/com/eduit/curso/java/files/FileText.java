package ar.com.eduit.curso.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileText implements I_File{
    
    /*
        Implementacion de la interface I_File
    
    +++ ATRIBUTOS +++
    
    > File
        Importa el objeto File de la libreria io.File   
    
    +++ METODOS +++
    
    CONSTRUCTOR PARA ARCHIVO
    a>  FileText(File file){
            this.file = file;
        }
        
    CONSTRUCTOR PARA RUTA DE ARCHIVO
    b>  FileText(String file){
            this.file = file;
        }
    */
    
    private File file;

    public FileText(File file) {
        this.file = file;
    }
    
    public FileText(String file){
        this.file = new File(file);
    }

    // Implementacion de metodos 
    @Override
    public String getText() {
        String text="";
        int car;
        try ( FileReader in=new FileReader(file); ){
            while( (car=in.read()) != -1 ){
                text += ( char )car;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return text;
    }

    @Override
    public void setText(String text) {
        try (FileWriter out = new FileWriter(file)){
            out.write(text);
        } catch (Exception e) {
            System.out.println(e);
        }        
    }

    @Override
    public void appendText(String text) {        
        try (FileWriter out = new FileWriter(file, true)){
            out.write(text);
        } catch (Exception e) {
            System.out.println(e);
        } 
    }

    @Override
    public void addLines(List<String> list) {
        try (FileWriter out = new FileWriter(file, true)){
            for(String s: list) out.write(s + "\n");
        } catch (Exception e) {
            System.out.println(e);
        } 
    }

    @Override
    public List<String> getAll() {
        List<String> list = new ArrayList();
        String linea;
        try (BufferedReader in = new BufferedReader(new FileReader(file));){
            //while( (linea=in.readLine()) != null ){
            //    list.add(linea);
            //}            
            return in.lines().collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    
}
