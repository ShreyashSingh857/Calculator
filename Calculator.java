import java.awt.*;
import java.awt.event.*;
class Calculator
{
    public double n1,n2,result;
    String num1,num2;
    public TextField t1 = null;
    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    public String sign;
    public Calculator()
    {
        
        Frame f = new Frame("CALCULATOR");
        f.setBackground(Color.LIGHT_GRAY);
        Font font = new Font("Arial",Font.BOLD,24);
        f.setFont(font);
        Font f1 = new Font("Algerian",Font.BOLD,50);
        f.setSize(600,780);
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);
        f.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e)
        {
            f.dispose();
        }
        });
        
        t1 = new TextField("");
        t1.setBounds(20,50,560,150);
        t1.setFont(f1);
        b1 = new Button("7");
        b1.setBounds(20,220,132,100);
        Color c1 = new Color(37,150,190);

        b1.setBackground(c1);
        b2 = new Button("8");
        b2.setBounds(162,220,132,100);
        b2.setBackground(c1);
        b3 =new Button("9");
        b3.setBounds(304,220,132,100);
        b3.setBackground(c1);
        b4 = new Button("*");
        b4.setBounds(446,220,132,100);
        b4.setBackground(c1);
        b5 = new Button("4");
        b5.setBounds(20,330,132,100);
        b5.setBackground(c1);
        b6 = new Button("5");
        b6.setBounds(162,330,132,100);
        b6.setBackground(c1);
        b7 = new Button("6");
        b7.setBounds(304,330,132,100);
        b7.setBackground(c1);
        b8 = new Button("/");
        b8.setBounds(446,330,132,100);
        b8.setBackground(c1);
        b9 = new Button("1");
        b9.setBounds(20,440,132,100);
        b9.setBackground(c1);
        b10 = new Button("2");
        b10.setBounds(162,440,132,100);
        b10.setBackground(c1);
        b11 = new Button("3");
        b11.setBounds(304,440,132,100);
        b11.setBackground(c1);
        b12 = new Button("-");
        b12.setBounds(446,440,132,100);
        b12.setBackground(c1);
        b13 = new Button(".");
        b13.setBounds(20,550,132,100);
        b13.setBackground(c1);
        b14 = new Button("0");
        b14.setBounds(162,550,132,100);
        b14.setBackground(c1);
        b15 = new Button("=");
        b15.setBounds(304,550,132,100);
        b15.setBackground(c1);
        b16 = new Button("+");
        b16.setBounds(446,550,132,100);
        b16.setBackground(c1);
        b17 = new Button("C");
        b17.setBounds(231,660,132,100);
        b17.setBackground(c1);
        b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"7");
        }
        });
        b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"8");
        }
        });
        b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"9");
        }
        });
        b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"4");
        }
        });
        b6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"5");
        }
        });
        b7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"6");
        }
        });
        b9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"1");
        }
        });
        b10.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"2");
        }
        });
        b11.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"3");
        }
        });
        b13.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+".");
        }
        });
        b14.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(t1.getText()+"0");
        }
        });
        b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          num1 = t1.getText();
          n1 = Double.parseDouble(num1);
          t1.setText(""); 
          sign = "*";
        }
        });
        b8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          num1 = t1.getText();
          n1 = Double.parseDouble(num1);
          t1.setText(""); 
          sign = "/";
        }
        });
        b12.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          num1 = t1.getText();
          n1 = Double.parseDouble(num1);
          t1.setText(""); 
          sign = "-";
        }
        });
        b16.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          num1 = t1.getText();
          n1 = Double.parseDouble(num1);
          t1.setText(""); 
          sign = "+";
        }
        });
        b15.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          num2 = t1.getText();
          n2 = Double.parseDouble(num2);
          t1.setText(""); 
          switch(sign)
          {
            case "+":
              result = n1 + n2;
              break;
            case "-":
              result = n1 - n2;
              break;
            case "*":
              result = n1*n2;
              break;
            case "/":
              if(n2==0)
              {
                t1.setText("Cannot Divide by zero");
              } 
              result = n1/n2;
              break;
            default:
              t1.setText("ERROR");
          }
          t1.setText(String.valueOf(result));
        }
        });
        b17.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          t1.setText(""); 
        }
        });
        
       f.add(b1);
       f.add(b2);
       f.add(t1);
       f.add(b3);
       f.add(b4);
       f.add(b5);
       f.add(b6);
       f.add(b7);
       f.add(b8);
       f.add(b9);
       f.add(b10);
       f.add(b11);
       f.add(b12);
       f.add(b13);
       f.add(b14);
       f.add(b15);
       f.add(b16);
       f.add(b17);
    }
    public static void main(String[] args)
    {
       new Calculator();
    }
}