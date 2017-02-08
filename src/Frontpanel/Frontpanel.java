package Frontpanel;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;

public class Frontpanel {

	protected Shell shell;
	private Text address;
	private Text value;

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
		shell.setSize(893, 589);
		shell.setText("SWT Application");
		
		Label lblOpcode = new Label(shell, SWT.NONE);
		lblOpcode.setBounds(10, 112, 106, 14);
		lblOpcode.setText("Opcode:000000");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(540, 10, 319, 80);
		
		Label lblAdress = new Label(composite, SWT.NONE);
		lblAdress.setBounds(24, 10, 59, 14);
		lblAdress.setText("Adress");
		
		address = new Text(composite, SWT.BORDER);
		address.setBounds(19, 30, 64, 19);
		
		Label lblValue = new Label(composite, SWT.NONE);
		lblValue.setBounds(129, 10, 59, 14);
		lblValue.setText("Value");
		
		value = new Text(composite, SWT.BORDER);
		value.setBounds(117, 30, 64, 19);
		
		Button btnStoreOnMemory = new Button(composite, SWT.NONE);
		btnStoreOnMemory.setBounds(187, 26, 122, 28);
		btnStoreOnMemory.setText("Store on Memory");
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setBounds(10, 10, 518, 80);
		
		Button single1 = new Button(composite_1, SWT.RADIO);
		single1.setBounds(10, 10, 29, 18);
		single1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		single1.setText("1");
		
		Button single2 = new Button(composite_1, SWT.RADIO);
		single2.setBounds(44, 10, 90, 18);
		single2.setText("2");
		
		Button single3 = new Button(composite_1, SWT.RADIO);
		single3.setBounds(81, 10, 90, 18);
		single3.setText("3");
		
		Button single4 = new Button(composite_1, SWT.RADIO);
		single4.setBounds(119, 10, 90, 18);
		single4.setText("4");
		
		Button single5 = new Button(composite_1, SWT.RADIO);
		single5.setBounds(158, 10, 90, 18);
		single5.setText("5");
		
		Button single6 = new Button(composite_1, SWT.RADIO);
		single6.setBounds(197, 10, 90, 18);
		single6.setText("6");
		
		Button single7 = new Button(composite_1, SWT.RADIO);
		single7.setBounds(236, 10, 90, 18);
		single7.setText("7");
		
		Button single8 = new Button(composite_1, SWT.RADIO);
		single8.setBounds(274, 10, 90, 18);
		single8.setText("8");
		
		Button single9 = new Button(composite_1, SWT.RADIO);
		single9.setBounds(314, 10, 90, 18);
		single9.setText("9");
		
		Button single10 = new Button(composite_1, SWT.RADIO);
		single10.setBounds(351, 10, 90, 18);
		single10.setText("10");
		
		Button single11 = new Button(composite_1, SWT.RADIO);
		single11.setBounds(10, 52, 90, 18);
		single11.setText("11");
		
		Button single12 = new Button(composite_1, SWT.RADIO);
		single12.setBounds(44, 52, 90, 18);
		single12.setText("12");
		
		Button single13 = new Button(composite_1, SWT.RADIO);
		single13.setBounds(81, 52, 90, 18);
		single13.setText("13");
		
		Button single14 = new Button(composite_1, SWT.RADIO);
		single14.setBounds(119, 52, 90, 18);
		single14.setText("14");
		
		Button single15 = new Button(composite_1, SWT.RADIO);
		single15.setBounds(158, 52, 90, 18);
		single15.setText("15");
		
		Button single16 = new Button(composite_1, SWT.RADIO);
		single16.setBounds(197, 52, 90, 18);
		single16.setText("16");
		
		Button single17 = new Button(composite_1, SWT.RADIO);
		single17.setBounds(236, 52, 90, 18);
		single17.setText("17");
		
		Button single18 = new Button(composite_1, SWT.RADIO);
		single18.setBounds(274, 52, 90, 18);
		single18.setText("18");
		
		Button single19 = new Button(composite_1, SWT.RADIO);
		single19.setBounds(314, 52, 90, 18);
		single19.setText("19");
		
