import java.awt.color.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code ="Preorder" width=500 height=500>
</applet>
*/
public class Preorder extends Applet implements Runnable{

	Thread t;
	int c;
	String s,msg,s1,s2,s3,s4,s5,s6,s7,msg1,msg2;
	Font f;
	public void init()
	{
		s=new String();
		msg=new String();
		msg="PREORDER-TRAVERSAL(BST)";
		msg1="NODE LEFT RIGHT";
		msg2="First print the node then go to left of node and then to right";
		s="a";
		c=1;
		f=new Font("Arial",Font.BOLD,40);
		t=new Thread(this);
		setBackground(Color.cyan);
		
	}
