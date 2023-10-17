package oracle.awtlogin;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main implements ActionListener {
//	private String M_ID = "greencomp", M_PWD = "green1234";
	private Button btnLogin, btnRegister;
	private TextField tfMsg;
	TextField id, pwd;
	private MemberDAO dao;
	private Frame f, mainFrame;

	public Main() {
		dao = new MemberDAO();
		f = new Frame("Login");
		f.setSize(330, 150);
//		f.setLayout(new FlowLayout());
		f.setLayout(null);

		mainFrame = new Frame("MAIN");
		mainFrame.setSize(400, 300);
		mainFrame.setLocation(10, 20);
		mainFrame.setVisible(false);

		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(20, 20, 50, 50);
		Label lpwd = new Label("PWD : ", Label.RIGHT);
		lpwd.setBounds(20, 50, 50, 50);

		id = new TextField(10);
		id.setBounds(80, 35, 120, 20);
		pwd = new TextField(10);
		pwd.setEchoChar('*');
		pwd.setBounds(80, 65, 120, 20);

		btnLogin = new Button("Login");
		btnLogin.setBounds(210, 30, 60, 30);
		btnLogin.addActionListener(this);
		
		btnRegister = new Button("Register");
		btnRegister.setBounds(210, 70, 60, 30);
		btnRegister.addActionListener(this);

		tfMsg = new TextField();
		tfMsg.setBounds(80, 95, 120, 20);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btnLogin);
		f.add(tfMsg);
		f.add(btnRegister);
		f.setVisible(true);
	}

	public static void main(String[] args) {
//		Main tft = new Main();
		new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin) {
			System.out.println("Login1");
		}else if(e.getSource() == btnRegister) {
			System.out.println("Register1");
		}
		
		if(e.getActionCommand().equals("Login")) {
			System.out.println("Login2");
		}else if(e.getActionCommand().equals("Register")) {
			System.out.println("Register2");
		}
		
//		System.out.println("click!!!");
//		System.out.println(id.getText());
//		if (!id.getText().equals("") && !pwd.getText().equals("")) {
//			ArrayList<MemberVo> ar = dao.list(id.getText());
//			if (ar.size() != 0 && ar.get(0).getPwd().equals(pwd.getText())) {
//				tfMsg.setText("로그인이 되었습니다.");
//				mainFrame.setVisible(true);
//				f.setVisible(false);
//			} else {
//				tfMsg.setText("로그인이 실패하였습니다.");
//			}
//		} else {
//			tfMsg.setText("틀렸습니다.");
//		}
	}
}
