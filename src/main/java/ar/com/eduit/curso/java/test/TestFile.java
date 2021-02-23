package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.files.FileText;
import ar.com.eduit.curso.java.files.I_File;
import java.util.ArrayList;
import java.util.List;

public class TestFile {
    
    public static void main(String[] args) {
        
        String file = "res/texto.txt";          // Ruta del archivo.
        I_File fText = new FileText(file);      // Le paso la ruta del archivo como argumento al metodo constructor de FileText.
        
        
        fText.setText("Curso de Java!");        
        fText.setText("> Si uso el setText otra vez, esto va a borrar y reemplazar lo anterior!");
        
        fText.appendText("\n> Por eso para agregar texto uso el appendText()!");
        
        fText.addLine("Para no tener que andar poniendo saltos de linea manualmente, utilizo el metodo addLine!");
        fText.addLine("Lunes");
        fText.addLine("Martes");
        fText.addLine("Miercoles");
        fText.addLine("Jueves");
        fText.addLine("Viernes");
        fText.addLine("Sabado");
        fText.addLine("Domingo");
        fText.addLine("Lunes");        
        
        List<String> estaciones = new ArrayList();
        
        estaciones.add("Verano");
        estaciones.add("Otoño");
        estaciones.add("Invierno");
        estaciones.add("Verano");
        
        fText.addLines(estaciones);
        
        
        //System.out.println(fText.getText());  // Utilizo el metodo getText, de no existir el archivo tirara la exception FileNotFound.    
        //fText.print();             
        //fText.getAll().forEach(System.out::println);
        
        // Mostrar solo filas que contengan la letra M        
        fText.getAll()
                .stream()
                .filter( s -> s.toLowerCase().contains("m") )
                .forEach(System.out::println);
    }
}
