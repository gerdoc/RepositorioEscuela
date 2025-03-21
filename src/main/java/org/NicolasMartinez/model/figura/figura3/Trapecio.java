package org.NicolasMartinez.model.figura.figura3;
import org.NicolasMartinez.model.figura.Cuadrado;
import org.NicolasMartinez.util.ReadUtil;
import org.NicolasMartinez.vista.Menu;
public class Trapecio extends Cuadrado {
    private double baseMenor;
    private double baseMayor;
    private double altura;
    public Trapecio() {
    }
    public Trapecio(double lado, double baseMenor, double baseMayor, double altura) {
        super(lado);
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
    }
    public double getBaseMenor() {
        return baseMenor;
    }
    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }
    public double getBaseMayor() {
        return baseMayor;
    }
    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double area() {
        return ((baseMayor+baseMenor)*altura)/2;
    }
    @Override
    public double perimetro() {
        return baseMenor+baseMayor+(lado1*2);
    }
    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeBaseMenor();
        baseMenor = ReadUtil.readDouble();
        Menu.leerBaseMayor();
        baseMayor = ReadUtil.readDouble();
        Menu.leeAltura();
        altura = ReadUtil.readDouble();
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mTrapecio: \u001B[0m" + "\n\t" + "\u001B[34mBase Mayor = " + baseMayor + "\n\t" + "Base Menor = " + baseMenor
                + "\n\t" + "Altura = " + altura + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro() + "\u001B[0m";
    }
}
