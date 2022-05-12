package ico.fes.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Eduardo Salazar
 */
public class VentanaSwing extends JFrame{

    private JTextField cuadro;
    private JButton botón;
    private JLabel resultado;
    
    public VentanaSwing() throws HeadlessException {
        setTitle("Conversión de grados ºC a ºF");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        ImageIcon icono = new ImageIcon( System.getProperty("user.dir") + "\\src\\ico\\fes\\swing\\prosuna.png");
        botón = new JButton(icono);
        botón.setBackground(Color.GREEN);
        botón.setOpaque(true);
        botón.setToolTipText("Clic para convertir en ºF");
        resultado = new JLabel("ºF");
        this.getContentPane().add(cuadro);
        this.getContentPane().add(botón);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        this.botón.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float fahren = 0.0f;
                float celsius = 0.0f;
                try {    
                    celsius = Float.parseFloat(cuadro.getText());
                    fahren = (celsius * (9.0f/5.0f)) + 32.0f;
                    resultado.setText(fahren + " ºF");
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor valido", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
        });
        
    }
    
    
}
