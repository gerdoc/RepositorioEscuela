package org.gerdoc.model.figura1;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;
public class Rectangulo extends Cuadrado
{
    public Rectangulo() { }
    protected double alturaA;
    public Rectangulo(double ladoA, double alturaA)
    {
        super(ladoA);
        this.alturaA = alturaA;
    }
    public double getAlturaA()
    {
        return alturaA;
    }
    public void setAlturaA(double altura) {this.alturaA = altura;}
    @Override
    public double area()
    {
        return super.area();
    }
    @Override
    public double perimetro()
    {
        return alturaA * ladoA;
    }
    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeAltura();
        alturaA = ReadUtil.readInt();
    }
    @Override
    public String mostrarDatosFigura() {
        return "Rectangulo:" + "\n\t" + "Base = " + ladoA + "\n\t" + "Altura = " + alturaA
                + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro();
    }
}