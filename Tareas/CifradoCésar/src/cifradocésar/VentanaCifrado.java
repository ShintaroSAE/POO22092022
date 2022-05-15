package cifradocésar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Eduardo Salazar
 */
public class VentanaCifrado extends JFrame{
    JTextField texto;
    JTextField numero;
    JLabel salida;
    JButton boton;
    String cs = "abcdefghijklmnñopqrstuvwxyz";
    public VentanaCifrado() throws HeadlessException {
        setTitle("Cifrado César");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        texto = new JTextField(20);
        numero = new JTextField(5);
        boton = new JButton("Cifre su texto");
        salida = new JLabel();
        texto.setToolTipText("Ingrese el texto a cifrar");
        numero.setToolTipText("Letras a desplazar");
        this.getContentPane().add(texto);
        this.getContentPane().add(numero);
        this.getContentPane().add(boton);
        this.getContentPane().add(salida);
        this.validate();
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String textoCifrado = "";
                String textoCifrar = texto.getText();
                String despla = numero.getText();
                int num = Integer.parseInt(despla);
                char caracter;
                try {
                    textoCifrar = textoCifrar.toLowerCase();
                    for(int i = 0; i < textoCifrar.length(); i++){
                    caracter = textoCifrar.charAt(i);
                    int pos = cs.indexOf(caracter);
                    if(pos == -1){
                        textoCifrado += caracter;
                    }else{
                        textoCifrado += cs.charAt((pos + num )% cs.length());
                    }
                }
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            salida.setText(textoCifrado);
            }
            
        });
    }
    
}
