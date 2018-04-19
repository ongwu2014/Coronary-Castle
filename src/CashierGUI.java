import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.AbstractListModel;

import java.awt.List;
import java.text.DecimalFormat;



public class CashierGUI {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private UIInterceptor uiInterceptor;
	
	private JCheckBox chckbxMustard;
	private JCheckBox chckbxMayonnaise;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxLettuce;
	private JCheckBox chckbxTomato;
	private JCheckBox chckbxOnion;
	private JCheckBox chckbxPickle;
	private JCheckBox chckbxJalapenoPepper;
	private JCheckBox chckbxOunces;
	private JCheckBox chckbxOunces_1;
	private JCheckBox chckbxBladderBuster;
	private JCheckBox chckbxRemoveOrder;
	
	private JCheckBox chckbxHamSlices;
	private JCheckBox chckbxFriedEgg;
	private JCheckBox chckbxCheese;
	private JCheckBox chckbxOnionRings;
	private JCheckBox chckbxFrenchFries;
	private JCheckBox chckbxMustard_1;
	private JCheckBox chckbxMayonnaise_1;
	private JCheckBox chckbxKetchup;
	private JCheckBox chckbxLettuce_1;
	private JCheckBox chckbxTomato_1;
	private JCheckBox chckbxOnion_1;
	private JCheckBox chckbxPickle_1;
	private JCheckBox chckbxJPepper;
	private JCheckBox chckbxOunces_2;
	private JCheckBox chckbxOunces_3;
	private JCheckBox chckbxBBuster;
	
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	private JCheckBox checkBox_3;
	private JCheckBox checkBox_4;
	private JCheckBox checkBox_5;
	private JCheckBox checkBox_6;
	private JCheckBox checkBox_7;
	private JCheckBox checkBox_8;
	private JCheckBox checkBox_9;
	private JCheckBox checkBox_10;
	private JCheckBox checkBox_11;
	private JCheckBox checkBox_12;
	private JCheckBox checkBox_13;
	private JCheckBox checkBox_14;
	private JCheckBox checkBox_15;
	
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblFinalizingOrder;
	private JLabel lblCompletingOrder;
	private JLabel lblPrintingCustomerReceipt;
	private JLabel lblAddingOrderTo;
	private JLabel lblOrderComplete;

	private JButton btnReturn;
	private JButton btnBypass;
	private JButton btnDoublebp;
	private JButton btnTriplebp;
	private JButton btnQuadbp;
	
	private JLabel lblErrorPaymentMethod;
	private List list;
	private JComboBox comboBox;
	private JScrollPane pane;
	
	private JPanel paymentPanel;
	private JPanel dataPanel;
	private JPanel finalPanel;
	private JPanel orderPanel;
	private JPanel modifyPanel;
	private int totalOrder = 0;
	
	Boolean[] turner;
	
	private class HandlerClass implements ItemListener {

		
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			JCheckBox[] jch = {chckbxHamSlices, chckbxFriedEgg, chckbxCheese, chckbxOnionRings, chckbxFrenchFries, chckbxMustard_1,
					chckbxMayonnaise_1, chckbxKetchup, chckbxLettuce_1, chckbxTomato_1, chckbxOnion_1, chckbxPickle_1,
					chckbxJPepper, chckbxOunces_2, chckbxOunces_3, chckbxBBuster
			};
			
