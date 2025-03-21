package org.NicolasMartinez.model.figura.figura3;

import org.NicolasMartinez.util.ReadUtil;
import org.NicolasMartinez.vista.Menu;
public class Romboide extends Rectangulo {
    private double ladosIguales;
    public Romboide() {
    }
    public Romboide(double ladosI, double altura, double base ) {
        super(base,altura);
        this.ladosIguales = ladosI;
    }
    public double getLadosIguales() {
        return ladosIguales;
    }
    public void setLadosIguales(double ladosIguales) {
        this.ladosIguales = ladosIguales;
    }
    @Override
    public double area() {
        return ladosIguales*altura;
    }
    @Override
    public double perimetro() {
        return (2*lado1)+(2*ladosIguales);
    }
    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeBase();
        ladosIguales = ReadUtil.readDouble();
    }
    public String mostrarDatosFigura() {
        return "\u001B[31mRomboide: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + "\n\t" + "Altura = " + altura
                + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro() + "\u001B[0m";
    }
}
