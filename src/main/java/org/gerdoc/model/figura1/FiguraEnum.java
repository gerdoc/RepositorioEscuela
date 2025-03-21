package org.gerdoc.model.figura1;
public enum FiguraEnum
{
    CUADRADO(1),
    EQUILATERO(2),
    ISOSCELES(3),
    ESCALENO(4),
    SALIR(5),
    OPCION_ERRONEA( 6 );
    private Integer tipo;
    FiguraEnum(int tipo)    {
        this.tipo = (Integer) tipo;
    }
    public Integer getTipo()    {
        return tipo;
    }
    public static FiguraEnum getFiguraEnumById( int id )    {
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
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }
}
