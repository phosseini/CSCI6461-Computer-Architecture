package front;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import alu.instruction.AbstractInstruction;
import cpu.Registers;
import memory.Cache.CacheLine;
import memory.MCU;
import util.Const;
import util.MachineFaultException;
import util.StringUtil;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FrontPanel {

    /**
     * 0 - the registers panel is not enabled. </br>
     * 1 - the registers panel has been enabled.
     */
    private int enableFlag;
    private int prog1Step;

    private JFrame frmCsciClassProject;
    private JPanel pnlRegisters;
    private JPanel pnlR0;
    private JLabel lblR;
    private JRadioButton rdbR0_16;
    private JRadioButton rdbR0_15;
    private JRadioButton rdbR0_14;
    private JRadioButton rdbR0_13;
    private JRadioButton rdbR0_12;
    private JRadioButton rdbR0_11;
    private JRadioButton rdbR0_10;
    private JRadioButton rdbR0_9;
    private JRadioButton rdbR0_8;
    private JRadioButton rdbR0_7;
    private JRadioButton rdbR0_6;
    private JRadioButton rdbR0_5;
    private JRadioButton rdbR0_4;
    private JRadioButton rdbR0_3;
    private JRadioButton rdbR0_2;
    private JRadioButton rdbR0_1;
    private JTextField textFieldR0;
    private JTextField textFieldR1;
    private JButton btnStoreR0;
    private JPanel pnlR1;
    private JLabel lblR_1;
    private JRadioButton rdbR1_16;

    private JRadioButton rdbR1_15;

    private JRadioButton rdbR1_14;

    private JRadioButton rdbR1_13;
    private JRadioButton rdbR1_12;

    private JRadioButton rdbR1_11;

    private JRadioButton rdbR1_10;

    private JRadioButton rdbR1_9;

    private JRadioButton rdbR1_8;

    private JRadioButton rdbR1_7;

    private JRadioButton rdbR1_6;

    private JRadioButton rdbR1_5;

    private JRadioButton rdbR1_4;

    private JRadioButton rdbR1_3;

    private JRadioButton rdbR1_2;

    private JRadioButton rdbR1_1;
    private JButton btnStoreR1;
    private JPanel pnlR2;
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
    private JPanel pnlR3;
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
    private JTextField textFieldR3;
    private JButton btnStoreR3;
    private JPanel pnlX1;
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
    private JPanel pnlX2;
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
    private JTextField textFieldX2;
    private JButton btnStoreX2;
    private JPanel pnlX3;
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
    private JTextField textFieldX3;
    private JButton btnStoreX3;
    private JPanel pnlMAR;
    private JLabel lblMAR;
    private JRadioButton rdbMAR_16;
    private JRadioButton rdbMAR_15;
    private JRadioButton rdbMAR_14;
    private JRadioButton rdbMAR_13;
    private JRadioButton rdbMAR_12;
    private JRadioButton rdbMAR_11;
    private JRadioButton rdbMAR_10;
    private JRadioButton rdbMAR_9;
    private JRadioButton rdbMAR_8;
    private JRadioButton rdbMAR_7;
    private JRadioButton rdbMAR_6;
    private JRadioButton rdbMAR_5;
    private JRadioButton rdbMAR_4;
    private JRadioButton rdbMAR_3;
    private JRadioButton rdbMAR_2;
    private JRadioButton rdbMAR_1;
    private JTextField textFieldMAR;
    private JButton btnStoreMAR;
    private JPanel pnlMBR;
    private JLabel lblMBR;
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
    private JTextField textFieldMBR;
    private JButton btnStoreMBR;
    private JPanel pnlMSR;
    private JLabel lblMSR;
    private JRadioButton rdbMSR_16;
    private JRadioButton rdbMSR_15;
    private JRadioButton rdbMSR_14;
    private JRadioButton rdbMSR_13;
    private JRadioButton rdbMSR_12;
    private JRadioButton rdbMSR_11;
    private JRadioButton rdbMSR_10;
    private JRadioButton rdbMSR_9;
    private JRadioButton rdbMSR_8;
    private JRadioButton rdbMSR_7;
    private JRadioButton rdbMSR_6;
    private JRadioButton rdbMSR_5;
    private JRadioButton rdbMSR_4;
    private JRadioButton rdbMSR_3;
    private JRadioButton rdbMSR_2;
    private JRadioButton rdbMSR_1;
    private JTextField textFieldMSR;
    private JButton btnStoreMSR;
    private JPanel pnlIR;
    private JLabel lblIR;
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
    private JTextField textFieldIR;
    private JButton btnStoreIR;
    private JPanel pnlPC;
    private JLabel lblPC;
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
    private JTextField textFieldPC;
    private JButton btnStorePC;
    private JPanel pnlCC;
    private JLabel lblCC;
    private JRadioButton rdbCC_4;
    private JRadioButton rdbCC_3;
    private JRadioButton rdbCC_2;
    private JRadioButton rdbCC_1;
    private JTextField textFieldCC;
    private JButton btnStoreCC;
    private JPanel pnlMFR;
    private JLabel lblMFR;
    private JRadioButton rdbMFR_4;
    private JRadioButton rdbMFR_3;
    private JRadioButton rdbMFR_2;
    private JRadioButton rdbMFR_1;
    private JTextField textFieldMFR;
    private JButton btnStoreMFR;
    private JButton btnIPL;
    private Registers registers;
    private MCU mcu;
    private JPanel pnlIns;
    private JLabel lblIns;
    private JRadioButton rdbIns_16;
    private JRadioButton rdbIns_15;
    private JRadioButton rdbIns_14;
    private JRadioButton rdbIns_13;
    private JRadioButton rdbIns_12;
    private JRadioButton rdbIns_11;
    private JRadioButton rdbIns_10;
    private JRadioButton rdbIns_9;
    private JRadioButton rdbIns_8;
    private JRadioButton rdbIns_7;
    private JRadioButton rdbIns_6;
    private JRadioButton rdbIns_5;
    private JRadioButton rdbIns_4;
    private JRadioButton rdbIns_3;
    private JRadioButton rdbIns_2;
    private JRadioButton rdbIns_1;
    private JButton btnExecute;
    private JTextArea consolePrinter;
    private JScrollPane scrollPane1;
    private JTextField textFieldAddress;
    private JTextField textFieldValue;
    private JPanel testPanel;
    private JPanel pnlAddress;
    private JLabel lblAddress;
    private JPanel pnlValue;
    private JLabel lblValue;
    private JPanel pnlButton;
    private JButton btnStore;
    private JButton btnLoad;
    private JLabel lblPrinter;
    private JLabel lblTestPanel;
    private JPanel pnlPrinter;

    private JLabel lblKeyboard;

    private JScrollPane scrollPane2;

    private JTextArea consoleKeyboard;
    private JPanel pnlOp;
    private JTable tableCache;

    private JPanel pnlCache;

    private JLabel lblCache;

    private JScrollPane scrollPane3;

    private JButton btn20Num;
    private JPanel pnlProgram1;

    private JLabel lblProgram1;

    private JButton btn1Num;
    private JPanel pnlKeyb;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrontPanel window = new FrontPanel();
                    window.frmCsciClassProject.setVisible(true);
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
        initCPU();
        initComponents();
        addListeners();
        refreshRegistersPanel();

    }

    /**
     * initialize the registers and the memory control unit
     */
    private void initCPU() {
        registers = new Registers();
        mcu = new MCU();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initComponents() {
        frmCsciClassProject = new JFrame();
        frmCsciClassProject.setTitle("CSCI6461 Class Project");
        frmCsciClassProject.setBounds(100, 100, 1368, 890);
        frmCsciClassProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlRegisters = new JPanel();
        pnlRegisters.setBounds(14, 169, 782, 617);

        pnlR3 = new JPanel();

        lblR_3 = new JLabel("R3");
        pnlR3.add(lblR_3);

        rdbR3_16 = new JRadioButton("");
        pnlR3.add(rdbR3_16);

        rdbR3_15 = new JRadioButton("");
        pnlR3.add(rdbR3_15);

        rdbR3_14 = new JRadioButton("");
        pnlR3.add(rdbR3_14);

        rdbR3_13 = new JRadioButton("");
        pnlR3.add(rdbR3_13);

        rdbR3_12 = new JRadioButton("");
        pnlR3.add(rdbR3_12);

        rdbR3_11 = new JRadioButton("");
        pnlR3.add(rdbR3_11);

        rdbR3_10 = new JRadioButton("");
        pnlR3.add(rdbR3_10);

        rdbR3_9 = new JRadioButton("");
        pnlR3.add(rdbR3_9);

        rdbR3_8 = new JRadioButton("");
        pnlR3.add(rdbR3_8);

        rdbR3_7 = new JRadioButton("");
        pnlR3.add(rdbR3_7);

        rdbR3_6 = new JRadioButton("");
        pnlR3.add(rdbR3_6);

        rdbR3_5 = new JRadioButton("");
        pnlR3.add(rdbR3_5);

        rdbR3_4 = new JRadioButton("");
        pnlR3.add(rdbR3_4);

        rdbR3_3 = new JRadioButton("");
        pnlR3.add(rdbR3_3);

        rdbR3_2 = new JRadioButton("");
        pnlR3.add(rdbR3_2);

        rdbR3_1 = new JRadioButton("");
        pnlR3.add(rdbR3_1);

        textFieldR3 = new JTextField();
        textFieldR3.setEditable(false);
        textFieldR3.setColumns(10);
        pnlR3.add(textFieldR3);

        btnStoreR3 = new JButton("store");
        pnlR3.add(btnStoreR3);

        pnlX1 = new JPanel();

        lblX = new JLabel("X1");
        pnlX1.add(lblX);

        rdbX1_16 = new JRadioButton("");
        pnlX1.add(rdbX1_16);

        rdbX1_15 = new JRadioButton("");
        pnlX1.add(rdbX1_15);

        rdbX1_14 = new JRadioButton("");
        pnlX1.add(rdbX1_14);

        rdbX1_13 = new JRadioButton("");
        pnlX1.add(rdbX1_13);

        rdbX1_12 = new JRadioButton("");
        pnlX1.add(rdbX1_12);

        rdbX1_11 = new JRadioButton("");
        pnlX1.add(rdbX1_11);

        rdbX1_10 = new JRadioButton("");
        pnlX1.add(rdbX1_10);

        rdbX1_9 = new JRadioButton("");
        pnlX1.add(rdbX1_9);

        rdbX1_8 = new JRadioButton("");
        pnlX1.add(rdbX1_8);

        rdbX1_7 = new JRadioButton("");
        pnlX1.add(rdbX1_7);

        rdbX1_6 = new JRadioButton("");
        pnlX1.add(rdbX1_6);

        rdbX1_5 = new JRadioButton("");
        pnlX1.add(rdbX1_5);

        rdbX1_4 = new JRadioButton("");
        pnlX1.add(rdbX1_4);

        rdbX1_3 = new JRadioButton("");
        pnlX1.add(rdbX1_3);

        rdbX1_2 = new JRadioButton("");
        pnlX1.add(rdbX1_2);

        rdbX1_1 = new JRadioButton("");
        pnlX1.add(rdbX1_1);

        textFieldX1 = new JTextField();
        textFieldX1.setEditable(false);
        textFieldX1.setColumns(10);
        pnlX1.add(textFieldX1);

        btnStoreX1 = new JButton("store");
        pnlX1.add(btnStoreX1);

        pnlX2 = new JPanel();

        lblX_1 = new JLabel("X2");
        pnlX2.add(lblX_1);

        rdbX2_16 = new JRadioButton("");
        pnlX2.add(rdbX2_16);

        rdbX2_15 = new JRadioButton("");
        pnlX2.add(rdbX2_15);

        rdbX2_14 = new JRadioButton("");
        pnlX2.add(rdbX2_14);

        rdbX2_13 = new JRadioButton("");
        pnlX2.add(rdbX2_13);

        rdbX2_12 = new JRadioButton("");
        pnlX2.add(rdbX2_12);

        rdbX2_11 = new JRadioButton("");
        pnlX2.add(rdbX2_11);

        rdbX2_10 = new JRadioButton("");
        pnlX2.add(rdbX2_10);

        rdbX2_9 = new JRadioButton("");
        pnlX2.add(rdbX2_9);

        rdbX2_8 = new JRadioButton("");
        pnlX2.add(rdbX2_8);

        rdbX2_7 = new JRadioButton("");
        pnlX2.add(rdbX2_7);

        rdbX2_6 = new JRadioButton("");
        pnlX2.add(rdbX2_6);

        rdbX2_5 = new JRadioButton("");
        pnlX2.add(rdbX2_5);

        rdbX2_4 = new JRadioButton("");
        pnlX2.add(rdbX2_4);

        rdbX2_3 = new JRadioButton("");
        pnlX2.add(rdbX2_3);

        rdbX2_2 = new JRadioButton("");
        pnlX2.add(rdbX2_2);

        rdbX2_1 = new JRadioButton("");
        pnlX2.add(rdbX2_1);

        textFieldX2 = new JTextField();
        textFieldX2.setEditable(false);
        textFieldX2.setColumns(10);
        pnlX2.add(textFieldX2);

        btnStoreX2 = new JButton("store");
        pnlX2.add(btnStoreX2);

        pnlX3 = new JPanel();

        lblX_2 = new JLabel("X3");
        pnlX3.add(lblX_2);

        rdbX3_16 = new JRadioButton("");
        pnlX3.add(rdbX3_16);

        rdbX3_15 = new JRadioButton("");
        pnlX3.add(rdbX3_15);

        rdbX3_14 = new JRadioButton("");
        pnlX3.add(rdbX3_14);

        rdbX3_13 = new JRadioButton("");
        pnlX3.add(rdbX3_13);

        rdbX3_12 = new JRadioButton("");
        pnlX3.add(rdbX3_12);

        rdbX3_11 = new JRadioButton("");
        pnlX3.add(rdbX3_11);

        rdbX3_10 = new JRadioButton("");
        pnlX3.add(rdbX3_10);

        rdbX3_9 = new JRadioButton("");
        pnlX3.add(rdbX3_9);

        rdbX3_8 = new JRadioButton("");
        pnlX3.add(rdbX3_8);

        rdbX3_7 = new JRadioButton("");
        pnlX3.add(rdbX3_7);

        rdbX3_6 = new JRadioButton("");
        pnlX3.add(rdbX3_6);

        rdbX3_5 = new JRadioButton("");
        pnlX3.add(rdbX3_5);

        rdbX3_4 = new JRadioButton("");
        pnlX3.add(rdbX3_4);

        rdbX3_3 = new JRadioButton("");
        pnlX3.add(rdbX3_3);

        rdbX3_2 = new JRadioButton("");
        pnlX3.add(rdbX3_2);

        rdbX3_1 = new JRadioButton("");
        pnlX3.add(rdbX3_1);

        textFieldX3 = new JTextField();
        textFieldX3.setEditable(false);
        textFieldX3.setColumns(10);
        pnlX3.add(textFieldX3);

        btnStoreX3 = new JButton("store");
        pnlX3.add(btnStoreX3);

        pnlMAR = new JPanel();

        lblMAR = new JLabel("MAR");
        pnlMAR.add(lblMAR);

        rdbMAR_16 = new JRadioButton("");
        pnlMAR.add(rdbMAR_16);

        rdbMAR_15 = new JRadioButton("");
        pnlMAR.add(rdbMAR_15);

        rdbMAR_14 = new JRadioButton("");
        pnlMAR.add(rdbMAR_14);

        rdbMAR_13 = new JRadioButton("");
        pnlMAR.add(rdbMAR_13);

        rdbMAR_12 = new JRadioButton("");
        pnlMAR.add(rdbMAR_12);

        rdbMAR_11 = new JRadioButton("");
        pnlMAR.add(rdbMAR_11);

        rdbMAR_10 = new JRadioButton("");
        pnlMAR.add(rdbMAR_10);

        rdbMAR_9 = new JRadioButton("");
        pnlMAR.add(rdbMAR_9);

        rdbMAR_8 = new JRadioButton("");
        pnlMAR.add(rdbMAR_8);

        rdbMAR_7 = new JRadioButton("");
        pnlMAR.add(rdbMAR_7);

        rdbMAR_6 = new JRadioButton("");
        pnlMAR.add(rdbMAR_6);

        rdbMAR_5 = new JRadioButton("");
        pnlMAR.add(rdbMAR_5);

        rdbMAR_4 = new JRadioButton("");
        pnlMAR.add(rdbMAR_4);

        rdbMAR_3 = new JRadioButton("");
        pnlMAR.add(rdbMAR_3);

        rdbMAR_2 = new JRadioButton("");
        pnlMAR.add(rdbMAR_2);

        rdbMAR_1 = new JRadioButton("");
        pnlMAR.add(rdbMAR_1);

        textFieldMAR = new JTextField();
        textFieldMAR.setEditable(false);
        textFieldMAR.setColumns(10);
        pnlMAR.add(textFieldMAR);

        btnStoreMAR = new JButton("store");
        pnlMAR.add(btnStoreMAR);

        pnlMBR = new JPanel();

        lblMBR = new JLabel("MBR");
        pnlMBR.add(lblMBR);

        rdbMBR_16 = new JRadioButton("");
        pnlMBR.add(rdbMBR_16);

        rdbMBR_15 = new JRadioButton("");
        pnlMBR.add(rdbMBR_15);

        rdbMBR_14 = new JRadioButton("");
        pnlMBR.add(rdbMBR_14);

        rdbMBR_13 = new JRadioButton("");
        pnlMBR.add(rdbMBR_13);

        rdbMBR_12 = new JRadioButton("");
        pnlMBR.add(rdbMBR_12);

        rdbMBR_11 = new JRadioButton("");
        pnlMBR.add(rdbMBR_11);

        rdbMBR_10 = new JRadioButton("");
        pnlMBR.add(rdbMBR_10);

        rdbMBR_9 = new JRadioButton("");
        pnlMBR.add(rdbMBR_9);

        rdbMBR_8 = new JRadioButton("");
        pnlMBR.add(rdbMBR_8);

        rdbMBR_7 = new JRadioButton("");
        pnlMBR.add(rdbMBR_7);

        rdbMBR_6 = new JRadioButton("");
        pnlMBR.add(rdbMBR_6);

        rdbMBR_5 = new JRadioButton("");
        pnlMBR.add(rdbMBR_5);

        rdbMBR_4 = new JRadioButton("");
        pnlMBR.add(rdbMBR_4);

        rdbMBR_3 = new JRadioButton("");
        pnlMBR.add(rdbMBR_3);

        rdbMBR_2 = new JRadioButton("");
        pnlMBR.add(rdbMBR_2);

        rdbMBR_1 = new JRadioButton("");
        pnlMBR.add(rdbMBR_1);

        textFieldMBR = new JTextField();
        textFieldMBR.setEditable(false);
        textFieldMBR.setColumns(10);
        pnlMBR.add(textFieldMBR);

        btnStoreMBR = new JButton("store");
        pnlMBR.add(btnStoreMBR);

        pnlMSR = new JPanel();

        lblMSR = new JLabel("MSR");
        pnlMSR.add(lblMSR);

        rdbMSR_16 = new JRadioButton("");
        pnlMSR.add(rdbMSR_16);

        rdbMSR_15 = new JRadioButton("");
        pnlMSR.add(rdbMSR_15);

        rdbMSR_14 = new JRadioButton("");
        pnlMSR.add(rdbMSR_14);

        rdbMSR_13 = new JRadioButton("");
        pnlMSR.add(rdbMSR_13);

        rdbMSR_12 = new JRadioButton("");
        pnlMSR.add(rdbMSR_12);

        rdbMSR_11 = new JRadioButton("");
        pnlMSR.add(rdbMSR_11);

        rdbMSR_10 = new JRadioButton("");
        pnlMSR.add(rdbMSR_10);

        rdbMSR_9 = new JRadioButton("");
        pnlMSR.add(rdbMSR_9);

        rdbMSR_8 = new JRadioButton("");
        pnlMSR.add(rdbMSR_8);

        rdbMSR_7 = new JRadioButton("");
        pnlMSR.add(rdbMSR_7);

        rdbMSR_6 = new JRadioButton("");
        pnlMSR.add(rdbMSR_6);

        rdbMSR_5 = new JRadioButton("");
        pnlMSR.add(rdbMSR_5);

        rdbMSR_4 = new JRadioButton("");
        pnlMSR.add(rdbMSR_4);

        rdbMSR_3 = new JRadioButton("");
        pnlMSR.add(rdbMSR_3);

        rdbMSR_2 = new JRadioButton("");
        pnlMSR.add(rdbMSR_2);

        rdbMSR_1 = new JRadioButton("");
        pnlMSR.add(rdbMSR_1);

        textFieldMSR = new JTextField();
        textFieldMSR.setEditable(false);
        textFieldMSR.setColumns(10);
        pnlMSR.add(textFieldMSR);

        btnStoreMSR = new JButton("store");
        pnlMSR.add(btnStoreMSR);

        pnlIR = new JPanel();

        lblIR = new JLabel("IR");
        pnlIR.add(lblIR);

        rdbIR_16 = new JRadioButton("");
        pnlIR.add(rdbIR_16);

        rdbIR_15 = new JRadioButton("");
        pnlIR.add(rdbIR_15);

        rdbIR_14 = new JRadioButton("");
        pnlIR.add(rdbIR_14);

        rdbIR_13 = new JRadioButton("");
        pnlIR.add(rdbIR_13);

        rdbIR_12 = new JRadioButton("");
        pnlIR.add(rdbIR_12);

        rdbIR_11 = new JRadioButton("");
        pnlIR.add(rdbIR_11);

        rdbIR_10 = new JRadioButton("");
        pnlIR.add(rdbIR_10);

        rdbIR_9 = new JRadioButton("");
        pnlIR.add(rdbIR_9);

        rdbIR_8 = new JRadioButton("");
        pnlIR.add(rdbIR_8);

        rdbIR_7 = new JRadioButton("");
        pnlIR.add(rdbIR_7);

        rdbIR_6 = new JRadioButton("");
        pnlIR.add(rdbIR_6);

        rdbIR_5 = new JRadioButton("");
        pnlIR.add(rdbIR_5);

        rdbIR_4 = new JRadioButton("");
        pnlIR.add(rdbIR_4);

        rdbIR_3 = new JRadioButton("");
        pnlIR.add(rdbIR_3);

        rdbIR_2 = new JRadioButton("");
        pnlIR.add(rdbIR_2);

        rdbIR_1 = new JRadioButton("");
        pnlIR.add(rdbIR_1);

        textFieldIR = new JTextField();
        textFieldIR.setEditable(false);
        textFieldIR.setColumns(10);
        pnlIR.add(textFieldIR);

        btnStoreIR = new JButton("store");
        pnlIR.add(btnStoreIR);

        pnlPC = new JPanel();

        lblPC = new JLabel("PC");
        pnlPC.add(lblPC);

        rdbPC_12 = new JRadioButton("");
        pnlPC.add(rdbPC_12);

        rdbPC_11 = new JRadioButton("");
        pnlPC.add(rdbPC_11);

        rdbPC_10 = new JRadioButton("");
        pnlPC.add(rdbPC_10);

        rdbPC_9 = new JRadioButton("");
        pnlPC.add(rdbPC_9);

        rdbPC_8 = new JRadioButton("");
        pnlPC.add(rdbPC_8);

        rdbPC_7 = new JRadioButton("");
        pnlPC.add(rdbPC_7);

        rdbPC_6 = new JRadioButton("");
        pnlPC.add(rdbPC_6);

        rdbPC_5 = new JRadioButton("");
        pnlPC.add(rdbPC_5);

        rdbPC_4 = new JRadioButton("");
        pnlPC.add(rdbPC_4);

        rdbPC_3 = new JRadioButton("");
        pnlPC.add(rdbPC_3);

        rdbPC_2 = new JRadioButton("");
        pnlPC.add(rdbPC_2);

        rdbPC_1 = new JRadioButton("");
        pnlPC.add(rdbPC_1);

        textFieldPC = new JTextField();
        textFieldPC.setEditable(false);
        textFieldPC.setColumns(10);
        pnlPC.add(textFieldPC);

        btnStorePC = new JButton("store");
        pnlPC.add(btnStorePC);
        pnlRegisters.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

        pnlR0 = new JPanel();

        lblR = new JLabel("R0");
        pnlR0.add(lblR);

        rdbR0_16 = new JRadioButton("");
        pnlR0.add(rdbR0_16);

        rdbR0_15 = new JRadioButton("");
        pnlR0.add(rdbR0_15);

        rdbR0_14 = new JRadioButton("");
        pnlR0.add(rdbR0_14);

        rdbR0_13 = new JRadioButton("");
        pnlR0.add(rdbR0_13);

        rdbR0_12 = new JRadioButton("");
        pnlR0.add(rdbR0_12);

        rdbR0_11 = new JRadioButton("");
        pnlR0.add(rdbR0_11);

        rdbR0_10 = new JRadioButton("");
        pnlR0.add(rdbR0_10);

        rdbR0_9 = new JRadioButton("");
        pnlR0.add(rdbR0_9);

        rdbR0_8 = new JRadioButton("");
        pnlR0.add(rdbR0_8);

        rdbR0_7 = new JRadioButton("");
        pnlR0.add(rdbR0_7);

        rdbR0_6 = new JRadioButton("");
        pnlR0.add(rdbR0_6);

        rdbR0_5 = new JRadioButton("");
        pnlR0.add(rdbR0_5);

        rdbR0_4 = new JRadioButton("");
        pnlR0.add(rdbR0_4);

        rdbR0_3 = new JRadioButton("");
        pnlR0.add(rdbR0_3);

        rdbR0_2 = new JRadioButton("");
        pnlR0.add(rdbR0_2);

        rdbR0_1 = new JRadioButton("");
        pnlR0.add(rdbR0_1);

        textFieldR0 = new JTextField();
        textFieldR0.setEditable(false);
        pnlR0.add(textFieldR0);
        textFieldR0.setColumns(10);

        btnStoreR0 = new JButton("store");
        pnlR0.add(btnStoreR0);
        pnlRegisters.add(pnlR0);

        pnlR1 = new JPanel();

        lblR_1 = new JLabel("R1");
        pnlR1.add(lblR_1);

        rdbR1_16 = new JRadioButton("");
        pnlR1.add(rdbR1_16);

        rdbR1_15 = new JRadioButton("");
        pnlR1.add(rdbR1_15);

        rdbR1_14 = new JRadioButton("");
        pnlR1.add(rdbR1_14);

        rdbR1_13 = new JRadioButton("");
        pnlR1.add(rdbR1_13);

        rdbR1_12 = new JRadioButton("");
        pnlR1.add(rdbR1_12);

        rdbR1_11 = new JRadioButton("");
        pnlR1.add(rdbR1_11);

        rdbR1_10 = new JRadioButton("");
        pnlR1.add(rdbR1_10);

        rdbR1_9 = new JRadioButton("");
        pnlR1.add(rdbR1_9);

        rdbR1_8 = new JRadioButton("");
        pnlR1.add(rdbR1_8);

        rdbR1_7 = new JRadioButton("");
        pnlR1.add(rdbR1_7);

        rdbR1_6 = new JRadioButton("");
        pnlR1.add(rdbR1_6);

        rdbR1_5 = new JRadioButton("");
        pnlR1.add(rdbR1_5);

        rdbR1_4 = new JRadioButton("");
        pnlR1.add(rdbR1_4);

        rdbR1_3 = new JRadioButton("");
        pnlR1.add(rdbR1_3);

        rdbR1_2 = new JRadioButton("");
        pnlR1.add(rdbR1_2);

        rdbR1_1 = new JRadioButton("");
        pnlR1.add(rdbR1_1);

        textFieldR1 = new JTextField();
        textFieldR1.setEditable(false);
        textFieldR1.setColumns(10);
        pnlR1.add(textFieldR1);

        btnStoreR1 = new JButton("store");
        pnlR1.add(btnStoreR1);
        pnlRegisters.add(pnlR1);

        pnlR2 = new JPanel();

        lblR_2 = new JLabel("R2");
        pnlR2.add(lblR_2);

        rdbR2_16 = new JRadioButton("");
        pnlR2.add(rdbR2_16);

        rdbR2_15 = new JRadioButton("");
        pnlR2.add(rdbR2_15);

        rdbR2_14 = new JRadioButton("");
        pnlR2.add(rdbR2_14);

        rdbR2_13 = new JRadioButton("");
        pnlR2.add(rdbR2_13);

        rdbR2_12 = new JRadioButton("");
        pnlR2.add(rdbR2_12);

        rdbR2_11 = new JRadioButton("");
        pnlR2.add(rdbR2_11);

        rdbR2_10 = new JRadioButton("");
        pnlR2.add(rdbR2_10);

        rdbR2_9 = new JRadioButton("");
        pnlR2.add(rdbR2_9);

        rdbR2_8 = new JRadioButton("");
        pnlR2.add(rdbR2_8);

        rdbR2_7 = new JRadioButton("");
        pnlR2.add(rdbR2_7);

        rdbR2_6 = new JRadioButton("");
        pnlR2.add(rdbR2_6);

        rdbR2_5 = new JRadioButton("");
        pnlR2.add(rdbR2_5);

        rdbR2_4 = new JRadioButton("");
        pnlR2.add(rdbR2_4);

        rdbR2_3 = new JRadioButton("");
        pnlR2.add(rdbR2_3);

        rdbR2_2 = new JRadioButton("");
        pnlR2.add(rdbR2_2);

        rdbR2_1 = new JRadioButton("");
        pnlR2.add(rdbR2_1);

        textFieldR2 = new JTextField();
        textFieldR2.setEditable(false);
        textFieldR2.setColumns(10);
        pnlR2.add(textFieldR2);

        btnStoreR2 = new JButton("store");
        pnlR2.add(btnStoreR2);
        pnlRegisters.add(pnlR2);
        pnlRegisters.add(pnlR3);
        pnlRegisters.add(pnlX1);
        pnlRegisters.add(pnlX2);
        pnlRegisters.add(pnlX3);
        pnlRegisters.add(pnlMAR);
        pnlRegisters.add(pnlMBR);
        pnlRegisters.add(pnlMSR);

        pnlMFR = new JPanel();

        lblMFR = new JLabel("MFR");
        pnlMFR.add(lblMFR);

        rdbMFR_4 = new JRadioButton("");
        pnlMFR.add(rdbMFR_4);

        rdbMFR_3 = new JRadioButton("");
        pnlMFR.add(rdbMFR_3);

        rdbMFR_2 = new JRadioButton("");
        pnlMFR.add(rdbMFR_2);

        rdbMFR_1 = new JRadioButton("");
        pnlMFR.add(rdbMFR_1);

        textFieldMFR = new JTextField();
        textFieldMFR.setEditable(false);
        textFieldMFR.setColumns(10);
        pnlMFR.add(textFieldMFR);

        btnStoreMFR = new JButton("store");
        pnlMFR.add(btnStoreMFR);
        pnlRegisters.add(pnlMFR);
        pnlRegisters.add(pnlPC);
        pnlRegisters.add(pnlIR);

        pnlCC = new JPanel();

        lblCC = new JLabel("CC");
        pnlCC.add(lblCC);

        rdbCC_4 = new JRadioButton("");
        pnlCC.add(rdbCC_4);

        rdbCC_3 = new JRadioButton("");
        pnlCC.add(rdbCC_3);

        rdbCC_2 = new JRadioButton("");
        pnlCC.add(rdbCC_2);

        rdbCC_1 = new JRadioButton("");
        pnlCC.add(rdbCC_1);

        textFieldCC = new JTextField();
        textFieldCC.setEditable(false);
        textFieldCC.setColumns(10);
        pnlCC.add(textFieldCC);

        btnStoreCC = new JButton("store");
        pnlCC.add(btnStoreCC);
        pnlRegisters.add(pnlCC);

        btnIPL = new JButton("IPL");
        btnIPL.setBounds(821, 53, 136, 69);

        testPanel = new JPanel();
        testPanel.setBounds(831, 621, 207, 165);
        testPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

        lblTestPanel = new JLabel("Memory interface");
        testPanel.add(lblTestPanel);

        pnlAddress = new JPanel();
        testPanel.add(pnlAddress);
        pnlAddress.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        lblAddress = new JLabel("address");
        pnlAddress.add(lblAddress);

        textFieldAddress = new JTextField();
        textFieldAddress.setText("0");
        pnlAddress.add(textFieldAddress);
        textFieldAddress.setColumns(10);

        pnlValue = new JPanel();
        testPanel.add(pnlValue);
        pnlValue.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        lblValue = new JLabel("value");
        pnlValue.add(lblValue);

        textFieldValue = new JTextField();
        textFieldValue.setText("0");
        pnlValue.add(textFieldValue);
        textFieldValue.setColumns(10);

        pnlButton = new JPanel();
        testPanel.add(pnlButton);
        pnlButton.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        btnStore = new JButton("store");
        pnlButton.add(btnStore);

        btnLoad = new JButton("load");
        pnlButton.add(btnLoad);
        setEnableForPanel(pnlRegisters, false);

        pnlPrinter = new JPanel();
        pnlPrinter.setBounds(821, 184, 254, 201);
        pnlPrinter.setLayout(new BoxLayout(pnlPrinter, BoxLayout.Y_AXIS));

        lblPrinter = new JLabel("Console Printer");
        pnlPrinter.add(lblPrinter);

        scrollPane1 = new JScrollPane();
        pnlPrinter.add(scrollPane1);

        consolePrinter = new JTextArea();
        consolePrinter.setLineWrap(true);
        consolePrinter.setEditable(false);
        scrollPane1.setViewportView(consolePrinter);

        pnlOp = new JPanel();
        pnlOp.setBounds(14, 45, 715, 98);
        pnlOp.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

        pnlIns = new JPanel();
        pnlOp.add(pnlIns);
        pnlIns.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        lblIns = new JLabel("Instruction");
        pnlIns.add(lblIns);

        rdbIns_16 = new JRadioButton("");
        pnlIns.add(rdbIns_16);

        rdbIns_15 = new JRadioButton("");
        pnlIns.add(rdbIns_15);

        rdbIns_14 = new JRadioButton("");
        pnlIns.add(rdbIns_14);

        rdbIns_13 = new JRadioButton("");
        pnlIns.add(rdbIns_13);

        rdbIns_12 = new JRadioButton("");
        pnlIns.add(rdbIns_12);

        rdbIns_11 = new JRadioButton("");
        pnlIns.add(rdbIns_11);

        rdbIns_10 = new JRadioButton("");
        pnlIns.add(rdbIns_10);

        rdbIns_9 = new JRadioButton("");
        pnlIns.add(rdbIns_9);

        rdbIns_8 = new JRadioButton("");
        pnlIns.add(rdbIns_8);

        rdbIns_7 = new JRadioButton("");
        pnlIns.add(rdbIns_7);

        rdbIns_6 = new JRadioButton("");
        pnlIns.add(rdbIns_6);

        rdbIns_5 = new JRadioButton("");
        pnlIns.add(rdbIns_5);

        rdbIns_4 = new JRadioButton("");
        pnlIns.add(rdbIns_4);

        rdbIns_3 = new JRadioButton("");
        pnlIns.add(rdbIns_3);

        rdbIns_2 = new JRadioButton("");
        pnlIns.add(rdbIns_2);

        rdbIns_1 = new JRadioButton("");
        pnlIns.add(rdbIns_1);

        btnExecute = new JButton("execute");
        pnlIns.add(btnExecute);

        // set the panels to disabled
        // after you push the IPL button on the frontpanel, these panels will be
        // set to enabled
        setEnableForPanel(pnlIns, false);

        pnlCache = new JPanel();
        pnlCache.setBounds(1119, 325, 217, 223);

        lblCache = new JLabel("Cache");

        scrollPane3 = new JScrollPane();

        tableCache = new JTable(16, 2);
        tableCache.setEnabled(false);
        scrollPane3.setViewportView(tableCache);
        tableCache.setModel(new DefaultTableModel(
                new Object[][] { { null, null }, { null, null }, { null, null }, { null, null }, { null, null },
                        { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null },
                        { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, },
                new String[] { "Tag", "Data" }));
        pnlCache.setLayout(new BoxLayout(pnlCache, BoxLayout.Y_AXIS));
        pnlCache.add(lblCache);
        pnlCache.add(scrollPane3);

        pnlProgram1 = new JPanel();
        pnlProgram1.setBounds(1159, 184, 177, 111);

        lblProgram1 = new JLabel("Program 1");
        pnlProgram1.add(lblProgram1);

        btn20Num = new JButton("read 20 numbers");
        pnlProgram1.add(btn20Num);

        btn1Num = new JButton("read 1 number");
        pnlProgram1.add(btn1Num);
        setEnableForPanel(pnlProgram1, false);
        frmCsciClassProject.getContentPane().setLayout(null);
        frmCsciClassProject.getContentPane().add(pnlOp);
        frmCsciClassProject.getContentPane().add(pnlRegisters);
        frmCsciClassProject.getContentPane().add(btnIPL);
        frmCsciClassProject.getContentPane().add(pnlPrinter);
        frmCsciClassProject.getContentPane().add(testPanel);
        frmCsciClassProject.getContentPane().add(pnlProgram1);
        frmCsciClassProject.getContentPane().add(pnlCache);
                                
                                pnlKeyb = new JPanel();
                                pnlKeyb.setBounds(821, 397, 254, 201);
                                frmCsciClassProject.getContentPane().add(pnlKeyb);
                                pnlKeyb.setLayout(new BoxLayout(pnlKeyb, BoxLayout.Y_AXIS));
                                
                                        lblKeyboard = new JLabel("Console Keyboard");
                                        pnlKeyb.add(lblKeyboard);
                                        
                                                scrollPane2 = new JScrollPane();
                                                pnlKeyb.add(scrollPane2);
                                                
                                                        consoleKeyboard = new JTextArea();
                                                        consoleKeyboard.setLineWrap(true);
                                                        scrollPane2.setViewportView(consoleKeyboard);
        enableFlag = 0;

    }

    /**
     * Add listeners to the components
     */
    private void addListeners() {

        // add listener to the store button of R0. when you push the store
        // button, the selecting status of the radiobuttons will be read, and
        // this method will calculate the value of the register, then put it
        // into the textfield and store it into the
        // register. no effective value will be read from textfield
        btnStoreR0.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                int i = 0;
                boolean sign = false;
                for (Component com : pnlR0.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        if (i == 0) {
                            sign = rdb.isSelected() ? true : false;
                        }
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                        i++;
                    }
                }
                int value = StringUtil.signedBinaryToDecimal(buffer.toString(), sign);
                textFieldR0.setText(String.valueOf(value));
                registers.setR0(value);
                System.out.println("R0 is set to: " + value);
                printConsole("R0 is set to: " + value);
            }
        });
        // add listener to the store button of R1
        btnStoreR1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                int i = 0;
                boolean sign = false;
                for (Component com : pnlR1.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        if (i == 0) {
                            sign = rdb.isSelected() ? true : false;
                        }
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                        i++;
                    }
                }
                int value = StringUtil.signedBinaryToDecimal(buffer.toString(), sign);
                textFieldR1.setText(String.valueOf(value));
                registers.setR1(value);
                System.out.println("R1 is set to: " + value);
                printConsole("R1 is set to: " + value);
            }
        });
        // add listener to the store button of R2
        btnStoreR2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                int i = 0;
                boolean sign = false;
                for (Component com : pnlR2.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        if (i == 0) {
                            sign = rdb.isSelected() ? true : false;
                        }
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                        i++;
                    }
                }
                int value = StringUtil.signedBinaryToDecimal(buffer.toString(), sign);
                textFieldR2.setText(String.valueOf(value));
                registers.setR2(value);
                System.out.println("R2 is set to: " + value);
                printConsole("R2 is set to: " + value);
            }
        });
        // add listener to the store button of R3
        btnStoreR3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                int i = 0;
                boolean sign = false;
                for (Component com : pnlR3.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        if (i == 0) {
                            sign = rdb.isSelected() ? true : false;
                        }
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                        i++;
                    }
                }
                int value = StringUtil.signedBinaryToDecimal(buffer.toString(), sign);
                textFieldR3.setText(String.valueOf(value));
                registers.setR3(value);
                System.out.println("R3 is set to: " + value);
                printConsole("R3 is set to: " + value);
            }
        });
        // add listener to the store button of X1
        btnStoreX1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlX1.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldX1.setText(String.valueOf(value));
                registers.setX1(value);
                System.out.println("X1 is set to: " + value);
                printConsole("X1 is set to: " + value);
            }
        });
        // add listener to the store button of X2
        btnStoreX2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlX2.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldX2.setText(String.valueOf(value));
                registers.setX2(value);
                System.out.println("X2 is set to: " + value);
                printConsole("X2 is set to: " + value);
            }
        });
        // add listener to the store button of X3
        btnStoreX3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlX3.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldX3.setText(String.valueOf(value));
                registers.setX1(value);
                System.out.println("X3 is set to: " + value);
                printConsole("X3 is set to: " + value);
            }
        });
        // add listener to the store button of MAR
        btnStoreMAR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlMAR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldMAR.setText(String.valueOf(value));
                registers.setMAR(value);
                System.out.println("MAR is set to: " + value);
                printConsole("MAR is set to: " + value);
            }
        });
        // add listener to the store button of MBR
        btnStoreMBR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlMBR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldMBR.setText(String.valueOf(value));
                registers.setMBR(value);
                System.out.println("MBR is set to: " + value);
                printConsole("MBR is set to: " + value);
            }
        });
        // add listener to the store button of MSR
        btnStoreMSR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlMSR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldMSR.setText(String.valueOf(value));
                registers.setMSR(value);
                System.out.println("MSR is set to: " + value);
                printConsole("MSR is set to: " + value);
            }
        });
        // add listener to the store button of MFR
        btnStoreMFR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlMFR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldMFR.setText(String.valueOf(value));
                registers.setMFR(value);
                System.out.println("MFR is set to: " + value);
                printConsole("MFR is set to: " + value);
            }
        });
        // add listener to the store button of PC
        btnStorePC.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlPC.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldPC.setText(String.valueOf(value));
                registers.setPC(value);
                System.out.println("PC is set to: " + value);
                printConsole("PC is set to: " + value);
            }
        });
        // add listener to the store button of ID
        btnStoreIR.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlIR.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }

                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldIR.setText(String.valueOf(value));
                registers.setIR(value);
                System.out.println("IR is set to: " + value);
                printConsole("IR is set to: " + value);
            }
        });
        // add listener to the store button of CC
        btnStoreCC.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlCC.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                textFieldCC.setText(String.valueOf(value));
                registers.setCC(value);
                System.out.println("CC is set to: " + value);
                printConsole("CC is set to: " + value);
            }
        });

        // add listener to the execute button of instruction
        btnExecute.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                StringBuffer buffer = new StringBuffer();
                for (Component com : pnlIns.getComponents()) {
                    if (com instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) com;
                        buffer = rdb.isSelected() ? buffer.append("1") : buffer.append("0");
                    }
                }
                int value = StringUtil.binaryToDecimal(buffer.toString());
                refreshRegistersPanel();
                mcu.storeIntoMemory(registers.getPC(), value);
                registers.setMAR(registers.getPC());
                registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                registers.setIR(registers.getMBR());
                refreshRegistersPanel();
                runInstruction(registers.getBinaryStringIr(), registers, mcu);
                //registers.increasePCByOne(); // TODO fix it
                refreshRegistersPanel();
            }
        });

        // add listener to the IPL button
        btnIPL.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (enableFlag == 0) {
                    setEnableForPanel(pnlIns, true);
                    setEnableForPanel(pnlRegisters, true);
                    setEnableForPanel(pnlProgram1, true);
                    mcu.loadProgram(Const.TB);
                    prog1Step = 0;
                    enableFlag = 1;
                    

                }
                mcu.loadMemoryFromROM();
                refreshRegistersPanel();
                registers.setPC(Const.BOOT_PROG_BASE);
                int end = Const.ROM.size() + Const.BOOT_PROG_BASE;

                do {
                    refreshRegistersPanel();
                    registers.setMAR(registers.getPC());
                    registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                    registers.setIR(registers.getMBR());
                    runInstruction(registers.getBinaryStringIr(), registers, mcu);
                    refreshRegistersPanel();
                    //registers.increasePCByOne();// TODO fix it

                } while (registers.getPC() < end);
                registers.setPC(8);
                refreshRegistersPanel();
                printConsole("IPL complete!");
            }
        });
        btnLoad.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int address = Integer.parseInt(textFieldAddress.getText());
                if (address > mcu.getCurrentMemorySize() - 1 || address < 0) {
                    JOptionPane.showMessageDialog(null,
                            "Memory between 0 and " + (mcu.getCurrentMemorySize() - 1) + "!");
                } else {
                    int value = mcu.fetchFromMemory(address);
                    textFieldValue.setText(String.valueOf(value));
                }
            }
        });

        btnStore.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int address = Integer.parseInt(textFieldAddress.getText());
                int value = Integer.parseInt(textFieldValue.getText());
                if (address > mcu.getCurrentMemorySize() - 1 || address < 0) {
                    JOptionPane.showMessageDialog(null,
                            "Memory between 0 and " + (mcu.getCurrentMemorySize() - 1) + "!");
                } else if (value > 0xffff || value < 0) {
                    JOptionPane.showMessageDialog(null, "Value between 0 and 65535!");
                } else {
                    mcu.storeIntoMemory(address, value);
                    textFieldAddress.setText("0");
                    textFieldValue.setText("0");
                    printConsole("store memory address " + address + " with value " + value);
                }
            }
        });

        textFieldAddress.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent arg0) {
                textFieldAddress.selectAll();
            }

            @Override
            public void focusLost(FocusEvent arg0) {

            }
        });
        textFieldValue.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent arg0) {
                textFieldValue.selectAll();
            }

            @Override
            public void focusLost(FocusEvent arg0) {

            }
        });
        consoleKeyboard.addKeyListener(new KeyAdapter() { // TODO
            public void keyReleased(KeyEvent e) {
                mcu.setKeyboardBuffer(consoleKeyboard.getText());
            }
        });

        btn20Num.addMouseListener(new MouseAdapter() { // TODO
            public void mousePressed(MouseEvent e) {
                if (prog1Step == 0) {
                    // read 20 numbers from the console keyboard
                    mcu.loadProgram(Const.Pre);
                    mcu.loadProgram(Const.PG1_20);
                    registers.setPC(Const.PG_20_BASE); //TODO FIXIT
                    int end = Const.PG_20_BASE + Const.PG1_20.size();
                    refreshRegistersPanel();
                    do {
                        refreshRegistersPanel();
                        registers.setMAR(registers.getPC());
                        registers.setMBR(mcu.fetchFromCache(registers.getMAR()));
                        registers.setIR(registers.getMBR());
                        runInstruction(registers.getBinaryStringIr(), registers, mcu);
                        refreshRegistersPanel();
                        //registers.increasePCByOne();// TODO fix it
                    } while (registers.getPC() < end);
                    prog1Step = 1;
                }

            }
        });

        btn1Num.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                if (prog1Step == 1) {
                    // read 1 number from the concole keyboard and run program 1

                    prog1Step = 0;
                }
            }
        });

    }

    private void refreshCacheTable() {
        int row = 0;
        for (CacheLine line : mcu.getCache().getCacheLines()) {
            this.tableCache.setValueAt(line.getTag(), row, 0);
            this.tableCache.setValueAt(line.getData(), row, 1);
            row++;
        }

    }

    private void pushConsoleBuffer() {
        if (mcu.getPrinterBuffer() != null) {
            consolePrinter.append(mcu.getPrinterBuffer());
            mcu.setPrinterBuffer("");
        }
        if (mcu.getKeyboardBuffer() != null) {
            consoleKeyboard.setText(mcu.getKeyboardBuffer());
        }
    }

    /**
     * This method will read the value of every register and set the radio
     * buttons and text field according to the value of the register.
     */
    private void refreshRegistersPanel() {
        for (Component com : pnlRegisters.getComponents()) {
            if (com instanceof JPanel) {
                JPanel pnl = (JPanel) com;
                int regVal = 0;
                int bitLong = 0;
                String bitString = "";
                int i = 0;
                for (Component comm : pnl.getComponents()) {
                    if (comm instanceof JLabel) {
                        JLabel lbl = (JLabel) comm;
                        regVal = registers.getRegistersByName(lbl.getText());
                        bitLong = registers.getBitLongByName(lbl.getText());
                        bitString = StringUtil.decimalToBinary(regVal, bitLong);
                        i = bitLong;
                    }
                    if (comm instanceof JRadioButton) {
                        JRadioButton rdb = (JRadioButton) comm;
                        if (bitString.charAt(bitLong - i) == '1') {
                            rdb.setSelected(true);
                        } else {
                            rdb.setSelected(false);
                        }
                        i--;
                    }
                    if (comm instanceof JTextField) {
                        JTextField txt = (JTextField) comm;
                        txt.setText(String.valueOf(regVal));
                    }
                }
            }
        }
    }

    /**
     * 
     * set every component in the panel enabled/disabled according to the flag
     * 
     * @param panel
     * @param flag
     *            true: enable; false: disable
     * 
     */
    private void setEnableForPanel(JPanel panel, boolean flag) {
        for (Component com : panel.getComponents()) {
            if (com instanceof JPanel) {
                JPanel subPanel = (JPanel) com;
                this.setEnableForPanel(subPanel, flag);
            } else {
                com.setEnabled(flag);
            }
        }
    }

    /**
     * 
     * print a message in the console
     * 
     * @param message
     *            the message you want to print
     * 
     */
    private void printConsole(String message) {
        consolePrinter.append(message + "\n");
    }

    /**
     * 
     * run the instruction
     * 
     * @param instruction
     *            instruction in binary String, for example "0000000000000000".
     * @param registers
     * @param mcu
     * 
     */
    private void runInstruction(String instruction, Registers registers, MCU mcu) {

        // execute button event
        String opCode = instruction.substring(0, 6);
        try {
            if (Const.OPCODE.containsKey(opCode)) {

                AbstractInstruction instr = (AbstractInstruction) Class
                        .forName("alu.instruction." + Const.OPCODE.get(opCode)).newInstance();
                instr.execute(instruction, registers, mcu);
                System.out.println("instruction: " + instruction);
                // printConsole("instruction: " + instruction);
                refreshCacheTable();
                pushConsoleBuffer();

                String message = instr.getExecuteMessage();
                System.out.println(message);
                //
                // TODO do something with this message
                //

            } else {
                // we don't have that kind of instruction
                throw new MachineFaultException(Const.FaultCode.ILL_OPRC.getValue());
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MachineFaultException t) {
            // handle the machine fault

            t.printStackTrace();
            handleMachineFault(t.getFaultCode());
        }
    }

    private void handleMachineFault(int faultCode) {
        //
        // TODO write something to handle the machine fault
        //
        JOptionPane.showMessageDialog(null, "Program stop!");

    }
}