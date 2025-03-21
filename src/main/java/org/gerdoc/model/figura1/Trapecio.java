package org.gerdoc.model.figura1;

import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;
public class Trapecio extends Figura {
    public Trapecio() {}
    private double baseMayor;
    private double baseMenor;
    private double alturaB;
    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor =  baseMenor;
        this.alturaB =  altura;
    }
    public double getBaseMayor() {return baseMayor;    }
    public void setBaseMayor(double baseMayor) {this.baseMayor = baseMayor;    }
    public double getBaseMenor() {return baseMenor;    }
    public void setBaseMenor(double baseMenor) {this.baseMenor = baseMenor;    }
    public double getAltura() {return alturaB;    }
    public void setAltura(double altura) {this.alturaB = alturaB;    }
    @Override
    public double perimetro() {
        return ((baseMayor - ((baseMayor - baseMenor) / 2)) + alturaB) * 2;
    }
    @Override
    public double area() {
        return ((baseMayor + baseMenor) * alturaB) / 2;
    }
    @Override
    public void leeDatos() {
        Menu.leeBaseMayor();
        baseMayor = ReadUtil.readInt();
        Menu.leeBaseMenor();
        baseMenor = ReadUtil.readInt();
        Menu.leeAltura();
        alturaB = ReadUtil.readInt();
    }
    @Override
    public String mostrarDatosFigura() {
        return "Trapecio:" + "\n\t" + "Base Mayor = " + baseMayor + "\n\t" + "Base Menor = " + baseMenor
                + "\n\t" + "Altura = " + alturaB + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro() ;
    }
}