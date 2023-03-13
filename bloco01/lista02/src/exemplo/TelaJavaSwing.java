package exemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

/**
 * Classe que implementa a tela da aplicação
 * @author Gabriel
 *
 */
public class TelaJavaSwing {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTextField tfCpf;
	private JTextField tfData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJavaSwing window = new TelaJavaSwing();
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
	public TelaJavaSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][][][]"));
		
		JLabel lblCadastrPessoa = new JLabel("CADASTRO DE PESSOA");
		lblCadastrPessoa.setFont(new Font("Sitka Text", Font.BOLD, 11));
		frame.getContentPane().add(lblCadastrPessoa, "cell 1 0,alignx center");
		
		JLabel lblNome = new JLabel("Nome:");
		frame.getContentPane().add(lblNome, "cell 0 1,alignx trailing");
		
		tfNome = new JTextField();
		frame.getContentPane().add(tfNome, "cell 1 1,growx");
		tfNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		frame.getContentPane().add(lblNewLabel_1, "cell 0 2,alignx trailing");
		
		tfIdade = new JTextField();
		frame.getContentPane().add(tfIdade, "cell 1 2,growx");
		tfIdade.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		frame.getContentPane().add(lblNewLabel_2, "cell 0 3,alignx trailing");
		
		tfCpf = new JTextField();
		frame.getContentPane().add(tfCpf, "cell 1 3,growx");
		tfCpf.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			//Método criado para executar uma ação ao clicar no botão salvar.
			public void actionPerformed(ActionEvent e) {
				
				//Converter um campo texto para inteiro.
				if (!"".equals(tfIdade.getText())) {
					int idade = Integer.valueOf(tfIdade.getText());
				}
				
				//Mostrar uma mensagem com um botão OK
				JOptionPane.showMessageDialog(frame, "CPF é " + tfCpf.getText());
				
				//Converter um campo data no formato "DIA/MES/ANO"
				LocalDate data = LocalDate.parse(tfData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			}
		});
		
		JLabel lblData = new JLabel("data (dia/mes/ano)");
		frame.getContentPane().add(lblData, "cell 0 4,alignx trailing,aligny baseline");
		
		tfData = new JTextField();
		frame.getContentPane().add(tfData, "cell 1 4,growx");
		tfData.setColumns(10);
		frame.getContentPane().add(btnNewButton, "cell 1 5,alignx right");
	}
}