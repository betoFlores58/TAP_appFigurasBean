/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2019    HORA: 17-18 HRS
:*
:*                             Clase TrianguloRect
:*        
:*  Archivo     : TAP2019bLib
:*  Autor       : Juan Gerardo García Valenzuela
:*  Fecha       : 11/Oct/2019
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Obtiene información de un Triángulo Rectángulo.
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
public class TrianguloRect extends Figura{
//------------------------------------------------------------------------------------------
//Declaración de atributos. ================================================================
    private double c1;
    private double c2;
//------------------------------------------------------------------------------------------
//Constructores de la clase: defalut y parametrizado.=======================================
    public TrianguloRect(){
        c1 = 0;
        c2 = 0;
    }
    public TrianguloRect(double c1, double c2){
        this.c1 = c1;
        this.c2 = c2;
    }
//------------------------------------------------------------------------------------------
//Método que calcula la hipotenusa un triángulo, con la fórmula: ===========================
// ((cateto1^2) + (cateto2^2))^(1 / 2) =====================================================
    public double hipotenusa(){
        return Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
    }
//------------------------------------------------------------------------------------------
//Método que calcula el perímetro de un triángulo, con la fórmula: =========================
// cateto1 + cateto2 + hipotenusa ==========================================================
    @Override
    public double perimetro() {
        return c1 + c2 + hipotenusa();
    }
//------------------------------------------------------------------------------------------
//Método que calcula el área de un rectángulo, con la fórmula: =============================
// (cateto1 + cateto2) / 2 =================================================================
    @Override
    public double area() {
        return (c1 * c2) / 2;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }
}
