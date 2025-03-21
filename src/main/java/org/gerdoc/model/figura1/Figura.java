package org.gerdoc.model.figura1;
import org.gerdoc.vista.SolicitaDatos;
public abstract class Figura implements SolicitaDatos{
    public Figura()    {}
    public abstract double area( );
    public abstract double perimetro();
    public abstract String mostrarDatosFigura();
}