			JCheckBox[] jch1 = {checkBox, checkBox_4, checkBox_8, checkBox_1, checkBox_5, checkBox_12, checkBox_2, checkBox_13, checkBox_9,
					checkBox_6, checkBox_10, checkBox_14, checkBox_3, checkBox_7, checkBox_11, checkBox_15
			};
			
			
			if (chckbxRemoveOrder.isSelected()) {
				for (int i = 0; i < jch.length; i++) {
					jch[i].setEnabled(false);
				}
				for (int i = 0; i < jch1.length; i++) {
					jch1[i].setEnabled(false);
				}
			} else {
				for (int i = 0; i < jch.length; i++) {
					jch[i].setEnabled(true);
				}
				for (int i = 0; i < jch1.length; i++) {
					jch1[i].setEnabled(true);
				}
			}
			
		}
		
	}
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierGUI window = new CashierGUI();
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
	public CashierGUI() {
		uiInterceptor = new UIInterceptor();
		initialize();
	}
	
	protected void addAction () {
		JCheckBox[] jch = {chckbxMustard, chckbxMayonnaise, chckbxNewCheckBox, chckbxLettuce, chckbxTomato, chckbxOnion, chckbxPickle,
				chckbxJalapenoPepper, chckbxOunces, chckbxOunces_1, chckbxBladderBuster
		};
		for (int i = 0; i < jch.length; i++) {
			if (jch[i].isSelected()) {
				uiInterceptor.addItem(10 + i);;
			}
		}
		totalOrder++;
		comboBox.addItem("Order " + totalOrder);
		resetAction();
	}
	
	public void cancelAction () {
		uiInterceptor.makeNewOrder();
		list.removeAll();
	}
	
	protected void comboSelector () {
		JCheckBox[] jch = {chckbxHamSlices, chckbxFriedEgg, chckbxCheese, chckbxOnionRings, chckbxFrenchFries, chckbxMustard_1,
				chckbxMayonnaise_1, chckbxKetchup, chckbxLettuce_1, chckbxTomato_1, chckbxOnion_1, chckbxPickle_1,
				chckbxJPepper, chckbxOunces_2, chckbxOunces_3, chckbxBBuster
		};
		
		JCheckBox[] jch1 = {checkBox, checkBox_4, checkBox_8, checkBox_1, checkBox_5, checkBox_12, checkBox_2, checkBox_13, checkBox_9,
				checkBox_6, checkBox_10, checkBox_14, checkBox_3, checkBox_7, checkBox_11, checkBox_15
		};
		if (comboBox.getSelectedItem() != null) {
			String [] text = ((String) comboBox.getSelectedItem()).split("\\s");
			int type = Integer.parseInt(text[1]);
			turner = uiInterceptor.getOrderAtIndex(type);
			for (int i = 0; i < jch1.length; i++) {
				jch1[i].setEnabled(true);
				jch[i].setEnabled(true);
			}
			for (int i = 0; i < turner.length; i++) {
				if (turner[i]) {
					jch1[i].setEnabled(false);
				} else {
					jch[i].setEnabled(false);
				}
				
			}
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void confirmAction() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String [] items = uiInterceptor.getLineItems();
		list.removeAll();
		for (int i = 0; i < items.length; i++) {
			list.add(items[i]);
		}
		DecimalFormat dc = new DecimalFormat("0.00");
		String formattedText = dc.format(uiInterceptor.getTotal());
		label.setText("$ "+formattedText);
		formattedText = dc.format(uiInterceptor.getTax());
		label_1.setText("$ "+formattedText);
		formattedText = dc.format(uiInterceptor.getNetTotal());
		label_2.setText("$ "+formattedText);
	}
	
	protected void modifyAction() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		JCheckBox[] jch = {chckbxHamSlices, chckbxFriedEgg, chckbxCheese, chckbxOnionRings, chckbxFrenchFries, chckbxMustard_1,
				chckbxMayonnaise_1, chckbxKetchup, chckbxLettuce_1, chckbxTomato_1, chckbxOnion_1, chckbxPickle_1,
				chckbxJPepper, chckbxOunces_2, chckbxOunces_3, chckbxBBuster
		};
		
		JCheckBox[] jch1 = {checkBox, checkBox_4, checkBox_8, checkBox_1, checkBox_5, checkBox_12, checkBox_2, checkBox_13, checkBox_9,
				checkBox_6, checkBox_10, checkBox_14, checkBox_3, checkBox_7, checkBox_11, checkBox_15
		};
		
		String [] text = ((String) comboBox.getSelectedItem()).split("\\s");
		int type = Integer.parseInt(text[1]);
		for (int i = 0; i < jch.length; i++) {
			if (jch[i].isSelected()) {
				turner[i] = false;
			}
			if (jch1[i].isSelected()) {
				turner[i] = true;
			}
		}
		uiInterceptor.modifyOrder(type, turner);
		modifyPanel.setVisible(false);
		orderPanel.setVisible (true);
		for (int i = 0; i < jch.length; i++) {
			jch[i].setSelected(false);
			jch1[i].setSelected(false);
		}
		
	}
	
	protected void newPaymentAction(){
		dataPanel.setVisible(false);
		paymentPanel.setVisible(true);
		textField_1.setEnabled(true);
		textField_2.setEnabled(true);
    	textField_3.setEnabled(true);
    	textField_4.setEnabled(true);
    	textField_5.setEnabled(true);
    	textField_6.setEnabled(true);
	}
	

	protected void paymentAction(String string) {
		paymentPanel.setVisible (false);
		dataPanel.setVisible (true);
	    switch (string) {
	    case "cash":
	    	textField_2.setEnabled(false);
	    	textField_3.setEnabled(false);
	    	textField_4.setEnabled(false);
	    	textField_5.setEnabled(false);
	    	textField_6.setEnabled(false);
	    	break;
	    case "credit":
	    case "debit":
	    case "store":
	    	textField_1.setEnabled(false);
	    	break;
	    case "split":
	    	break;
	    default:
	    	break;
	    }
	}
	
	protected void processPayment () throws InterruptedException {
		double cash = 0.0;
		double balance = 0.0;
		if (textField_1.isEnabled() && !textField_2.isEnabled()) {
			if (textField_1.getText() != null) {
				cash = Double.parseDouble (textField_1.getText());
			}
			balance = uiInterceptor.processPayment(cash, false);
		} else if (!textField_1.isEnabled() && textField_2.isEnabled()) {
			balance = uiInterceptor.processPayment(cash, true);
		} else {
			if (textField_1.getText() != null) {
				cash = Double.parseDouble (textField_1.getText());
			}
			balance = uiInterceptor.processPayment(cash, true);
		}
		
		if (balance < 0) {
			lblErrorPaymentMethod.setVisible(true);
		} else {
			DecimalFormat dc = new DecimalFormat("0.00");
			String formattedText = dc.format(balance);
			dataPanel.setVisible(false);
			finalPanel.setVisible(true);
			label_3.setText("$"+formattedText);
			
			/*Thread.sleep(1000);
			lblFinalizingOrder.setVisible(true);
			Thread.sleep(1000);
			lblCompletingOrder.setVisible(true);
			Thread.sleep(1000);
			lblPrintingCustomerReceipt.setVisible(true);
			Thread.sleep(1000);
			lblAddingOrderTo.setVisible(true);
			Thread.sleep(1000);
			lblOrderComplete.setVisible(true);
			btnReturn.setVisible(true);*/
		}
	}
	
	protected void resetAction() {
		JCheckBox[] jch = {chckbxMustard, chckbxMayonnaise, chckbxNewCheckBox, chckbxLettuce, chckbxTomato, chckbxOnion, chckbxPickle,
				chckbxJalapenoPepper, chckbxOunces, chckbxOunces_1, chckbxBladderBuster
		};
		for (int i = 0; i < jch.length; i++) {
			if (jch[i].isSelected()) {
				jch[i].setSelected(false);
			}
		}
		Image img = new ImageIcon(this.getClass().getResource("/bp.png")).getImage();
		btnBypass.setIcon(new ImageIcon(img));
		img = new ImageIcon(this.getClass().getResource("/doublebp.png")).getImage();
		btnDoublebp.setIcon(new ImageIcon(img));
		img = new ImageIcon(this.getClass().getResource("/triplebp.png")).getImage();
		btnTriplebp.setIcon(new ImageIcon(img));
		img = new ImageIcon(this.getClass().getResource("/quadbp.png")).getImage();
		btnQuadbp.setIcon(new ImageIcon(img));
		btnBypass.setEnabled(true);
		btnDoublebp.setEnabled(true);
		btnTriplebp.setEnabled(true);
		btnQuadbp.setEnabled(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 553, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		HandlerClass handler = new HandlerClass();
		
		JPanel loginPanel = new JPanel();
		frame.getContentPane().add(loginPanel, "name_1515598741294184");
		loginPanel.setLayout(null);
		
		JLabel logoLabel = new JLabel("");
		logoLabel.setBounds(146, 6, 263, 199);
		loginPanel.add(logoLabel);
		Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		logoLabel.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel = new JLabel("Cashier Login");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblNewLabel.setBounds(193, 217, 216, 50);
		loginPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cashier ID:");
		lblNewLabel_1.setBounds(94, 335, 90, 38);
		loginPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(178, 340, 226, 28);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(106, 380, 89, 50);
		loginPanel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 391, 228, 28);
		loginPanel.add(passwordField);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(menuPanel, "name_1515608703899076");
		menuPanel.setLayout(null);
		
		orderPanel = new JPanel();
		frame.getContentPane().add(orderPanel, "name_1515614140713796");
		orderPanel.setLayout(null);
		
		modifyPanel = new JPanel();
		frame.getContentPane().add(modifyPanel, "name_1515618481964382");
		modifyPanel.setLayout(null);
		
		JPanel confirmPanel = new JPanel();
		frame.getContentPane().add(confirmPanel, "name_1515622376189484");
		confirmPanel.setLayout(null);

		paymentPanel = new JPanel();
		frame.getContentPane().add(paymentPanel, "name_1515627022080210");
		paymentPanel.setLayout(null);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//do authentication 
				loginPanel.setVisible(false);
				menuPanel.setVisible(true);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		btnLogin.setIcon(new ImageIcon(img));
		btnLogin.setBounds(221, 450, 117, 36);
		loginPanel.add(btnLogin);
		
		
		JLabel lblThis = new JLabel("");
		lblThis.setBounds(6, 0, 536, 563);
		menuPanel.add(lblThis);
		img = new ImageIcon(this.getClass().getResource("/Artboard.png")).getImage();
		lblThis.setIcon(new ImageIcon(img));
		
		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uiInterceptor.makeNewOrder();
				menuPanel.setVisible(false);
				orderPanel.setVisible(true);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/new order.png")).getImage();
		btnNewOrder.setIcon(new ImageIcon(img));
		btnNewOrder.setBounds(207, 514, 118, 49);
		menuPanel.add(btnNewOrder);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add it to line items
				//display running total
				//deactivate other buttons
				menuPanel.setVisible(false);
				loginPanel.setVisible(true);
			}
		});
		btnLogout.setBounds(0, 6, 71, 29);
		menuPanel.add(btnLogout);
		
		
		btnBypass = new JButton("");
		btnBypass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add it to line items
				//display running total
				//deactivate other buttons
				Image img = new ImageIcon(this.getClass().getResource("/bpSelected.png")).getImage();
				btnBypass.setIcon(new ImageIcon(img));
				uiInterceptor.addItem(1);
				btnDoublebp.setEnabled(false);
				btnTriplebp.setEnabled(false);
				btnQuadbp.setEnabled(false);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/bp.png")).getImage();
		btnBypass.setIcon(new ImageIcon(img));
		btnBypass.setBounds(18, 54, 114, 114);
		orderPanel.add(btnBypass);
		
		JButton btnHamslice = new JButton("");
		btnHamslice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add it to line items
				//display running total
				//deactivate other buttons
				uiInterceptor.addItem(5);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/hamSlices.png")).getImage();
		btnHamslice.setIcon(new ImageIcon(img));
		btnHamslice.setBounds(18, 230, 87, 81);
		orderPanel.add(btnHamslice);
		
		JButton btnFriedEgg = new JButton("");
		btnFriedEgg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uiInterceptor.addItem(6);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/friedEgg.png")).getImage();
		btnFriedEgg.setIcon(new ImageIcon(img));
		btnFriedEgg.setBounds(117, 230, 87, 81);
		orderPanel.add(btnFriedEgg);
		
		JButton btnCheese = new JButton("");
		btnCheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uiInterceptor.addItem(7);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/cheese.png")).getImage();
		btnCheese.setIcon(new ImageIcon(img));
		btnCheese.setBounds(228, 230, 87, 81);
		orderPanel.add(btnCheese);
		
		chckbxMustard = new JCheckBox("Mustard");
		chckbxMustard.setBounds(18, 371, 87, 23);
		orderPanel.add(chckbxMustard);
		//chckbxMustard.addItemListener(handler);
		
		chckbxMayonnaise = new JCheckBox("Mayonnaise");
		chckbxMayonnaise.setBounds(128, 371, 106, 23);
		orderPanel.add(chckbxMayonnaise);
		//chckbxMayonnaise.addItemListener(handler);
		
		chckbxNewCheckBox = new JCheckBox("Ketchup");
		chckbxNewCheckBox.setBounds(267, 371, 87, 23);
		orderPanel.add(chckbxNewCheckBox);
		//chckbxNewCheckBox.addItemListener(handler);
		
		chckbxTomato = new JCheckBox("Tomato");
		chckbxTomato.setBounds(392, 371, 87, 23);
		orderPanel.add(chckbxTomato);
		//chckbxTomato.addItemListener(handler);
		
		chckbxLettuce = new JCheckBox("Lettuce");
		chckbxLettuce.setBounds(18, 390, 87, 23);
		orderPanel.add(chckbxLettuce);
		//chckbxLettuce.addItemListener(handler);
		
		chckbxOnion = new JCheckBox("Onion");
		chckbxOnion.setBounds(128, 390, 87, 23);
		orderPanel.add(chckbxOnion);
		//chckbxOnion.addItemListener(handler);
		
		chckbxPickle = new JCheckBox("Pickle");
		chckbxPickle.setBounds(267, 390, 87, 23);
		orderPanel.add(chckbxPickle);
		//chckbxPickle.addItemListener(handler);
		
		chckbxJalapenoPepper = new JCheckBox("Jalapeno Pepper");
		chckbxJalapenoPepper.setBounds(393, 390, 136, 23);
		orderPanel.add(chckbxJalapenoPepper);
		//chckbxJalapenoPepper.addItemListener(handler);
		
		btnDoublebp = new JButton("");
		btnDoublebp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add it to line items
				//display running total
				//deactivate other buttons
				Image img = new ImageIcon(this.getClass().getResource("/dbpSelected.png")).getImage();
				btnDoublebp.setIcon(new ImageIcon(img));
				uiInterceptor.addItem(2);
				btnBypass.setEnabled(false);
				btnTriplebp.setEnabled(false);
				btnQuadbp.setEnabled(false);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/doublebp.png")).getImage();
		btnDoublebp.setIcon(new ImageIcon(img));
		btnDoublebp.setBounds(154, 54, 114, 114);
		orderPanel.add(btnDoublebp);
		
		btnTriplebp = new JButton("");
		btnTriplebp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add it to line items
				//display running total
				//deactivate other buttons
				Image img = new ImageIcon(this.getClass().getResource("/tbpSelected.png")).getImage();
				btnTriplebp.setIcon(new ImageIcon(img));
				uiInterceptor.addItem(3);
				btnDoublebp.setEnabled(false);
				btnBypass.setEnabled(false);
				btnQuadbp.setEnabled(false);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/triplebp.png")).getImage();
		btnTriplebp.setIcon(new ImageIcon(img));
		btnTriplebp.setBounds(287, 55, 114, 114);
		orderPanel.add(btnTriplebp);
		
		btnQuadbp = new JButton("");
		btnQuadbp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add it to line items
				//display running total
				//deactivate other buttons
				Image img = new ImageIcon(this.getClass().getResource("/qbpSelected.png")).getImage();
				btnQuadbp.setIcon(new ImageIcon(img));
				uiInterceptor.addItem(4);
				btnDoublebp.setEnabled(false);
				btnTriplebp.setEnabled(false);
				btnBypass.setEnabled(false);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/quadbp.png")).getImage();
		btnQuadbp.setIcon(new ImageIcon(img));
		btnQuadbp.setBounds(413, 55, 114, 114);
		orderPanel.add(btnQuadbp);
		
		JButton btnOnionRings = new JButton("");
		btnOnionRings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uiInterceptor.addItem(8);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/onionRings.png")).getImage();
		btnOnionRings.setIcon(new ImageIcon(img));
		btnOnionRings.setBounds(327, 230, 87, 81);
		orderPanel.add(btnOnionRings);
		
		JButton btnFrenchFries = new JButton("");
		btnFrenchFries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uiInterceptor.addItem(9);
			}
		});
		img = new ImageIcon(this.getClass().getResource("/frenchFries.png")).getImage();
		btnFrenchFries.setIcon(new ImageIcon(img));
		btnFrenchFries.setBounds(440, 230, 87, 81);
		orderPanel.add(btnFrenchFries);
		
		JLabel lblBurgerSizes = new JLabel("Burger Sizes:");
		lblBurgerSizes.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblBurgerSizes.setBounds(18, 16, 200, 50);
		orderPanel.add(lblBurgerSizes);
		
		JLabel lblBypass = new JLabel("Bypass");
		lblBypass.setBounds(52, 158, 57, 35);
		orderPanel.add(lblBypass);
		
		JLabel lblDoubleBypass = new JLabel("Double Bypass");
		lblDoubleBypass.setBounds(164, 151, 106, 50);
		orderPanel.add(lblDoubleBypass);
		
		JLabel lblTrippleBypass = new JLabel("Triple Bypass");
		lblTrippleBypass.setBounds(297, 153, 95, 50);
		orderPanel.add(lblTrippleBypass);
		
		JLabel lblQuadBypass = new JLabel("Quad Bypass");
		lblQuadBypass.setBounds(423, 153, 87, 50);
		orderPanel.add(lblQuadBypass);
		
		JLabel lblToppings = new JLabel("Toppings:");
		lblToppings.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblToppings.setBounds(18, 193, 200, 50);
		orderPanel.add(lblToppings);
		
		JButton btnNewButton = new JButton("Add Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add order to listItems
				addAction();
			}
		});
		btnNewButton.setBounds(18, 513, 117, 50);
		orderPanel.add(btnNewButton);
		
		JButton btnModifyOrder = new JButton("Modify Order");
		btnModifyOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderPanel.setVisible(false);
				modifyPanel.setVisible(true);
			}
		});
		btnModifyOrder.setBounds(154, 513, 117, 50);
		orderPanel.add(btnModifyOrder);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAction();
			}
		});
		btnReset.setBounds(289, 513, 117, 50);
		orderPanel.add(btnReset);
		
		JButton btnPayment = new JButton("Confirm");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderPanel.setVisible (false);
				confirmPanel.setVisible(true);
				try {
					confirmAction();
				} catch (InstantiationException | IllegalAccessException
						| ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPayment.setBounds(423, 513, 117, 50);
		orderPanel.add(btnPayment);
		
		JLabel lblHamSlices = new JLabel("Ham Slices");
		lblHamSlices.setBounds(28, 304, 75, 24);
		orderPanel.add(lblHamSlices);
		
		JLabel lblFriedEgg = new JLabel("Fried Egg");
		lblFriedEgg.setBounds(127, 302, 66, 29);
		orderPanel.add(lblFriedEgg);
		
		JLabel lblCheese = new JLabel("Cheese");
		lblCheese.setBounds(249, 302, 50, 29);
		orderPanel.add(lblCheese);
		
		JLabel lblOnionRings = new JLabel("Onion Rings");
		lblOnionRings.setBounds(335, 302, 79, 29);
		orderPanel.add(lblOnionRings);
		
		JLabel lblFrenchFries = new JLabel("French Fries");
		lblFrenchFries.setBounds(450, 302, 77, 29);
		orderPanel.add(lblFrenchFries);
		
		JLabel lblFreeToppings = new JLabel("Free Toppings:");
		lblFreeToppings.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblFreeToppings.setBounds(18, 334, 200, 50);
		orderPanel.add(lblFreeToppings);
		
		chckbxOunces = new JCheckBox("32 Ounces");
		chckbxOunces.setBounds(18, 458, 114, 23);
		orderPanel.add(chckbxOunces);
		//chckbxOunces.addItemListener(handler);
		
		chckbxOunces_1 = new JCheckBox("48 Ounces");
		chckbxOunces_1.setBounds(154, 458, 114, 23);
		orderPanel.add(chckbxOunces_1);
		//chckbxOunces_1.addItemListener(handler);
		
		chckbxBladderBuster = new JCheckBox("Bladder Buster (64 Ounces)");
		chckbxBladderBuster.setBounds(310, 458, 200, 23);
		orderPanel.add(chckbxBladderBuster);
		//chckbxBladderBuster.addItemListener(handler);
		
		JLabel lblGenericSodas = new JLabel("Generic Sodas:");
		lblGenericSodas.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblGenericSodas.setBounds(18, 421, 200, 50);
		orderPanel.add(lblGenericSodas);
		
		JButton btnCancelOrder = new JButton("Cancel Order");
		btnCancelOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderPanel.setVisible(false);
				menuPanel.setVisible(true);
				cancelAction();
			}
		});
		btnCancelOrder.setBounds(412, 8, 117, 35);
		orderPanel.add(btnCancelOrder);
		
		comboBox = new JComboBox();
		comboBox.setBounds(128, 41, 255, 27);
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		        if (modifyPanel.isVisible()) {
			    	comboSelector();
		        }

		    }
		});

		modifyPanel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Select Order:");
		lblNewLabel_2.setBounds(28, 45, 88, 16);
		modifyPanel.add(lblNewLabel_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifyPanel.setVisible(false);
				orderPanel.setVisible(true);
			}
		});
		btnBack.setBounds(20, 4, 61, 29);
		modifyPanel.add(btnBack);
		
		chckbxRemoveOrder = new JCheckBox("Remove Order");
		chckbxRemoveOrder.setBounds(405, 41, 128, 23);
		modifyPanel.add(chckbxRemoveOrder);
		chckbxRemoveOrder.addItemListener(handler);
		
		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					modifyAction();
				} catch (InstantiationException | IllegalAccessException
						| ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnModify.setBounds(102, 509, 117, 43);
		modifyPanel.add(btnModify);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifyPanel.setVisible(false);
				confirmPanel.setVisible(true);
				try {
					confirmAction();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnConfirm.setBounds(310, 509, 117, 43);
		modifyPanel.add(btnConfirm);
		
		JLabel lblSelectItemsTo = new JLabel("Select items to remove:");
		lblSelectItemsTo.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblSelectItemsTo.setBounds(28, 105, 232, 16);
		modifyPanel.add(lblSelectItemsTo);
		
		JLabel lblSelectItemsTo_1 = new JLabel("Select items to add:");
		lblSelectItemsTo_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblSelectItemsTo_1.setBounds(28, 306, 173, 16);
		modifyPanel.add(lblSelectItemsTo_1);
		
		chckbxHamSlices = new JCheckBox("Ham Slices");
		chckbxHamSlices.setBounds(28, 140, 128, 23);
		modifyPanel.add(chckbxHamSlices);
		
		chckbxFriedEgg = new JCheckBox("Fried Egg");
		chckbxFriedEgg.setBounds(167, 140, 128, 23);
		modifyPanel.add(chckbxFriedEgg);
		
		chckbxCheese = new JCheckBox("Cheese");
		chckbxCheese.setBounds(310, 140, 128, 23);
		modifyPanel.add(chckbxCheese);
		
		chckbxOnionRings = new JCheckBox("Onion Rings");
		chckbxOnionRings.setBounds(28, 185, 128, 23);
		modifyPanel.add(chckbxOnionRings);
		
		chckbxFrenchFries = new JCheckBox("French Fries");
		chckbxFrenchFries.setBounds(167, 185, 128, 23);
		modifyPanel.add(chckbxFrenchFries);
		
		chckbxMustard_1 = new JCheckBox("Mustard");
		chckbxMustard_1.setBounds(425, 140, 108, 23);
		modifyPanel.add(chckbxMustard_1);
		
		chckbxMayonnaise_1 = new JCheckBox("Mayonnaise");
		chckbxMayonnaise_1.setBounds(28, 231, 128, 23);
		modifyPanel.add(chckbxMayonnaise_1);
		
		chckbxKetchup = new JCheckBox("Ketchup");
		chckbxKetchup.setBounds(425, 185, 128, 23);
		modifyPanel.add(chckbxKetchup);
		
		chckbxLettuce_1 = new JCheckBox("Lettuce");
		chckbxLettuce_1.setBounds(310, 185, 128, 23);
		modifyPanel.add(chckbxLettuce_1);
		
		chckbxTomato_1 = new JCheckBox("Tomato");
		chckbxTomato_1.setBounds(167, 231, 128, 23);
		modifyPanel.add(chckbxTomato_1);
		
		chckbxOnion_1 = new JCheckBox("Onion");
		chckbxOnion_1.setBounds(310, 231, 128, 23);
		modifyPanel.add(chckbxOnion_1);
		
		chckbxPickle_1 = new JCheckBox("Pickle");
		chckbxPickle_1.setBounds(425, 231, 128, 23);
		modifyPanel.add(chckbxPickle_1);
		
		chckbxJPepper = new JCheckBox("J. Pepper");
		chckbxJPepper.setBounds(28, 271, 128, 23);
		modifyPanel.add(chckbxJPepper);
		
		chckbxOunces_2 = new JCheckBox("32 Ounces");
		chckbxOunces_2.setBounds(167, 271, 128, 23);
		modifyPanel.add(chckbxOunces_2);
		
		chckbxOunces_3 = new JCheckBox("48 Ounces");
		chckbxOunces_3.setBounds(310, 271, 128, 23);
		modifyPanel.add(chckbxOunces_3);
		
		chckbxBBuster = new JCheckBox("B. Buster");
		chckbxBBuster.setBounds(425, 271, 128, 23);
		modifyPanel.add(chckbxBBuster);
		
		checkBox = new JCheckBox("Ham Slices");
		checkBox.setBounds(28, 334, 128, 23);
		modifyPanel.add(checkBox);
		
		checkBox_1 = new JCheckBox("Onion Rings");
		checkBox_1.setBounds(28, 379, 128, 23);
		modifyPanel.add(checkBox_1);
		
		checkBox_2 = new JCheckBox("Mayonnaise");
		checkBox_2.setBounds(28, 421, 128, 23);
		modifyPanel.add(checkBox_2);
		
		checkBox_3 = new JCheckBox("J. Pepper");
		checkBox_3.setBounds(28, 463, 128, 23);
		modifyPanel.add(checkBox_3);
		
		checkBox_4 = new JCheckBox("Fried Egg");
		checkBox_4.setBounds(167, 334, 128, 23);
		modifyPanel.add(checkBox_4);
		
		checkBox_5 = new JCheckBox("French Fries");
		checkBox_5.setBounds(167, 379, 128, 23);
		modifyPanel.add(checkBox_5);
		
		checkBox_6 = new JCheckBox("Tomato");
		checkBox_6.setBounds(167, 421, 128, 23);
		modifyPanel.add(checkBox_6);
		
		checkBox_7 = new JCheckBox("32 Ounces");
		checkBox_7.setBounds(167, 463, 128, 23);
		modifyPanel.add(checkBox_7);
		
		checkBox_8 = new JCheckBox("Cheese");
		checkBox_8.setBounds(310, 334, 128, 23);
		modifyPanel.add(checkBox_8);
		
		checkBox_9 = new JCheckBox("Lettuce");
		checkBox_9.setBounds(310, 379, 128, 23);
		modifyPanel.add(checkBox_9);
		
		checkBox_10 = new JCheckBox("Onion");
		checkBox_10.setBounds(310, 421, 128, 23);
		modifyPanel.add(checkBox_10);
		
		checkBox_11 = new JCheckBox("48 Ounces");
		checkBox_11.setBounds(310, 463, 128, 23);
		modifyPanel.add(checkBox_11);
		
		checkBox_12 = new JCheckBox("Mustard");
		checkBox_12.setBounds(425, 334, 108, 23);
		modifyPanel.add(checkBox_12);
		
		checkBox_13 = new JCheckBox("Ketchup");
		checkBox_13.setBounds(425, 379, 128, 23);
		modifyPanel.add(checkBox_13);
		
	    checkBox_14 = new JCheckBox("Pickle");
		checkBox_14.setBounds(425, 421, 128, 23);
		modifyPanel.add(checkBox_14);
		
		checkBox_15 = new JCheckBox("B. Buster");
		checkBox_15.setBounds(425, 463, 128, 23);
		modifyPanel.add(checkBox_15);
		
		
		
		JButton btnModify_1 = new JButton("Modify");
		btnModify_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentPanel.setVisible(false);
				modifyPanel.setVisible(true);
			}
		});
		btnModify_1.setBounds(57, 515, 117, 48);
		confirmPanel.add(btnModify_1);
		
		JButton btnPayment_1 = new JButton("Payment");
		btnPayment_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPanel.setVisible(false);
				paymentPanel.setVisible(true);
			}
		});
		btnPayment_1.setBounds(370, 515, 117, 48);
		confirmPanel.add(btnPayment_1);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(362, 487, 36, 16);
		confirmPanel.add(lblTotal);
		
		JLabel lblTax = new JLabel("Tax (6.5%) :");
		lblTax.setBounds(326, 467, 72, 16);
		confirmPanel.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setBounds(342, 448, 56, 16);
		confirmPanel.add(lblSubtotal);
		
		label = new JLabel("$ 00.00");
		label.setBounds(410, 448, 61, 16);
		confirmPanel.add(label);
		
		label_1 = new JLabel("$ 00.00");
		label_1.setBounds(410, 467, 61, 16);
		confirmPanel.add(label_1);
		
		label_2 = new JLabel("$ 00.00");
		label_2.setBounds(410, 487, 61, 16);
		confirmPanel.add(label_2);
		
		list = new List();
		list.setBounds(10, 10, 533, 413);
		confirmPanel.add(list);
		
		JButton btnCash = new JButton("");
		btnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentAction("cash");
			}
		});
		img = new ImageIcon(this.getClass().getResource("/cash.png")).getImage();
		btnCash.setIcon(new ImageIcon(img));
		btnCash.setBounds(111, 55, 117, 104);
		paymentPanel.add(btnCash);
		
		JButton btnCredit = new JButton("");
		btnCredit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentAction("debit");
			}
		});
		img = new ImageIcon(this.getClass().getResource("/cards.png")).getImage();
		btnCredit.setIcon(new ImageIcon(img));
		btnCredit.setBounds(324, 55, 117, 104);
		paymentPanel.add(btnCredit);
		
		JButton btnDebit = new JButton("");
		btnDebit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentAction("credit");
			}
		});
		img = new ImageIcon(this.getClass().getResource("/cards.png")).getImage();
		btnDebit.setIcon(new ImageIcon(img));
		btnDebit.setBounds(111, 199, 117, 104);
		paymentPanel.add(btnDebit);
		
		JButton btnGiftcard = new JButton("");
		btnGiftcard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentAction("store");
			}
		});
		img = new ImageIcon(this.getClass().getResource("/logoNew.png")).getImage();
		btnGiftcard.setIcon(new ImageIcon(img));
		btnGiftcard.setBounds(324, 199, 117, 104);
		paymentPanel.add(btnGiftcard);
		
		JButton btnSplit = new JButton("");
		btnSplit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentAction("split");
			}
		});
		img = new ImageIcon(this.getClass().getResource("/split.png")).getImage();
		btnSplit.setIcon(new ImageIcon(img));
		btnSplit.setBounds(164, 343, 198, 104);
		paymentPanel.add(btnSplit);
		
		JLabel lblSelectPaymentMethod = new JLabel("Select Payment Method");
		lblSelectPaymentMethod.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblSelectPaymentMethod.setBounds(164, 6, 229, 25);
		paymentPanel.add(lblSelectPaymentMethod);
		
		JLabel lblCash = new JLabel("Cash");
		lblCash.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCash.setBounds(140, 159, 61, 16);
		paymentPanel.add(lblCash);
		
		JLabel lblDebitCard = new JLabel("Debit Card");
		lblDebitCard.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDebitCard.setBounds(345, 159, 89, 16);
		paymentPanel.add(lblDebitCard);
		
		JLabel lblCreditCard = new JLabel("Credit Card");
		lblCreditCard.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCreditCard.setBounds(121, 302, 89, 16);
		paymentPanel.add(lblCreditCard);
		
		JLabel lblStoreCard = new JLabel("Store Card");
		lblStoreCard.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblStoreCard.setBounds(345, 302, 89, 16);
		paymentPanel.add(lblStoreCard);
		
		JLabel lblSplitPay = new JLabel("Split Pay");
		lblSplitPay.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSplitPay.setBounds(234, 446, 67, 16);
		paymentPanel.add(lblSplitPay);
		
		JLabel lblCashAndCredit = new JLabel("(Cash and credit cards only)");
		lblCashAndCredit.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblCashAndCredit.setBounds(195, 459, 143, 16);
		paymentPanel.add(lblCashAndCredit);
		
		JLabel lblNewLabel_3 = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/accept.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(96, 521, 352, 42);
		paymentPanel.add(lblNewLabel_3);
		
		dataPanel = new JPanel();
		frame.getContentPane().add(dataPanel, "name_1515631083615110");
		dataPanel.setLayout(null);
		
		JLabel lblEnterTenderedCash = new JLabel("Enter tendered cash:");
		lblEnterTenderedCash.setBounds(5, 73, 133, 16);
		dataPanel.add(lblEnterTenderedCash);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 67, 352, 28);
		dataPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDebitCard_1 = new JLabel("Debit Card / Credit Card / Store Card");
		lblDebitCard_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDebitCard_1.setBounds(6, 134, 372, 28);
		dataPanel.add(lblDebitCard_1);
		
		JLabel lblCardNumber = new JLabel("Card Number:");
		lblCardNumber.setBounds(6, 184, 108, 16);
		dataPanel.add(lblCardNumber);
		
		JLabel lblExpirationDate = new JLabel("Expiration Date:");
		lblExpirationDate.setBounds(6, 225, 143, 16);
		dataPanel.add(lblExpirationDate);
		
		JLabel lblCvv = new JLabel("CVV:");
		lblCvv.setBounds(359, 225, 61, 16);
		dataPanel.add(lblCvv);
		
		JLabel lblCashPayment = new JLabel("Cash Payment");
		lblCashPayment.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCashPayment.setBounds(6, 27, 143, 28);
		dataPanel.add(lblCashPayment);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 174, 388, 28);
		dataPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(108, 219, 221, 28);
		dataPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(392, 219, 104, 28);
		dataPanel.add(textField_4);
		
		JLabel lblPostalCode = new JLabel("Postal Code:");
		lblPostalCode.setBounds(6, 276, 85, 16);
		dataPanel.add(lblPostalCode);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(108, 270, 156, 28);
		dataPanel.add(textField_5);
		
		JLabel lblSecurityCode = new JLabel("Security Code:");
		lblSecurityCode.setBounds(300, 276, 100, 16);
		dataPanel.add(lblSecurityCode);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(392, 270, 104, 28);
		dataPanel.add(textField_6);
		
		JButton btnAutofill = new JButton("Autofill");
		btnAutofill.setBounds(414, 138, 77, 29);
		dataPanel.add(btnAutofill);
		
		JLabel lblcvvIsNot = new JLabel("***CVV is not required for store cards");
		lblcvvIsNot.setBounds(30, 324, 273, 16);
		dataPanel.add(lblcvvIsNot);
		
		JLabel lblsecurityCodeIs = new JLabel("***Security Code is not required for credit and debit cards");
		lblsecurityCodeIs.setBounds(30, 340, 370, 16);
		dataPanel.add(lblsecurityCodeIs);
		
		JLabel lbluseCardReader = new JLabel("***Use card reader for card data or click Autofill to simulate card data");
		lbluseCardReader.setBounds(30, 358, 466, 16);
		dataPanel.add(lbluseCardReader);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					processPayment();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPlaceOrder.setBounds(212, 398, 117, 47);
		dataPanel.add(btnPlaceOrder);
		
		JButton btnNewPaymentMethod = new JButton("New Payment");
		btnNewPaymentMethod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newPaymentAction();
			}
		});
		btnNewPaymentMethod.setBounds(303, 516, 117, 47);
		dataPanel.add(btnNewPaymentMethod);
		
		lblErrorPaymentMethod = new JLabel("Error: Payment method was declined by host ");
		lblErrorPaymentMethod.setForeground(Color.RED);
		lblErrorPaymentMethod.setBounds(137, 470, 283, 16);
		lblErrorPaymentMethod.setVisible(false);
		dataPanel.add(lblErrorPaymentMethod);
		
		JButton btnCancelOrder_1 = new JButton("Cancel Order");
		btnCancelOrder_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataPanel.setVisible(false);
				menuPanel.setVisible(true);
				cancelAction();
			}
		});
		btnCancelOrder_1.setBounds(127, 516, 117, 47);
		dataPanel.add(btnCancelOrder_1);
		
		finalPanel = new JPanel();
		frame.getContentPane().add(finalPanel, "name_1515635381038385");
		finalPanel.setLayout(null);
		
		lblFinalizingOrder = new JLabel("Finalizing order ...");
		lblFinalizingOrder.setBounds(52, 133, 183, 16);
		//lblFinalizingOrder.setVisible(false);
		finalPanel.add(lblFinalizingOrder);
		
		lblCompletingOrder = new JLabel("Completing order ...");
		lblCompletingOrder.setBounds(52, 180, 183, 16);
		//lblCompletingOrder.setVisible(false);
		finalPanel.add(lblCompletingOrder);
		
		lblPrintingCustomerReceipt = new JLabel("Printing customer receipt ...");
		lblPrintingCustomerReceipt.setBounds(52, 231, 183, 16);
		//lblPrintingCustomerReceipt.setVisible(false);
		finalPanel.add(lblPrintingCustomerReceipt);
		
		lblAddingOrderTo = new JLabel("Adding order to kitchen queue ...");
		lblAddingOrderTo.setBounds(49, 281, 216, 16);
		//lblAddingOrderTo.setVisible(false);
		finalPanel.add(lblAddingOrderTo);
		
		lblOrderComplete = new JLabel("Order Complete!!!");
		lblOrderComplete.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblOrderComplete.setBounds(188, 380, 161, 28);
		//lblOrderComplete.setVisible(false);
		finalPanel.add(lblOrderComplete);
		
		btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finalPanel.setVisible(false);
				menuPanel.setVisible(true);
				resetAction();
			}
		});
		btnReturn.setBounds(217, 506, 117, 46);
		//btnReturn.setVisible(false);
		finalPanel.add(btnReturn);
		
		JLabel lblBalance = new JLabel("Balance: ");
		lblBalance.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblBalance.setBounds(52, 67, 77, 28);
		finalPanel.add(lblBalance);
		
		label_3 = new JLabel("$00.00");
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label_3.setBounds(128, 67, 161, 28);
		finalPanel.add(label_3);
	}
}
