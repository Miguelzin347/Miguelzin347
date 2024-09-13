package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.TextField;
import javax.swing.JToolBar;
import java.awt.Toolkit;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class CriandoTela {

	private JFrame frame;
	private JTextField textField_1;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriandoTela window = new CriandoTela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CriandoTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Desktop\\image-removebg-preview.ico"));
		frame.setBounds(100, 100, 411, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(18, 96, 86, 22);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(18, 157, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrDigiteAHora = new JTextArea();
		txtrDigiteAHora.setText("Sua hora de dormir HH:MM");
		txtrDigiteAHora.setBounds(18, 58, 197, 22);
		frame.getContentPane().add(txtrDigiteAHora);
		
		JTextArea txtrDigiteAHora_1 = new JTextArea();
		txtrDigiteAHora_1.setText("Sua hora de acordar HH:MM");
		txtrDigiteAHora_1.setBounds(18, 124, 205, 22);
		frame.getContentPane().add(txtrDigiteAHora_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Alarme Ideal");
		chckbxNewCheckBox.setBounds(18, 195, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton Botao_agenda = new JButton("Agenda");
		Botao_agenda.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(Botao_agenda);
		
		JButton Botao_sabermais = new JButton("Saiba Mais");
		Botao_sabermais.setBounds(88, 0, 89, 23);
		frame.getContentPane().add(Botao_sabermais);
		
		JButton botao_sobre_sono = new JButton("Sobre o tempo de sono");
		botao_sobre_sono.setBounds(172, 0, 89, 23);
		frame.getContentPane().add(botao_sobre_sono);
		
		JButton btnNewButton = new JButton("Logar");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(250, 0, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
