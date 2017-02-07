package Frontpanel;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class Frontpanel {

	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Frontpanel window = new Frontpanel();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(694, 503);
		shell.setText("SWT Application");
		
		Button btnRadioButton = new Button(shell, SWT.RADIO);
		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton.setBounds(25, 17, 78, 18);
		btnRadioButton.setText("1");
		
		Button button = new Button(shell, SWT.RADIO);
		button.setBounds(60, 17, 90, 18);
		button.setText("2");
		
		Button button_1 = new Button(shell, SWT.RADIO);
		button_1.setBounds(96, 17, 90, 18);
		button_1.setText("3");
		
		Button button_2 = new Button(shell, SWT.RADIO);
		button_2.setBounds(130, 17, 90, 18);
		button_2.setText("4");
		
		Button button_3 = new Button(shell, SWT.RADIO);
		button_3.setBounds(169, 17, 90, 18);
		button_3.setText("5");
		
		Button button_4 = new Button(shell, SWT.RADIO);
		button_4.setBounds(204, 17, 90, 18);
		button_4.setText("6");
		
		Button button_5 = new Button(shell, SWT.RADIO);
		button_5.setBounds(239, 17, 90, 18);
		button_5.setText("7");
		
		Button button_6 = new Button(shell, SWT.RADIO);
		button_6.setBounds(275, 17, 90, 18);
		button_6.setText("8");
		
		Button button_7 = new Button(shell, SWT.RADIO);
		button_7.setBounds(309, 17, 90, 18);
		button_7.setText("9");
		
		Button button_8 = new Button(shell, SWT.RADIO);
		button_8.setBounds(350, 17, 90, 18);
		button_8.setText("10");
		
		Button button_9 = new Button(shell, SWT.RADIO);
		button_9.setBounds(25, 41, 90, 18);
		button_9.setText("11");
		
		Button button_10 = new Button(shell, SWT.RADIO);
		button_10.setBounds(60, 41, 90, 18);
		button_10.setText("12");
		
		Button button_11 = new Button(shell, SWT.RADIO);
		button_11.setBounds(96, 41, 90, 18);
		button_11.setText("13");
		
		Button button_12 = new Button(shell, SWT.RADIO);
		button_12.setBounds(130, 41, 90, 18);
		button_12.setText("14");
		
		Button button_13 = new Button(shell, SWT.RADIO);
		button_13.setBounds(169, 41, 90, 18);
		button_13.setText("15");
		
		Button button_14 = new Button(shell, SWT.RADIO);
		button_14.setBounds(204, 41, 90, 18);
		button_14.setText("16");
		
		Button button_15 = new Button(shell, SWT.RADIO);
		button_15.setBounds(239, 41, 90, 18);
		button_15.setText("17");
		
		Button button_16 = new Button(shell, SWT.RADIO);
		button_16.setBounds(275, 41, 90, 18);
		button_16.setText("18");
		
		Button button_17 = new Button(shell, SWT.RADIO);
		button_17.setBounds(309, 41, 90, 18);
		button_17.setText("19");
		
		Button button_18 = new Button(shell, SWT.RADIO);
		button_18.setBounds(350, 41, 90, 18);
		button_18.setText("20");
		
		Button btnSingleStep = new Button(shell, SWT.NONE);
		btnSingleStep.setBounds(271, 65, 94, 28);
		btnSingleStep.setText("Single Step");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(25, 109, 64, 19);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(135, 109, 64, 19);
		
		Label lblAdress = new Label(shell, SWT.NONE);
		lblAdress.setBounds(30, 89, 59, 14);
		lblAdress.setText("Adress");
		
		Label lblValue = new Label(shell, SWT.NONE);
		lblValue.setBounds(136, 89, 59, 14);
		lblValue.setText("Value");
		
		Button btnStoreOnMemory = new Button(shell, SWT.NONE);
		btnStoreOnMemory.setBounds(250, 100, 122, 28);
		btnStoreOnMemory.setText("Store on Memory");
		
		Label lblOpcode = new Label(shell, SWT.NONE);
		lblOpcode.setBounds(25, 155, 106, 14);
		lblOpcode.setText("Opcode:000000");
		
		Button btnRadioButton_1 = new Button(shell, SWT.RADIO);
		btnRadioButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton_1.setBounds(25, 198, 16, 18);
		
		Button btnRadioButton_2 = new Button(shell, SWT.RADIO);
		btnRadioButton_2.setBounds(25, 198, 16, 18);
		
		Button btnRadioButton_3 = new Button(shell, SWT.RADIO);
		btnRadioButton_3.setBounds(47, 198, 22, 18);
		
		Button button_19 = new Button(shell, SWT.RADIO);
		button_19.setBounds(554, 198, 16, 18);
		
		Button button_20 = new Button(shell, SWT.RADIO);
		button_20.setBounds(75, 198, 22, 18);
		
		Button button_21 = new Button(shell, SWT.RADIO);
		button_21.setBounds(96, 198, 22, 18);
		
		Button button_22 = new Button(shell, SWT.RADIO);
		button_22.setBounds(170, 198, 16, 18);
		
		Button btnRadioButton_4 = new Button(shell, SWT.RADIO);
		btnRadioButton_4.setBounds(124, 198, 16, 18);
		
		Button button_23 = new Button(shell, SWT.RADIO);
		button_23.setBounds(192, 198, 22, 18);
		
		Button button_24 = new Button(shell, SWT.RADIO);
		button_24.setBounds(220, 198, 16, 18);
		
		Button button_25 = new Button(shell, SWT.RADIO);
		button_25.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_25.setBounds(265, 198, 22, 18);
		
		Button button_26 = new Button(shell, SWT.RADIO);
		button_26.setBounds(243, 198, 16, 18);
		
		Button button_27 = new Button(shell, SWT.RADIO);
		button_27.setBounds(309, 198, 16, 18);
		
		Button button_28 = new Button(shell, SWT.RADIO);
		button_28.setBounds(331, 198, 16, 18);
		
		Button button_29 = new Button(shell, SWT.RADIO);
		button_29.setBounds(350, 198, 22, 18);
		
		Button button_30 = new Button(shell, SWT.RADIO);
		button_30.setBounds(377, 198, 22, 18);
		
		Button button_31 = new Button(shell, SWT.RADIO);
		button_31.setBounds(405, 198, 20, 18);
		
		Button button_32 = new Button(shell, SWT.RADIO);
		button_32.setBounds(451, 198, 16, 18);
		
		Button button_33 = new Button(shell, SWT.RADIO);
		button_33.setBounds(469, 198, 22, 18);
		
		Button button_34 = new Button(shell, SWT.RADIO);
		button_34.setBounds(497, 198, 22, 18);
		
		Button button_35 = new Button(shell, SWT.RADIO);
		button_35.setBounds(526, 198, 22, 18);
		
		Button btnStore = new Button(shell, SWT.NONE);
		btnStore.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnStore.setBounds(594, 192, 90, 28);
		btnStore.setText("store");
		
		Label lblR = new Label(shell, SWT.NONE);
		lblR.setBounds(4, 199, 16, 14);
		lblR.setText("R0");
		
		Label lblR_1 = new Label(shell, SWT.NONE);
		lblR_1.setBounds(4, 225, 16, 14);
		lblR_1.setText("R1");
		
		Label lblR_2 = new Label(shell, SWT.NONE);
		lblR_2.setBounds(4, 252, 16, 14);
		lblR_2.setText("R2");
		
		Label lblR_3 = new Label(shell, SWT.NONE);
		lblR_3.setBounds(4, 285, 22, 14);
		lblR_3.setText("R3");
		
		Button button_36 = new Button(shell, SWT.RADIO);
		button_36.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_36.setBounds(51, 224, 16, 18);
		
		Button button_37 = new Button(shell, SWT.RADIO);
		button_37.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_37.setBounds(25, 224, 16, 18);
		
		Button button_38 = new Button(shell, SWT.RADIO);
		button_38.setBounds(99, 224, 16, 18);
		
		Button button_39 = new Button(shell, SWT.RADIO);
		button_39.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_39.setBounds(124, 224, 22, 18);
		
		Button button_40 = new Button(shell, SWT.RADIO);
		button_40.setBounds(75, 224, 22, 18);
		
		Button button_41 = new Button(shell, SWT.RADIO);
		button_41.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_41.setBounds(169, 224, 16, 18);
		
		Button button_42 = new Button(shell, SWT.RADIO);
		button_42.setBounds(192, 224, 22, 18);
		
		Button button_43 = new Button(shell, SWT.RADIO);
		button_43.setBounds(220, 224, 16, 18);
		
		Button button_44 = new Button(shell, SWT.RADIO);
		button_44.setBounds(239, 224, 20, 18);
		
		Button button_45 = new Button(shell, SWT.RADIO);
		button_45.setBounds(265, 224, 22, 18);
		
		Button button_46 = new Button(shell, SWT.RADIO);
		button_46.setBounds(309, 224, 16, 18);
		
		Button button_47 = new Button(shell, SWT.RADIO);
		button_47.setBounds(331, 224, 22, 18);
		
		Button button_48 = new Button(shell, SWT.RADIO);
		button_48.setBounds(350, 224, 15, 18);
		
		Button button_49 = new Button(shell, SWT.RADIO);
		button_49.setBounds(377, 224, 22, 18);
		
		Button button_50 = new Button(shell, SWT.RADIO);
		button_50.setBounds(405, 224, 22, 18);
		
		Button button_51 = new Button(shell, SWT.RADIO);
		button_51.setBounds(451, 224, 22, 18);
		
		Button button_52 = new Button(shell, SWT.RADIO);
		button_52.setBounds(469, 224, 22, 18);
		
		Button button_53 = new Button(shell, SWT.RADIO);
		button_53.setBounds(497, 224, 22, 18);
		
		Button button_54 = new Button(shell, SWT.RADIO);
		button_54.setBounds(526, 224, 22, 18);
		
		Button button_55 = new Button(shell, SWT.RADIO);
		button_55.setBounds(553, 224, 27, 18);
		
		Button button_56 = new Button(shell, SWT.RADIO);
		button_56.setBounds(25, 252, 16, 18);
		
		Button button_57 = new Button(shell, SWT.RADIO);
		button_57.setBounds(47, 251, 22, 18);
		
		Button button_58 = new Button(shell, SWT.RADIO);
		button_58.setBounds(75, 252, 22, 18);
		
		Button button_59 = new Button(shell, SWT.RADIO);
		button_59.setBounds(96, 252, 22, 18);
		
		Button button_60 = new Button(shell, SWT.RADIO);
		button_60.setBounds(124, 251, 20, 18);
		
		Button button_61 = new Button(shell, SWT.RADIO);
		button_61.setBounds(169, 252, 22, 18);
		
		Button button_62 = new Button(shell, SWT.RADIO);
		button_62.setBounds(192, 252, 22, 18);
		
		Button button_63 = new Button(shell, SWT.RADIO);
		button_63.setBounds(219, 252, 17, 18);
		
		Button button_64 = new Button(shell, SWT.RADIO);
		button_64.setBounds(239, 252, 22, 18);
		
		Button button_65 = new Button(shell, SWT.RADIO);
		button_65.setBounds(265, 251, 22, 18);
		
		Button button_66 = new Button(shell, SWT.RADIO);
		button_66.setBounds(309, 252, 20, 18);
		
		Button button_67 = new Button(shell, SWT.RADIO);
		button_67.setBounds(331, 251, 22, 18);
		
		Button button_68 = new Button(shell, SWT.RADIO);
		button_68.setBounds(350, 251, 22, 18);
		
		Button button_69 = new Button(shell, SWT.RADIO);
		button_69.setBounds(377, 251, 16, 18);
		
		Button button_70 = new Button(shell, SWT.RADIO);
		button_70.setBounds(405, 251, 24, 18);
		
		Button button_71 = new Button(shell, SWT.RADIO);
		button_71.setBounds(451, 251, 22, 18);
		
		Button button_72 = new Button(shell, SWT.RADIO);
		button_72.setBounds(469, 251, 22, 18);
		
		Button button_73 = new Button(shell, SWT.RADIO);
		button_73.setBounds(497, 251, 22, 18);
		
		Button button_74 = new Button(shell, SWT.RADIO);
		button_74.setBounds(526, 251, 22, 18);
		
		Button button_75 = new Button(shell, SWT.RADIO);
		button_75.setBounds(554, 251, 22, 18);
		
		Button button_76 = new Button(shell, SWT.RADIO);
		button_76.setBounds(25, 284, 22, 18);
		
		Button button_77 = new Button(shell, SWT.RADIO);
		button_77.setBounds(47, 284, 22, 18);
		
		Button button_78 = new Button(shell, SWT.RADIO);
		button_78.setBounds(75, 284, 16, 18);
		
		Button button_79 = new Button(shell, SWT.RADIO);
		button_79.setBounds(96, 284, 19, 18);
		
		Button button_80 = new Button(shell, SWT.RADIO);
		button_80.setBounds(124, 284, 22, 18);
		
		Button button_81 = new Button(shell, SWT.RADIO);
		button_81.setBounds(169, 284, 22, 18);
		
		Button button_82 = new Button(shell, SWT.RADIO);
		button_82.setBounds(192, 284, 22, 18);
		
		Button button_83 = new Button(shell, SWT.RADIO);
		button_83.setBounds(222, 284, 14, 18);
		
		Button button_84 = new Button(shell, SWT.RADIO);
		button_84.setBounds(239, 284, 22, 18);
		
		Button button_85 = new Button(shell, SWT.RADIO);
		button_85.setBounds(265, 284, 22, 18);
		
		Button button_86 = new Button(shell, SWT.RADIO);
		button_86.setBounds(309, 284, 22, 18);
		
		Button button_87 = new Button(shell, SWT.RADIO);
		button_87.setBounds(331, 284, 22, 18);
		
		Button button_88 = new Button(shell, SWT.RADIO);
		button_88.setBounds(350, 284, 22, 18);
		
		Button button_89 = new Button(shell, SWT.RADIO);
		button_89.setBounds(377, 284, 16, 18);
		
		Button button_90 = new Button(shell, SWT.RADIO);
		button_90.setBounds(403, 284, 22, 18);
		
		Button button_91 = new Button(shell, SWT.RADIO);
		button_91.setBounds(451, 284, 16, 18);
		
		Button button_92 = new Button(shell, SWT.RADIO);
		button_92.setBounds(468, 284, 23, 18);
		
		Button button_93 = new Button(shell, SWT.RADIO);
		button_93.setBounds(497, 284, 22, 18);
		
		Button button_94 = new Button(shell, SWT.RADIO);
		button_94.setBounds(526, 284, 22, 18);
		
		Button button_95 = new Button(shell, SWT.RADIO);
		button_95.setBounds(554, 284, 22, 18);
		
		Button btnStore_1 = new Button(shell, SWT.NONE);
		btnStore_1.setBounds(594, 218, 94, 28);
		btnStore_1.setText("store");
		
		Button button_96 = new Button(shell, SWT.NONE);
		button_96.setText("store");
		button_96.setBounds(594, 252, 94, 28);
		
		Button button_97 = new Button(shell, SWT.NONE);
		button_97.setText("store");
		button_97.setBounds(594, 285, 94, 28);
		
		Label lblIx = new Label(shell, SWT.NONE);
		lblIx.setBounds(4, 321, 27, 14);
		lblIx.setText("IX1");
		
		Label lblIx_1 = new Label(shell, SWT.NONE);
		lblIx_1.setText("IX2");
		lblIx_1.setBounds(4, 352, 27, 14);
		
		Label lblIx_2 = new Label(shell, SWT.NONE);
		lblIx_2.setText("IX3");
		lblIx_2.setBounds(4, 381, 27, 14);
		
		Label lblMbr = new Label(shell, SWT.NONE);
		lblMbr.setText("MBR");
		lblMbr.setBounds(-1, 409, 27, 14);
		
		Label lblMar = new Label(shell, SWT.NONE);
		lblMar.setText("MAR");
		lblMar.setBounds(-1, 441, 27, 14);
		
		Button button_98 = new Button(shell, SWT.RADIO);
		button_98.setBounds(25, 320, 16, 18);
		
		Button button_99 = new Button(shell, SWT.RADIO);
		button_99.setBounds(47, 320, 22, 18);
		
		Button button_100 = new Button(shell, SWT.RADIO);
		button_100.setBounds(75, 320, 16, 18);
		
		Button button_101 = new Button(shell, SWT.RADIO);
		button_101.setBounds(96, 320, 22, 18);
		
		Button button_102 = new Button(shell, SWT.RADIO);
		button_102.setBounds(124, 320, 32, 18);
		
		Button button_103 = new Button(shell, SWT.RADIO);
		button_103.setBounds(169, 320, 22, 18);
		
		Button button_104 = new Button(shell, SWT.RADIO);
		button_104.setBounds(192, 320, 22, 18);
		
		Button button_105 = new Button(shell, SWT.RADIO);
		button_105.setBounds(220, 320, 22, 18);
		
		Button button_106 = new Button(shell, SWT.RADIO);
		button_106.setBounds(239, 320, 22, 18);
		
		Button button_107 = new Button(shell, SWT.RADIO);
		button_107.setBounds(265, 320, 22, 18);
		
		Button button_108 = new Button(shell, SWT.RADIO);
		button_108.setBounds(309, 320, 20, 18);
		
		Button button_109 = new Button(shell, SWT.RADIO);
		button_109.setBounds(331, 320, 20, 18);
		
		Button button_110 = new Button(shell, SWT.RADIO);
		button_110.setBounds(352, 320, 20, 18);
		
		Button button_111 = new Button(shell, SWT.RADIO);
		button_111.setBounds(25, 352, 20, 18);
		
		Button button_112 = new Button(shell, SWT.RADIO);
		button_112.setBounds(47, 352, 20, 18);
		
		Button button_113 = new Button(shell, SWT.RADIO);
		button_113.setBounds(75, 352, 20, 18);
		
		Button button_114 = new Button(shell, SWT.RADIO);
		button_114.setBounds(96, 352, 20, 18);
		
		Button button_115 = new Button(shell, SWT.RADIO);
		button_115.setBounds(124, 351, 20, 18);
		
		Button button_116 = new Button(shell, SWT.RADIO);
		button_116.setBounds(169, 352, 20, 18);
		
		Button button_117 = new Button(shell, SWT.RADIO);
		button_117.setBounds(192, 352, 20, 18);
		
		Button button_118 = new Button(shell, SWT.RADIO);
		button_118.setBounds(220, 352, 20, 18);
		
		Button button_119 = new Button(shell, SWT.RADIO);
		button_119.setBounds(239, 352, 20, 18);
		
		Button button_120 = new Button(shell, SWT.RADIO);
		button_120.setBounds(265, 352, 20, 18);
		
		Button button_121 = new Button(shell, SWT.RADIO);
		button_121.setBounds(309, 352, 20, 18);
		
		Button button_122 = new Button(shell, SWT.RADIO);
		button_122.setBounds(331, 352, 20, 18);
		
		Button button_123 = new Button(shell, SWT.RADIO);
		button_123.setBounds(352, 352, 20, 18);
		
		Button button_124 = new Button(shell, SWT.RADIO);
		button_124.setBounds(25, 381, 20, 18);
		
		Button button_125 = new Button(shell, SWT.RADIO);
		button_125.setBounds(47, 381, 20, 18);
		
		Button button_126 = new Button(shell, SWT.RADIO);
		button_126.setBounds(75, 381, 20, 18);
		
		Button button_127 = new Button(shell, SWT.RADIO);
		button_127.setBounds(96, 381, 20, 18);
		
		Button button_128 = new Button(shell, SWT.RADIO);
		button_128.setBounds(124, 381, 20, 18);
		
		Button button_129 = new Button(shell, SWT.RADIO);
		button_129.setBounds(169, 381, 20, 18);
		
		Button button_130 = new Button(shell, SWT.RADIO);
		button_130.setBounds(192, 381, 20, 18);
		
		Button button_131 = new Button(shell, SWT.RADIO);
		button_131.setBounds(220, 381, 20, 18);
		
		Button button_132 = new Button(shell, SWT.RADIO);
		button_132.setBounds(239, 381, 20, 18);
		
		Button button_133 = new Button(shell, SWT.RADIO);
		button_133.setBounds(265, 381, 20, 18);
		
		Button button_134 = new Button(shell, SWT.RADIO);
		button_134.setBounds(309, 381, 20, 18);
		
		Button button_135 = new Button(shell, SWT.RADIO);
		button_135.setBounds(331, 381, 20, 18);
		
		Button button_136 = new Button(shell, SWT.RADIO);
		button_136.setBounds(352, 381, 20, 18);
		
		Button button_137 = new Button(shell, SWT.RADIO);
		button_137.setBounds(25, 408, 20, 18);
		
		Button button_138 = new Button(shell, SWT.RADIO);
		button_138.setBounds(47, 409, 20, 18);
		
		Button button_139 = new Button(shell, SWT.RADIO);
		button_139.setBounds(75, 409, 20, 18);
		
		Button button_140 = new Button(shell, SWT.RADIO);
		button_140.setBounds(95, 409, 20, 18);
		
		Button button_141 = new Button(shell, SWT.RADIO);
		button_141.setBounds(124, 409, 20, 18);
		
		Button button_142 = new Button(shell, SWT.RADIO);
		button_142.setBounds(169, 409, 20, 18);
		
		Button button_143 = new Button(shell, SWT.RADIO);
		button_143.setBounds(192, 409, 20, 18);
		
		Button button_144 = new Button(shell, SWT.RADIO);
		button_144.setBounds(220, 409, 20, 18);
		
		Button button_145 = new Button(shell, SWT.RADIO);
		button_145.setBounds(239, 409, 20, 18);
		
		Button button_146 = new Button(shell, SWT.RADIO);
		button_146.setBounds(265, 409, 20, 18);
		
		Button button_147 = new Button(shell, SWT.RADIO);
		button_147.setBounds(309, 409, 20, 18);
		
		Button button_148 = new Button(shell, SWT.RADIO);
		button_148.setBounds(331, 409, 20, 18);
		
		Button button_149 = new Button(shell, SWT.RADIO);
		button_149.setBounds(352, 409, 20, 18);
		
		Button button_150 = new Button(shell, SWT.RADIO);
		button_150.setBounds(377, 409, 20, 18);
		
		Button button_151 = new Button(shell, SWT.RADIO);
		button_151.setBounds(405, 409, 20, 18);
		
		Button button_152 = new Button(shell, SWT.RADIO);
		button_152.setBounds(451, 409, 20, 18);
		
		Button button_153 = new Button(shell, SWT.RADIO);
		button_153.setBounds(471, 409, 20, 18);
		
		Button button_154 = new Button(shell, SWT.RADIO);
		button_154.setBounds(497, 409, 20, 18);
		
		Button button_155 = new Button(shell, SWT.RADIO);
		button_155.setBounds(526, 409, 20, 18);
		
		Button button_156 = new Button(shell, SWT.RADIO);
		button_156.setBounds(554, 409, 20, 18);
		
		Button button_157 = new Button(shell, SWT.RADIO);
		button_157.setBounds(25, 441, 20, 18);
		
		Button button_158 = new Button(shell, SWT.RADIO);
		button_158.setBounds(47, 441, 20, 18);
		
		Button button_159 = new Button(shell, SWT.RADIO);
		button_159.setBounds(75, 441, 20, 18);
		
		Button button_160 = new Button(shell, SWT.RADIO);
		button_160.setBounds(96, 441, 20, 18);
		
		Button button_161 = new Button(shell, SWT.RADIO);
		button_161.setBounds(124, 441, 20, 18);
		
		Button button_162 = new Button(shell, SWT.RADIO);
		button_162.setBounds(169, 441, 20, 18);
		
		Button button_163 = new Button(shell, SWT.RADIO);
		button_163.setBounds(192, 441, 20, 18);
		
		Button button_164 = new Button(shell, SWT.RADIO);
		button_164.setBounds(220, 441, 20, 18);
		
		Button button_165 = new Button(shell, SWT.RADIO);
		button_165.setBounds(239, 441, 20, 18);
		
		Button button_166 = new Button(shell, SWT.RADIO);
		button_166.setBounds(265, 441, 20, 18);
		
		Button button_167 = new Button(shell, SWT.RADIO);
		button_167.setBounds(309, 441, 20, 18);
		
		Button button_168 = new Button(shell, SWT.RADIO);
		button_168.setBounds(331, 441, 20, 18);
		
		Button button_169 = new Button(shell, SWT.RADIO);
		button_169.setBounds(352, 441, 20, 18);
		
		Button button_170 = new Button(shell, SWT.RADIO);
		button_170.setBounds(377, 441, 20, 18);
		
		Button button_171 = new Button(shell, SWT.RADIO);
		button_171.setBounds(405, 441, 20, 18);
		
		Button button_172 = new Button(shell, SWT.RADIO);
		button_172.setBounds(451, 441, 20, 18);
		
		Button button_173 = new Button(shell, SWT.RADIO);
		button_173.setBounds(471, 441, 20, 18);
		
		Button button_174 = new Button(shell, SWT.RADIO);
		button_174.setBounds(497, 441, 20, 18);
		
		Button button_175 = new Button(shell, SWT.RADIO);
		button_175.setBounds(528, 441, 20, 18);
		
		Button button_176 = new Button(shell, SWT.RADIO);
		button_176.setBounds(554, 441, 20, 18);
		
		Button button_177 = new Button(shell, SWT.NONE);
		button_177.setText("store");
		button_177.setBounds(397, 310, 94, 28);
		
		Button button_178 = new Button(shell, SWT.NONE);
		button_178.setText("store");
		button_178.setBounds(397, 342, 94, 28);
		
		Button button_179 = new Button(shell, SWT.NONE);
		button_179.setText("store");
		button_179.setBounds(397, 381, 94, 28);
		
		Button button_180 = new Button(shell, SWT.NONE);
		button_180.setText("store");
		button_180.setBounds(594, 402, 94, 28);
		
		Button button_181 = new Button(shell, SWT.NONE);
		button_181.setText("store");
		button_181.setBounds(594, 443, 94, 28);

	}
}
