package window;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Application implements ActionListener {

	private JFrame frame;
	private JButton btnClickMe;
	private JLabel lblClickMeView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 191, 135);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		btnClickMe = new JButton("ClickMe");
		btnClickMe.setActionCommand("Clicked");
		
		frame.getContentPane().add(btnClickMe, BorderLayout.NORTH);
		
		lblClickMeView = new JLabel("");
		frame.getContentPane().add(lblClickMeView, BorderLayout.SOUTH);
		lblClickMeView.setHorizontalTextPosition(AbstractButton.CENTER);
		
		btnClickMe.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if ("Clicked".equals(e.getActionCommand())){
			this.lblClickMeView.setText("Hello Java");
		}
	}

}
