package Hawkeye;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtAddress;
	private JLabel lblAddress;
	private JTextField txtPort;
	private JLabel lblPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		//Ensures that the JFrame will account for the operation system and look like a native application.
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		//Create JFrame/ window
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Create Username Text Field
		txtUsername = new JTextField();
		txtUsername.setToolTipText("Enter your desired username here.");
		txtUsername.setBounds(64, 100, 165, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		//Create Username Label
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(113, 75, 68, 20);
		contentPane.add(lblUsername);
		
		//Create Address Text Field
		txtAddress = new JTextField();
		txtAddress.setToolTipText("Address of the chat server. E.g 192.168.1.1 ");
		txtAddress.setColumns(10);
		txtAddress.setBounds(64, 165, 165, 20);
		contentPane.add(txtAddress);
		
		//Create Address Label
		lblAddress = new JLabel("IP Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setBounds(113, 140, 68, 20);
		contentPane.add(lblAddress);
		
		//Create Port Text Field
		txtPort = new JTextField();
		txtPort.setToolTipText("Enter the port of the desired server. E.g. 2555");
		txtPort.setBounds(64, 230, 165, 20);
		contentPane.add(txtPort);
		txtPort.setColumns(10);
		
		//Create Port Label
		lblPort = new JLabel("Port:");
		lblPort.setHorizontalAlignment(SwingConstants.CENTER);
		lblPort.setBounds(124, 205, 46, 14);
		contentPane.add(lblPort);
		
		//Create login button and set action for button press
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(102, 287, 89, 23);
		contentPane.add(btnLogin);
	}
}
