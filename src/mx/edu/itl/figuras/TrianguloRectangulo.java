/*------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: Ago-Dic    HORA: 17-18 HRS
:*
:*            Clase que calcula el area y perimetro de un triangulo rectángulo
:*        
:*  Archivo     : TrianguloRectangulo.java
:*  Autor       : Alberto Villarreal Flores 16130067
:*  Fecha       : 12/Sep/2019
:*  Compilador  : JAVA J2SE v1.8.0.2
:*  Descripci�n : La clase recibe como parámetros la base y la altura del 
:*                triangulo y utiliza los métodos abstractos de la clase Figura.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*============================================================================== 
:*----------------------------------------------------------------------------*/

package mx.edu.itl.figuras;


import mx.edu.itl.figuras.Figura;



public class TrianguloRectangulo extends Figura{
    private double c1;
    private double c2;
    public TrianguloRectangulo(){
        c1 = 0;
        c2 = 0;
    }
    public TrianguloRectangulo(double c1, double c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    
//---------------------------------------------------------------------------------------    
    public double hipotenusa(){
        return Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
    }
    
//---------------------------------------------------------------------------------------    

    @Override
    public double perimetro() {
        return c1 + c2 + hipotenusa();
    }
    
//---------------------------------------------------------------------------------------
    @Override
    public double area() {
        return (c1 * c2) / 2;
    }
}
