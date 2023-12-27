import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class game{
    private static int l;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Digit Shape Making game project");
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.pink);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton b1 = new JButton();
        b1.setBounds(50, 50, 150, 40);
        b1.setBackground(Color.pink);
        b1.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b2 = new JButton();
        b2.setBorder(BorderFactory.createEtchedBorder(0));
        b2.setBounds(50, 50, 40, 180);
        b2.setBackground(Color.pink);
        JButton b3 = new JButton();
        b3.setBounds(160, 50, 40, 180);
        b3.setBackground(Color.pink);
        b3.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b4 = new JButton();
        b4.setBounds(90, 190, 70, 40);
        b4.setBackground(Color.pink);
        b4.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b5 = new JButton();
        b5.setBounds(50, 190, 40, 180);
        b5.setBackground(Color.pink);
        b5.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b6 = new JButton();
        b6.setBounds(160, 190, 40, 180);
        b6.setBackground(Color.pink);
        b6.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b7 = new JButton();
        b7.setBounds(50, 330, 150, 40);
        b7.setBackground(Color.pink);
        b7.setBorder(BorderFactory.createEtchedBorder(0));

        JButton b8 = new JButton();
        b8.setBounds(220, 50, 150, 40);
        b8.setBackground(Color.pink);
        b8.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b9 = new JButton();
        b9.setBounds(220, 50, 40, 180);
        b9.setBackground(Color.pink);
        b9.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b10 = new JButton();
        b10.setBounds(330, 50, 40, 180);
        b10.setBackground(Color.pink);
        b10.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b11 = new JButton();
        b11.setBounds(260, 190, 70, 40);
        b11.setBackground(Color.pink);
        b11.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b12 = new JButton();
        b12.setBounds(220, 190, 40, 180);
        b12.setBackground(Color.pink);
        b12.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b13 = new JButton();
        b13.setBounds(330, 190, 40, 180);
        b13.setBackground(Color.pink);
        b13.setBorder(BorderFactory.createEtchedBorder(0));
        JButton b14 = new JButton();
        b14.setBounds(220, 330, 150, 40);
        b14.setBackground(Color.pink);
        b14.setBorder(BorderFactory.createEtchedBorder(0));

        JTextField scordboard = new JTextField();
        scordboard.setFont(new Font("Din",Font.BOLD,50));
        scordboard.setHorizontalAlignment(JTextField.CENTER);
        scordboard.setBackground(Color.black);
        scordboard.setForeground(Color.magenta);
        scordboard.setBounds(450, 0, 220, 110);

        ActionListener buttonClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JButton button = (JButton) event.getSource();
                Color currentColor = button.getBackground();
                if (currentColor.equals(Color.pink)) {
                    button.setBackground(Color.red);
                } else {
                    button.setBackground(Color.pink);
                }
            }
        };

         JTextField success = new JTextField();
        success.setBounds(0, 530,450, 80);
        success.setBackground(Color.lightGray);
        success.setForeground(Color.black);
       success.setFont(new Font("Din",Font.BOLD,35));

        Random rand = new Random();
        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(490, 480, 150, 40);
         resetButton.setBackground(Color.blue);
        resetButton.setForeground(Color.red);
        resetButton.setBorder(BorderFactory.createEtchedBorder(0));
        resetButton.setFont(new Font("Din",Font.BOLD,30));
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == resetButton) {
                    b1.setBackground(Color.pink);
                    b2.setBackground(Color.pink);
                    b3.setBackground(Color.pink);
                    b4.setBackground(Color.pink);
                    b5.setBackground(Color.pink);
                    b6.setBackground(Color.pink);
                    b7.setBackground(Color.pink);
                    b8.setBackground(Color.pink);
                    b9.setBackground(Color.pink);
                    b10.setBackground(Color.pink);
                    b11.setBackground(Color.pink);
                    b12.setBackground(Color.pink);
                    b13.setBackground(Color.pink);
                    b14.setBackground(Color.pink);
                    int a = rand.nextInt(100);
                    l = a;
                    scordboard.setText("Creat " + a);
                    success.setText("");
                }
            }
        });
      
        JButton starButton = new JButton("START");
        starButton.setBounds(490, 430, 150, 40);
        starButton.setBackground(Color.green);
        starButton.setForeground(Color.red);
        starButton.setBorder(BorderFactory.createEtchedBorder(0));
        starButton.setFont(new Font("Din",Font.BOLD,30));
        starButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == starButton) {
                    b1.setBackground(Color.pink);
                    b2.setBackground(Color.pink);
                    b3.setBackground(Color.pink);
                    b4.setBackground(Color.pink);
                    b5.setBackground(Color.pink);
                    b6.setBackground(Color.pink);
                    b7.setBackground(Color.pink);
                    b8.setBackground(Color.pink);
                    b9.setBackground(Color.pink);
                    b10.setBackground(Color.pink);
                    b11.setBackground(Color.pink);
                    b12.setBackground(Color.pink);
                    b13.setBackground(Color.pink);
                    b14.setBackground(Color.pink);
                    int a = rand.nextInt(100);
                    l = a;
                    scordboard.setText("Creat " + a);
                    success.setText("");
                }
            }
        });



        JButton exiButton = new JButton("EXIT");
        exiButton.setBounds(490, 580, 150, 40);
        exiButton.setBackground(Color.orange);
        exiButton.setForeground(Color.red);
        exiButton.setBorder(BorderFactory.createEtchedBorder(0));
        exiButton.setFont(new Font("Din",Font.BOLD,30));
        exiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent k) {
                if (k.getSource() == exiButton) {
                    System.exit(1);
                }
            }
        });

       
        
        JButton okButton=new JButton("OK");
                okButton.setBounds(50, 440, 150, 40);
                okButton.setBackground(Color.orange);
                okButton.setForeground(Color.red);
                okButton.setBorder(BorderFactory.createEtchedBorder(0));
                okButton.setFont(new Font("Din",Font.BOLD,30));
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent k)
                    {   JButton bb[]= new JButton[]{b1,b2,b3,b4,b5,b6,b7}; 
                        JButton cc[]=new JButton[]{b8,b9,b10,b11,b12,b13,b14};
                       int []br=new int[3];
                        int a,c=0;
                        a=l;
                        if(a==0)
                         {br[0]=0; c=1;}
                        while(a>0)
                        {
                          br[c++]=a%10;
                          a/=10;  
                        }
                        if(c==2)
                        {
                            if(isCorrectDigit(br[1],bb)&&isCorrectDigitto(br[0],cc))
                             {success.setText(l+" is created sucessfully !!");}
                             else
                             { success.setText("Wrong!! Try again");}
                        }   
                        else if(c==1)
                        {
                            if(isCorrectDigitto(br[0],cc))
                             {success.setText(l+ " is created sucessfully!!");}
                             else
                             {success.setText("Wrong!! Try again ");}
                        }
                        c=0;
                    }
                });

        b1.addActionListener(buttonClickListener);
        b2.addActionListener(buttonClickListener);
        b3.addActionListener(buttonClickListener);
        b4.addActionListener(buttonClickListener);
        b5.addActionListener(buttonClickListener);
        b6.addActionListener(buttonClickListener);
        b7.addActionListener(buttonClickListener);
        b8.addActionListener(buttonClickListener);
        b9.addActionListener(buttonClickListener);
        b10.addActionListener(buttonClickListener);
        b11.addActionListener(buttonClickListener);
        b12.addActionListener(buttonClickListener);
        b13.addActionListener(buttonClickListener);
        b14.addActionListener(buttonClickListener);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.add(b13);
        frame.add(b14);
        frame.add(resetButton);
        frame.add(exiButton);
        frame.add(scordboard);
        frame.add(success);
        frame.add(okButton);
        frame.add(starButton);
        frame.setVisible(true);
    }

    private static boolean isButtonRed(JButton button) {
        return button.getBackground().equals(Color.red);
    }

    private static boolean isCorrectDigit(int a,JButton...c)
    {              boolean [] ar=new boolean[8];
                        ar[1]=isButtonRed(c[0]);
                        ar[2]=isButtonRed(c[1]);
                        ar[3]=isButtonRed(c[2]);
                        ar[4]=isButtonRed(c[3]);
                        ar[5]=isButtonRed(c[4]);
                        ar[6]=isButtonRed(c[5]);
                        ar[7]=isButtonRed(c[6]);
                    boolean b=false;    

                        switch(a)
                        {
                            case 0 :if(ar[1]&&ar[2]&&ar[3]&&!ar[4]&&ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 1 :if(!ar[1]&&!ar[2]&&ar[3]&&!ar[4]&&!ar[5]&&ar[6]&&!ar[7])
                                    {b=true;}
                                    break;
                            case 2 :if(ar[1]&&!ar[2]&&ar[3]&&ar[4]&&ar[5]&&!ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 3 :if(ar[1]&&!ar[2]&&ar[3]&&ar[4]&&!ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 4 :if(!ar[1]&&ar[2]&&ar[3]&&ar[4]&&!ar[5]&&ar[6]&&!ar[7])
                                    {b=true;}
                                    break;
                            case 5 :if(ar[1]&&ar[2]&&!ar[3]&&ar[4]&&!ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 6 :if(ar[1]&&ar[2]&&!ar[3]&&ar[4]&&ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 7 :if(ar[1]&&!ar[2]&&ar[3]&&!ar[4]&&!ar[5]&&ar[6]&&!ar[7])
                                    {b=true;}
                                    break;
                            case 8 :if(ar[1]&&ar[2]&&ar[3]&&ar[4]&&ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 9 :if(ar[1]&&ar[2]&&ar[3]&&ar[4]&&!ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                        }
                        return b;
                       
    }


     private static boolean isCorrectDigitto(int a,JButton...c)
    {              boolean [] ar=new boolean[8];
                        ar[1]=isButtonRed(c[0]);
                        ar[2]=isButtonRed(c[1]);
                        ar[3]=isButtonRed(c[2]);
                        ar[4]=isButtonRed(c[3]);
                        ar[5]=isButtonRed(c[4]);
                        ar[6]=isButtonRed(c[5]);
                        ar[7]=isButtonRed(c[6]);
                    boolean b=false;    

                        switch(a)
                        {
                            case 0 :if(ar[1]&&ar[2]&&ar[3]&&!ar[4]&&ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 1 :if(!ar[1]&&!ar[2]&&ar[3]&&!ar[4]&&!ar[5]&&ar[6]&&!ar[7])
                                    {b=true;}
                                    break;
                            case 2 :if(ar[1]&&!ar[2]&&ar[3]&&ar[4]&&ar[5]&&!ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 3 :if(ar[1]&&!ar[2]&&ar[3]&&ar[4]&&!ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 4 :if(!ar[1]&&ar[2]&&ar[3]&&ar[4]&&!ar[5]&&ar[6]&&!ar[7])
                                    {b=true;}
                                    break;
                            case 5 :if(ar[1]&&ar[2]&&!ar[3]&&ar[4]&&!ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 6 :if(ar[1]&&ar[2]&&!ar[3]&&ar[4]&&ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 7 :if(ar[1]&&!ar[2]&&ar[3]&&!ar[4]&&!ar[5]&&ar[6]&&!ar[7])
                                    {b=true;}
                                    break;
                            case 8 :if(ar[1]&&ar[2]&&ar[3]&&ar[4]&&ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                            case 9 :if(ar[1]&&ar[2]&&ar[3]&&ar[4]&&!ar[5]&&ar[6]&&ar[7])
                                    {b=true;}
                                    break;
                        }

                    return b;
                       
    }

    
        
}
