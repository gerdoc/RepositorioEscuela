package org.NicolasMartinez.model.figura;

import org.gerdoc.vista.SolicitaDatos;

public abstract class Figura extends org.gerdoc.model.figura1.Figura implements SolicitaDatos {
        public Figura(){}
        public abstract double area( );
        public abstract double perimetro();
}
