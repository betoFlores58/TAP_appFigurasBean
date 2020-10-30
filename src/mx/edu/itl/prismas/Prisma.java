/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2019    HORA: 17-18 HRS
:*
:*                      Clase Abstracta de los prismas.
:*        
:*  Archivo     : TAP2019bLib
:*  Autor       : Juan Gerardo García Valenzuela
:*  Fecha       : 11/Oct/2019
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Implementa los métodos en común de los prismas.
:*  Ultima modif: 
:*  Fecha           Modific�             Motivo
:*========================================================================================== 
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.prismas;

/**
 *
 * @author geras
 */
public abstract class Prisma {
//------------------------------------------------------------------------------------------
//Método abstracto areaBase que se implementará en distintas clases de prismas. ============
    public abstract double areaBase();
//------------------------------------------------------------------------------------------
//Método abstracto areaLateral que se implementará en distintas clases de prismas. =========
    public abstract double areaLateral();
//------------------------------------------------------------------------------------------
//Método abstracto areaTotal que se implementará en distintas clases de prismas. ===========
    public abstract double areaTotal();
//------------------------------------------------------------------------------------------
//Método abstracto volumen que se implementará en distintas clases de prismas. =============
    public abstract double volumen();
}
