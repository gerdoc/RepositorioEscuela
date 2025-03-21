package org.gerdoc.model.figura2;
import org.gerdoc.model.figura1.Equilatero;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;
public class Isosceles extends Equilatero {
    protected double lado2;
    public Isosceles() {}
    public Isosceles(double base, double altura, double lado1, double lado2)    {
        super(base, altura, lado1);
        this.lado2 = lado2;
    }
    public double getLado2() {return lado2;}
    public void setLado2(double lado2) {this.lado2 = lado2;}
    @Override
    public double perimetro()
    {
        return 2*lado1+ lado2;
    }
    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeLado2( );
        lado2 = ReadUtil.readInt( );
    }
    public String mostrarDatosFigura() {
        return "\u001B[31mTriangulo Escaleno: \u001B[0m" + "\n\t" + "\u001B[34mLados iguales = " + lado1 + "\n\t" + "Lado desigual = " + lado2
                + "\n\t" + " Base = " + lado1 + "\n\t" + "Altura = "+ altura
                + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro() + "\u001B[0m";
    }
}