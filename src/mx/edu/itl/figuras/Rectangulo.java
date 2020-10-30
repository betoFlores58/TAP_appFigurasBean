/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2019    HORA: 17-18 HRS
:*
:*                              Clase Rectángulo
:*        
:*  Archivo     : TAP2019bLib
:*  Autor       : Juan Gerardo García Valenzuela
:*  Fecha       : 11/Oct/2019
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Obtiene información de un Rectángulo.
:*  Ultima modif: 
:*  Fecha           Modific�             Motivo
:*========================================================================================== 
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.figuras;

/**
 *
 * @author geras
 */
public class Rectangulo extends Figura{
//------------------------------------------------------------------------------------------
//Declaración de atributos. ================================================================
    private double largo;
    private double ancho;
//------------------------------------------------------------------------------------------
//Constructores de la clase: defalut y parametrizado.=======================================
    public Rectangulo(){
        largo = 0;
        ancho = 0;
    }
    public Rectangulo(double largo, double ancho){
        this.largo =largo;
        this.ancho = ancho;
    }
//------------------------------------------------------------------------------------------
//Método que calcula la diagonal que atraviesa un rectángulo, con la fórmula: ==============
// ((largo^2) + (ancho^2))^(1 / 2) =========================================================
    public double diagonal(){
        return Math.sqrt(Math.pow(largo, 2) + Math.pow(ancho, 2));
    }
//------------------------------------------------------------------------------------------
//Método que calcula el perímetro de un rectángulo, con la fórmula: ========================
// (2 * largo) + (2 * ancho) ===============================================================
    @Override
    public double perimetro() {
        return (2 * largo) + (2 * ancho);
    }
//------------------------------------------------------------------------------------------
//Método que calcula el área de un rectángulo, con la fórmula: =============================
// largo * ancho ===========================================================================
    @Override
    public double area() {
        return largo * ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
