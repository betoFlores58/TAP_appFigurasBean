/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itl.beans;
import mx.edu.itl.prismas.Cilindro;

/**
 *
 * @author geras
 */
public interface ICilindro{
    public double areaBase();
    public double areaLateral();
    public double areaTotal();
    public double volumen();
    public void setRadio(double radio);
    public double getRadio();
    public void setAltura ( double altura );
    public double getAltura(); 
}
