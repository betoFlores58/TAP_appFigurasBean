/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2019    HORA: 17-18 HRS
:*
:*                            Clase PrismaRectangular
:*        
:*  Archivo     : TAP2019bLib
:*  Autor       : Juan Gerardo García Valenzuela
:*  Fecha       : 11/Oct/2019
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Obtiene información de un Prisma Rectangular.
:*  Ultima modif: 
:*  Fecha           Modific�             Motivo
:*========================================================================================== 
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.prismas;
import mx.edu.itl.figuras.Rectangulo;

/**
 *
 * @author geras
 */
public class PrismaRectangular extends Prisma{
//------------------------------------------------------------------------------------------
//Declaración de atributos. ================================================================
    double l, a, h;
    Rectangulo baseInf, baseSup, cuerpo;
//------------------------------------------------------------------------------------------
//Constructores de la clase: defalut y parametrizado.=======================================
    public PrismaRectangular(){
        l = 0;
        a = 0;
        h = 0;
    }
    public PrismaRectangular(double l, double a, double h){
        this.l = l;
        this.a = a;
        this.h = h;
        baseInf = new Rectangulo(l, a);
        baseSup = new Rectangulo(l, a);
        cuerpo = new Rectangulo(h, baseInf.perimetro());
    }
//------------------------------------------------------------------------------------------
//Método que obtiene el área de la base de un prisma rectangular mediante un método de la ==
// clase Rectángulo. =======================================================================
    @Override
    public double areaBase() {
        return baseInf.area();
    }
//------------------------------------------------------------------------------------------
//Método que obtiene el área del cuerpo de un prisma rectangular mediante un método de la ==
// clase Rectángulo. =======================================================================
    @Override
    public double areaLateral() {
        return cuerpo.area();
    }
//------------------------------------------------------------------------------------------
//Método que obtiene el área total de un prisma rectangular sumando el área de sus bases y =
// la del cuerpo. ==========================================================================
    @Override
    public double areaTotal() {
        return baseInf.area() + baseSup.area() + cuerpo.area();
    }
//------------------------------------------------------------------------------------------
//Método para obtener el volumen de un prisma rectangular con la fórmula: ==================
// largo * ancho * altura ==================================================================
    @Override
    public double volumen() {
        return baseInf.area() * h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
        comp();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        comp();
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
        comp();
    }

    public Rectangulo getBaseInf() {
        return baseInf;
    }

    public void setBaseInf(Rectangulo baseInf) {
        this.baseInf = baseInf;
    }

    public Rectangulo getBaseSup() {
        return baseSup;
    }

    public void setBaseSup(Rectangulo baseSup) {
        this.baseSup = baseSup;
    }

    public Rectangulo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Rectangulo cuerpo) {
        this.cuerpo = cuerpo;
    }
    public void comp(){
        baseInf = new Rectangulo( l, a );
        baseSup = new Rectangulo( l, a );
        cuerpo  = new Rectangulo( h, baseInf.perimetro() );
    }
}