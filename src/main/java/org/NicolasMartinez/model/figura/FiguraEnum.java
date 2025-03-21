package org.NicolasMartinez.model.figura;
public enum FiguraEnum
{
    CUADRADO(1),
    EQUILATERO(2),
    ISOSCELES(3),
    ESCALENO(4),
    CIRCULO(5),
    RECTANGULO(6),
    ROMBO(7),
    ROMBOIDE(8),
    TRAPECIO(9),
    SALIR(10),
    OPCION_ERRONEA( 11 );
    private Integer tipo;
    FiguraEnum(int tipo)    {
        this.tipo = tipo;
    }
    public Integer getTipo()    {
        return tipo;
    }
    public static FiguraEnum getFiguraEnumById( int id )
    {
        switch( id )
        {
            case 1:
                return CUADRADO;
            case 2:
                return EQUILATERO;
            case 3:
                return ISOSCELES;
            case 4:
                return ESCALENO;
            case 5:
                return CIRCULO;
            case 6:
                return RECTANGULO;
            case 7:
                return ROMBO;
            case 8:
                return ROMBOIDE;
            case 9:
                return TRAPECIO;
            case 10:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }
}
