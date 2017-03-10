import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receta extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receta frame = new Receta();
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
	public Receta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JRadioButton radioTortillaConCebolla = new JRadioButton("Tortilla con cebolla");
		buttonGroup.add(radioTortillaConCebolla);
		
		JRadioButton radioTortillaSinCebolla = new JRadioButton("Tortilla sin cebolla");
		buttonGroup.add(radioTortillaSinCebolla);
		
		JRadioButton radioTortillaFrancesaCon = new JRadioButton("Tortilla francesa con jam\u00F3n");
		buttonGroup.add(radioTortillaFrancesaCon);
		
		JCheckBox checkPatata = new JCheckBox("Patata");
		
		JCheckBox checkCebolla = new JCheckBox("Cebolla");
		
		JCheckBox checkHuevos = new JCheckBox("Huevos");
		
		JCheckBox checkJamon = new JCheckBox("Jamon");
		
		JCheckBox checkChorizo = new JCheckBox("Chorizo");
		
		JCheckBox checkPimiento = new JCheckBox("Pimiento");
		
		JCheckBox checkPimienta = new JCheckBox("Pimienta");
		
		JCheckBox checkLechuga = new JCheckBox("Lechuga");
		
		JButton botonComprobar = new JButton("Comprobar");
		botonComprobar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(radioTortillaConCebolla.isSelected()){									
				    if(checkPatata.isSelected() && checkHuevos.isSelected() && checkCebolla.isSelected() && !checkPimiento.isSelected()
					&& !checkLechuga.isSelected() && !checkChorizo.isSelected() && !checkPimienta.isSelected() && !checkJamon.isSelected()){
						botonComprobar.setBackground(Color.BLUE);
						}
						else{
						botonComprobar.setBackground(Color.ORANGE);	
						}
					
				}else if(radioTortillaSinCebolla.isSelected()){
					if(checkPatata.isSelected() && checkHuevos.isSelected() && !checkCebolla.isSelected() && !checkPimiento.isSelected()
					&& !checkLechuga.isSelected() && !checkChorizo.isSelected() && !checkPimienta.isSelected() && !checkJamon.isSelected()){
						botonComprobar.setBackground(Color.BLUE);
						}
						else{
						botonComprobar.setBackground(Color.ORANGE);	
						}
					
				}else if(radioTortillaFrancesaCon.isSelected()){
					if(!checkPatata.isSelected() && checkHuevos.isSelected() && !checkCebolla.isSelected() && !checkPimiento.isSelected()
					&& !checkLechuga.isSelected() && !checkChorizo.isSelected() && !checkPimienta.isSelected() && checkJamon.isSelected()){
						botonComprobar.setBackground(Color.BLUE);
						}
						else{
						botonComprobar.setBackground(Color.ORANGE);	
						}
				}
				
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(radioTortillaConCebolla)
									.addGap(18)
									.addComponent(radioTortillaSinCebolla))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(checkPimienta)
											.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
											.addComponent(checkCebolla))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(checkPatata)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(checkHuevos)))
									.addGap(56)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(30)
									.addComponent(radioTortillaFrancesaCon))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(checkJamon)
										.addComponent(checkLechuga))
									.addGap(44)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(checkChorizo)
										.addComponent(checkPimiento)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(197)
							.addComponent(botonComprobar)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(radioTortillaConCebolla)
						.addComponent(radioTortillaSinCebolla)
						.addComponent(radioTortillaFrancesaCon))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(checkPatata)
						.addComponent(checkJamon)
						.addComponent(checkPimiento)
						.addComponent(checkHuevos))
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(checkPimienta)
						.addComponent(checkChorizo)
						.addComponent(checkLechuga)
						.addComponent(checkCebolla))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addComponent(botonComprobar))
		);
		contentPane.setLayout(gl_contentPane);
	}
}