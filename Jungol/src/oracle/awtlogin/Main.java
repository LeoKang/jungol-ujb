package oracle.awtlogin;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main implements ActionListener {
	private String M_ID = "greencomp", M_PWD = "green1234";
	private Button btn;
	private TextField tfMsg;
	TextField id, pwd;
	private MemberDAO dao;

	public Main() {
		dao = new MemberDAO();
		Frame f = new Frame("Login");
		f.setSize(330, 150);
//		f.setLayout(new FlowLayout());
		f.setLayout(null);

		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(20, 20, 50, 50);
		Label lpwd = new Label("PWD : ", Label.RIGHT);
		lpwd.setBounds(20, 50, 50, 50);

		id = new TextField(10);
		id.setBounds(80, 35, 120, 20);
		pwd = new TextField(10);
		pwd.setEchoChar('*');
		pwd.setBounds(80, 65, 120, 20);

		btn = new Button("Login");
		btn.setBounds(210, 30, 50, 50);
		btn.addActionListener(this);

		tfMsg = new TextField();
		tfMsg.setBounds(80, 95, 120, 20);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn);
		f.add(tfMsg);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Main tft = new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("click!!!");
		System.out.println(id.getText());
		if (!id.getText().equals("") && !pwd.getText().equals("")) {
			ArrayList<MemberVo> ar = dao.list(id.getText());
			if(ar.size() != 0 && ar.get(0).getPwd().equals(pwd.getText())) {
				tfMsg.setText("로그인이 되었습니다.");	
			}else {
				tfMsg.setText("로그인이 실패하였습니다.");
			}
		} else {
			tfMsg.setText("틀렸습니다.");
		}
	}
}
