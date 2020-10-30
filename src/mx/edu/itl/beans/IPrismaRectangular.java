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
public interface IPrismaRectangular {
    public double areaBase    ();
    public double areaLateral ();
    public double areaTotal   ();
    public double volumen     ();
    public void setLargo    ( double l );
    public void setAncho    ( double a );
    public void setAltura   ( double h );
    public double getLargo  ();
    public double getAncho  ();
    public double getAltura ();
}
