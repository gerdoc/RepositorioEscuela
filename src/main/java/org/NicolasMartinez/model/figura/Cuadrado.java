package org.NicolasMartinez.model.figura;
import org.NicolasMartinez.util.ReadUtil;
import org.NicolasMartinez.vista.Menu;
public class Cuadrado extends Figura
{
    protected double lado1;
    public Cuadrado()
    {
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public Cuadrado(double lado)
    {
        this.lado1 = lado;
    }
    @Override
    public double area()
    {
        return lado1*lado1;
    }
    @Override
    public double perimetro()
    {
        return lado1*4;
    }
    @Override
    public void leeDatos()
    {
        Menu.leeLado( );
        lado1 = ReadUtil.readDouble( );
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mCuadrado: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro()
                + "\u001B[0m";
    }
}