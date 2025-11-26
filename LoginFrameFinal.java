import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel UserLable, PassLable, ResultLable;

    public MarvellousLogin(String Title, int Width, int Height)
    {
        fobj = new JFrame(Title);

        UserLable = new JLabel("User Name");
        UserLable.setBounds(50 , 50 , 100 , 30);

        tobj = new JTextField();
        tobj.setBounds(150 , 50 , 150 , 30);

        PassLable = new JLabel("Password");
        PassLable.setBounds(50 , 100 , 100 , 30);

        pobj = new JPasswordField();
        pobj.setBounds(150 , 100 , 150 , 30);

        bobj = new JButton("SUBMIT");
        bobj.setBounds(150 , 150 , 100 , 30);

        ResultLable = new JLabel("");
        ResultLable.setBounds(150 , 200, 250 , 30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(UserLable);
        fobj.add(PassLable);
        fobj.add(ResultLable);

        bobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(Width,Height);

        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Username : Marvellous
    //Password : Marvellous@123

    public void actionPerformed(ActionEvent aobj)
    {
        String Uname = tobj.getText();
        String pass = pobj.getText();

        if((Uname.equals("Marvellous")) && (pass.equals("Marvellous@123")))
        {
            ResultLable.setText("Login Succesfully...");
        }
        else
        {
            ResultLable.setText("Login Failed...");
        }
    }
}
class LoginFrameFinal
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Login", 400 , 300);
    }
}