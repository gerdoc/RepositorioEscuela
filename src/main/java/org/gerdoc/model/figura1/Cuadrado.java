package org.gerdoc.model.figura1;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;
public class Cuadrado extends Figura
{
    protected double ladoA;
    public Cuadrado()    {    }
    public Cuadrado(double lado)
    {
        this.ladoA = ladoA;
    }
    public double getLado() {
        return ladoA;
    }
    public void setLado(double lado) {
        this.ladoA = ladoA;
    }
    @Override
    public double area()
    {
        return ladoA*ladoA;
    }
    @Override
    public double perimetro()
    {
        return ladoA*4;
    }
    @Override
    public void leeDatos()    {
        Menu.leeLado1( );
        ladoA = ReadUtil.readInt( );
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mCuadrado: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + ladoA + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro()
        + "\u001B[0m";
    }
}