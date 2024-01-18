package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JTextField txtNum4;
	private JTextField txtNum5;
	private JTextField txtNum6;
	private JTextField txtNum7;
	private JTextField txtNum8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 97, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 실행되는 리스너(핸들러)
				System.out.println("확인1 클릭!!!");
				
			}
		});
		btn1.setBounds(12, 60, 67, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭!!!");
				
			}
		});
		btn2.setBounds(91, 60, 67, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭!!!", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer ==0) {
					System.out.println("YES 클릭...");
					
				}else {
					System.out.println("NO 클릭...");
				}
			}
		});
		btn3.setBounds(170, 60, 67, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트필드 실습");
		lblNewLabel_2.setBounds(12, 93, 107, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(56, 111, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(12, 114, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnUid = new JButton("확인");
		btnUid.setBounds(175, 110, 67, 23);
		frame.getContentPane().add(btnUid);
		
		JLabel lbResultUid = new JLabel("결과 : ");
		lbResultUid.setBounds(248, 114, 145, 15);
		frame.getContentPane().add(lbResultUid);
		
		JLabel lblNewLabel_3_1 = new JLabel("이름");
		lblNewLabel_3_1.setBounds(12, 143, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(56, 140, 116, 21);
		frame.getContentPane().add(txtName);
		
		JButton btnName = new JButton("확인");
		
		btnName.setBounds(175, 139, 67, 23);
		frame.getContentPane().add(btnName);
		
		JLabel lbResultName = new JLabel("결과 : ");
		lbResultName.setBounds(248, 143, 145, 15);
		frame.getContentPane().add(lbResultName);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("휴대폰");
		lblNewLabel_3_1_1.setBounds(12, 172, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(56, 169, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnHp = new JButton("확인");
		
		btnHp.setBounds(175, 168, 67, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbResultHp = new JLabel("결과 : ");
		lbResultHp.setBounds(248, 172, 145, 15);
		frame.getContentPane().add(lbResultHp);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("덧셈");
		lblNewLabel_3_1_1_1.setBounds(12, 201, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1_1);
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(10);
		txtNum1.setBounds(56, 198, 53, 21);
		frame.getContentPane().add(txtNum1);
		
		JButton btnPlus = new JButton("확인");
		
		btnPlus.setBounds(175, 197, 67, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lbResultPlus = new JLabel("결과 : ");
		lbResultPlus.setBounds(248, 201, 145, 15);
		frame.getContentPane().add(lbResultPlus);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(121, 198, 51, 21);
		frame.getContentPane().add(txtNum2);
		
		JLabel lblNewLabel_4 = new JLabel("+");
		lblNewLabel_4.setBounds(111, 201, 13, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("뺄셈");
		lblNewLabel_3_1_1_1_1.setBounds(12, 230, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1_1_1);
		
		txtNum3 = new JTextField();
		txtNum3.setColumns(10);
		txtNum3.setBounds(56, 227, 53, 21);
		frame.getContentPane().add(txtNum3);
		
		JLabel lblNewLabel_4_1 = new JLabel("-");
		lblNewLabel_4_1.setBounds(111, 230, 13, 15);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		txtNum4 = new JTextField();
		txtNum4.setColumns(10);
		txtNum4.setBounds(121, 227, 51, 21);
		frame.getContentPane().add(txtNum4);
		
		JButton btnMinus = new JButton("확인");
		
		btnMinus.setBounds(175, 226, 67, 23);
		frame.getContentPane().add(btnMinus);
		
		JLabel lbResultMinus = new JLabel("결과 : ");
		lbResultMinus.setBounds(248, 230, 145, 15);
		frame.getContentPane().add(lbResultMinus);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("곱셈");
		lblNewLabel_3_1_1_1_2.setBounds(12, 259, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1_1_2);
		
		txtNum5 = new JTextField();
		txtNum5.setColumns(10);
		txtNum5.setBounds(56, 256, 53, 21);
		frame.getContentPane().add(txtNum5);
		
		JLabel lblNewLabel_4_2 = new JLabel("*");
		lblNewLabel_4_2.setBounds(111, 259, 13, 15);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		txtNum6 = new JTextField();
		txtNum6.setColumns(10);
		txtNum6.setBounds(121, 256, 51, 21);
		frame.getContentPane().add(txtNum6);
		
		JButton btnMulti = new JButton("확인");
		
		btnMulti.setBounds(175, 255, 67, 23);
		frame.getContentPane().add(btnMulti);
		
		JLabel lbResultMulti = new JLabel("결과 : ");
		lbResultMulti.setBounds(248, 259, 145, 15);
		frame.getContentPane().add(lbResultMulti);
		
		JLabel lblNewLabel_3_1_1_1_3 = new JLabel("나눗셈");
		lblNewLabel_3_1_1_1_3.setBounds(12, 288, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1_1_3);
		
		txtNum7 = new JTextField();
		txtNum7.setColumns(10);
		txtNum7.setBounds(56, 285, 53, 21);
		frame.getContentPane().add(txtNum7);
		
		JLabel lblNewLabel_4_3 = new JLabel("/");
		lblNewLabel_4_3.setBounds(111, 288, 13, 15);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		txtNum8 = new JTextField();
		txtNum8.setColumns(10);
		txtNum8.setBounds(121, 285, 51, 21);
		frame.getContentPane().add(txtNum8);
		
		JButton btnDiv = new JButton("확인");
		
		btnDiv.setBounds(175, 284, 67, 23);
		frame.getContentPane().add(btnDiv);
		
		JLabel lbResultDiv = new JLabel("결과 : ");
		lbResultDiv.setBounds(248, 288, 145, 15);
		frame.getContentPane().add(lbResultDiv);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 353, 51, 23);
		frame.getContentPane().add(chk1);
		
		JLabel lblNewLabel_5 = new JLabel("체크박스 실습");
		lblNewLabel_5.setBounds(12, 332, 97, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(67, 353, 51, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(121, 353, 51, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(175, 353, 51, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(225, 353, 51, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbCheckResult = new JLabel("결과 : ");
		lbCheckResult.setBounds(12, 382, 289, 15);
		frame.getContentPane().add(lbCheckResult);
		
		JButton btnCheck = new JButton("확인");
		
		btnCheck.setBounds(284, 353, 67, 23);
		frame.getContentPane().add(btnCheck);
		
		
		
		
		
		// 이벤트 리스너
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 텍스트필드에 입력된 문자열 가져오기
				String uid = txtUid.getText();
				
				// 결과 라벨에 가져온 문자열 입력하기 
				lbResultUid.setText("결과 : "  + uid);
				
			}
		});
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 텍스트필드에 입력된 문자열 가져오기
				String name = txtName.getText();
				
				// 결과 라벨에 가져온 문자열 입력하기 
				lbResultName.setText("결과 : "  + name);
			}
		});
		
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 텍스트필드에 입력된 문자열 가져오기
				String hp = txtHp.getText();
				
				// 결과 라벨에 가져온 문자열 입력하기 
				lbResultHp.setText("결과 : "  + hp);
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int result = num1 + num2;
				lbResultPlus.setText("결과 : " + result);
			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num3 = Integer.parseInt(txtNum3.getText());
				int num4 = Integer.parseInt(txtNum4.getText());
				
				int result = num3 - num4;
				lbResultMinus.setText("결과 : " + result);
			}
		});
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num5 = Integer.parseInt(txtNum5.getText());
				int num6 = Integer.parseInt(txtNum6.getText());
				
				int result = num5 * num6;
				lbResultMulti.setText("결과 : " + result);
			}
		});
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num7 = Integer.parseInt(txtNum7.getText());
				int num8 = Integer.parseInt(txtNum8.getText());
				
				int result = num7 / num8;
				lbResultDiv.setText("결과 : " + result);
			}
		});
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbCheckResult.setText("결과 : " + cities);
				
				
			}
		});
		
	}
}
