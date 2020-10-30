/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itl.beans;

/**
 *
 * @author geras
 */
public interface IPrismaTriangular {
    public double areaBase();
    public double areaLateral();
    public double areaTotal();
    public double volumen();
    public double getC1();
    public double getC2();
    public double getH();
    public void   setC1( double C1 );
    public void   setC2( double C2 );
    public void   setH ( double H );
}
