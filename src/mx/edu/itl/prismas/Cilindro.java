/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2019    HORA: 17-18 HRS
:*
:*                              Clase Cilindro
:*        
:*  Archivo     : TAP2019bLib
:*  Autor       : Juan Gerardo García Valenzuela
:*  Fecha       : 11/Oct/2019
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Obtiene información de un cilindro.
:*  Ultima modif: 
:*  Fecha           Modific�             Motivo
:*========================================================================================== 
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.prismas;
import mx.edu.itl.figuras.Circulo;
import mx.edu.itl.figuras.Rectangulo;

/**
 *
 * @author geras
 */
public class Cilindro {
//------------------------------------------------------------------------------------------
//Declaración de atributos.=================================================================
    private double radio;
    private double altura;
    private Circulo baseSup;
    private Circulo baseInf;
    private Rectangulo cuerpo;
//------------------------------------------------------------------------------------------
//Constructores de la clase: defalut y parametrizado.=======================================
    public Cilindro(){
        radio = 0;
        altura = 0;
    }
    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        baseSup = new Circulo(radio);
        baseInf = new Circulo(radio);
        cuerpo = new Rectangulo(baseSup.circunferencia(), altura);
    }
//------------------------------------------------------------------------------------------
//Método para obtener el área de una de las bases de un cilindro mediante un método de =====
//la clase Círculo. ========================================================================
    public double areaBase(){
        return baseSup.area();
    }
//------------------------------------------------------------------------------------------
//Método para obtener el área del cuerpo de un cilindro mediante un método de la clase =====
//Rectángulo. ==============================================================================
    public double areaLateral(){
        return cuerpo.area();
    }
//------------------------------------------------------------------------------------------
//Método para obtener el área total de un cilindro sumando el area de ambas bases y el =====
//cuerpo del cilindro.======================================================================
    public double areaTotal(){
        return (baseSup.area() + baseInf.area() + cuerpo.area());
    }
//------------------------------------------------------------------------------------------
//Método para obtener el volumen del cilindo con la fórmula. ===============================
//(PI(r^2)) * altura ==================================================================
    public double volumen(){
        return (baseSup.area() * altura);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        comp();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        comp();
    }

    public Circulo getBaseSup() {
        return baseSup;
    }

    public void setBaseSup(Circulo baseSup) {
        this.baseSup = baseSup;
    }

    public Circulo getBaseInf() {
        return baseInf;
    }

    public void setBaseInf(Circulo baseInf) {
        this.baseInf = baseInf;
    }

    public Rectangulo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Rectangulo cuerpo) {
        this.cuerpo = cuerpo;
    }
    public void comp(){
        baseSup = new Circulo( radio );
        baseInf = new Circulo( radio );
        cuerpo = new Rectangulo ( baseSup.circunferencia(), altura );
    }
}
