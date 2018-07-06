package test1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test2 extends JFrame implements ActionListener{
	
	JPanel s1=new JPanel();
	JLabel sui1=new JLabel("姓名");
	JLabel sui2=new JLabel("密码");
	JLabel sui3=new JLabel("密码");
	JTextField kai1=new JTextField(20);
	JTextField kai2=new JTextField(20);
	JTextField kai3=new JTextField(20);
	JButton ling1=new JButton("注册");
	JButton ling2=new JButton("清空");
	public Test2(){
		s1.add(sui1);
		s1.add(kai1);
		s1.add(sui2);
		s1.add(kai2);
		s1.add(sui3);
		s1.add(kai3);
		s1.add(ling1);
		s1.add(ling2);
		s1.setLayout(new GridLayout(4, 2));
		ling1.addActionListener(this);
		ling2.addActionListener(this);
		this.add(s1);
		pack();
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(ling2)){
			kai1.setText("");
			kai2.setText("");
			kai3.setText("");
		}
		
		if(arg0.getSource().equals(ling1)){
			try {
				boolean ret=false;
				Scanner input=new Scanner(new File("E:/suikailing.txt"));
				if(kai1.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "不能为空");
				}else if(kai2.getText().isEmpty()||kai3.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "不能为空");
				}else if(!kai2.getText().equals(kai3.getText())){
					JOptionPane.showMessageDialog(null, "不一致");
				}else {
					while(input.hasNextLine()){
						String s1=input.nextLine();
						int a=s1.indexOf("#");
						String s2=s1.substring(0, a);
						System.out.println(s2);
						if(s2.equals(kai1.getText())){
							ret=true;
							JOptionPane.showMessageDialog(null, "已经重复");
							break;
						}
					}
					if(ret==false){
						JOptionPane.showMessageDialog(null, "注册成功");
					}
					
				}
			} catch (FileNotFoundException e) {			
			}
			
		}
		
	}
	public static void main(String[] args) {
		Test2 skl=new Test2();
		
	}
}
