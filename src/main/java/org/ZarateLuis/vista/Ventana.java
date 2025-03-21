package org.ZarateLuis.vista;

import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura1.Cuadrado;
import org.gerdoc.model.figura1.Figura;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Ejecutable;

import javax.swing.*;
public class Ventana extends JFrame implements Ejecutable
{
    private static Ventana ventana;
    private Historiales historiales;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private JLabel resultadoLabel;
    private Figura figura;
    private Ventana( )
    {
        super( "Programa de figuras" );
        init( );
    }
    private void init()
    {
        jLabel = new JLabel( "Dame un lado" );
        jLabel.setBounds( 10, 20, 100, 20);
        jTextField = new JTextField( );
        jTextField.setBounds( 120, 10, 100, 20);
        jButton = new JButton( "Calcular" );
        jButton.setBounds( 10, 40, 100, 20);
        resultadoLabel = new JLabel("Área y Perímetro");
        resultadoLabel.setBounds(10, 70, 300, 20);
        getContentPane().setLayout( null );
        getContentPane().add( jLabel );
        getContentPane().add( jTextField );
        getContentPane().add( jButton );
        getContentPane().add(resultadoLabel);

        jButton.addActionListener( (event) ->
                {
            figura = new Cuadrado( );
            ((Cuadrado)figura).setLado(ReadUtil.string2Integer( jTextField.getText( ) ) );
                    double area = figura.area();
                    double perimetro = figura.perimetro();
                    resultadoLabel.setText("Área: " + area + " Perímetro: " + perimetro);
                }
        );
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
    public void addHistoriales(Historiales historiales)
    {
        this.historiales = historiales;
    }
}