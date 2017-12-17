package com.example.maven.calculator_sandra_b;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Design and function of the length converter
 * 
 * @author Sandra Bjorklund
 * @verision 2.3
 */
public class MainFrame {
	/**
	 * Constructors to create design
	 */
	private JFrame frmConverter;
	private JTextField tx_setMeter;
	private JTextField tx_Result;
	private JLabel lbMeter = new JLabel("Meter :");
	private JLabel lblResult = new JLabel("Result:");
	private JButton btnKm = new JButton("KM");
	private JButton btnYard = new JButton("Yard");
	private JButton btnMile = new JButton("Mile");
	private JButton btnCM = new JButton("CM");
	private JButton btnFoot = new JButton("Foot");
	private JButton btnMM = new JButton("MM");
	private JButton btnInch = new JButton("Inch");

	/**
	 * Constructor to get the count methods
	 */
	FromMeters fromMeters = new FromMeters();
	/**
	 * The attributes to count
	 */
	double valueMeterToFoot;
	double valueMeterToMm;
	double valueMeterToCm;
	double valueMeterToMile;
	double valueMeterToYard;
	double valueMeterToKm;
	double valueMeterToInch;
	double convertedValue;

	/**
	 * Launch the application MainFrame.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the Frame.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConverter = new JFrame();
		frmConverter.setTitle("Converter");
		frmConverter.setBounds(100, 100, 450, 300);
		frmConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConverter.getContentPane().setLayout(null);

		/**
		 * Settings for design
		 */
		lbMeter.setBounds(116, 39, 98, 31);
		frmConverter.getContentPane().add(lbMeter);

		tx_setMeter = new JTextField();
		tx_setMeter.setBounds(126, 65, 151, 31);
		frmConverter.getContentPane().add(tx_setMeter);
		tx_setMeter.setColumns(10);

		tx_Result = new JTextField();
		tx_Result.setBounds(69, 214, 260, 31);
		frmConverter.getContentPane().add(tx_Result);
		tx_Result.setColumns(10);

		lblResult.setBounds(56, 199, 70, 15);
		frmConverter.getContentPane().add(lblResult);

		btnInch.setBounds(69, 150, 75, 25);
		frmConverter.getContentPane().add(btnInch);

		btnMM.setBounds(239, 150, 75, 25);
		frmConverter.getContentPane().add(btnMM);

		btnFoot.setBounds(287, 108, 75, 25);
		frmConverter.getContentPane().add(btnFoot);

		btnCM.setBounds(154, 150, 75, 25);
		frmConverter.getContentPane().add(btnCM);

		btnMile.setBounds(117, 108, 75, 25);
		frmConverter.getContentPane().add(btnMile);

		btnYard.setBounds(202, 108, 75, 25);
		frmConverter.getContentPane().add(btnYard);

		btnKm.setBounds(32, 108, 75, 25);
		frmConverter.getContentPane().add(btnKm);

		/**
		 *ActionListeners with if statements to set functions to design.
		 */
		btnKm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(tx_setMeter.getText().equals(""))) {
					valueMeterToKm = Double.parseDouble(tx_setMeter.getText());
					convertedValue = fromMeters.meterToKm(valueMeterToKm);
					tx_Result.setText("Km = " + convertedValue);
					cleanTextFields();
				} else {
					tx_Result.setText("No value, please try again");
					cleanTextFields();
				}
			}
		});
		btnYard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(tx_setMeter.getText().equals(""))) {
					valueMeterToYard = Double.parseDouble(tx_setMeter.getText());
					convertedValue = fromMeters.meterToYard(valueMeterToYard);
					tx_Result.setText("Yard = " + convertedValue);
					cleanTextFields();
				} else {
					tx_Result.setText("No value, please try again");
					cleanTextFields();
				}
			}
		});
		btnMile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(tx_setMeter.getText().equals(""))) {
					valueMeterToMile = Double.parseDouble(tx_setMeter.getText());
					convertedValue = fromMeters.meterToMile(valueMeterToMile);
					tx_Result.setText("Mile = " + convertedValue);
					cleanTextFields();
				} else {
					tx_Result.setText("No value, please try again");
					cleanTextFields();
				}
			}
		});
		btnCM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(tx_setMeter.getText().equals(""))) {
					valueMeterToCm = Double.parseDouble(tx_setMeter.getText());
					convertedValue = fromMeters.meterToCm(valueMeterToCm);
					tx_Result.setText("CM = " + convertedValue);
					cleanTextFields();
				} else {
					tx_Result.setText("No value, please try again");
					cleanTextFields();
				}
			}
		});
		btnFoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(tx_setMeter.getText().equals(""))) {
					valueMeterToFoot = Double.parseDouble(tx_setMeter.getText());
					convertedValue = fromMeters.meterToFoot(valueMeterToFoot);
					tx_Result.setText("Foot = " + convertedValue);
					cleanTextFields();
				} else {
					tx_Result.setText("No value, please try again");
					cleanTextFields();
				}
			}
		});

		btnMM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(tx_setMeter.getText().equals(""))) {
					valueMeterToMm = Double.parseDouble(tx_setMeter.getText());
					convertedValue = fromMeters.meterToMm(valueMeterToMm);
					tx_Result.setText("MM = " + convertedValue);
					cleanTextFields();
				} else {
					tx_Result.setText("No value, please try again");
					cleanTextFields();
				}
			}
		});

		btnInch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(tx_setMeter.getText().equals(""))) {
					valueMeterToInch = Double.parseDouble(tx_setMeter.getText());
					convertedValue = fromMeters.meterToInch(valueMeterToInch);
					tx_Result.setText("Inch = " + convertedValue);
					cleanTextFields();
				} else {
					tx_Result.setText("No value, please try again");
					cleanTextFields();
				}
			}
		});

	}
	public void cleanTextFields() {
		tx_setMeter.setText("");
	}
}
