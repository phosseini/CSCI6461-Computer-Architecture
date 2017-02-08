package front;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontPanel {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblR;
	private JRadioButton rdbtnR0_16;
	private JRadioButton rdbtnR0_15;
	private JRadioButton rdbtnR0_14;
	private JRadioButton rdbtnR0_13;
	private JRadioButton rdbtnR0_12;
	private JRadioButton rdbtnR0_11;
	private JRadioButton rdbtnR0_10;
	private JRadioButton rdbtnR0_9;
	private JRadioButton rdbtnR0_8;
	private JRadioButton rdbtnR0_7;
	private JRadioButton rdbtnR0_6;
	private JRadioButton rdbtnR0_5;
	private JRadioButton rdbtnR0_4;
	private JRadioButton rdbtnR0_3;
	private JRadioButton rdbtnR0_2;
	private JRadioButton rdbtnR0_1;
	private JTextField textFieldR0;
	private JTextField textFieldR1;
	JButton btnStoreR0;
	JPanel panel_2;
	JLabel lblR_1;
	JRadioButton rdbR1_16;
	
	JRadioButton rdbR1_15;
	
	JRadioButton rdbR1_14;
	
	JRadioButton rdbR1_13;
	JRadioButton rdbR1_12;
	
	JRadioButton rdbR1_11;
	
	JRadioButton rdbR1_10;
	
	JRadioButton rdbR1_9;
	
	JRadioButton rdbR1_8;
	
	JRadioButton rdbR1_7;
	
	JRadioButton rdbR1_6;
	
	JRadioButton rdbR1_5;
	
	JRadioButton rdbR1_4;
	
	JRadioButton rdbR1_3;
	
	JRadioButton rdbR1_2;
	
	JRadioButton rdbR1_1;
	JButton btnStoreR1;
	private JPanel panel_3;
	private JLabel lblR_2;
	private JRadioButton rdbR2_16;
	private JRadioButton rdbR2_15;
	private JRadioButton rdbR2_14;
	private JRadioButton rdbR2_13;
	private JRadioButton rdbR2_12;
	private JRadioButton rdbR2_11;
	private JRadioButton rdbR2_10;
	private JRadioButton rdbR2_9;
	private JRadioButton rdbR2_8;
	private JRadioButton rdbR2_7;
	private JRadioButton rdbR2_6;
	private JRadioButton rdbR2_5;
	private JRadioButton rdbR2_4;
	private JRadioButton rdbR2_3;
	private JRadioButton rdbR2_2;
	private JRadioButton rdbR2_1;
	private JTextField textFieldR2;
	private JButton btnStoreR2;
	private JPanel panel_4;
	private JLabel lblR_3;
	private JRadioButton rdbR3_16;
	private JRadioButton rdbR3_15;
	private JRadioButton rdbR3_14;
	private JRadioButton rdbR3_13;
	private JRadioButton rdbR3_12;
	private JRadioButton rdbR3_11;
	private JRadioButton rdbR3_10;
	private JRadioButton rdbR3_9;
	private JRadioButton rdbR3_8;
	private JRadioButton rdbR3_7;
	private JRadioButton rdbR3_6;
	private JRadioButton rdbR3_5;
	private JRadioButton rdbR3_4;
	private JRadioButton rdbR3_3;
	private JRadioButton rdbR3_2;
	private JRadioButton rdbR3_1;
	private JTextField textField_R3;
	private JButton btnStoreR3;
	private JPanel panel_5;
	private JLabel lblX;
	private JRadioButton rdbX1_16;
	private JRadioButton rdbX1_15;
	private JRadioButton rdbX1_14;
	private JRadioButton rdbX1_13;
	private JRadioButton rdbX1_12;
	private JRadioButton rdbX1_11;
	private JRadioButton rdbX1_10;
	private JRadioButton rdbX1_9;
	private JRadioButton rdbX1_8;
	private JRadioButton rdbX1_7;
	private JRadioButton rdbX1_6;
	private JRadioButton rdbX1_5;
	private JRadioButton rdbX1_4;
	private JRadioButton rdbX1_3;
	private JRadioButton rdbX1_2;
	private JRadioButton rdbX1_1;
	private JTextField textFieldX1;
	private JButton btnStoreX1;
	private JPanel panel_6;
	private JLabel lblX_1;
	private JRadioButton rdbX2_16;
	private JRadioButton rdbX2_15;
	private JRadioButton rdbX2_14;
	private JRadioButton rdbX2_13;
	private JRadioButton rdbX2_12;
	private JRadioButton rdbX2_11;
	private JRadioButton rdbX2_10;
	private JRadioButton rdbX2_9;
	private JRadioButton rdbX2_8;
	private JRadioButton rdbX2_7;
	private JRadioButton rdbX2_6;
	private JRadioButton rdbX2_5;
	private JRadioButton rdbX2_4;
	private JRadioButton rdbX2_3;
	private JRadioButton rdbX2_2;
	private JRadioButton rdbX2_1;
	private JTextField textField_X2;
	private JButton btnStoreX2;
	private JPanel panel_7;
	private JLabel lblX_2;
	private JRadioButton rdbX3_16;
	private JRadioButton rdbX3_15;
	private JRadioButton rdbX3_14;
	private JRadioButton rdbX3_13;
	private JRadioButton rdbX3_12;
	private JRadioButton rdbX3_11;
	private JRadioButton rdbX3_10;
	private JRadioButton rdbX3_9;
	private JRadioButton rdbX3_8;
	private JRadioButton rdbX3_7;
	private JRadioButton rdbX3_6;
	private JRadioButton rdbX3_5;
	private JRadioButton rdbX3_4;
	private JRadioButton rdbX3_3;
	private JRadioButton rdbX3_2;
	private JRadioButton rdbX3_1;
	private JTextField textField_3;
	private JButton btnStoreX3;
	private JPanel panel_8;
	private JLabel lblMar;
	private JRadioButton rdbMar_16;
	private JRadioButton rdbMar_15;
	private JRadioButton rdbMar_14;
	private JRadioButton rdbMar_13;
	private JRadioButton rdbMar_12;
	private JRadioButton rdbMar_11;
	private JRadioButton rdbMar_10;
	private JRadioButton rdbMar_9;
	private JRadioButton rdbMar_8;
	private JRadioButton rdbMar_7;
	private JRadioButton rdbMar_6;
	private JRadioButton rdbMar_5;
	private JRadioButton rdbMar_4;
	private JRadioButton rdbMar_3;
	private JRadioButton rdbMar_2;
	private JRadioButton rdbMar_1;
	private JTextField textField_Mar;
	private JButton btnStore_Mar;
	private JPanel panel_9;
	private JLabel lblMbr;
	private JRadioButton rdbMBR_16;
	private JRadioButton rdbMBR_15;
	private JRadioButton rdbMBR_14;
	private JRadioButton rdbMBR_13;
	private JRadioButton rdbMBR_12;
	private JRadioButton rdbMBR_11;
	private JRadioButton rdbMBR_10;
	private JRadioButton rdbMBR_9;
	private JRadioButton rdbMBR_8;
	private JRadioButton rdbMBR_7;
	private JRadioButton rdbMBR_6;
	private JRadioButton rdbMBR_5;
	private JRadioButton rdbMBR_4;
	private JRadioButton rdbMBR_3;
	private JRadioButton rdbMBR_2;
	private JRadioButton rdbMBR_1;
	private JTextField textField_MBR;
	private JButton btnStore_MBR;
	private JPanel panel_10;
	private JLabel lblMsr;
	private JRadioButton rdbMsr_16;
	private JRadioButton rdbMsr_15;
	private JRadioButton rdbMsr_14;
	private JRadioButton rdbMsr_13;
	private JRadioButton rdbMsr_12;
	private JRadioButton rdbMsr_11;
	private JRadioButton rdbMsr_10;
	private JRadioButton rdbMsr_9;
	private JRadioButton rdbMsr_8;
	private JRadioButton rdbMsr_7;
	private JRadioButton rdbMsr_6;
	private JRadioButton rdbMsr_5;
	private JRadioButton rdbMsr_4;
	private JRadioButton rdbMsr_3;
	private JRadioButton rdbMsr_2;
	private JRadioButton rdbMsr_1;
	private JTextField textField_MSR;
	private JButton btnStore_MSR;
	private JPanel panel_11;
	private JLabel lblIr;
	private JRadioButton rdbIR_16;
	private JRadioButton rdbIR_15;
	private JRadioButton rdbIR_14;
	private JRadioButton rdbIR_13;
	private JRadioButton rdbIR_12;
	private JRadioButton rdbIR_11;
	private JRadioButton rdbIR_10;
	private JRadioButton rdbIR_9;
	private JRadioButton rdbIR_8;
	private JRadioButton rdbIR_7;
	private JRadioButton rdbIR_6;
	private JRadioButton rdbIR_5;
	private JRadioButton rdbIR_4;
	private JRadioButton rdbIR_3;
	private JRadioButton rdbIR_2;
	private JRadioButton rdbIR_1;
	private JTextField textField_IR;
	private JButton btnStore_IR;
	private JPanel panel_12;
	private JLabel lblPc;
	private JRadioButton rdbPC_12;
	private JRadioButton rdbPC_11;
	private JRadioButton rdbPC_10;
	private JRadioButton rdbPC_9;
	private JRadioButton rdbPC_8;
	private JRadioButton rdbPC_7;
	private JRadioButton rdbPC_6;
	private JRadioButton rdbPC_5;
	private JRadioButton rdbPC_4;
	private JRadioButton rdbPC_3;
	private JRadioButton rdbPC_2;
	private JRadioButton rdbPC_1;
	private JTextField textField_PC;
	private JButton btnStore_PC;
	private JPanel panel_13;
	private JLabel lblCc;
	private JRadioButton rdbCC_4;
	private JRadioButton rdbCC_3;
	private JRadioButton rdbCC_2;
	private JRadioButton rdbCC_1;
	private JTextField textField_CC;
	private JButton btnStore_CC;
	private JPanel panel_14;
	private JLabel lblMfr;
	private JRadioButton rdbMFR_4;
	private JRadioButton rdbMFR_3;
	private JRadioButton rdbMFR_2;
	private JRadioButton rdbMFR_1;
	private JTextField textField_MFR;
	private JButton btnStore_MFR;
	private JPanel panel_15;
	private JTextField textField_Address;
	private JTextField textField_Value;
	private JLabel lblAddress;
	private JLabel lblValue;
	private JButton btnStore_address;
	private JButton btnIpl;
	private JPanel panel_16;
	private JTextField textField;
	private JButton btnDeposit;
	private JButton btnFetch;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPanel window = new FrontPanel();
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
	public FrontPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 998, 654);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(16, 6, 800, 595);
		frame.getContentPane().add(panel);
		
	    panel_1 = new JPanel();
	    panel.add(panel_1);
		
	    lblR = new JLabel("R0");
		panel_1.add(lblR);
		
		rdbtnR0_16 = new JRadioButton("");
		panel_1.add(rdbtnR0_16);
		
		rdbtnR0_15 = new JRadioButton("");
		panel_1.add(rdbtnR0_15);
		
		rdbtnR0_14 = new JRadioButton("");
		panel_1.add(rdbtnR0_14);
		
		rdbtnR0_13 = new JRadioButton("");
		panel_1.add(rdbtnR0_13);
		
		rdbtnR0_12 = new JRadioButton("");
		panel_1.add(rdbtnR0_12);
		
		rdbtnR0_11 = new JRadioButton("");
		panel_1.add(rdbtnR0_11);
		
		rdbtnR0_10 = new JRadioButton("");
		panel_1.add(rdbtnR0_10);
		
		rdbtnR0_9 = new JRadioButton("");
		panel_1.add(rdbtnR0_9);
		
		rdbtnR0_8 = new JRadioButton("");
		panel_1.add(rdbtnR0_8);
		
		rdbtnR0_7 = new JRadioButton("");
		panel_1.add(rdbtnR0_7);
		
		rdbtnR0_6 = new JRadioButton("");
		panel_1.add(rdbtnR0_6);
		
		rdbtnR0_5 = new JRadioButton("");
		panel_1.add(rdbtnR0_5);
		
		rdbtnR0_4 = new JRadioButton("");
		panel_1.add(rdbtnR0_4);
		
		rdbtnR0_3 = new JRadioButton("");
		panel_1.add(rdbtnR0_3);
		
		rdbtnR0_2 = new JRadioButton("");
		panel_1.add(rdbtnR0_2);
		
		rdbtnR0_1 = new JRadioButton("");
		panel_1.add(rdbtnR0_1);
		
		textFieldR0 = new JTextField();
		panel_1.add(textFieldR0);
		textFieldR0.setColumns(10);
		
		btnStoreR0 = new JButton("store");
		panel_1.add(btnStoreR0);
		
		 panel_2 = new JPanel();
		panel.add(panel_2);
		
		 lblR_1 = new JLabel("R1");
		panel_2.add(lblR_1);
		
		rdbR1_16 = new JRadioButton("");
		panel_2.add(rdbR1_16);
		
		rdbR1_15 = new JRadioButton("");
		panel_2.add(rdbR1_15);
		
		rdbR1_14 = new JRadioButton("");
		panel_2.add(rdbR1_14);
		
		rdbR1_13 = new JRadioButton("");
		panel_2.add(rdbR1_13);
		
		rdbR1_12 = new JRadioButton("");
		panel_2.add(rdbR1_12);
		
		 rdbR1_11 = new JRadioButton("");
		panel_2.add(rdbR1_11);
		
		rdbR1_10 = new JRadioButton("");
		panel_2.add(rdbR1_10);
		
		 rdbR1_9 = new JRadioButton("");
		panel_2.add(rdbR1_9);
		
		 rdbR1_8 = new JRadioButton("");
		panel_2.add(rdbR1_8);
		
		 rdbR1_7 = new JRadioButton("");
		panel_2.add(rdbR1_7);
		
		 rdbR1_6 = new JRadioButton("");
		panel_2.add(rdbR1_6);
		
		 rdbR1_5 = new JRadioButton("");
		panel_2.add(rdbR1_5);
		
		 rdbR1_4 = new JRadioButton("");
		panel_2.add(rdbR1_4);
		
		 rdbR1_3 = new JRadioButton("");
		panel_2.add(rdbR1_3);
		
		rdbR1_2 = new JRadioButton("");
		panel_2.add(rdbR1_2);
		
		rdbR1_1 = new JRadioButton("");
		panel_2.add(rdbR1_1);
		
		textFieldR1 = new JTextField();
		textFieldR1.setColumns(10);
		panel_2.add(textFieldR1);
		
		btnStoreR1 = new JButton("store");
		panel_2.add(btnStoreR1);
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		
		lblR_2 = new JLabel("R2");
		panel_3.add(lblR_2);
		
		rdbR2_16 = new JRadioButton("");
		panel_3.add(rdbR2_16);
		
		rdbR2_15 = new JRadioButton("");
		panel_3.add(rdbR2_15);
		
		rdbR2_14 = new JRadioButton("");
		panel_3.add(rdbR2_14);
		
		rdbR2_13 = new JRadioButton("");
		panel_3.add(rdbR2_13);
		
		rdbR2_12 = new JRadioButton("");
		panel_3.add(rdbR2_12);
		
		rdbR2_11 = new JRadioButton("");
		panel_3.add(rdbR2_11);
		
		rdbR2_10 = new JRadioButton("");
		panel_3.add(rdbR2_10);
		
		rdbR2_9 = new JRadioButton("");
		panel_3.add(rdbR2_9);
		
		rdbR2_8 = new JRadioButton("");
		panel_3.add(rdbR2_8);
		
		rdbR2_7 = new JRadioButton("");
		panel_3.add(rdbR2_7);
		
		rdbR2_6 = new JRadioButton("");
		panel_3.add(rdbR2_6);
		
		rdbR2_5 = new JRadioButton("");
		panel_3.add(rdbR2_5);
		
		rdbR2_4 = new JRadioButton("");
		panel_3.add(rdbR2_4);
		
		rdbR2_3 = new JRadioButton("");
		panel_3.add(rdbR2_3);
		
		rdbR2_2 = new JRadioButton("");
		panel_3.add(rdbR2_2);
		
		rdbR2_1 = new JRadioButton("");
		panel_3.add(rdbR2_1);
		
		textFieldR2 = new JTextField();
		textFieldR2.setColumns(10);
		panel_3.add(textFieldR2);
		
		btnStoreR2 = new JButton("store");
		panel_3.add(btnStoreR2);
		
		panel_4 = new JPanel();
		panel.add(panel_4);
		
		lblR_3 = new JLabel("R3");
		panel_4.add(lblR_3);
		
		rdbR3_16 = new JRadioButton("");
		panel_4.add(rdbR3_16);
		
		rdbR3_15 = new JRadioButton("");
		panel_4.add(rdbR3_15);
		
		rdbR3_14 = new JRadioButton("");
		panel_4.add(rdbR3_14);
		
		rdbR3_13 = new JRadioButton("");
		panel_4.add(rdbR3_13);
		
		rdbR3_12 = new JRadioButton("");
		panel_4.add(rdbR3_12);
		
		rdbR3_11 = new JRadioButton("");
		panel_4.add(rdbR3_11);
		
		rdbR3_10 = new JRadioButton("");
		panel_4.add(rdbR3_10);
		
		rdbR3_9 = new JRadioButton("");
		panel_4.add(rdbR3_9);
		
		rdbR3_8 = new JRadioButton("");
		panel_4.add(rdbR3_8);
		
		rdbR3_7 = new JRadioButton("");
		panel_4.add(rdbR3_7);
		
		rdbR3_6 = new JRadioButton("");
		panel_4.add(rdbR3_6);
		
		rdbR3_5 = new JRadioButton("");
		panel_4.add(rdbR3_5);
		
		rdbR3_4 = new JRadioButton("");
		panel_4.add(rdbR3_4);
		
		rdbR3_3 = new JRadioButton("");
		panel_4.add(rdbR3_3);
		
		rdbR3_2 = new JRadioButton("");
		panel_4.add(rdbR3_2);
		
		rdbR3_1 = new JRadioButton("");
		panel_4.add(rdbR3_1);
		
		textField_R3 = new JTextField();
		textField_R3.setColumns(10);
		panel_4.add(textField_R3);
		
		btnStoreR3 = new JButton("store");
		panel_4.add(btnStoreR3);
		
		panel_5 = new JPanel();
		panel.add(panel_5);
		
		lblX = new JLabel("X1");
		panel_5.add(lblX);
		
		rdbX1_16 = new JRadioButton("");
		panel_5.add(rdbX1_16);
		
		rdbX1_15 = new JRadioButton("");
		panel_5.add(rdbX1_15);
		
		rdbX1_14 = new JRadioButton("");
		panel_5.add(rdbX1_14);
		
		rdbX1_13 = new JRadioButton("");
		panel_5.add(rdbX1_13);
		
		rdbX1_12 = new JRadioButton("");
		panel_5.add(rdbX1_12);
		
		rdbX1_11 = new JRadioButton("");
		panel_5.add(rdbX1_11);
		
		rdbX1_10 = new JRadioButton("");
		panel_5.add(rdbX1_10);
		
		rdbX1_9 = new JRadioButton("");
		panel_5.add(rdbX1_9);
		
		rdbX1_8 = new JRadioButton("");
		panel_5.add(rdbX1_8);
		
		rdbX1_7 = new JRadioButton("");
		panel_5.add(rdbX1_7);
		
		rdbX1_6 = new JRadioButton("");
		panel_5.add(rdbX1_6);
		
		rdbX1_5 = new JRadioButton("");
		panel_5.add(rdbX1_5);
		
		rdbX1_4 = new JRadioButton("");
		panel_5.add(rdbX1_4);
		
		rdbX1_3 = new JRadioButton("");
		panel_5.add(rdbX1_3);
		
		rdbX1_2 = new JRadioButton("");
		panel_5.add(rdbX1_2);
		
		rdbX1_1 = new JRadioButton("");
		panel_5.add(rdbX1_1);
		
		textFieldX1 = new JTextField();
		textFieldX1.setColumns(10);
		panel_5.add(textFieldX1);
		
		btnStoreX1 = new JButton("store");
		panel_5.add(btnStoreX1);
		
		panel_6 = new JPanel();
		panel.add(panel_6);
		
		lblX_1 = new JLabel("X2");
		panel_6.add(lblX_1);
		
		rdbX2_16 = new JRadioButton("");
		panel_6.add(rdbX2_16);
		
		rdbX2_15 = new JRadioButton("");
		panel_6.add(rdbX2_15);
		
		rdbX2_14 = new JRadioButton("");
		panel_6.add(rdbX2_14);
		
		rdbX2_13 = new JRadioButton("");
		panel_6.add(rdbX2_13);
		
		rdbX2_12 = new JRadioButton("");
		panel_6.add(rdbX2_12);
		
		rdbX2_11 = new JRadioButton("");
		panel_6.add(rdbX2_11);
		
		rdbX2_10 = new JRadioButton("");
		panel_6.add(rdbX2_10);
		
		rdbX2_9 = new JRadioButton("");
		panel_6.add(rdbX2_9);
		
		rdbX2_8 = new JRadioButton("");
		panel_6.add(rdbX2_8);
		
		rdbX2_7 = new JRadioButton("");
		panel_6.add(rdbX2_7);
		
		rdbX2_6 = new JRadioButton("");
		panel_6.add(rdbX2_6);
		
		rdbX2_5 = new JRadioButton("");
		panel_6.add(rdbX2_5);
		
		rdbX2_4 = new JRadioButton("");
		panel_6.add(rdbX2_4);
		
		rdbX2_3 = new JRadioButton("");
		panel_6.add(rdbX2_3);
		
		rdbX2_2 = new JRadioButton("");
		panel_6.add(rdbX2_2);
		
		rdbX2_1 = new JRadioButton("");
		panel_6.add(rdbX2_1);
		
		textField_X2 = new JTextField();
		textField_X2.setColumns(10);
		panel_6.add(textField_X2);
		
		btnStoreX2 = new JButton("store");
		panel_6.add(btnStoreX2);
		
		panel_7 = new JPanel();
		panel.add(panel_7);
		
		lblX_2 = new JLabel("X3");
		panel_7.add(lblX_2);
		
		rdbX3_16 = new JRadioButton("");
		panel_7.add(rdbX3_16);
		
		rdbX3_15 = new JRadioButton("");
		panel_7.add(rdbX3_15);
		
		rdbX3_14 = new JRadioButton("");
		panel_7.add(rdbX3_14);
		
		rdbX3_13 = new JRadioButton("");
		panel_7.add(rdbX3_13);
		
		rdbX3_12 = new JRadioButton("");
		panel_7.add(rdbX3_12);
		
		rdbX3_11 = new JRadioButton("");
		panel_7.add(rdbX3_11);
		
		rdbX3_10 = new JRadioButton("");
		panel_7.add(rdbX3_10);
		
		rdbX3_9 = new JRadioButton("");
		panel_7.add(rdbX3_9);
		
		rdbX3_8 = new JRadioButton("");
		panel_7.add(rdbX3_8);
		
		rdbX3_7 = new JRadioButton("");
		panel_7.add(rdbX3_7);
		
		rdbX3_6 = new JRadioButton("");
		panel_7.add(rdbX3_6);
		
		rdbX3_5 = new JRadioButton("");
		panel_7.add(rdbX3_5);
		
		rdbX3_4 = new JRadioButton("");
		panel_7.add(rdbX3_4);
		
		rdbX3_3 = new JRadioButton("");
		panel_7.add(rdbX3_3);
		
		rdbX3_2 = new JRadioButton("");
		panel_7.add(rdbX3_2);
		
		rdbX3_1 = new JRadioButton("");
		panel_7.add(rdbX3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_7.add(textField_3);
		
		btnStoreX3 = new JButton("store");
		panel_7.add(btnStoreX3);
		
		panel_8 = new JPanel();
		panel.add(panel_8);
		
		lblMar = new JLabel("MAR");
		panel_8.add(lblMar);
		
		rdbMar_16 = new JRadioButton("");
		panel_8.add(rdbMar_16);
		
		rdbMar_15 = new JRadioButton("");
		panel_8.add(rdbMar_15);
		
		rdbMar_14 = new JRadioButton("");
		panel_8.add(rdbMar_14);
		
		rdbMar_13 = new JRadioButton("");
		panel_8.add(rdbMar_13);
		
		rdbMar_12 = new JRadioButton("");
		panel_8.add(rdbMar_12);
		
		rdbMar_11 = new JRadioButton("");
		panel_8.add(rdbMar_11);
		
		rdbMar_10 = new JRadioButton("");
		panel_8.add(rdbMar_10);
		
		rdbMar_9 = new JRadioButton("");
		panel_8.add(rdbMar_9);
		
		rdbMar_8 = new JRadioButton("");
		panel_8.add(rdbMar_8);
		
		rdbMar_7 = new JRadioButton("");
		panel_8.add(rdbMar_7);
		
		rdbMar_6 = new JRadioButton("");
		panel_8.add(rdbMar_6);
		
		rdbMar_5 = new JRadioButton("");
		panel_8.add(rdbMar_5);
		
		rdbMar_4 = new JRadioButton("");
		panel_8.add(rdbMar_4);
		
		rdbMar_3 = new JRadioButton("");
		panel_8.add(rdbMar_3);
		
		rdbMar_2 = new JRadioButton("");
		panel_8.add(rdbMar_2);
		
		rdbMar_1 = new JRadioButton("");
		panel_8.add(rdbMar_1);
		
		textField_Mar = new JTextField();
		textField_Mar.setColumns(10);
		panel_8.add(textField_Mar);
		
		btnStore_Mar = new JButton("store");
		panel_8.add(btnStore_Mar);
		
		panel_9 = new JPanel();
		panel.add(panel_9);
		
		lblMbr = new JLabel("MBR");
		panel_9.add(lblMbr);
		
		rdbMBR_16 = new JRadioButton("");
		panel_9.add(rdbMBR_16);
		
		rdbMBR_15 = new JRadioButton("");
		panel_9.add(rdbMBR_15);
		
		rdbMBR_14 = new JRadioButton("");
		panel_9.add(rdbMBR_14);
		
		rdbMBR_13 = new JRadioButton("");
		panel_9.add(rdbMBR_13);
		
		rdbMBR_12 = new JRadioButton("");
		panel_9.add(rdbMBR_12);
		
		rdbMBR_11 = new JRadioButton("");
		panel_9.add(rdbMBR_11);
		
		rdbMBR_10 = new JRadioButton("");
		panel_9.add(rdbMBR_10);
		
		rdbMBR_9 = new JRadioButton("");
		panel_9.add(rdbMBR_9);
		
		rdbMBR_8 = new JRadioButton("");
		panel_9.add(rdbMBR_8);
		
		rdbMBR_7 = new JRadioButton("");
		panel_9.add(rdbMBR_7);
		
		rdbMBR_6 = new JRadioButton("");
		panel_9.add(rdbMBR_6);
		
		rdbMBR_5 = new JRadioButton("");
		panel_9.add(rdbMBR_5);
		
		rdbMBR_4 = new JRadioButton("");
		panel_9.add(rdbMBR_4);
		
		rdbMBR_3 = new JRadioButton("");
		panel_9.add(rdbMBR_3);
		
		rdbMBR_2 = new JRadioButton("");
		panel_9.add(rdbMBR_2);
		
		rdbMBR_1 = new JRadioButton("");
		panel_9.add(rdbMBR_1);
		
		textField_MBR = new JTextField();
		textField_MBR.setColumns(10);
		panel_9.add(textField_MBR);
		
		btnStore_MBR = new JButton("store");
		panel_9.add(btnStore_MBR);
		
		panel_10 = new JPanel();
		panel.add(panel_10);
		
		lblMsr = new JLabel("MSR");
		panel_10.add(lblMsr);
		
		rdbMsr_16 = new JRadioButton("");
		panel_10.add(rdbMsr_16);
		
		rdbMsr_15 = new JRadioButton("");
		panel_10.add(rdbMsr_15);
		
		rdbMsr_14 = new JRadioButton("");
		panel_10.add(rdbMsr_14);
		
		rdbMsr_13 = new JRadioButton("");
		panel_10.add(rdbMsr_13);
		
		rdbMsr_12 = new JRadioButton("");
		panel_10.add(rdbMsr_12);
		
		rdbMsr_11 = new JRadioButton("");
		panel_10.add(rdbMsr_11);
		
		rdbMsr_10 = new JRadioButton("");
		panel_10.add(rdbMsr_10);
		
		rdbMsr_9 = new JRadioButton("");
		panel_10.add(rdbMsr_9);
		
		rdbMsr_8 = new JRadioButton("");
		panel_10.add(rdbMsr_8);
		
		rdbMsr_7 = new JRadioButton("");
		panel_10.add(rdbMsr_7);
		
		rdbMsr_6 = new JRadioButton("");
		panel_10.add(rdbMsr_6);
		
		rdbMsr_5 = new JRadioButton("");
		panel_10.add(rdbMsr_5);
		
		rdbMsr_4 = new JRadioButton("");
		panel_10.add(rdbMsr_4);
		
		rdbMsr_3 = new JRadioButton("");
		panel_10.add(rdbMsr_3);
		
		rdbMsr_2 = new JRadioButton("");
		panel_10.add(rdbMsr_2);
		
		rdbMsr_1 = new JRadioButton("");
		panel_10.add(rdbMsr_1);
		
		textField_MSR = new JTextField();
		textField_MSR.setColumns(10);
		panel_10.add(textField_MSR);
		
		btnStore_MSR = new JButton("store");
		panel_10.add(btnStore_MSR);
		
		panel_11 = new JPanel();
		panel.add(panel_11);
		
		lblIr = new JLabel("IR");
		panel_11.add(lblIr);
		
		rdbIR_16 = new JRadioButton("");
		panel_11.add(rdbIR_16);
		
		rdbIR_15 = new JRadioButton("");
		panel_11.add(rdbIR_15);
		
		rdbIR_14 = new JRadioButton("");
		panel_11.add(rdbIR_14);
		
		rdbIR_13 = new JRadioButton("");
		panel_11.add(rdbIR_13);
		
		rdbIR_12 = new JRadioButton("");
		panel_11.add(rdbIR_12);
		
		rdbIR_11 = new JRadioButton("");
		panel_11.add(rdbIR_11);
		
		rdbIR_10 = new JRadioButton("");
		panel_11.add(rdbIR_10);
		
		rdbIR_9 = new JRadioButton("");
		panel_11.add(rdbIR_9);
		
		rdbIR_8 = new JRadioButton("");
		panel_11.add(rdbIR_8);
		
		rdbIR_7 = new JRadioButton("");
		panel_11.add(rdbIR_7);
		
		rdbIR_6 = new JRadioButton("");
		panel_11.add(rdbIR_6);
		
		rdbIR_5 = new JRadioButton("");
		panel_11.add(rdbIR_5);
		
		rdbIR_4 = new JRadioButton("");
		panel_11.add(rdbIR_4);
		
		rdbIR_3 = new JRadioButton("");
		panel_11.add(rdbIR_3);
		
		rdbIR_2 = new JRadioButton("");
		panel_11.add(rdbIR_2);
		
		rdbIR_1 = new JRadioButton("");
		panel_11.add(rdbIR_1);
		
		textField_IR = new JTextField();
		textField_IR.setColumns(10);
		panel_11.add(textField_IR);
		
		btnStore_IR = new JButton("store");
		panel_11.add(btnStore_IR);
		
		panel_12 = new JPanel();
		panel.add(panel_12);
		
		lblPc = new JLabel("PC");
		panel_12.add(lblPc);
		
		rdbPC_12 = new JRadioButton("");
		panel_12.add(rdbPC_12);
		
		rdbPC_11 = new JRadioButton("");
		panel_12.add(rdbPC_11);
		
		rdbPC_10 = new JRadioButton("");
		panel_12.add(rdbPC_10);
		
		rdbPC_9 = new JRadioButton("");
		panel_12.add(rdbPC_9);
		
		rdbPC_8 = new JRadioButton("");
		panel_12.add(rdbPC_8);
		
		rdbPC_7 = new JRadioButton("");
		panel_12.add(rdbPC_7);
		
		rdbPC_6 = new JRadioButton("");
		panel_12.add(rdbPC_6);
		
		rdbPC_5 = new JRadioButton("");
		panel_12.add(rdbPC_5);
		
		rdbPC_4 = new JRadioButton("");
		panel_12.add(rdbPC_4);
		
		rdbPC_3 = new JRadioButton("");
		panel_12.add(rdbPC_3);
		
		rdbPC_2 = new JRadioButton("");
		panel_12.add(rdbPC_2);
		
		rdbPC_1 = new JRadioButton("");
		panel_12.add(rdbPC_1);
		
		textField_PC = new JTextField();
		textField_PC.setColumns(10);
		panel_12.add(textField_PC);
		
		btnStore_PC = new JButton("store");
		panel_12.add(btnStore_PC);
		
		panel_13 = new JPanel();
		panel.add(panel_13);
		
		lblCc = new JLabel("CC");
		panel_13.add(lblCc);
		
		rdbCC_4 = new JRadioButton("");
		panel_13.add(rdbCC_4);
		
		rdbCC_3 = new JRadioButton("");
		panel_13.add(rdbCC_3);
		
		rdbCC_2 = new JRadioButton("");
		panel_13.add(rdbCC_2);
		
		rdbCC_1 = new JRadioButton("");
		panel_13.add(rdbCC_1);
		
		textField_CC = new JTextField();
		textField_CC.setColumns(10);
		panel_13.add(textField_CC);
		
		btnStore_CC = new JButton("store");
		panel_13.add(btnStore_CC);
		
		panel_14 = new JPanel();
		panel.add(panel_14);
		
		lblMfr = new JLabel("MFR");
		panel_14.add(lblMfr);
		
		rdbMFR_4 = new JRadioButton("");
		panel_14.add(rdbMFR_4);
		
		rdbMFR_3 = new JRadioButton("");
		panel_14.add(rdbMFR_3);
		
		rdbMFR_2 = new JRadioButton("");
		panel_14.add(rdbMFR_2);
		
		rdbMFR_1 = new JRadioButton("");
		panel_14.add(rdbMFR_1);
		
		textField_MFR = new JTextField();
		textField_MFR.setColumns(10);
		panel_14.add(textField_MFR);
		
		btnStore_MFR = new JButton("store");
		panel_14.add(btnStore_MFR);
		
		panel_15 = new JPanel();
		panel_15.setBounds(828, 89, 164, 144);
		frame.getContentPane().add(panel_15);
		
		lblAddress = new JLabel("Address");
		panel_15.add(lblAddress);
		
		textField_Address = new JTextField();
		panel_15.add(textField_Address);
		textField_Address.setColumns(10);
		
		lblValue = new JLabel("Value");
		panel_15.add(lblValue);
		
		textField_Value = new JTextField();
		panel_15.add(textField_Value);
		textField_Value.setColumns(10);
		
		btnStore_address = new JButton("Store");
		panel_15.add(btnStore_address);
		
		btnIpl = new JButton("IPL");
		btnIpl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIpl.setBounds(850, 30, 117, 29);
		frame.getContentPane().add(btnIpl);
		
		panel_16 = new JPanel();
		panel_16.setBounds(828, 343, 164, 144);
		frame.getContentPane().add(panel_16);
		
		textField = new JTextField();
		panel_16.add(textField);
		textField.setColumns(10);
		
		btnDeposit = new JButton("Deposit");
		panel_16.add(btnDeposit);
		
		btnFetch = new JButton("Fetch");
		panel_16.add(btnFetch);
	}
}