		Button single20 = new Button(composite_1, SWT.RADIO);
		single20.setBounds(351, 52, 90, 18);
		single20.setText("20");
		
		Button btnSingleStep = new Button(composite_1, SWT.NONE);
		btnSingleStep.setBounds(396, 42, 94, 28);
		btnSingleStep.setText("Single Step");
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		composite_2.setBounds(5, 132, 745, 38);
		
		Label lblR = new Label(composite_2, SWT.NONE);
		lblR.setBounds(10, 10, 16, 14);
		lblR.setText("R0");
		
		Button R01 = new Button(composite_2, SWT.RADIO);
		R01.setBounds(33, 9, 16, 18);
		
		Button R02 = new Button(composite_2, SWT.RADIO);
		R02.setBounds(55, 9, 22, 18);
		
		Button R03 = new Button(composite_2, SWT.RADIO);
		R03.setBounds(83, 9, 22, 18);
		
		Button R04 = new Button(composite_2, SWT.RADIO);
		R04.setBounds(109, 9, 22, 18);
		
		Button R05 = new Button(composite_2, SWT.RADIO);
		R05.setBounds(137, 9, 16, 18);
		
		Button R06 = new Button(composite_2, SWT.RADIO);
		R06.setBounds(171, 9, 16, 18);
		
		Button R07 = new Button(composite_2, SWT.RADIO);
		R07.setBounds(193, 9, 22, 18);
		
		Button R08 = new Button(composite_2, SWT.RADIO);
		R08.setBounds(217, 9, 16, 18);
		
		Button R09 = new Button(composite_2, SWT.RADIO);
		R09.setBounds(243, 9, 16, 18);
		
		Button R010 = new Button(composite_2, SWT.RADIO);
		R010.setBounds(265, 9, 22, 18);
		
		Button R011 = new Button(composite_2, SWT.RADIO);
		R011.setBounds(306, 9, 16, 18);
		
		Button R012 = new Button(composite_2, SWT.RADIO);
		R012.setBounds(329, 9, 16, 18);
		
		Button R013 = new Button(composite_2, SWT.RADIO);
		R013.setBounds(352, 9, 22, 18);
		
		Button R014 = new Button(composite_2, SWT.RADIO);
		R014.setBounds(376, 9, 22, 18);
		
		Button R015 = new Button(composite_2, SWT.RADIO);
		R015.setBounds(398, 9, 20, 18);
		
		Button R016 = new Button(composite_2, SWT.RADIO);
		R016.setBounds(449, 9, 16, 18);
		
		Button R017 = new Button(composite_2, SWT.RADIO);
		R017.setBounds(471, 9, 22, 18);
		
		Button R018 = new Button(composite_2, SWT.RADIO);
		R018.setBounds(494, 9, 22, 18);
		
		Button R019 = new Button(composite_2, SWT.RADIO);
		R019.setBounds(519, 9, 22, 18);
		
		Button R020 = new Button(composite_2, SWT.RADIO);
		R020.setBounds(546, 9, 16, 18);
		
		Button btnStoreR0 = new Button(composite_2, SWT.NONE);
		btnStoreR0.setBounds(603, 3, 94, 28);
		btnStoreR0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnStoreR0.setText("store");
		
		Composite composite_3 = new Composite(shell, SWT.NONE);
		composite_3.setBounds(5, 176, 745, 38);
		
		Label lblR_4 = new Label(composite_3, SWT.NONE);
		lblR_4.setText("R1");
		lblR_4.setBounds(10, 10, 16, 14);
		
		Button R11 = new Button(composite_3, SWT.RADIO);
		R11.setBounds(33, 9, 16, 18);
		
		Button R12 = new Button(composite_3, SWT.RADIO);
		R12.setBounds(55, 9, 22, 18);
		
		Button R13 = new Button(composite_3, SWT.RADIO);
		R13.setBounds(83, 9, 22, 18);
		
		Button R14 = new Button(composite_3, SWT.RADIO);
		R14.setBounds(109, 9, 22, 18);
		
		Button R15 = new Button(composite_3, SWT.RADIO);
		R15.setBounds(137, 9, 16, 18);
		
