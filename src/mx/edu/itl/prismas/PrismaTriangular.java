/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2019    HORA: 17-18 HRS
:*
:*                           Clase Prisma Triangular.
:*        
:*  Archivo     : TAP2019bLib
:*  Autor       : Juan Gerardo García Valenzuela
:*  Fecha       : 11/Oct/2019
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Obtiene información de un Prisma Triangular.
:*  Ultima modif: 
:*  Fecha           Modific�             Motivo
:*========================================================================================== 
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.prismas;
import mx.edu.itl.figuras.Rectangulo;
import mx.edu.itl.figuras.TrianguloRect;

/**
 *
 * @author geras
 */
public class PrismaTriangular extends Prisma{
//------------------------------------------------------------------------------------------
//Declaración de atributos. ================================================================
    double c1, c2, h;
    TrianguloRect baseInf, baseSup;
    Rectangulo cuerpo;
//------------------------------------------------------------------------------------------
//Constructores de la clase: defalut y parametrizado.=======================================
    public PrismaTriangular(){
        c1 = 0;
        c2 = 0;
        h = 0;
    }
    public PrismaTriangular(double c1, double c2, double h){
        this.c1 = c1;
        this.c2 = c2;
        this.h = h;
        baseInf = new TrianguloRect(c1, c2);
        baseSup = new TrianguloRect(c1, c2);
        cuerpo = new Rectangulo(h, baseInf.perimetro());
    }
//------------------------------------------------------------------------------------------
//Método que obtiene el área de la base de un prisma triangular mediante un método de la ===
// clase triangulo. ========================================================================
    @Override
    public double areaBase() {
        return baseInf.area();
    }
//------------------------------------------------------------------------------------------
//Método que obtiene el área del cuerpo de un prisma triangular mediante un método de la ===
// clase triangulo. ========================================================================
    @Override
    public double areaLateral() {
        return cuerpo.area();
    }
//------------------------------------------------------------------------------------------
//Método que obtiene el área total de un prisma triangular sumando el área de sus bases y ==
// la del cuerpo. ==========================================================================
    @Override
    public double areaTotal() {
        return baseInf.area() + baseSup.area() + cuerpo.area();
    }
//------------------------------------------------------------------------------------------
//Método para obtener el volumen de un prisma triangular con la fórmula: ===================
// ((cateto1 * cateto2) / 2) * altura ==================================================================
    @Override
    public double volumen() {
        return baseInf.area() * h;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
        comp();
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
        comp();
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
        comp();
    }

    public TrianguloRect getBaseInf() {
        return baseInf;
    }

    public void setBaseInf(TrianguloRect baseInf) {
        this.baseInf = baseInf;
    }

    public TrianguloRect getBaseSup() {
        return baseSup;
    }

    public void setBaseSup(TrianguloRect baseSup) {
        this.baseSup = baseSup;
    }

    public Rectangulo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Rectangulo cuerpo) {
        this.cuerpo = cuerpo;
    }
    public void comp(){
        baseInf = new TrianguloRect(c1, c2);
        baseSup = new TrianguloRect(c1, c2);
        cuerpo = new Rectangulo(h, baseInf.perimetro());
    }
}
