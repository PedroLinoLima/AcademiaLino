package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Usuario;

public class FrameUsuarioAcademia {
	
	Font fonteTitulo = new Font("Serif", Font.BOLD, 30);
	Font fonteDados = new Font("Serif", Font.BOLD, 20);
	

	public void criarTela() {
		JFrame telaAcademia = new JFrame();
		telaAcademia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaAcademia.setSize(1000,1000);
		telaAcademia.setTitle("ACADEMIA LINO");
		telaAcademia.setLayout(null);
		telaAcademia.setLocationRelativeTo(null);
		
		// *** NOME DA ACADEMIA (TITULO)
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("ACADEMIA LINO");
		labelTitulo.setBounds(10, 10, 700, 50);
		labelTitulo.setFont(fonteTitulo);
		
		// *** label NOME
		JLabel labelNome = new JLabel();
		labelNome.setText("NOME:");
		labelNome.setBounds(30, 60, 120, 30);
		labelNome.setFont(fonteDados);
		
		// *** label IDADE
		JLabel labelIdade = new JLabel();
		labelIdade.setText("IDADE");
		labelIdade.setBounds(30, 120, 150, 30);
		labelIdade.setFont(fonteDados);
		
		// *** label ALTURA
		JLabel labelAltura = new JLabel();
		labelAltura.setText("ALTURA: ");
		labelAltura.setBounds(30, 180, 100, 30);
		labelAltura.setFont(fonteDados);
		
		// *** label PESO
		JLabel labelPeso = new JLabel();
		labelPeso.setText("PESO: ");
		labelPeso.setBounds(30, 240, 100, 30);
		labelPeso.setFont(fonteDados);
		
		// *** label NIVEL DE ATIVIDADE
		JLabel labelNivelDeAtividade = new JLabel();
		labelNivelDeAtividade.setText("NIVEL DE ATIVIDADE: ");
		labelNivelDeAtividade.setBounds(30, 300, 250, 30);
		labelNivelDeAtividade.setFont(fonteDados);
		
		// *** label SEXO
		JLabel labelSexo = new JLabel();
		labelSexo.setText("SEXO: ");
		labelSexo.setBounds(30, 360, 100, 30);
		labelSexo.setFont(fonteDados);
		
		// *** textFild NOME
		JTextField textNome = new JTextField();
		textNome.setBounds(30, 90, 250, 30);
		
		// *** textFild IDADE
		JTextField textIdade = new JTextField();
		textIdade.setBounds(30, 150, 100, 30);
		
		// *** textFild ALTURA
		JTextField textAltura = new JTextField();
		textAltura.setBounds(30, 210, 100, 30);
		
		// *** textFild PESO
		JTextField textPeso = new JTextField();
		textPeso.setBounds(30, 270, 100, 30);
		
		// *** ComboBox NIVEL DE ATIVIDADE
		JComboBox<String> comboNivelDeAtividade = new JComboBox<String>();
		comboNivelDeAtividade.addItem("Nenhuma");
		comboNivelDeAtividade.addItem("Leve");
		comboNivelDeAtividade.addItem("Moderada");
		comboNivelDeAtividade.addItem("Pesada");
		String.valueOf(comboNivelDeAtividade.getSelectedItem());
		comboNivelDeAtividade.setBounds(30, 330, 100, 30);
		
		// *** JRadioButton (MASCULINO E FEMININO)
		JRadioButton radioMasculino = new JRadioButton();
		radioMasculino.setText("MASCULINO");
		radioMasculino.setBounds(30, 390, 100, 30);
		JRadioButton radioFeminino = new JRadioButton();
		radioFeminino.setText("FEMININO");
		radioFeminino.setBounds(30, 420, 100, 30);
		
		// *** ButtonGroup SEXO (MASCULINO E FEMININO)
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radioMasculino);
		buttonGroup.add(radioFeminino);
		
		// *** IMC RESULTADO
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC:");
		labelImc.setBounds(400, 60, 150, 30);
		labelImc.setFont(fonteDados);
		
		// *** IMC STATUS
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("STATUS IMC: ");
		labelStatusImc.setBounds(400, 90, 550, 30);
		labelStatusImc.setFont(fonteDados);
		
		// *** NCD RESULTADO
		JLabel labelNcd = new JLabel();
		labelNcd.setText("NCD:");
		labelNcd.setBounds(400, 120, 180, 30);
		labelNcd.setFont(fonteDados);
		
		// *** BOTÃO CALCULAR
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		Color verde = new Color(50,205,50);
		buttonCalcular.setBackground(verde);
		buttonCalcular.setBounds(30, 450, 180, 30);
		
		// *** contentPane
		
		// *** contentPane TITULO:
		telaAcademia.getContentPane().add(labelTitulo);
		
		// *** ContentPane NOME:
		telaAcademia.getContentPane().add(labelNome);
		telaAcademia.getContentPane().add(textNome);
		
		// *** ContentPane IDADE:
		telaAcademia.getContentPane().add(labelIdade);
		telaAcademia.getContentPane().add(textIdade);
		
		// *** ContentPane SEXO:
		telaAcademia.getContentPane().add(labelSexo);
		telaAcademia.getContentPane().add(radioMasculino);
		telaAcademia.getContentPane().add(radioFeminino);
		
		// *** ContentPane ALTURA:
		telaAcademia.getContentPane().add(labelAltura);
		telaAcademia.getContentPane().add(textAltura);
		
		// *** ContentPane PESO:
		telaAcademia.getContentPane().add(labelPeso);
		telaAcademia.getContentPane().add(textPeso);
		
		// *** ContentPane NIVEL DE ATIVIDADE:
		telaAcademia.getContentPane().add(labelNivelDeAtividade);
		telaAcademia.getContentPane().add(comboNivelDeAtividade);
		
		// *** ContentPane BOTÃO CALCULAR:
		telaAcademia.getContentPane().add(buttonCalcular);
		
		// *** ContentPane IMC:
		telaAcademia.getContentPane().add(labelImc);
		telaAcademia.getContentPane().add(labelStatusImc);
		
		// *** ContentPane NCD:
		telaAcademia.getContentPane().add(labelNcd);
		
		telaAcademia.setVisible(true);
		
		// *** CLICK BOTÃO CALCULAR:
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Usuario c1 = new Usuario();
				c1.setPeso(Double.parseDouble(textPeso.getText()));
				c1.setAltura(Double.parseDouble(textAltura.getText()));
				c1.setSexo(String.valueOf(radioMasculino.isSelected()?"Masculino":"Feminino"));
				c1.setIdade(Integer.parseInt(textIdade.getText()));
				c1.setNivelDeAtividade(String.valueOf(comboNivelDeAtividade.getSelectedItem().toString()));
				
				labelImc.setText("IMC: " + String.valueOf(c1.getImc()));
				labelStatusImc.setText("STATUS IMC: " + c1.statusImc());
				labelNcd.setText("NCD: " + String.valueOf(c1.getNcd()));
			}
		});
	}
}