		Button R16 = new Button(composite_3, SWT.RADIO);
		R16.setBounds(171, 9, 16, 18);
		
		Button R17 = new Button(composite_3, SWT.RADIO);
		R17.setBounds(193, 9, 22, 18);
		
		Button R18 = new Button(composite_3, SWT.RADIO);
		R18.setBounds(217, 9, 16, 18);
		
		Button R19 = new Button(composite_3, SWT.RADIO);
		R19.setBounds(243, 9, 16, 18);
		
		Button R110 = new Button(composite_3, SWT.RADIO);
		R110.setBounds(265, 9, 22, 18);
		
		Button R111 = new Button(composite_3, SWT.RADIO);
		R111.setBounds(306, 9, 16, 18);
		
		Button R112 = new Button(composite_3, SWT.RADIO);
		R112.setBounds(329, 9, 16, 18);
		
		Button R113 = new Button(composite_3, SWT.RADIO);
		R113.setBounds(352, 9, 22, 18);
		
		Button R114 = new Button(composite_3, SWT.RADIO);
		R114.setBounds(376, 9, 22, 18);
		
		Button R115 = new Button(composite_3, SWT.RADIO);
		R115.setBounds(398, 9, 20, 18);
		
		Button R116 = new Button(composite_3, SWT.RADIO);
		R116.setBounds(449, 9, 16, 18);
		
		Button R117 = new Button(composite_3, SWT.RADIO);
		R117.setBounds(471, 9, 22, 18);
		
		Button R118 = new Button(composite_3, SWT.RADIO);
		R118.setBounds(494, 9, 22, 18);
		
		Button R119 = new Button(composite_3, SWT.RADIO);
		R119.setBounds(519, 9, 22, 18);
		
		Button R120 = new Button(composite_3, SWT.RADIO);
		R120.setBounds(546, 9, 16, 18);
		
		Button buttonR1 = new Button(composite_3, SWT.NONE);
		buttonR1.setText("store");
		buttonR1.setBounds(603, 3, 94, 28);
		
		Composite composite_4 = new Composite(shell, SWT.NONE);
		composite_4.setBounds(5, 220, 745, 38);
		
		Label lblR_1 = new Label(composite_4, SWT.NONE);
		lblR_1.setText("R2");
		lblR_1.setBounds(10, 10, 16, 14);
		
		Button R21 = new Button(composite_4, SWT.RADIO);
		R21.setBounds(33, 9, 16, 18);
		
		Button R22 = new Button(composite_4, SWT.RADIO);
		R22.setBounds(55, 9, 22, 18);
		
		Button R23 = new Button(composite_4, SWT.RADIO);
		R23.setBounds(83, 9, 22, 18);
		
		Button R24 = new Button(composite_4, SWT.RADIO);
		R24.setBounds(109, 9, 22, 18);
		
		Button R25 = new Button(composite_4, SWT.RADIO);
		R25.setBounds(137, 9, 16, 18);
		
		Button R26 = new Button(composite_4, SWT.RADIO);
		R26.setBounds(171, 9, 16, 18);
		
		Button R27 = new Button(composite_4, SWT.RADIO);
		R27.setBounds(193, 9, 22, 18);
		
		Button R28 = new Button(composite_4, SWT.RADIO);
		R28.setBounds(217, 9, 16, 18);
		
		Button R29 = new Button(composite_4, SWT.RADIO);
		R29.setBounds(243, 9, 16, 18);
		
		Button R210 = new Button(composite_4, SWT.RADIO);
		R210.setBounds(265, 9, 22, 18);
		
		Button R211 = new Button(composite_4, SWT.RADIO);
		R211.setBounds(306, 9, 16, 18);
		
		Button R212 = new Button(composite_4, SWT.RADIO);
		R212.setBounds(329, 9, 16, 18);
		
		Button R213 = new Button(composite_4, SWT.RADIO);
		R213.setBounds(352, 9, 22, 18);
		
		Button R214 = new Button(composite_4, SWT.RADIO);
		R214.setBounds(376, 9, 22, 18);
		
		Button R215 = new Button(composite_4, SWT.RADIO);
		R215.setBounds(398, 9, 20, 18);
		
