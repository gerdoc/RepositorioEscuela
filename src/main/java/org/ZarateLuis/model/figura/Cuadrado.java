package org.ZarateLuis.model.figura;
import org.gerdoc.model.figura1.Figura;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;
public class Cuadrado extends Figura
{
    private double lado;
    public Cuadrado()
    {
    }
    public Cuadrado(double lado)
    {
        this.lado = lado;
    }
    @Override
    public double area()
    {
        return lado*lado;
    }
    @Override
    public double perimetro()
    {
        return lado*4;
    }
    @Override
    public void leeDatos()
    {
        Menu.leeLado( );
        lado = ReadUtil.readInt( );
    }
    public double getLado()
    {
        return lado;
    }
    public void setLado(double lado)
    {
        this.lado = lado;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mCuadrado: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro()
                + "\u001B[0m";
    }
}