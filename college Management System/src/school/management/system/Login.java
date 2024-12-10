
package school.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame  implements ActionListener{
    
     JButton login, cancel;
    JTextField eusername, epassword;
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel username=new JLabel("Username");
        username.setBounds(40,20,100,20);
        add(username);
        username.setFont(new Font("serif",Font.BOLD,16));
        username.setForeground(Color.blue);
        
        eusername=new JTextField();
        eusername.setBounds(150,20,160,30);
        add(eusername);
        
        JLabel password=new JLabel("password");
        password.setBounds(40,70,100,20);
        add(password);
         password.setFont(new Font("serif",Font.BOLD,16));
         password.setForeground(Color.blue);
        
       
        
        epassword=new JPasswordField();
        epassword.setBounds(150,70,160,30);
        add(epassword);
        
        
         login =new JButton("Login");
        login.setBounds(40,140,140,40);
        add(login);
        login.setBackground(Color.decode("#fb641b"));
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("serif",Font.BOLD,18));
        
          cancel =new JButton("Cancel");
        cancel.setBounds(220,140,140,40);
        add(cancel);
        cancel.setBackground(Color.decode("#6CF038"));
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif",Font.BOLD,18));
        
         ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Icons/second.jpg"));
        Image img2=img1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT );
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image=new JLabel(img1);
        add(image);
        image.setBounds(400,0,150,150);
        
        setSize(600,300);
        setLocation(500,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
          if (ae.getSource() == login) {
            String username = eusername.getText();
            String password = epassword.getText();
            
            String query = "select * from login where username='"+username+"' and password='"+password+"'";
            
            try {
                connection c = new connection();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Project();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }
    public static void main(String []args){
    new Login();
    }
    
}