		Button R216 = new Button(composite_4, SWT.RADIO);
		R216.setBounds(449, 9, 16, 18);
		
		Button R217 = new Button(composite_4, SWT.RADIO);
		R217.setBounds(471, 9, 22, 18);
		
		Button R218 = new Button(composite_4, SWT.RADIO);
		R218.setBounds(494, 9, 22, 18);
		
		Button R219 = new Button(composite_4, SWT.RADIO);
		R219.setBounds(519, 9, 22, 18);
		
		Button R220 = new Button(composite_4, SWT.RADIO);
		R220.setBounds(546, 9, 16, 18);
		
		Button buttonR2 = new Button(composite_4, SWT.NONE);
		buttonR2.setText("store");
		buttonR2.setBounds(603, 3, 94, 28);
		
		Composite composite_5 = new Composite(shell, SWT.NONE);
		composite_5.setBounds(5, 264, 745, 38);
		
		Label lblR_2 = new Label(composite_5, SWT.NONE);
		lblR_2.setText("R3");
		lblR_2.setBounds(10, 10, 16, 14);
		
		Button R31 = new Button(composite_5, SWT.RADIO);
		R31.setBounds(33, 9, 16, 18);
		
		Button R32 = new Button(composite_5, SWT.RADIO);
		R32.setBounds(55, 9, 22, 18);
		
		Button R33 = new Button(composite_5, SWT.RADIO);
		R33.setBounds(83, 9, 22, 18);
		
		Button R34 = new Button(composite_5, SWT.RADIO);
		R34.setBounds(109, 9, 22, 18);
		
		Button R35 = new Button(composite_5, SWT.RADIO);
		R35.setBounds(137, 9, 16, 18);
		
		Button R36 = new Button(composite_5, SWT.RADIO);
		R36.setBounds(171, 9, 16, 18);
		
		Button R37 = new Button(composite_5, SWT.RADIO);
		R37.setBounds(193, 9, 22, 18);
		
		Button R38 = new Button(composite_5, SWT.RADIO);
		R38.setBounds(217, 9, 16, 18);
		
		Button R39 = new Button(composite_5, SWT.RADIO);
		R39.setBounds(243, 9, 16, 18);
		
		Button R310 = new Button(composite_5, SWT.RADIO);
		R310.setBounds(265, 9, 22, 18);
		
		Button R311 = new Button(composite_5, SWT.RADIO);
		R311.setBounds(306, 9, 16, 18);
		
		Button R312 = new Button(composite_5, SWT.RADIO);
		R312.setBounds(329, 9, 16, 18);
		
		Button R313 = new Button(composite_5, SWT.RADIO);
		R313.setBounds(352, 9, 22, 18);
		
		Button R314 = new Button(composite_5, SWT.RADIO);
		R314.setBounds(376, 9, 22, 18);
		
		Button R315 = new Button(composite_5, SWT.RADIO);
		R315.setBounds(398, 9, 20, 18);
		
		Button R316 = new Button(composite_5, SWT.RADIO);
		R316.setBounds(449, 9, 16, 18);
		
		Button R317 = new Button(composite_5, SWT.RADIO);
		R317.setBounds(471, 9, 22, 18);
		
		Button R318 = new Button(composite_5, SWT.RADIO);
		R318.setBounds(494, 9, 22, 18);
		
		Button R319 = new Button(composite_5, SWT.RADIO);
		R319.setBounds(519, 9, 22, 18);
		
		Button R320 = new Button(composite_5, SWT.RADIO);
		R320.setBounds(546, 9, 16, 18);
		
		Button buttonR3 = new Button(composite_5, SWT.NONE);
		buttonR3.setText("store");
		buttonR3.setBounds(603, 3, 94, 28);
		
		Composite composite_6 = new Composite(shell, SWT.NONE);
		composite_6.setBounds(5, 308, 616, 38);
		
		Label lblIx = new Label(composite_6, SWT.NONE);
		lblIx.setBounds(10, 20, 27, 14);
		lblIx.setText("IX1");
		
		Button IX11 = new Button(composite_6, SWT.RADIO);
		IX11.setBounds(32, 19, 16, 18);
		
