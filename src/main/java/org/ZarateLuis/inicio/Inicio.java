package org.ZarateLuis.inicio;
import org.gerdoc.historial.Historia;
import org.gerdoc.historial.Historiales;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Menu;
import org.gerdoc.vista.Ventana;
public class Inicio
{
    public Inicio()
    {
    }
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while( flag )
        {
            Menu.principal2( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            switch ( opcion )
            {
                case 1:
                    ejecutable = Consola.getInstance( );
                    break;
                case 2:
                    ejecutable = Ventana.getInstance( );
                    break;
                case 3:
                    ejecutable = (Ejecutable) org.ZarateLuis.vista.Consola.getInstance();
                    break;
                case 4:
                    ejecutable = (Ejecutable) org.ZarateLuis.vista.Ventana.getInstance();
                    break;
                case 5:
                    ejecutable = (Ejecutable) org.NicolasMartinez.vista.Consola.getInstance();
                    break;
                case 6:
                    ejecutable = (Ejecutable) org.NicolasMartinez.vista.Ventana.getInstance();
                    break;
                case 7:
                    ejecutable = (Ejecutable) Historia.getInstance();
                    break;
                case 8:
                    flag = false;
                    ejecutable = null;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.run( );
            }
        }
    }
}