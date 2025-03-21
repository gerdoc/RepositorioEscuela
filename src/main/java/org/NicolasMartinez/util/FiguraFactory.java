package org.NicolasMartinez.util;
import org.NicolasMartinez.model.figura.*;
import org.NicolasMartinez.model.figura.figura2.Escaleno;
import org.NicolasMartinez.model.figura.figura3.Rectangulo;
import org.NicolasMartinez.model.figura.figura3.Romboide;
import org.NicolasMartinez.model.figura.figura3.Trapecio;
import org.NicolasMartinez.model.figura.figura2.Isosceles;
public class FiguraFactory
{
    public static Figura getFiguraByFiguraEnum(FiguraEnum figuraEnum )
    {
        switch (figuraEnum)
        {
            case CUADRADO:
                return new Cuadrado();
            case EQUILATERO:
                return new Equilatero( );
            case ISOSCELES:
                return new Isosceles( );
            case ESCALENO:
                return new Escaleno( );
            case CIRCULO:
                return new Circulo( );
            case RECTANGULO:
                return new Rectangulo( );
            case ROMBO:
                return new Rombo( );
            case ROMBOIDE:
                return new Romboide( );
            case TRAPECIO:
                return new Trapecio( );
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}