		Button IX12 = new Button(composite_6, SWT.RADIO);
		IX12.setBounds(54, 19, 22, 18);
		
		Button IX13 = new Button(composite_6, SWT.RADIO);
		IX13.setBounds(82, 19, 16, 18);
		
		Button IX14 = new Button(composite_6, SWT.RADIO);
		IX14.setBounds(110, 19, 22, 18);
		
		Button IX15 = new Button(composite_6, SWT.RADIO);
		IX15.setBounds(138, 19, 32, 18);
		
		Button IX16 = new Button(composite_6, SWT.RADIO);
		IX16.setBounds(176, 19, 22, 18);
		
		Button IX17 = new Button(composite_6, SWT.RADIO);
		IX17.setBounds(195, 19, 22, 18);
		
		Button IX18 = new Button(composite_6, SWT.RADIO);
		IX18.setBounds(216, 19, 22, 18);
		
		Button IX19 = new Button(composite_6, SWT.RADIO);
		IX19.setBounds(236, 19, 22, 18);
		
		Button IX110 = new Button(composite_6, SWT.RADIO);
		IX110.setBounds(264, 19, 22, 18);
		
		Button IX111 = new Button(composite_6, SWT.RADIO);
		IX111.setBounds(304, 19, 20, 18);
		
		Button IX112 = new Button(composite_6, SWT.RADIO);
		IX112.setBounds(327, 19, 20, 18);
		
		Button IX113 = new Button(composite_6, SWT.RADIO);
		IX113.setBounds(353, 19, 20, 18);
		
		Button buttonIX1 = new Button(composite_6, SWT.NONE);
		buttonIX1.setBounds(462, 13, 94, 28);
		buttonIX1.setText("store");
		
		Composite composite_7 = new Composite(shell, SWT.NONE);
		composite_7.setBounds(5, 352, 616, 38);
		
		Label lblIx_3 = new Label(composite_7, SWT.NONE);
		lblIx_3.setText("IX2");
		lblIx_3.setBounds(10, 20, 27, 14);
		
		Button IX21 = new Button(composite_7, SWT.RADIO);
		IX21.setBounds(32, 19, 16, 18);
		
		Button IX22 = new Button(composite_7, SWT.RADIO);
		IX22.setBounds(54, 19, 22, 18);
		
		Button IX23 = new Button(composite_7, SWT.RADIO);
		IX23.setBounds(82, 19, 16, 18);
		
		Button IX24 = new Button(composite_7, SWT.RADIO);
		IX24.setBounds(110, 19, 22, 18);
		
		Button IX25 = new Button(composite_7, SWT.RADIO);
		IX25.setBounds(138, 19, 32, 18);
		
		Button IX26 = new Button(composite_7, SWT.RADIO);
		IX26.setBounds(176, 19, 22, 18);
		
		Button IX27 = new Button(composite_7, SWT.RADIO);
		IX27.setBounds(195, 19, 22, 18);
		
		Button IX28 = new Button(composite_7, SWT.RADIO);
		IX28.setBounds(216, 19, 22, 18);
		
		Button IX29 = new Button(composite_7, SWT.RADIO);
		IX29.setBounds(236, 19, 22, 18);
		
		Button IX210 = new Button(composite_7, SWT.RADIO);
		IX210.setBounds(264, 19, 22, 18);
		
		Button IX211 = new Button(composite_7, SWT.RADIO);
		IX211.setBounds(304, 19, 20, 18);
		
		Button IX212 = new Button(composite_7, SWT.RADIO);
		IX212.setBounds(327, 19, 20, 18);
		
		Button IX213 = new Button(composite_7, SWT.RADIO);
		IX213.setBounds(353, 19, 20, 18);
		
		Button buttonIX2 = new Button(composite_7, SWT.NONE);
		buttonIX2.setText("store");
		buttonIX2.setBounds(462, 13, 94, 28);
		
		Composite composite_8 = new Composite(shell, SWT.NONE);
		composite_8.setBounds(5, 396, 616, 38);
		
