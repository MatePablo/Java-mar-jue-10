
package ar.com.eduit.curso.java.files;

import java.util.List;

public interface I_File {   
    
    /*
    --- Interfaz I_File: ---
    
    +++ METODOS +++
    
    > print()
        Imprime en consola el contenido de un archivo, llamando al metodo getText() dentro de un System.out.println
    
    > getText()
        Devuelve una variable String con el contenido de un archivo.
    
    > setText( String text )
        Recibe un texto como parametro y lo escribe en el archivo.
    
    > appendText( String text )
        Recibe un texto como parametro y lo apendiza.
    
    > addLine( String line)
        Recibe un texto como parametro, y mediante el metodo appendText lo apendiza con un salto de linea.
    */
    
    default void print(){
        System.out.println(getText());
    };        
    String getText();   
    void setText(String text); 
    void appendText(String text); 
    default void addLine(String line){
        appendText(line+"\n");
    };
    
    default void addLines(List<String> list){
        list.forEach(item -> addLine(item));
    }
    List<String> getAll();
}
