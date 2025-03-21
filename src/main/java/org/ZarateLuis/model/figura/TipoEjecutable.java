package org.ZarateLuis.model.figura;
import org.ZarateLuis.vista.Consola;
import org.ZarateLuis.vista.Ventana;
import org.gerdoc.vista.Ejecutable;

public enum TipoEjecutable
{
    CONSOLA( 1, (Ejecutable) Consola.getInstance()),
    VENTANA( 2, (Ejecutable) Ventana.getInstance()),
    CONSOLAVANESA( 3, (Ejecutable) org.ZarateLuis.vista.Consola.getInstance()),
    VENTANAVANESA( 4, (Ejecutable) Ventana.getInstance()),
    CONSOLACRISTO( 5, (Ejecutable) org.NicolasMartinez.vista.Consola.getInstance()),
    VENTANACRISTO( 6, (Ejecutable) org.NicolasMartinez.vista.Ventana.getInstance()),
    SALIR( 8, null ),
    OPCION_ERRONEA( 9, null ),
    HISTORIAL(7, null );
    private Integer id;
    private Ejecutable ejecutable;
    TipoEjecutable(int id, Ejecutable ejecutable)
    {
        this.id = Integer.valueOf(id);
        this.ejecutable = ejecutable;
    }
    public Integer getId()
    {
        return id;
    }
    public static TipoEjecutable getTipoEjecutableById( int opcion )
    {
        switch( opcion )
        {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return CONSOLAVANESA;
            case 4:
                return VENTANAVANESA;
            case 5:
                return CONSOLACRISTO;
            case 6:
                return VENTANACRISTO;
            case 7:
                return HISTORIAL;
            case 8:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }
    public Ejecutable getEjecutable()
    {
        return ejecutable;
    }
}