		Label lblIx_2 = new Label(composite_8, SWT.NONE);
		lblIx_2.setText("IX3");
		lblIx_2.setBounds(10, 20, 27, 14);
		
		Button IX31 = new Button(composite_8, SWT.RADIO);
		IX31.setBounds(32, 19, 16, 18);
		
		Button IX32 = new Button(composite_8, SWT.RADIO);
		IX32.setBounds(54, 19, 22, 18);
		
		Button IX33 = new Button(composite_8, SWT.RADIO);
		IX33.setBounds(82, 19, 16, 18);
		
		Button IX34 = new Button(composite_8, SWT.RADIO);
		IX34.setBounds(110, 19, 22, 18);
		
		Button IX35 = new Button(composite_8, SWT.RADIO);
		IX35.setBounds(138, 19, 32, 18);
		
		Button IX36 = new Button(composite_8, SWT.RADIO);
		IX36.setBounds(176, 19, 22, 18);
		
		Button IX37 = new Button(composite_8, SWT.RADIO);
		IX37.setBounds(195, 19, 22, 18);
		
		Button IX38 = new Button(composite_8, SWT.RADIO);
		IX38.setBounds(216, 19, 22, 18);
		
		Button IX39 = new Button(composite_8, SWT.RADIO);
		IX39.setBounds(236, 19, 22, 18);
		
		Button IX310 = new Button(composite_8, SWT.RADIO);
		IX310.setBounds(264, 19, 22, 18);
		
		Button IX311 = new Button(composite_8, SWT.RADIO);
		IX311.setBounds(304, 19, 20, 18);
		
		Button IX312 = new Button(composite_8, SWT.RADIO);
		IX312.setBounds(327, 19, 20, 18);
		
		Button IX313 = new Button(composite_8, SWT.RADIO);
		IX313.setBounds(353, 19, 20, 18);
		
		Button buttonIX3 = new Button(composite_8, SWT.NONE);
		buttonIX3.setText("store");
		buttonIX3.setBounds(462, 13, 94, 28);
		
		Composite composite_9 = new Composite(shell, SWT.NONE);
		composite_9.setBounds(5, 450, 745, 38);
		
		Label lblMbr = new Label(composite_9, SWT.NONE);
		lblMbr.setText("MBR");
		lblMbr.setBounds(0, 10, 27, 14);
		
		Button MBR1 = new Button(composite_9, SWT.RADIO);
		MBR1.setBounds(33, 9, 16, 18);
		
		Button MBR2 = new Button(composite_9, SWT.RADIO);
		MBR2.setBounds(55, 9, 22, 18);
		
		Button MBR3 = new Button(composite_9, SWT.RADIO);
		MBR3.setBounds(83, 9, 22, 18);
		
		Button MBR4 = new Button(composite_9, SWT.RADIO);
		MBR4.setBounds(109, 9, 22, 18);
		
		Button MBR5 = new Button(composite_9, SWT.RADIO);
		MBR5.setBounds(137, 9, 16, 18);
		
		Button MBR6 = new Button(composite_9, SWT.RADIO);
		MBR6.setBounds(171, 9, 16, 18);
		
		Button MBR7 = new Button(composite_9, SWT.RADIO);
		MBR7.setBounds(193, 9, 22, 18);
		
		Button MBR8 = new Button(composite_9, SWT.RADIO);
		MBR8.setBounds(217, 9, 16, 18);
		
		Button MBR9 = new Button(composite_9, SWT.RADIO);
		MBR9.setBounds(243, 9, 16, 18);
		
		Button MBR10 = new Button(composite_9, SWT.RADIO);
		MBR10.setBounds(265, 9, 22, 18);
		
		Button MBR11 = new Button(composite_9, SWT.RADIO);
		MBR11.setBounds(306, 9, 16, 18);
		
		Button MBR12 = new Button(composite_9, SWT.RADIO);
		MBR12.setBounds(329, 9, 16, 18);
		
		Button MBR13 = new Button(composite_9, SWT.RADIO);
		MBR13.setBounds(352, 9, 22, 18);
		
		Button MBR14 = new Button(composite_9, SWT.RADIO);
		MBR14.setBounds(376, 9, 22, 18);
		
