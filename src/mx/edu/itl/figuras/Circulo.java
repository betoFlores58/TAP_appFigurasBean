/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2019    HORA: 17-18 HRS
:*
:*                              Clase Círculo
:*        
:*  Archivo     : TAP2019bLib
:*  Autor       : Juan Gerardo García Valenzuela
:*  Fecha       : 11/Oct/2019
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Obtiene información de un circulo.
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
public class Circulo extends Figura {
//------------------------------------------------------------------------------------------
//Declaración de atributos.=================================================================

    private double radio;
//------------------------------------------------------------------------------------------
//Constructores de la clase: defalut y parametrizado.=======================================

    public Circulo() {
        radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
//------------------------------------------------------------------------------------------
//Método para la obtención del diámetro del círculo, con la fórmula: =======================
// radio * 2 ===============================================================================

    public double diametro() {
        return radio * 2;
    }
//------------------------------------------------------------------------------------------
//Método para obtener la circunferencia del círculo, con la fórmula: =======================
// PI * diámetro ===========================================================================

    public double circunferencia() {
        return Math.PI * diametro();
    }
//------------------------------------------------------------------------------------------
//Método que obtiene el perímetro de un círculo, con el llamado al método circunferencia() =

    @Override
    public double perimetro() {  
        return diametro();
    }
//------------------------------------------------------------------------------------------
//Método para obtener el área del círculo, con la fórmula: =================================
// PI(r^2) =================================================================================

    @Override
    public double area() {
        return Math.PI * (Math.pow(radio, 2));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
