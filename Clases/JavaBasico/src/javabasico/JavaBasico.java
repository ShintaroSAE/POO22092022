package javabasico;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author Eduardo Salazar
 */
public class JavaBasico {
    public static void main(String[] args) {
        int edad = 20;
        System.out.println("Edad = " + edad);
        
        Integer edad2 = new Integer (22);
        System.out.println(edad2);
        
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(".-.-.-.-.-.-.-.-.-");
        
        //convertir String a Entero
        String cadena = "99";
        int altura = Integer.parseInt(cadena);//Metodo miembro
        Color c1 = Color.BLUE;//Atributo miembro
        altura += 1;
        System.out.println("Altura = " + altura);
        
        float y = Float.parseFloat(cadena);
        y = y + 0.5f;
        System.out.println("Altura = " + y);
        System.out.println("==============================================");
        
        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(5.2f, 55);
        Arbol tree3 = new Arbol(1.4f, 5);
        Arbol tree4 = new Arbol(10.8f, 85);
        
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
        System.out.println(tree4);
        
        System.out.println("Troncos de un arbol = " + Arbol.tronco);//LOS ATRIBUTOS DE CLASE VAN EN MAYUS
        //Un atributo de clase o metodo de clase (miembro) son identificadores que almacenan
        //un valor constante o un comportamiento constante igual para todos los objetos
        //de la misma. Al ser constantes no es necesario crear una instancia (objeto) para 
        //acceder a ellos.
       /* JOptionPane.showMessageDialog(null, "Hola Mundo", "Aqui va un titulo", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);*/
        
        //sin operador ternario
        int edad3= 25;
        //validar si es mayor de edad
        String resultado = "";
        if (edad3<18){
            resultado = "Menor de edad";
        }else{
            resultado = "Mayor de edad";
        }
        System.out.println(resultado);
        
        //usando el operador terniario
        int edad4 = 15;
        String res = "";
        res = edad4 < 18? "Menor de edad" : "Mayor de edad";
        System.out.println(res);
        
        //version minima
        int edad5 = 15;
        System.out.println(edad5 < 18? "Menor de edad" : "Mayor de edad");
        System.out.println("========================OPERADOR OR & AND Y DESPLAZAMIENTOS====================================");
        //comparacion OR a nivel de bits
        int val1 = 1;
        int val2 = 2;
        System.out.println(val1 | val2);
        
        int val3 = 1; //0000...0001
        int val4 = 0;
        val4 = val3 << 2;
        System.out.println(val4);
        System.out.println("======================================ARREGLOS================================================");
        //ARREGLOS
        int[] edades;
        edades = new int[5];
        System.out.println(edades);
        edades[0] = 10;
        System.out.println("La primer edad es " + edades[0]);
        //Declarar e inicializar en una sola linea
        float[] estaturas = new float [5];
        //Asignacion de valores
        int [] pesos = {80,87,78,75,87};
        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        
        System.out.println("=====CON CICLO FOR======");
        for (int i = pesos.length-1 ; i >= 0; i--){
            System.out.println(pesos[i]);
        }
        System.out.println("=======================ARREGLO DE ALUMNOS=============================");
        Alumno[] lista = new Alumno[5];
        lista[0] = new Alumno("959418", 2, 9.9f);
        lista[1] = new Alumno("987916", 2, 7.9f);
        lista[2] = new Alumno("998422", 2, 8.0f);
        lista[3] = new Alumno("913254", 2, 5.5f);
        lista[4] = new Alumno("979542", 2, 10.0f);
        
        for (int i = 0; i < lista.length; i++){
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
        }
        //For each es un FOR especial el cual es utilizado para simplificar los FOR con arreglos
        System.out.println("========CON FOR EACH========");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());
        }
    }
    
}
