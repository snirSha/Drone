package Auto_pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Visualizator {
	
	final static ArrayList<Integer> ButtonHeights = new ArrayList<Integer>(Arrays.asList(0 , 30 , 60 , 90 , 120 , 150 , 180 , 210));
	final static ArrayList<Integer> ButtonWeights = new ArrayList<Integer>(Arrays.asList(1400 , 1512 , 1624));

	// This class only generate the visualization settings 
	
	public static void initialize(Simulator main) {
		Timer.reset();
		main.frame = new JFrame();
		main.frame.setSize(1800,700);
		main.frame.setTitle("Drone Simulator");
		main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.frame.getContentPane().setLayout(null);
		
		// Func buttons 
		
		JButton stopBtn = new JButton("Pause");
		stopBtn.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {					 
				  Timer.pause();
				  CPU.stopAllCPUS();
				  Simulator.toogleStop = !Simulator.toogleStop;
			  }
		});
		stopBtn.setBounds(ButtonWeights.get(0), ButtonHeights.get(0), 110, 30);
		main.frame.getContentPane().add(stopBtn);

		JButton resumeBtn = new JButton("Resume");
		resumeBtn.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Timer.resume();
				  CPU.resumeAllCPUS();
				  Simulator.toogleStop = !Simulator.toogleStop;
			  }
		});
		resumeBtn.setBounds(ButtonWeights.get(0), ButtonHeights.get(1), 110, 30);
		main.frame.getContentPane().add(resumeBtn);
		
		JButton toogleMapBtn = new JButton("Toogle Map");
		toogleMapBtn.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Simulator.toogleRealMap = !Simulator.toogleRealMap;
			  }
		});
		toogleMapBtn.setBounds(ButtonWeights.get(0), ButtonHeights.get(2), 110, 30);
		main.frame.getContentPane().add(toogleMapBtn);
		
		JButton toogleAIBtn = new JButton("Toogle AI");
		toogleAIBtn.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Timer.start();
				  Simulator.toogleAI = !Simulator.toogleAI;
			  }
		});
		toogleAIBtn.setBounds(1512, 300, 150, 50);
		main.frame.getContentPane().add(toogleAIBtn);

		JButton returnBtn = new JButton("Return Home");
		returnBtn.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Simulator.return_home = !Simulator.return_home;
				  Utils.speedDown(Simulator.algo);
				  Utils.spinBy(180, true,  Simulator.algo,new Func() {
						@Override
						public void method() {
							Utils.speedUp(Simulator.algo);
						}
					});
			  }
		});
		returnBtn.setBounds(ButtonWeights.get(0), ButtonHeights.get(3), 110, 30);
		main.frame.getContentPane().add(returnBtn);
		
		// Speed buttons
		JButton speedBtn1 = new JButton("speedUp");
		speedBtn1.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.speedUp(Simulator.algo);
			  }
		});
		speedBtn1.setBounds(ButtonWeights.get(1), ButtonHeights.get(0), 110, 30);
		main.frame.getContentPane().add(speedBtn1);
		
		JButton speedBtn2 = new JButton("speedDown");
		speedBtn2.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.speedDown(Simulator.algo);
			  }
		});
		speedBtn2.setBounds(ButtonWeights.get(1), ButtonHeights.get(1), 110, 30);
		main.frame.getContentPane().add(speedBtn2);
		
		// Spin buttons
		JButton spinBtn1 = new JButton("spin180");
		spinBtn1.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.spinBy(180 , Simulator.algo);
			  }
		});
		spinBtn1.setBounds(ButtonWeights.get(2), ButtonHeights.get(0), 110, 30);
		main.frame.getContentPane().add(spinBtn1);
		
		JButton spinBtn2 = new JButton("spin90");
		spinBtn2.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.spinBy(90 , Simulator.algo);
			  }
		});
		spinBtn2.setBounds(ButtonWeights.get(2), ButtonHeights.get(1), 110, 30);
		main.frame.getContentPane().add(spinBtn2);
		
		JButton spinBtn3 = new JButton("spin60");
		spinBtn3.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.spinBy(60 , Simulator.algo);
			  }
		});
		spinBtn3.setBounds(ButtonWeights.get(2), ButtonHeights.get(2), 110, 30);
		main.frame.getContentPane().add(spinBtn3);
		
		JButton spinBtn4 = new JButton("spin45");
		spinBtn4.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.spinBy(60 , Simulator.algo);
			  }
		});
		spinBtn4.setBounds(ButtonWeights.get(2), ButtonHeights.get(3), 110, 30);
		main.frame.getContentPane().add(spinBtn4);
		
		JButton spinBtn5 = new JButton("spin30");
		spinBtn5.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.spinBy(30 , Simulator.algo);
			  }
		});
		spinBtn5.setBounds(ButtonWeights.get(2), ButtonHeights.get(4), 110, 30);
		main.frame.getContentPane().add(spinBtn5);
		
		JButton spinBtn6 = new JButton("spin-30");
		spinBtn6.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.spinBy(-30 , Simulator.algo);
			  }
		});
		spinBtn6.setBounds(ButtonWeights.get(2), ButtonHeights.get(5), 110, 30);
		main.frame.getContentPane().add(spinBtn6);
		
		JButton spinBtn7 = new JButton("spin-45");
		spinBtn7.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.spinBy(-45 , Simulator.algo);
			  }
		});
		spinBtn7.setBounds(ButtonWeights.get(2), ButtonHeights.get(6), 110, 30);
		main.frame.getContentPane().add(spinBtn7);
		
		JButton spinBtn8 = new JButton("spin-60");
		spinBtn8.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  Utils.spinBy(-60 , Simulator.algo);
			  }
		});
		spinBtn8.setBounds(ButtonWeights.get(2), ButtonHeights.get(7), 110, 30);
		main.frame.getContentPane().add(spinBtn8);
		
		Simulator.info_label_drone = new JLabel();
		Simulator.info_label_drone.setBounds(1450, 500, 300, 200);
		main.frame.getContentPane().add(Simulator.info_label_drone);
	
		Simulator.info_label_config = new JLabel();
		Simulator.info_label_config.setBounds(1450, 400, 300, 200);
		main.frame.getContentPane().add(Simulator.info_label_config);
	}
}