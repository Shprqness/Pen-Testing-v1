package github.shprqness.pentools;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JToolBar;

import org.omg.CORBA.PUBLIC_MEMBER;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Label;
import java.awt.List;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Frames {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frames window = new Frames();
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
	public Frames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setName("Pen Testing Application v1 {Coded by Shprqness}");
		ImageIcon icon = new ImageIcon("https://pbs.twimg.com/profile_images/1063070519682101250/s_bZGJef_400x400.jpg");
		frame.setIconImage(icon.getImage());
		frame.setBounds(100, 100, 1134, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBackground(Color.GREEN);
		
		JButton btnNewButton = new JButton("Domain DNS Lookup");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI dnsresolve = new URL("https://cyber-hub.net/domain_resolver.php").toURI();
					Desktop.getDesktop().browse(dnsresolve);
				} catch (IOException e1) {
					System.out.println("Error, Could not process url.");
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(245, 172, 179, 48);
		frame.getContentPane().add(btnNewButton);
		JButton btnNewButton_1 = new JButton("WhoIs Lookup");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI whois = new URL("https://www.whatismyip.com/ip-whois-lookup/").toURI();
					Desktop.getDesktop().browse(whois);
				} catch (IOException e1) {
					System.out.println("Error, Could not process url.");
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(53, 172, 179, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(245, 152, -10, 109);
		frame.getContentPane().add(separator);
		
		TextArea t = new TextArea();
		TextArea textArea = new TextArea();
		textArea.setText("Terms of Service - \n \n By using this application you agree not to use this toward bany sort / kind of illegal activity. \n You agree not "
				+ "too use this application to 'Threaten' or 'Harass' any 3rd party company or individual. \n \n Privacy Policy - \n \n "
				+ "'Pen Testing Application v1' does not in any way, shape or form save / store user information such as \n Internet Protocol Addresses, MAC Addresses or any other form of Personal information without consent from the party.");
		textArea.setEditable(false);
		textArea.setBounds(53, 288, 648, 181);
		frame.getContentPane().add(textArea);
		
		Button button = new Button("Check out the Developers GitHub!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI github = new URL("https://github.com/shprqness").toURI();
					Desktop.getDesktop().browse(github);
				} catch (IOException e1) {
					System.out.println("Error, Could not process url.");
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(53, 10, 240, 28);
		frame.getContentPane().add(button);
		
		
		
	}
}
