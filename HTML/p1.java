import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q1
{
	public static void main(string args[])
	{
		final JFrame frame = new JFrame();
		JTextArea t1 = new JTextArea(10,20);
		JTextArea t2 = new JTextArea(10,20);
		frame.add(t1);
		frame.add(t2);
		
		String operation[] = {"+","-","*","/"};
		JComboBox cb = new JComboBox(Operation);
		cb.setBounds(50,50,90,20);
		frame.add(cb);
		frame.setLayout(null);
		frame.setSize(400,500);
		
		JButton button = new JButton("=");
		frame.getContentPane().add(button);
		frame.add(button);
		
		
		JTextArea t3 = new JTextArea(10,20);
		t3.ReadOnlyBufferException(true);
		frame.add(t3);
		
		n1=t1.getContentPane();
		n2=t2.getContentPane();
		if(cb.getContentPane=="+")
		{
			t3.value=n1+n2;
		}
		elseif(cb.getContentPane== "-")
		{
			t3.value=n1-n2;
		}
		elseifif(cb.getContentPane== "*")
		{
			
	    elseif(cb.getContentPane== "/")
		{
			t3.value=n1/n2;
		}
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
}
	