package org.gerdoc.model.figura1;

public class Romboide extends Rectangulo {
    public Romboide() {}
    public Romboide(double lado, double altura) {
        super(lado, altura);
    }
    @Override
    public double area() {
        return ladoA * alturaA;
    }
    @Override
    public double perimetro() {
        return ladoA*2 + alturaA*2;
    }
    @Override
    public void leeDatos() {
        super.leeDatos();
    }

    @Override
    public String mostrarDatosFigura() {
        return "Romboide: " + "\n\t" + "Lados = " + ladoA + "\n\t" + "Altura = " + alturaA
                + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro();
    }
}