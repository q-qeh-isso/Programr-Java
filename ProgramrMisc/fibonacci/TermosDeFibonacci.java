package fibonacci;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Insets;

public class TermosDeFibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtTermo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TermosDeFibonacci frame = new TermosDeFibonacci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TermosDeFibonacci() {
		setTitle("Sequencia Numeros de Fibonacci");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 149);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTermos = new JLabel("N\u00FAmero de termos desejado:");
		lblTermos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTermos.setBounds(66, 31, 193, 14);
		contentPane.add(lblTermos);
		
		txtTermo = new JTextField();
		txtTermo.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTermo.setText("123");
		txtTermo.setBounds(273, 30, 86, 20);
		contentPane.add(txtTermo);
		txtTermo.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setMargin(new Insets(5, 14, 5, 14));
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOk.setMnemonic('o');
		btnOk.setBounds(177, 78, 89, 31);
		contentPane.add(btnOk);
	}
}