		Button MBR15 = new Button(composite_9, SWT.RADIO);
		MBR15.setBounds(398, 9, 20, 18);
		
		Button MBR16 = new Button(composite_9, SWT.RADIO);
		MBR16.setBounds(449, 9, 16, 18);
		
		Button MBR17 = new Button(composite_9, SWT.RADIO);
		MBR17.setBounds(471, 9, 22, 18);
		
		Button MBR18 = new Button(composite_9, SWT.RADIO);
		MBR18.setBounds(494, 9, 22, 18);
		
		Button MBR19 = new Button(composite_9, SWT.RADIO);
		MBR19.setBounds(519, 9, 22, 18);
		
		Button MBR20 = new Button(composite_9, SWT.RADIO);
		MBR20.setBounds(546, 9, 16, 18);
		
		Button buttonMBR = new Button(composite_9, SWT.NONE);
		buttonMBR.setText("store");
		buttonMBR.setBounds(603, 3, 94, 28);
		
		Composite composite_10 = new Composite(shell, SWT.NONE);
		composite_10.setBounds(5, 504, 745, 38);
		
		Label lblMar = new Label(composite_10, SWT.NONE);
		lblMar.setText("MAR");
		lblMar.setBounds(0, 10, 27, 14);
		
		Button MAR1 = new Button(composite_10, SWT.RADIO);
		MAR1.setBounds(33, 9, 16, 18);
		
		Button MAR2 = new Button(composite_10, SWT.RADIO);
		MAR2.setBounds(55, 9, 22, 18);
		
		Button MAR3 = new Button(composite_10, SWT.RADIO);
		MAR3.setBounds(83, 9, 22, 18);
		
		Button MAR4 = new Button(composite_10, SWT.RADIO);
		MAR4.setBounds(109, 9, 22, 18);
		
		Button MAR5 = new Button(composite_10, SWT.RADIO);
		MAR5.setBounds(137, 9, 16, 18);
		
		Button MAR6 = new Button(composite_10, SWT.RADIO);
		MAR6.setBounds(171, 9, 16, 18);
		
		Button MAR7 = new Button(composite_10, SWT.RADIO);
		MAR7.setBounds(193, 9, 22, 18);
		
		Button MAR8 = new Button(composite_10, SWT.RADIO);
		MAR8.setBounds(217, 9, 16, 18);
		
		Button MAR9 = new Button(composite_10, SWT.RADIO);
		MAR9.setBounds(243, 9, 16, 18);
		
		Button MAR10 = new Button(composite_10, SWT.RADIO);
		MAR10.setBounds(265, 9, 22, 18);
		
		Button MAR11 = new Button(composite_10, SWT.RADIO);
		MAR11.setBounds(306, 9, 16, 18);
		
		Button MAR12 = new Button(composite_10, SWT.RADIO);
		MAR12.setBounds(329, 9, 16, 18);
		
		Button MAR13 = new Button(composite_10, SWT.RADIO);
		MAR13.setBounds(352, 9, 22, 18);
		
		Button MAR14 = new Button(composite_10, SWT.RADIO);
		MAR14.setBounds(376, 9, 22, 18);
		
		Button MAR15 = new Button(composite_10, SWT.RADIO);
		MAR15.setBounds(398, 9, 20, 18);
		
		Button MAR16 = new Button(composite_10, SWT.RADIO);
		MAR16.setBounds(449, 9, 16, 18);
		
		Button MAR17 = new Button(composite_10, SWT.RADIO);
		MAR17.setBounds(471, 9, 22, 18);
		
		Button MAR18 = new Button(composite_10, SWT.RADIO);
		MAR18.setBounds(494, 9, 22, 18);
		
		Button MAR19 = new Button(composite_10, SWT.RADIO);
		MAR19.setBounds(519, 9, 22, 18);
		
		Button MAR20 = new Button(composite_10, SWT.RADIO);
		MAR20.setBounds(546, 9, 16, 18);
		
		Button buttonMAR = new Button(composite_10, SWT.NONE);
		buttonMAR.setText("store");
		buttonMAR.setBounds(603, 3, 94, 28);
		R010.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		R01.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});

	}
}
