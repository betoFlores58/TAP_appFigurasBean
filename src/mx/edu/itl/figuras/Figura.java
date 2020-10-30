/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2019    HORA: 17-18 HRS
:*
:*                             Clase abstracta Figura
:*        
:*  Archivo     : TAP2019bLib
:*  Autor       : Juan Gerardo García Valenzuela
:*  Fecha       : 11/Oct/2019
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Contiene la implementación de métodos compartidos entre figuras.
:*  Ultima modif: 
:*  Fecha           Modific�             Motivo
:*========================================================================================== 
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.figuras;

/**
JUnit
* Pruebas unitarias o unidades de prueba
* prueba las partes del código mas básicas
* Herram
 */
public abstract class Figura {
//Implementación del método abstracto perímetro que compartirán varias clases. =============
    public abstract double perimetro();
//Implementación del método abstracto area que compartirán varias clases. ==================
    public abstract double area();
}
