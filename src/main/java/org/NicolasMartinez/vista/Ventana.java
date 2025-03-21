package org.NicolasMartinez.vista;

import org.NicolasMartinez.model.figura.Cuadrado;
import org.NicolasMartinez.model.figura.Figura;
import org.NicolasMartinez.util.ReadUtil;
import org.gerdoc.historial.Historiales;
import org.gerdoc.vista.Ejecutable;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable
{
    private static Ventana ventana;
    private Historiales historiales;
    private JLabel jLabel;
    private JLabel menuLabel;
    private JLabel opc1Label;
    private JLabel opc2Label;
    private JLabel opc3Label;
    private JLabel opc4Label;
    private JLabel opc5Label;
    private JLabel opc6Label;
    private JLabel opc7Label;
    private JLabel opc8Label;
    private JLabel opc9Label;
    private JLabel areaLabel;
    private JLabel perimetroLabel;
    private JTextField jTextField;
    private JTextField jTextField2;
    private JButton jButton;
    private JButton jButton2;
    private Figura figura;
    private int opcion = 0;
    private Ventana( )
    {
        super( "Programa de figuras" );
        init( );
    }
    private void init() {
        opc1Label = new JLabel("1.- Cuadrado");
        opc1Label.setBounds(5,10,150,20);
        opc2Label = new JLabel("2.- Circulo");
        opc2Label.setBounds(5,30,150,20);
        opc3Label = new JLabel("3.- Equilatero");
        opc3Label.setBounds(5,50,150,20);
        opc4Label = new JLabel("4.- Isosceles");
        opc4Label.setBounds(5,70,150,20);
        opc5Label = new JLabel("5.- Escaleno");
        opc5Label.setBounds(5,90,150,20);
        opc6Label = new JLabel("6.- Rectangulo");
        opc6Label.setBounds(5,110,150,20);
        opc7Label = new JLabel("7.- Romboide");
        opc7Label.setBounds(5,130,150,20);
        opc8Label = new JLabel("8.- Trapecio");
        opc8Label.setBounds(5,150,150,20);
        opc9Label = new JLabel("9.- Salir");
        opc9Label.setBounds(5,170,150,20);
        menuLabel = new JLabel("Selecciona la opcion");
        menuLabel.setBounds(5,190,150,20);
        jTextField2 = new JTextField();
        jTextField2.setBounds(125,192,100,20);
        jButton2 = new JButton("Enviar");
        jButton2.setBounds(5,215,100,20);
        getContentPane().setLayout(null);
        getContentPane().add(menuLabel);
        getContentPane().add(opc1Label);
        getContentPane().add(opc2Label);
        getContentPane().add(opc3Label);
        getContentPane().add(opc4Label);
        getContentPane().add(opc5Label);
        getContentPane().add(opc6Label);
        getContentPane().add(opc7Label);
        getContentPane().add(opc8Label);
        getContentPane().add(opc9Label);
        getContentPane().add(jTextField2);
        getContentPane().add(jButton2);
        jButton2.addActionListener((event) -> {
            opcion = ReadUtil.string2Integer(jTextField2.getText());
            System.out.println(opcion);
            mostrar();
        });
    }
    public void mostrar(){
        switch (opcion){
            case 1:
                jLabel = new JLabel("Dame el lado  del cuadrado");
                jLabel.setBounds(5, 240, 200, 20);
                jTextField = new JTextField();
                jTextField.setBounds(120, 260, 100, 20);
                jButton = new JButton("Calcular");
                jButton.setBounds(10, 280, 100, 20);
                areaLabel = new JLabel("Área:");
                areaLabel.setBounds(10, 300, 100, 20);
                perimetroLabel = new JLabel("Perímetro:");
                perimetroLabel.setBounds(10, 320, 100, 20);
                getContentPane().add(jTextField);
                getContentPane().add(jButton);
                getContentPane().add(areaLabel);
                getContentPane().add(perimetroLabel);
                getContentPane().add(jLabel);
                jButton.addActionListener((event) -> {
                    figura = new Cuadrado();
                    ((Cuadrado) figura).setLado1(ReadUtil.string2Double(jTextField.getText()));
                    areaLabel.setText("Área: " + figura.area());
                    perimetroLabel.setText("Perímetro: " + figura.perimetro());
                    historiales.addFigura( figura );
                });
                break;
            case 2:
                jLabel = new JLabel("Dame el lado  del Triangulo Equilatero");
                jLabel.setBounds(5, 240, 200, 20);
                jTextField = new JTextField();
                jTextField.setBounds(120, 260, 100, 20);
                jButton = new JButton("Calcular");
                jButton.setBounds(10, 280, 100, 20);
                areaLabel = new JLabel("Área:");
                areaLabel.setBounds(10, 300, 100, 20);
                perimetroLabel = new JLabel("Perímetro:");
                perimetroLabel.setBounds(10, 320, 100, 20);
                getContentPane().add(jTextField);
                getContentPane().add(jButton);
                getContentPane().add(areaLabel);
                getContentPane().add(perimetroLabel);
                getContentPane().add(jLabel);
                jButton.addActionListener((event) -> {
                    figura = new Cuadrado();
                    ((Cuadrado) figura).setLado1(ReadUtil.string2Double(jTextField.getText()));
                    areaLabel.setText("Área: " + figura.area());
                    perimetroLabel.setText("Perímetro: " + figura.perimetro());
                    historiales.addFigura( figura );
                });
                break;
            case 3:
                jLabel = new JLabel("Dame el lado  del cuadrado");
                jLabel.setBounds(5, 240, 200, 20);
                jTextField = new JTextField();
                jTextField.setBounds(120, 260, 100, 20);
                jButton = new JButton("Calcular");
                jButton.setBounds(10, 280, 100, 20);
                areaLabel = new JLabel("Área:");
                areaLabel.setBounds(10, 300, 100, 20);
                perimetroLabel = new JLabel("Perímetro:");
                perimetroLabel.setBounds(10, 320, 100, 20);
                getContentPane().add(jTextField);
                getContentPane().add(jButton);
                getContentPane().add(areaLabel);
                getContentPane().add(perimetroLabel);
                getContentPane().add(jLabel);
                jButton.addActionListener((event) -> {
                    figura = new Cuadrado();
                    ((Cuadrado) figura).setLado1(ReadUtil.string2Double(jTextField.getText()));
                    areaLabel.setText("Área: " + figura.area());
                    perimetroLabel.setText("Perímetro: " + figura.perimetro());
                    historiales.addFigura( figura );
                });
                break;
            case 4:
                jLabel = new JLabel("Dame el lado  del cuadrado");
                jLabel.setBounds(5, 240, 200, 20);
                jTextField = new JTextField();
                jTextField.setBounds(120, 260, 100, 20);
                jButton = new JButton("Calcular");
                jButton.setBounds(10, 280, 100, 20);
                areaLabel = new JLabel("Área:");
                areaLabel.setBounds(10, 300, 100, 20);
                perimetroLabel = new JLabel("Perímetro:");
                perimetroLabel.setBounds(10, 320, 100, 20);
                getContentPane().add(jTextField);
                getContentPane().add(jButton);
                getContentPane().add(areaLabel);
                getContentPane().add(perimetroLabel);
                getContentPane().add(jLabel);
                jButton.addActionListener((event) -> {
                    figura = new Cuadrado();
                    ((Cuadrado) figura).setLado1(ReadUtil.string2Double(jTextField.getText()));
                    areaLabel.setText("Área: " + figura.area());
                    perimetroLabel.setText("Perímetro: " + figura.perimetro());
                    historiales.addFigura( figura );
                });
                break;
            case 5:
                jLabel = new JLabel("Dame el lado  del cuadrado");
                jLabel.setBounds(5, 240, 200, 20);
                jTextField = new JTextField();
                jTextField.setBounds(120, 260, 100, 20);
                jButton = new JButton("Calcular");
                jButton.setBounds(10, 280, 100, 20);
                areaLabel = new JLabel("Área:");
                areaLabel.setBounds(10, 300, 100, 20);
                perimetroLabel = new JLabel("Perímetro:");
                perimetroLabel.setBounds(10, 320, 100, 20);
                getContentPane().add(jTextField);
                getContentPane().add(jButton);
                getContentPane().add(areaLabel);
                getContentPane().add(perimetroLabel);
                getContentPane().add(jLabel);
                jButton.addActionListener((event) -> {
                    figura = new Cuadrado();
                    ((Cuadrado) figura).setLado1(ReadUtil.string2Double(jTextField.getText()));
                    areaLabel.setText("Área: " + figura.area());
                    perimetroLabel.setText("Perímetro: " + figura.perimetro());
                });
                break;
            case 6:
                jLabel = new JLabel("Dame el lado  del cuadrado");
                jLabel.setBounds(5, 240, 200, 20);
                jTextField = new JTextField();
                jTextField.setBounds(120, 260, 100, 20);
                jButton = new JButton("Calcular");
                jButton.setBounds(10, 280, 100, 20);
                areaLabel = new JLabel("Área:");
                areaLabel.setBounds(10, 300, 100, 20);
                perimetroLabel = new JLabel("Perímetro:");
                perimetroLabel.setBounds(10, 320, 100, 20);
                getContentPane().add(jTextField);
                getContentPane().add(jButton);
                getContentPane().add(areaLabel);
                getContentPane().add(perimetroLabel);
                getContentPane().add(jLabel);
                jButton.addActionListener((event) -> {
                    figura = new Cuadrado();
                    ((Cuadrado) figura).setLado1(ReadUtil.string2Double(jTextField.getText()));
                    areaLabel.setText("Área: " + figura.area());
                    perimetroLabel.setText("Perímetro: " + figura.perimetro());
                    historiales.addFigura( figura );
                });
                break;
            case 7:
                jLabel = new JLabel("Dame el lado  del cuadrado");
                jLabel.setBounds(5, 240, 200, 20);
                jTextField = new JTextField();
                jTextField.setBounds(120, 260, 100, 20);
                jButton = new JButton("Calcular");
                jButton.setBounds(10, 280, 100, 20);
                areaLabel = new JLabel("Área:");
                areaLabel.setBounds(10, 300, 100, 20);
                perimetroLabel = new JLabel("Perímetro:");
                perimetroLabel.setBounds(10, 320, 100, 20);
                getContentPane().add(jTextField);
                getContentPane().add(jButton);
                getContentPane().add(areaLabel);
                getContentPane().add(perimetroLabel);
                getContentPane().add(jLabel);
                jButton.addActionListener((event) -> {
                    figura = new Cuadrado();
                    ((Cuadrado) figura).setLado1(ReadUtil.string2Double(jTextField.getText()));
                    areaLabel.setText("Área: " + figura.area());
                    perimetroLabel.setText("Perímetro: " + figura.perimetro());
                    historiales.addFigura( figura );
                });
                break;
            case 8:
                jLabel = new JLabel("Dame el lado  del cuadrado");
                jLabel.setBounds(5, 240, 200, 20);
                jTextField = new JTextField();
                jTextField.setBounds(120, 260, 100, 20);
                jButton = new JButton("Calcular");
                jButton.setBounds(10, 280, 100, 20);
                areaLabel = new JLabel("Área:");
                areaLabel.setBounds(10, 300, 100, 20);
                perimetroLabel = new JLabel("Perímetro:");
                perimetroLabel.setBounds(10, 320, 100, 20);
                getContentPane().add(jTextField);
                getContentPane().add(jButton);
                getContentPane().add(areaLabel);
                getContentPane().add(perimetroLabel);
                getContentPane().add(jLabel);
                jButton.addActionListener((event) -> {
                    figura = new Cuadrado();
                    ((Cuadrado) figura).setLado1(ReadUtil.string2Double(jTextField.getText()));
                    areaLabel.setText("Área: " + figura.area());
                    perimetroLabel.setText("Perímetro: " + figura.perimetro());
                    historiales.addFigura( figura );
                });
                break;
        }
    }
    public static Ventana getInstance( )
    {
        if(ventana==null)
        {
            ventana=new Ventana();
        }
        return ventana;
    }
    @Override
    public void run()
    {
        setBounds( 100, 100, 300, 200);
        setVisible( true );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

    @Override
    public void addHistoriales(org.gerdoc.historial.Historiales historiales) {
        this.historiales = (Historiales) historiales;
    }

}
