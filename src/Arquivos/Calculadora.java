package Arquivos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField txtEtapas;
	private JTextField txtResultado;
	
	//VARIÁVEIS PARA USARMOS AS OPERAÇÕES ARITIMÉTICAS
	Double numero1, numero2;
	String tipoOperacao = "nada";	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 445, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSete = new JButton("7");
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O SETE NO FINAL
				txtResultado.setText(txtResultado.getText() + "7");			
				
			}
		});
		btnSete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSete.setBounds(57, 113, 62, 36);
		frame.getContentPane().add(btnSete);
		
		JButton btnOito = new JButton("8");
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O OITO NO FINAL
				txtResultado.setText(txtResultado.getText() + "8");			
				
			}
		});
		btnOito.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOito.setBounds(127, 113, 62, 36);
		frame.getContentPane().add(btnOito);
		
		JButton btnNewButton_1_1 = new JButton("C");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//C = CLEAR (LIMPAR)
				txtResultado.setText("");
				txtEtapas.setText("");
				tipoOperacao = "nada";
				
			}
			
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(268, 113, 62, 36);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNove = new JButton("9");
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O NOVE NO FINAL
				txtResultado.setText(txtResultado.getText() + "9");			
				
			}
		});
		btnNove.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNove.setBounds(198, 113, 62, 36);
		frame.getContentPane().add(btnNove);
		
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCe.setBounds(338, 113, 62, 36);
		frame.getContentPane().add(btnCe);
		
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O QUATRO NO FINAL
				txtResultado.setText(txtResultado.getText() + "4");			
				
			}
		});
		btnQuatro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnQuatro.setBounds(57, 160, 62, 36);
		frame.getContentPane().add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O CINCO NO FINAL
				txtResultado.setText(txtResultado.getText() + "5");			
				
			}
		});
		btnCinco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCinco.setBounds(127, 160, 62, 36);
		frame.getContentPane().add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O SEIS NO FINAL
				txtResultado.setText(txtResultado.getText() + "6");			
				
			}
		});
		btnSeis.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSeis.setBounds(198, 160, 62, 36);
		frame.getContentPane().add(btnSeis);
		
		JButton btnUm = new JButton("1");
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O UM NO FINAL
				txtResultado.setText(txtResultado.getText() + "1");			
				
			}
		});
		btnUm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUm.setBounds(57, 207, 62, 36);
		frame.getContentPane().add(btnUm);
		
		JButton btnDois = new JButton("2");
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O DOIS NO FINAL
				txtResultado.setText(txtResultado.getText() + "2");			
				
			}
		});
		btnDois.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDois.setBounds(127, 207, 62, 36);
		frame.getContentPane().add(btnDois);
		
		JButton btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O TRÊS NO FINAL
				txtResultado.setText(txtResultado.getText() + "3");			
				
			}
		});
		btnTres.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTres.setBounds(198, 207, 62, 36);
		frame.getContentPane().add(btnTres);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VAI PEGAR OS NUMEROS QUE JÁ FORAM DIGITADOS E ACRESCENTAR O ZERO NO FINAL
				txtResultado.setText(txtResultado.getText() + "0");				
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnZero.setBounds(57, 254, 62, 36);
		frame.getContentPane().add(btnZero);
		
		JButton btnPonto = new JButton(".");
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPonto.setBounds(127, 254, 62, 36);
		frame.getContentPane().add(btnPonto);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(255, 255, 128));
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIgual.setBounds(198, 254, 132, 36);
		frame.getContentPane().add(btnIgual);
		
		JButton btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JUNTA O TEXTO DE ETAPAS COM O TEXTO DE RESULTADO
				if (tipoOperacao.equals("nada")) {
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
				
				}
				
				//PEGA TODAS AS ETAPAS E INCLUEM A OPERAÇÃO NO FINAL
				txtEtapas.setText(txtEtapas.getText() + "+");
				
				//PEGA O TEXTO DO RESULTADO E CONVERTE 
				numero1 = Double.parseDouble(txtResultado.getText());		
				
				//APAGANDO O TEXTO DO CAMPO DE RESULTADO
				txtResultado.setText("");
				
				tipoOperacao = "adicao";
			
			}
		});
		btnAdicao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdicao.setBounds(268, 160, 62, 83);
		frame.getContentPane().add(btnAdicao);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JUNTA O TEXTO DE ETAPAS COM O TEXTO DE RESULTADO
				if (tipoOperacao.equals("nada")) {
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
				
				}
				
				//PEGA TODAS AS ETAPAS E INCLUEM A OPERAÇÃO NO FINAL
				txtEtapas.setText(txtEtapas.getText() + "-");
				
				//PEGA O TEXTO DO RESULTADO E CONVERTE 
				numero1 = Double.parseDouble(txtResultado.getText());		
				
				//APAGANDO O TEXTO DO CAMPO DE RESULTADO
				txtResultado.setText("");
				
				tipoOperacao = "subtracao";
				
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubtracao.setBounds(338, 160, 62, 36);
		frame.getContentPane().add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("X");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JUNTA O TEXTO DE ETAPAS COM O TEXTO DE RESULTADO
				if (tipoOperacao.equals("nada")) {
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
				
				}
				
				//PEGA TODAS AS ETAPAS E INCLUEM A OPERAÇÃO NO FINAL
				txtEtapas.setText(txtEtapas.getText() + "*");
				
				//PEGA O TEXTO DO RESULTADO E CONVERTE 
				numero1 = Double.parseDouble(txtResultado.getText());		
				
				//APAGANDO O TEXTO DO CAMPO DE RESULTADO
				txtResultado.setText("");
				
				tipoOperacao = "multiplicacao";
				
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMultiplicacao.setBounds(338, 207, 62, 36);
		frame.getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JUNTA O TEXTO DE ETAPAS COM O TEXTO DE RESULTADO
				if (tipoOperacao.equals("nada")) {
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					
				}else {
					
				
				}
				
				//PEGA TODAS AS ETAPAS E INCLUEM A OPERAÇÃO NO FINAL
				txtEtapas.setText(txtEtapas.getText() + "/");
				
				//PEGA O TEXTO DO RESULTADO E CONVERTE 
				numero1 = Double.parseDouble(txtResultado.getText());		
				
				//APAGANDO O TEXTO DO CAMPO DE RESULTADO
				txtResultado.setText("");
				
				tipoOperacao = "divisao";
				
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDivisao.setBounds(338, 254, 62, 36);
		frame.getContentPane().add(btnDivisao);
		
		txtEtapas = new JTextField();
		txtEtapas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEtapas.setBounds(57, 24, 343, 29);
		frame.getContentPane().add(txtEtapas);
		txtEtapas.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtResultado.setColumns(10);
		txtResultado.setBounds(57, 64, 343, 29);
		frame.getContentPane().add(txtResultado);
	}
}
