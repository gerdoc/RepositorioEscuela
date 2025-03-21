package org.gerdoc.model.figura1;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;

public class Rombo extends Figura {
    private double lado1;
    private double diagonalMayor;
    private double diagonalMenor;
    public Rombo() {}
    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    public double getDiagonalMayor() {return diagonalMayor;    }
    public void setDiagonalMayor(double diagonalMayor) {this.diagonalMayor = diagonalMayor;    }
    public double getDiagonalMenor() {return diagonalMenor;    }
    public void setDiagonalMenor(double diagonalMenor) {this.diagonalMenor = diagonalMenor;    }
    @Override
    public double perimetro() {
        return (diagonalMayor + (diagonalMenor * 2)) / 2;    }

    @Override
    public double area() {
        return (diagonalMayor * diagonalMenor) / 2;}
    @Override
    public void leeDatos() {
        Menu.leeDiagonalMayor();
        diagonalMayor = ReadUtil.readInt();
        Menu.leeDiagonalMenor();
        diagonalMenor = ReadUtil.readInt();
    }
    @Override
    public String mostrarDatosFigura() {
        return "Rombo:" + "\n\t" + "Diagonal Mayor = "
                + diagonalMayor + "\n\t" + "Diagonal Menor = " + diagonalMenor + "\n\t" +
                "Area = " + perimetro() + "\n\t" + "Perimetro = " + perimetro() ;
    }
}