package calculate_interest;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener{
	
	JFrame f,f2,f3;
	ButtonGroup G1;
	JRadioButton r1,r2,r3;
	JButton b1,b2,b3,b4,b5;
	String a,b,c; 
	JTextField t,t1,t2;
	GUI()
	{
		f=new JFrame("Calculate Interest");
		f.setVisible(true);
		f.setSize(420,330);
		f.setLayout(null);
		f.getContentPane().setBackground(new Color(245,222,179));
		
		r1 = new JRadioButton("FD Account");
		r1.setBackground(new Color(245, 222, 179));
		r1.setBounds(138, 66, 109, 23);
		f.add(r1);
		
		JLabel l1 = new JLabel("Choose One");
		l1.setBackground(new Color(245, 222, 179));
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(81, 11, 200, 30);
		f.add(l1);
		
		r2 = new JRadioButton("RD Account");
		r2.setBackground(new Color(245, 222, 179));
		r2.setBounds(138, 114, 109, 23);
		f.add(r2);
		
		r3 = new JRadioButton("SB Account");
		r3.setBackground(new Color(245, 222, 179));
		r3.setBounds(138, 168, 109, 23);
		f.add(r3);
		
		b1 = new JButton("Go ->");
		b1.setBounds(138, 222, 89, 23);
		b1.addActionListener(this);
		f.add(b1);
		
		G1=new ButtonGroup();
		G1.add(r1);
		G1.add(r2);
		G1.add(r3);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(r1.isSelected() && e.getSource()==b1)
		{
			f.setVisible(false);
			
			f2=new JFrame("FD Account");
			f2.setVisible(true);
			f2.setSize(390,318);
			f2.setLayout(null);
			f2.getContentPane().setBackground(new Color(245,222,179));
			
			JLabel l1 = new JLabel("FD Account");
			l1.setFont(new Font("Tahoma", Font.BOLD, 20));
			l1.setHorizontalAlignment(SwingConstants.CENTER);
			l1.setBounds(110, 0, 147, 30);
			f2.add(l1);
			
			JLabel l2 = new JLabel("Enter the FD Amount");
			l2.setHorizontalAlignment(SwingConstants.CENTER);
			l2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			l2.setBounds(107, 40, 155, 23);
			f2.add(l2);
			
			JLabel l3 = new JLabel("Enter the number of days");
			l3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			l3.setHorizontalAlignment(SwingConstants.CENTER);
			l3.setBounds(108, 106, 147, 23);
			f2.add(l3);
			
			t = new JTextField();
			t.setBounds(138, 75, 86, 20);
			f2.add(t);
			t.setColumns(10);
			
			t1 = new JTextField();
			t1.setBounds(138, 140, 86, 20);
			f2.add(t1);
			t1.setColumns(10);
			
			JLabel l4 = new JLabel("Enter the age of AC Holder");
			l4.setHorizontalAlignment(SwingConstants.CENTER);
			l4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			l4.setBounds(107, 171, 155, 23);
			f2.add(l4);
			
			t2 = new JTextField();
			t2.setBounds(138, 204, 86, 20);
			f2.add(t2);
			t2.setColumns(10);
			
			b2 = new JButton("Calculate");
			b2.setBounds(135, 245, 89, 23);
			b2.addActionListener(this);
			f2.add(b2);
			
		}
		else if(e.getSource()==b1 && r2.isSelected())
		{
			f.setVisible(false);
			
			f2=new JFrame("RD Account");
			f2.setSize(390,318);
			f2.setLayout(null);
			f2.setVisible(true);
			f2.getContentPane().setBackground(new Color(245,222,179));
			
			JLabel l1 = new JLabel("RD Account");
			l1.setFont(new Font("Tahoma", Font.BOLD, 20));
			l1.setHorizontalAlignment(SwingConstants.CENTER);
			l1.setBounds(110, 0, 147, 30);
			f2.add(l1);
			
			JLabel l2 = new JLabel("Enter the RD Amount");
			l2.setHorizontalAlignment(SwingConstants.CENTER);
			l2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			l2.setBounds(107, 40, 155, 23);
			f2.add(l2);
			
			JLabel l3 = new JLabel("Enter the months 6,9,12,15,18,21");
			l3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			l3.setHorizontalAlignment(SwingConstants.CENTER);
			l3.setBounds(96, 106, 200, 23);
			f2.add(l3);
			
			t = new JTextField();
			t.setBounds(138, 75, 86, 20);
			f2.add(t);
			t.setColumns(10);
			
			t1 = new JTextField();
			t1.setBounds(138, 140, 86, 20);
			f2.add(t1);
			t1.setColumns(10);
			
			JLabel l4 = new JLabel("Enter the age of AC Holder");
			l4.setHorizontalAlignment(SwingConstants.CENTER);
			l4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			l4.setBounds(107, 171, 155, 23);
			f2.add(l4);
			
			t2 = new JTextField();
			t2.setBounds(138, 204, 86, 20);
			f2.add(t2);
			t2.setColumns(10);
			
			b3 = new JButton("Calculate");
			b3.setBounds(135, 245, 89, 23);
			b3.addActionListener(this);
			f2.add(b3);
			
		}
		if(e.getSource()==b1 && r3.isSelected())
		{
			f.setVisible(false);
			f2=new JFrame("SB Account");
			f2.setVisible(true);
			f2.setSize(390,270);
			f2.setLayout(null);
			f2.getContentPane().setBackground(new Color(245,222,179));
			
			JLabel l1 = new JLabel("SB Account");
			l1.setFont(new Font("Tahoma", Font.BOLD, 20));
			l1.setHorizontalAlignment(SwingConstants.CENTER);
			l1.setBounds(110, 0, 147, 30);
			f2.add(l1);
			
			JLabel l2 = new JLabel("Enter the SB Amount");
			l2.setHorizontalAlignment(SwingConstants.CENTER);
			l2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			l2.setBounds(107, 40, 155, 23);
			f2.add(l2);
			
			JLabel l3 = new JLabel("Enter the type of Account NRI(0) or Normal(1)");
			l3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			l3.setHorizontalAlignment(SwingConstants.CENTER);
			l3.setBounds(34, 106, 300, 23);
			f2.add(l3);
			
			t = new JTextField();
			t.setBounds(138, 75, 86, 20);
			f2.add(t);
			t.setColumns(10);
			
			t1 = new JTextField();
			t1.setBounds(138, 140, 86, 20);
			f2.add(t1);
			t1.setColumns(10);
			
			b4 = new JButton("Calculate");
			b4.setBounds(138, 183, 89, 23);
			b4.addActionListener(this);
			f2.add(b4);
			
		}
		if(e.getSource()==b2)
		{
			a=t.getText();
			b=t1.getText();
			c=t2.getText();
			if(a=="" || b=="" || c=="")
			{
				JOptionPane.showMessageDialog(null, "Invalid input");
			}
			else
			{
				FDAccount q=new FDAccount(Double.parseDouble(a),Integer.parseInt(b),Integer.parseInt(c));
				if(q.calculateInterest()==-1)
				{
					JOptionPane.showMessageDialog(null, "Invalid age Enter B/W 0 and 125");
					
					a="";
					b="";
					c="";
				}
				else
				{
					String z="";
					
					f3=new JFrame("Interest");
					f2.setVisible(false);
					f3.setVisible(true);
					f3.setSize(376,180);
					f3.setLayout(null);
					f3.getContentPane().setBackground(new Color(245,222,179));
					
					JLabel l1 = new JLabel("Interest Calculated");
					l1.setFont(new Font("Tahoma", Font.BOLD, 20));
					l1.setHorizontalAlignment(SwingConstants.CENTER);
					l1.setBounds(73, 11, 202, 30);
					f3.add(l1);
					
					z=Double.toString(q.calculateInterest()/100);
					
					JLabel lblNewLabel = new JLabel(z);
					lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 15));
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel.setBounds(107, 52, 129, 30);
					f3.add(lblNewLabel);
					
					b5 = new JButton("Back to Home");
					b5.setBounds(117, 93, 107, 23);
					b5.addActionListener(this);
					f3.add(b5);
					
					a="";
					b="";
					c="";
				}	
			}
		}
		if(e.getSource()==b3)
		{
			a=t.getText();
			b=t1.getText();
			c=t2.getText();
			if(a=="" || b=="" || c=="")
			{
				JOptionPane.showMessageDialog(null, "Invalid input");
			}
			else
			{
				RDAccount q=new RDAccount(Double.parseDouble(a),Integer.parseInt(b),Integer.parseInt(c));
				if(q.calculateInterest()==-1)
				{
					JOptionPane.showMessageDialog(null, "Invalid age Enter B/W 0 and 125");
					
					a="";
					b="";
					c="";
				}
				if(q.calculateInterest()==-2)
				{
					JOptionPane.showMessageDialog(null, "Invalid no of months");
					
					a="";
					b="";
					c="";
				}
				else
				{
					String z="";
					
					f3=new JFrame("Interest");
					f2.setVisible(false);
					f3.setVisible(true);
					f3.setSize(376,180);
					f3.setLayout(null);
					f3.getContentPane().setBackground(new Color(245,222,179));
					
					JLabel l1 = new JLabel("Interest Calculated");
					l1.setFont(new Font("Tahoma", Font.BOLD, 20));
					l1.setHorizontalAlignment(SwingConstants.CENTER);
					l1.setBounds(73, 11, 202, 30);
					f3.add(l1);
					
					z=Double.toString(q.calculateInterest()/100);
					
					JLabel lblNewLabel = new JLabel(z);
					lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 15));
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel.setBounds(107, 52, 129, 30);
					f3.add(lblNewLabel);
					
					b5 = new JButton("Back to Home");
					b5.setBounds(117, 93, 107, 23);
					b5.addActionListener(this);
					f3.add(b5);
					
					a="";
					b="";
					c="";
					
				}	
			}
		}
		if(e.getSource()==b4)
		{
			a=t.getText();
			b=t1.getText();
			if(a=="" || b=="")
			{
				JOptionPane.showMessageDialog(null, "Invalid input");
			}
			else
			{
					SBAccount q=new SBAccount(Double.parseDouble(a),Integer.parseInt(b));
				
					String z="";
					f3=new JFrame("Interest");
					f2.setVisible(false);
					f3.setVisible(true);
					f3.setSize(376,180);
					f3.setLayout(null);
					f3.getContentPane().setBackground(new Color(245,222,179));
					
					JLabel l1 = new JLabel("Interest Calculated");
					l1.setFont(new Font("Tahoma", Font.BOLD, 20));
					l1.setHorizontalAlignment(SwingConstants.CENTER);
					l1.setBounds(73, 11, 202, 30);
					f3.add(l1);
					
					z=Double.toString(q.calculateInterest()/100);
					
					JLabel lblNewLabel = new JLabel(z);
					lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 15));
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel.setBounds(107, 52, 129, 30);
					f3.add(lblNewLabel);
					
					b5 = new JButton("Back to Home");
					b5.setBounds(117, 93, 107, 23);
					b5.addActionListener(this);
					f3.add(b5);
					a="";
					b="";
					
					
			}
		}
		if(e.getSource() == b5)
		{
			f3.setVisible(false);
			f.setVisible(true);
		}
	}
}
