package org.NicolasMartinez.model.figura.figura3;

import org.NicolasMartinez.model.figura.Cuadrado;
import org.NicolasMartinez.util.ReadUtil;
import org.NicolasMartinez.vista.Menu;

public class Rectangulo extends Cuadrado{
    protected double altura;
    public Rectangulo() {
    }
    public Rectangulo(double base, double altura) {
        super(base);
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setLado2(double altura) {
        this.altura = altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double area() {
        return lado1*altura;
    }
    @Override
    public double perimetro() {
        return 2*(lado1+altura);
    }
    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeAltura();
        altura = ReadUtil.readDouble();
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mRectangulo: \u001B[0m" + "\n\t" + "\u001B[34mBase = " + lado1 + "\n\t" + "Altura = " + altura
                + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro() +"\u001B[0m";
    }
}
