package org.NicolasMartinez.model.figura.figura2;
import org.NicolasMartinez.util.ReadUtil;
import org.NicolasMartinez.vista.Menu;
public class Escaleno extends Isosceles
{
    private double lado3;
    public Escaleno( )
    {
    }
    public Escaleno(double base, double altura, double lado1, double lado2, double lado3)
    {
        super(base, altura, lado1, lado2);
        this.lado3 = lado3;
    }
    public double getLado3()
    {
        return lado3;
    }
    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }
    @Override
    public double perimetro()
    {
        return lado1+lado2+lado3;
    }
    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado3( );
        lado3 = ReadUtil.readDouble( );
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mTriangulo Escaleno: \u001B[0m" + "\n\t" + "\u001B[34mLado A = " + lado1 + "\n\t" + "Lado B = " + lado2
                + "\n\t" + "Lado C = " + lado3 + "\n\t" + " Base = " + lado1 + "\n\t" + "Altura = "+ altura
                + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro() + "\u001B[0m";
    }
}
