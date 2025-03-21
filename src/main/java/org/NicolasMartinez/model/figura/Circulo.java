package org.NicolasMartinez.model.figura;
import org.NicolasMartinez.util.ReadUtil;
import org.NicolasMartinez.vista.Menu;
import org.NicolasMartinez.model.figura.Figura;
public class Circulo extends Figura{
    private double radio;
    public Circulo() {
    }
    public Circulo(double radio){
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public void leeDatos() {
        Menu.leeRadio();
        radio = ReadUtil.readDouble();
    }
    @Override
    public double area() {
        return radio*radio*3.1416;
    }
    @Override
    public double perimetro() {
        return 2*radio*3.1416;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mCirculo: \u001B[0m" + "\n\t" + "\u001B[34mRadio = " + radio
                + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " +perimetro() + "\u001B[0m"  ;
    }
}
