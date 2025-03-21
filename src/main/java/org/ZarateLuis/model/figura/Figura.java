package org.ZarateLuis.model.figura1;

import org.gerdoc.vista.SolicitaDatos;

public abstract class Figura extends org.NicolasMartinez.model.figura.Figura implements SolicitaDatos {
    public Figura()    {}
    public abstract double area( );
    public abstract double perimetro();
}