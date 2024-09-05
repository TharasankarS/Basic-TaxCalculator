import javax.swing.*;
import java.awt.event.*;
class ITC extends JFrame implements ActionListener
{
 JButton ad,sb,mu;
 JTextField num1,num2,res1,res2;
 JLabel heading1,heading2,t1,t2,t3,t4;
 ITC()
 {
  super("INCOME TAX CALCULATOR");
  ad = new JButton("Old Slab");
  sb = new JButton("New Slab");
  heading1 = new JLabel("Old Slab/New Slab Calulator");
  t1 = new JLabel("Enter Amount after Deduction(Old)/ ");
  t4 = new JLabel("Total Income(New) : ");
  t2 = new JLabel("Tax to be paid : ");
  t3 = new JLabel("Balance after tax : ");
  num1 = new JTextField(10);
  res1 = new JTextField(10);
  res2 = new JTextField(10);
  add(heading1);
  add(ad);
  add(sb);
  add(t1);
  add(t4);
  add(t2);
  add(t3);
  add(num1);
  add(res2);
  add(res1);
  setLayout(null);
  heading1.setBounds(10,10,300,20);
  t1.setBounds(10,40,300,20);
  t4.setBounds(10,60,300,20);
  t2.setBounds(10,90,300,20);
  t3.setBounds(10,120,300,20);
  ad.setBounds(350,30,200,50);
  sb.setBounds(350,90,200,50);
  num1.setBounds(200,60,100,20);
  res1.setBounds(200,90,100,20);
  res2.setBounds(200,120,100,20);
  setSize(600,210);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  ad.addActionListener(this);
  sb.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  Object Source = ae.getSource();
  long n1,n,result1;
  n1=Long.parseLong(num1.getText());
  if(Source==sb)
  {
   if(n1>1500000)
   {
     n=n1;
     n1=n1-1500000;
     result1=(n1*30)/100;
     result1=result1+12500+25000+37500+50000+62500;
   }
   else if(n1>1250000)
   {
     n=n1;
     n1=n1-1250000;
     result1=(n1*25)/100;
     result1=result1+12500+25000+37500+50000;
   }
   else if(n1>1000000)
   {
     n=n1;
     n1=n1-1000000;
     result1=(n1*20)/100;
     result1=result1+12500+25000+37500;
   }
   else if(n1>750000)
   {
     n=n1;
     n1=n1-750000;
     result1=(n1*15)/100;
     result1=result1+12500+25000;
   }
   else if(n1>500000)
   {
     n=n1;
     n1=n1-500000;
     result1=(n1*10)/100;
     result1=result1+12500;
   }
   else if(n1>250000)
   {
     n=n1;
     n1=n1-250000;
     result1=(n1*5)/100;
   }
   else 
   {
     n=n1;
     result1=0;
   }
   res1.setText(Long.toString(result1));
   n=n-result1;
   res2.setText(Long.toString(n));
  }
  else if(Source==ad)
  {
    if(n1>1000000)
    {
      n=n1;
      n1=n1-1000000;
      result1=(n1*30)/100;
      result1=result1+12500+100000;
    }
    else if(n1>500000)
    {
      n=n1;
      n1=n1-500000;
      result1=(n1*20)/100;
      result1=result1+12500;
    }
    else if(n1>250000)
    {
      n=n1;
      n1=n1-250000;
      result1=(n1*5)/100;
    }
    else 
    {
      n=n1;
      result1=0;
    }
    res1.setText(Long.toString(result1));
    n=n-result1;
    res2.setText(Long.toString(n));
   }
 }
 public static void main(String args[])
 {
  ITC C1 = new ITC();
 }
}