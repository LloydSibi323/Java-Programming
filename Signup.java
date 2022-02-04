package basicprograms;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Signup extends Frame implements ActionListener{
	TextField t1 = new TextField(30);
	TextField t2 = new TextField(30);
	TextField t3 = new TextField(30);
	Button b1;
	public Signup() {
		setTitle("SignUp");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		
		Label f1 = new Label("Username  ");
		Label f2 = new Label("Email ");
		Label f3 = new Label("Password ");
		
		f1.setAlignment(Label.CENTER);
		f2.setAlignment(Label.CENTER);
		f3.setAlignment(Label.CENTER);
		
		b1 = new Button("Submit");
		b1.addActionListener(this);
		
		add(f1);
		add(t1);
		add(f2);
		add(t2);
		add(f3);
		add(t3);
		add(b1);
		t1.setText("sample@gmail.com");
		t2.setText("username");
		t3.setText("password");
		
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Username    -"+t1.getText());
		System.out.println("Email -"+t2.getText());
		System.out.println("Password -"+t3.getText());
	}
	public static void main(String[]args) {
		new Signup();
	}
}
