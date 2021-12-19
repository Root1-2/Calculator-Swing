import java.awt.Color;
import java.math;
import java.awt.Font;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener{
	JPanel panel1;
	JTextField text;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnAdd,btnSub,btnMulti,btnDiv,btnEqual,btnClr, btnsqrt, btnsq;
        int Flag;
        double num1, num2, num3, numResult;
	Frame()
        {
                //Font font = new Font("Arial", Font.BOLD,30) ;
            
		setSize(380,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLocationRelativeTo(null);
                setLayout(null);
                getContentPane().setBackground(Color.BLACK);
                
                panel1 = new JPanel();
                panel1.setBounds(0, 0, 400,100);
                panel1.setBackground(Color.BLACK);
                panel1.setLayout(null);
                add(panel1);
                
                text = new JTextField();
                text.setBounds(15, 10, 360, 50);
                text.setBackground(Color.WHITE);
                panel1.add(text);
                
                btn1 = new JButton("1");btn1.addActionListener(this);//btn1.setFont(font); 
		btn2 = new JButton("2");btn2.addActionListener(this);//btn2.setFont(font);
		btn3 = new JButton("3");btn3.addActionListener(this);//btn3.setFont(font);
		btn4 = new JButton("4");btn4.addActionListener(this);//btn4.setFont(font);
		btn5 = new JButton("5");btn5.addActionListener(this);//btn5.setFont(font);
		btn6 = new JButton("6");btn6.addActionListener(this);//btn6.setFont(font);
		btn7 = new JButton("7");btn7.addActionListener(this);//btn7.setFont(font);
		btn8 = new JButton("8");btn8.addActionListener(this);//btn8.setFont(font);
		btn9 = new JButton("9");btn9.addActionListener(this);//btn9.setFont(font);
		btn0 = new JButton("0");btn0.addActionListener(this);//btn0.setFont(font);
		btnEqual = new JButton("=");btnEqual.addActionListener(this);//btnEqual.setFont(font);
		btnClr = new JButton("C");btnClr.addActionListener(this);//btnClr.setFont(font);
                btnAdd = new JButton("+");btnAdd.addActionListener(this);//btnAdd.setFont(font);
		btnSub = new JButton("-");btnSub.addActionListener(this);//btnSub.setFont(font);
		btnMulti = new JButton("*");btnMulti.addActionListener(this);//btnMulti.setFont(font);
		btnDiv = new JButton("/");btnDiv.addActionListener(this);//btnDiv.setFont(font);
		btnDot = new JButton(".");btnDot.addActionListener(this);//btnDot.setFont(font);
                btnsqrt = new JButton("\u221A");btnsqrt.addActionListener(this);
                btnsq = new JButton("\u00B2");btnsq.addActionListener(this);
                
                btn1.setBounds(20,100,50,40);
                btn2.setBounds(90,100,50,40);
                btn3.setBounds(160,100,50,40);
                btn4.setBounds(20,170,50,40);
                btn5.setBounds(90,170,50,40);
                btn6.setBounds(160,170,50,40);
                btn7.setBounds(20,240,50,40);
                btn8.setBounds(90,240,50,40);
                btn9.setBounds(160,240,50,40);
                btn0.setBounds(20,310,50,40);
                btnEqual.setBounds(90,310,50,40);
                btnClr.setBounds(160,310,50,40);
                btnsqrt.setBounds(20, 380, 50, 40);
                btnsq.setBounds(90, 380, 50, 40);
                btnAdd.setBounds(250, 100, 50, 40);
                btnSub.setBounds(250, 152, 50, 40);
                btnMulti.setBounds(250, 204, 50, 40);
                btnDiv.setBounds(250, 256, 50, 40);
                btnDot.setBounds(250, 310, 50, 40);
                
                
                
                add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
                add(btn0);
		add(btnEqual);
		add(btnClr);
                add(btnMulti);
                add(btnDiv);
                add(btnDot);
                add(btnSub);
                add(btnAdd);
                add(btnsqrt);
                add(btnsq);
                
                setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
                text.setText(text.getText()+"1");
                }
                if(e.getSource()==btn2){
                text.setText(text.getText()+"2");
                }
                if(e.getSource()==btn3){
                text.setText(text.getText()+"3");
                }
                if(e.getSource()==btn4){
                text.setText(text.getText()+"4");
                }
                if(e.getSource()==btn5){
                text.setText(text.getText()+"5");
                }
                if(e.getSource()==btn6){
                text.setText(text.getText()+"6");
                }
                if(e.getSource()==btn7){
                text.setText(text.getText()+"7");
                }
                if(e.getSource()==btn8){
                text.setText(text.getText()+"8");
                }
                if(e.getSource()==btn9){
                text.setText(text.getText()+"9");
                }
                if(e.getSource()==btn0){
                text.setText(text.getText()+"0");
                }
                if(e.getSource()==btnDot){
                text.setText(text.getText()+".");
                }
                
                if(e.getSource()==btnAdd){
                    String str1 = text.getText();
                    num1 = Double.parseDouble(str1);
                    text.setText("");
                    Flag=1;
                }
                
                if(e.getSource()==btnSub){
                    String str1 = text.getText();
                    num1 = Double.parseDouble(str1);
                    text.setText("");
                    Flag=2;
                }
                
                if(e.getSource()==btnMulti){
                    String str1 = text.getText();
                    num1 = Double.parseDouble(str1);
                    text.setText("");
                    Flag=3;
                }
                
                if(e.getSource()==btnDiv){
                    String str1 = text.getText();
                    num1 = Double.parseDouble(str1);
                    text.setText("");
                    Flag=4;
                }
                
                if(e.getSource()==btnsq){
                        String str1 = text.getText();
                        num1 = Double.parseDouble(str1);
                        numResult = num1*num1;
                        text.setText(Double.toString(numResult));
                    }
                
                if(e.getSource()==btnEqual){
                    if(Flag==1){
                        String str2 = text.getText();
                        num2 = Double.parseDouble(str2);
                        numResult = num1 + num2;
                        text.setText(Double.toString(numResult));
                    }
                    
                    if(Flag==2){
                        String str2 = text.getText();
                        num2 = Double.parseDouble(str2);
                        numResult = num1 - num2;
                        text.setText(Double.toString(numResult));
                    }   
                    
                    if(Flag==3){
                        String str2 = text.getText();
                        num2 = Double.parseDouble(str2);
                        numResult = num1 * num2;
                        text.setText(Double.toString(numResult));
                    }
                    
                    if(Flag==4){
                        String str2 = text.getText();
                        num2 = Double.parseDouble(str2);
                        numResult = num1 / num2;
                        text.setText(Double.toString(numResult));
                    }
                }  
                if(e.getSource==btnsqrt){
                      String str1 = text.getText ();
                      num1 = Double.parseDouble(str1);
                      numResult = StrictMath.sqrt(num1);
                      text.setText(Double.toString(numResult);
                }
                if(e.getSource()==btnClr){
                  text.setText("");
                }
		
	}
}
