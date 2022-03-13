package gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Start extends JPanel {
	
	private JButton next=new JButton("NEXT");
	
	public Start(JFrame jFrame, int delay,int s) {
		Plot drawPanel = new Plot(jFrame,s);
		setSize(drawPanel.getSize());
		setBackground(drawPanel.c1);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel title[] = {new JLabel(" "),new JLabel("Polygon Area Calculator"),new JLabel("(OOM C3 Project)"),new JLabel(" ")};
		JLabel members[] = {new JLabel("SAPTARISHEE LASKAR - IIT2020110"), new JLabel("ANUJ JAIN - IIT2020146"),new JLabel("PRASHANT SINGH CHAUHAN - IIT2020147"),new JLabel("PRADUMN KUMAR - IIT2020150"),new JLabel(" "),new JLabel(" ")};
		for(int i = 0; i< 2;i++) {title[i].setAlignmentX(CENTER_ALIGNMENT);
		title[i].setAlignmentY(CENTER_ALIGNMENT);
		title[i].setFont(new Font("courier", Font.BOLD, 80));
		title[i].setForeground(drawPanel.c3);
		add(title[i]);}
		
		for(int i = 2; i< 4;i++) {title[i].setAlignmentX(CENTER_ALIGNMENT);
		title[i].setAlignmentY(CENTER_ALIGNMENT);
		title[i].setFont(new Font("courier", Font.BOLD, 40));
		title[i].setForeground(drawPanel.c3);
		add(title[i]);}
		
		for(int i = 0; i< 6;i++) {members[i].setAlignmentX(CENTER_ALIGNMENT);
		members[i].setFont(new Font("courier", Font.BOLD, 30));
		members[i].setAlignmentY(CENTER_ALIGNMENT);
		members[i].setForeground(drawPanel.c2);
		add(members[i]);} 
		
		int delayTime = delay*100000000;
		ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		         jFrame.getContentPane().removeAll();
		         jFrame.setSize(drawPanel.getSize());
		         jFrame.getContentPane().add(drawPanel);
		         jFrame.revalidate();
		         jFrame.repaint();
		      }
		};
		Timer timer = new Timer(delayTime, taskPerformer);
		timer.start();
		timer.setRepeats(false);
		  

	
	    next.setFont(new Font("courier", Font.BOLD, 30));
	    next.setForeground(drawPanel.c3);
	    next.setBackground(drawPanel.c1);
	    next.setSize(200,50);
	    add(next);
	    next.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent evt) {
			jFrame.getContentPane().removeAll();
			jFrame.setSize(drawPanel.getSize());
			jFrame.getContentPane().add(drawPanel);
			jFrame.revalidate();
			jFrame.repaint();
		}
		});
	
	
    }
	
	

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		jFrame.setTitle("Area Calculator");

		Start info = new Start(jFrame, 4,250);
		jFrame.setSize(info.getSize());
		//jFrame.setResizable(false);

		Container cPane = jFrame.getContentPane();
		cPane.add(info);
		jFrame.setVisible(true);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}