package test;
import java.applet.Applet;


import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Image;
import java.awt.List;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantLock;
 
import javax.print.attribute.AttributeSetUtilities;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
//import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
//import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.text.html.ImageView;
 
 
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.id3.AbstractID3v2Frame;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.framebody.FrameBodyAPIC;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3AudioHeader;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.AbstractID3v2Frame;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.framebody.FrameBodyAPIC;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.sun.*;
//import javazoom.jl.player.Player;
public class zhuye extends JFrame implements ActionListener{
 
	/**
	 * @param args
	 */
 
	JButton Btn1 = new JButton("????????????");
	//JButton Btn2 = new JButton("????????????");
	JButton next = new JButton("?????????");
	JButton last = new JButton("?????????");
	JButton sequenceplay = new JButton("????????????");
	JButton Randomplay = new JButton("????????????");
	JButton singleplay = new JButton("????????????");
	JButton local = new JButton("??????");
	JLabel locallabel =new JLabel("????????????");
	JButton like = new JButton("??????");
	JButton outside = new JButton("??????");
	//JButton model = new JButton("??????");
	JButton comeback = new JButton("??????");
	JButton poster = new JButton("??????");
	JTextField fieldAccount;//???????????????????????????
	JButton  jbfieldAccount;//??????????????????
	JLabel imagelabel =new JLabel();
	JLabel imagelabel1 =new JLabel();
	JLabel imagelabel2 =new JLabel();
	JLabel imagelabel3 =new JLabel();
	JTextArea time=new  JTextArea();//???????????????
	JTextArea time1=new  JTextArea();//????????????????????????
	JTextArea name=new  JTextArea();//????????????
	JTextArea name2=new  JTextArea();//????????????
	JLabel playtime;//???????????????
	JLabel playtime1;//???????????????
	Timer nTimer,nTimer2;//???????????????
	AudioClip sound1 = null, sound2 = null, sound3 = null;
	JFrame jf=new JFrame();
	JComboBox jcb;
	JMenuBar jb;//??????
	JMenuItem jm0,jm1,jm2;
	JMenuItem nightmode;
	private int number=0,number1=0,number2=0,single=0;
	private String check="??????";
	private int tnumber=0,tnumber1=0,tnumber2=0,tsingle=0;
	int n = 0;
	String PATH;
	private static	 String[] data = {"src\\Music\\Mu'z - ????????????.mp3","src\\Music\\?????? _ ?????? - ???????????????.mp3 ","src\\Music\\????????? - ??????????????? (Live).mp3", "src\\Music\\??????????????????.wav", "src\\Music\\Groove Coverage - God Is A Girl (Album Version).mp3", "src\\Music\\???????????? - ????????????.mp3", "src\\Music\\?????? _ ?????? - ??????.mp3", "src\\Music\\?????? - ?????????????????????.mp3", "src\\Music\\?????? _ ????????? - ??????.mp3"};
	private static	 String[] data2={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""}; //?????????????????????????????????30
	
	JScrollPane listScroller,listScroller2;
	 DefaultListModel listModel,listModel2;
	 JList list,list2,list3;
	
	 private static MP3File mp3File;
	 private static final int START=6;
	private static final String SHUTDOWN = null;
	private static final String String = null;
	
	 String filepath;// ??????????????????
 
	    String filename;// ??????????????????
	String T,T1;
	int Time=0,second=0,Time2;
	int panduanliebiao=0;
	 boolean isStop = true;// ??????????????????
 
	    boolean hasStop = true;// ??????????????????
	    AudioInputStream audioInputStream;// ?????????
 
	    AudioFormat audioFormat;// ????????????
 
	    SourceDataLine sourceDataLine;// ????????????
		private ReentrantLock mainLock;
		
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
    zhuye z=new zhuye();
	}
	
	
	
		public zhuye(){
		// ????????????
		
		//jf.setTitle("???????????????");
		
	//  jf.setBounds(100, 100, 1300, 1000);
		jf.setBounds(500, 150, 500, 800);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		jf.setUndecorated(true);
		
		
		
		fieldAccount=new JTextField();
	//	fieldAccount.setBounds(10,10,80,20);
		fieldAccount.setBackground(new Color(30, 144, 255));
		//fieldAccount.setOpaque(false);
		//fieldAccount.setBorder(null);
		fieldAccount.setText("0");
		//fieldAccount.setFont(new Font("????????????",Font.PLAIN,18));
		fieldAccount.setForeground(Color.white);
		jf.add(fieldAccount);
		
		
		jbfieldAccount=new JButton("??????");
	//	jbfieldAccount.setBounds(110,10,50,20);
		jbfieldAccount.setBackground(new Color(30, 144, 255));
		jbfieldAccount.setOpaque(false);
		jbfieldAccount.setBorder(null);
		
		jbfieldAccount.setFont(new Font("????????????",Font.PLAIN,18));
		jbfieldAccount.setForeground(Color.white);
		jbfieldAccount.addActionListener((ActionListener) this);
		jf.add(jbfieldAccount);
		
		 jb=new JMenuBar();
		//jb.setPreferredSize(new Dimension(680, 30));
		//jb.setPreferredSize(new Dimension(380, 30));
		//jb.setBounds(100,20,450,30);
		//jb.setBackground(Color.decode("#65991a"));
		//jb.setBackground(Color.decode("#02223"));
		//jb.setBackground(Color.decode("#559a95"));
		jb.setBackground(new Color(82, 153,145));
		//jb.setOpaque(false);
	//	jb.setBorder(null);
		jf.setJMenuBar(jb);
	//	jp1.add(jb);
		//????????????????????????
		JMenu jmenu=new JMenu("??????");
		jmenu.setForeground(Color.white);
		jmenu.setPreferredSize(new Dimension(200, 30));
		jb.add(jmenu);
		//?????????????????????
		//????????????????????????
//		JMenu jmenu1=new JMenu("??????");
//		
//		jmenu1.setForeground(Color.white);
//	//	jmenu1.setPreferredSize(new Dimension(100, 30));
//		jb.add(jmenu1);
 
		String[] dd={"5??????","10??????","15??????","?????????"};
		list3=new JList(dd); 
		
		//????????????????????????????????????
		list3.setVisibleRowCount(2);//???????????????setVisibleRowCount(?)????????????????
	   jf.add(list3);
		 jm0=new JMenuItem("????????????");
		jm1=new JMenuItem("??????????????????");
	    nightmode=new JMenuItem("????????????");
	    jm2=new JMenuItem("??????");
		jmenu.add(jm0);
		jmenu.add(jm1);
		jmenu.add(nightmode);
		jmenu.add(jm2);
		jm0.addActionListener((ActionListener) this);
		jm1.addActionListener((ActionListener) this);
		jm2.addActionListener((ActionListener) this);
		nightmode.addActionListener((ActionListener) this);
 
		time.setBounds(440,670,50,20);
		time.setBackground(new Color(30, 144, 255));
		time.setOpaque(false);
		time.setBorder(null);
		time.setText("0:00");
		 time.setFont(new Font("????????????",Font.PLAIN,18));
		time.setForeground(Color.white);
		
		time.setEditable(false);
		jf.add(time);
		
		time1.setBounds(390,670,50,20);
		time1.setBackground(new Color(30, 144, 255));
		time1.setOpaque(false);
		time1.setBorder(null);
		time1.setText("0:00/");
		 time1.setFont(new Font("????????????",Font.PLAIN,18));
		time1.setForeground(Color.white);
		
		time1.setEditable(false);
		jf.add(time1);
		
		name.setBounds(80,735,120,30);
		name.setBackground(new Color(30, 144, 255));
		name.setOpaque(false);
		name.setBorder(null);
		//name.setText("0:00/nnnnnnn?????????");
		name.setFont(new Font("????????????",Font.PLAIN,18));
		name.setForeground(Color.white);
		name.setEditable(false);
		jf.add(name);
		
		name2.setBounds(220,735,80,30);
		name2.setBackground(new Color(30, 144, 255));
		name2.setOpaque(false);
		name2.setBorder(null);
		//name2.setText("0:00/?????????");
		name2.setFont(new Font("????????????",Font.PLAIN,18));
		name2.setForeground(Color.white);
		name2.setEditable(false);
		jf.add(name2);
		
		playtime=new JLabel();
		//playtime.setBounds(20,680,350,5);
		playtime.setBounds(20,680,0,0);
		playtime.setOpaque(true);
		playtime.setBackground(Color.white);
		jf.add(playtime);
		
		
		
		playtime1=new JLabel();
	//	playtime1.setBounds(20,680,350,3);
		playtime.setBounds(20,680,0,0);
		playtime1.setOpaque(true);
		playtime1.setBackground(Color.blue);
		jf.add(playtime1);
		
		
		
		poster.setBounds(10, 690, 65, 50);
		//poster.add(Btn1);
		poster.setBackground(new Color(30, 144, 255));
		poster.setOpaque(false);
		poster.setBorder(null);	
		poster.setForeground(Color.white);
		jf.add(poster);		
		
	
		Btn1.setBounds(200, 692, 65, 50);
		jf.add(Btn1);
		Btn1.setBackground(new Color(30, 144, 255));
		Btn1.setOpaque(false);
		Btn1.setBorder(null);	
		Btn1.setForeground(Color.white);
		
		// ??????????????????
		//Btn2.setBounds(100, 675, 65, 80);
		
//		 Btn2.setBackground(new Color(30, 144, 255));
//		Btn2.setOpaque(false);
//		 Btn2.setBorder(null);	
//		 Btn2.setForeground(Color.white);
//		jf.add(Btn2);
		
		
		next.setBounds(330,690,65,50);
		next.setBackground(new Color(30, 144, 255));
		next.setOpaque(false);
		next.setBorder(null);	
		next.setForeground(Color.white);
		jf.add(next);
		
		last.setBounds(75,690,65,50);
		last.setBackground(new Color(30, 144, 255));
		last.setOpaque(false);
		last.setBorder(null);	
		last.setForeground(Color.white);
		jf.add(last);
		
		sequenceplay.setBounds(430,690,65,50);
		sequenceplay.setBackground(new Color(30, 144, 255));
		sequenceplay.setOpaque(false);
		sequenceplay.setBorder(null);	
		sequenceplay.setForeground(Color.white);
		jf.add(sequenceplay);
		
		Randomplay.setBounds(0,0,0,0);
		Randomplay.setBackground(new Color(30, 144, 255));
		Randomplay.setOpaque(false);
		Randomplay.setBorder(null);	
		Randomplay.setForeground(Color.white);
		jf.add(Randomplay);
		
		singleplay.setBounds(0,0,0,0);
		singleplay.setBackground(new Color(30, 144, 255));
		singleplay.setOpaque(false);
		singleplay.setBorder(null);	
		singleplay.setForeground(Color.white);
		jf.add(singleplay);
		
		
		local.setBounds(95,300,65,80);
		local.setBackground(new Color(30, 144, 255));
		local.setOpaque(false);
		local.setBorder(null);	
		local.setForeground(Color.white);
		jf.add(local);
		
	
		like.setBounds(215,300,65,80);
		like.setBackground(new Color(30, 144, 255));
		like.setOpaque(false);
		like.setBorder(null);	
		like.setForeground(Color.white);
		jf.add(like);
		
		
		outside.setBounds(330,300,65,80);
		outside.setBackground(new Color(30, 144, 255));
		outside.setOpaque(false);
		outside.setBorder(null);	
		outside.setForeground(Color.white);
		jf.add(outside);
		
		//model.setBounds(10,20,65,80);
		//model.setBackground(new Color(30, 144, 255));
		//model.setOpaque(false);
		//model.setBorder(null);	
		//model.setForeground(Color.white);
		//jf.add(model);
		
		locallabel.setBounds(0,0,0,0);
		locallabel.setForeground(Color.blue);
		jf.add(locallabel);
		
		comeback.setBounds(0,0,0,0);
		comeback.setBackground(new Color(30, 144, 255));
		comeback.setOpaque(false);
		comeback.setBorder(null);	
		comeback.setForeground(Color.white);
		jf.add(comeback);
		
		Btn1.addActionListener((ActionListener) this);
	//	Btn2.addActionListener((ActionListener) this);
		next.addActionListener((ActionListener) this);
		last.addActionListener((ActionListener) this);
		Randomplay.addActionListener((ActionListener) this);
		local.addActionListener((ActionListener) this);
		like.addActionListener((ActionListener) this);
		outside.addActionListener((ActionListener) this);
	//	model.addActionListener((ActionListener) this);
		comeback.addActionListener((ActionListener) this);
		Randomplay.addActionListener((ActionListener) this);
		singleplay.addActionListener((ActionListener) this);
		sequenceplay.addActionListener((ActionListener) this);
		poster.addActionListener((ActionListener) this);
		// ?????????????????????
	
		// ??????????????????
		ImageIcon image=new ImageIcon("src/Picture/001.jpg");
		ImageIcon image2=new ImageIcon("src/picture/????????????.jpg");
		ImageIcon image3=new ImageIcon("src/picture/????????????2.png");
	    imagelabel = new JLabel(image);
	    imagelabel2 = new JLabel(image2);
	    imagelabel3 = new JLabel(image3);
	   imagelabel2.setBounds(0,0,500,800);
	 
	    jf.add(imagelabel );
	  
	    
	 //   jf.add(imagelabel1 );
	  //  jf.add(imagelabel1 );
	    
	     listModel = new DefaultListModel();
	     listModel2 = new DefaultListModel();
		  for(int i=0;i<data.length;i++){
		   listModel.add(i, data[i]);
		  }
//		  for(int i=0;i<data2.length;i++){
//			   listModel2.add(i, data2[i]);
//			  }
		list = new JList(listModel);
		list2 = new JList(listModel2);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// ??????????????????????????????????????????????????????????????????
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//list.setCellRenderer(new MyCellRenderer(icons));//???????????????CellRenderer?????????????????????
		listScroller = new JScrollPane(list);
		listScroller2 = new JScrollPane(list2);
	
	//	listScroller.setBounds(0,0,0,0);//?????????????????????list
		//list.setBounds(20,300,450,350);
		listScroller.setBackground(new Color(30, 144, 255));
		listScroller.setOpaque(false);
		listScroller.setBorder(null);	
		
		
		listScroller2.setBackground(new Color(30, 144, 255));
		listScroller2.setOpaque(false);
		listScroller2.setBorder(null);	
	//	listScroller.setBounds(50,50,900,580);
		//this.add(listScroller,BorderLayout.CENTER);//?????????????????????list
		//this.add(list);
		jf.add(listScroller);
		jf.add(listScroller2);
		 jf.add(imagelabel2 );
		  jf.add(imagelabel3);
		  // ????????????????????????
		  
			
		  
		 addWindowListener(new WindowAdapter() {
 
	            public void windowClosing(WindowEvent e) {
 
	                System.exit(0);
 
	            }
 
	        });
		
		 jf.setVisible(true);
		/*
		 * ????????????????????????????????????????????????
		 */
 
		list.addMouseListener(new MouseAdapter(){  
			public void mousePressed(MouseEvent e){
				String path=(String)list.getSelectedValue();//???????????????????????????
				System.out.println(path);
				timerstop();
//				Btn1.setVisible(false);
//				Btn2.setBounds(200, 675, 65, 80);
//				Btn2.setVisible(true);
//				play2();
				Btn1.setText("????????????");
				timerstop();
				panduanliebiao=1;
			   photo(path);
		       play(path);
		       time(path);
		    
		       int s=list.getSelectedIndex();
		       System.out.println(s);
		       single=s;
		       check="??????";
		    
			}
		});
		
		/*
		 * ?????????????????????????????????????????????
		 */
		list2.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				String name=(String)list2.getSelectedValue();//???????????????????????????
				System.out.println(name);
				timerstop();
				Btn1.setText("????????????");
			
				String f=filepath+name; 
				
		       play(f);
		       time(f);
		       photo(f);
		       int s=list2.getSelectedIndex();
		       
		       System.out.println(f);
		        
		     tsingle=s;//?????????????????????????????????
		     check="??????";
		     if(check.equals("??????")){
		    	 System.out.println("??????");
		    	 for(int i=0;i<=30;i++){
		    	 System.out.println("data"+i+"???"+data2[i]);
		    	
		     }
		     }
		    
			}
		});
		
		/*
		 * ??????????????????
		 */
		list3.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				String name=(String)list3.getSelectedValue();//???????????????????????????
				System.out.println(name);
				list3.setBounds(0,0,0,0);
				if(name.equals("15??????")){
					System.out.println(name+"?????????");
					int minute=15*60;
					closemusic(minute);
				}
				if(name.equals("10??????")){
					System.out.println(name+"?????????");
					int minute=10*60;
					closemusic(minute);
				}
				if(name.equals("5??????")){
					System.out.println(name+"?????????");
					int minute=5*60;
					closemusic(minute);
				}
				if(name.equals("?????????")){
					fieldAccount.setBounds(10,10,80,20);
					jbfieldAccount.setBounds(110,10,50,20);
					
				}
			
		    
			}
		});
		
		
		
		}	
		
	
	@Override
	
	public void actionPerformed(ActionEvent e){
	// TODO Auto-generated method stub
		if(e.getSource()==jbfieldAccount){//?????????????????????
		
			String m=fieldAccount.getText();
			int m1=Integer.parseInt(m);
			System.out.println(m1+"???????????????");
			int minute=m1*60;
			closemusic(minute);
			fieldAccount.setBounds(0,0,0,0);
			jbfieldAccount.setBounds(0,0,0,0);
			
		}
		
		
		if(e.getSource()==jm0){//??????????????????
			System.out.println("111");
			list3.setBounds(10,10,60,90);
		}
		if(e.getSource()==jm1){//??????????????????
			open();
		}
		if(e.getSource()==jm2){//??????
			System.exit(0);
		}
		if(e.getActionCommand().equals("????????????")){
			nightmode.setText("????????????");
			jb.setBackground(new Color(24, 29,57));
			 imagelabel2.setBounds(0,0,0,0);
			  imagelabel3.setBounds(0,0,500,800);
		}
		if(e.getActionCommand().equals("????????????")){
			nightmode.setText("????????????");
			jb.setBackground(new Color(82, 153,145));
			 imagelabel2.setBounds(0,0,500,800);
			  imagelabel3.setBounds(0,0,0,0);
		}
		if(e.getSource()==poster){//??????
			like.setVisible(false);
			outside.setVisible(false);
		//	model.setVisible(false);
			local.setVisible(false);
		new	picture();
			
			
		}
//		if(e.getSource()==model){
//			open();
//		}
		if(e.getSource()==outside){
		
//			  for(int i=0;i<data2.length;i++){
//				   listModel2.add(i, data2[i]);
//				  }
			like.setVisible(false);
			outside.setVisible(false);
		//	model.setVisible(false);
			local.setVisible(false);
			listScroller2.setBounds(0,100,550,150);
			locallabel.setText("????????????");
			locallabel.setBounds(210,20,65,80);
			comeback.setBounds(10,15,65,80);
			comeback.setVisible(true);
			
			//waibo w=new waibo();
			
			
		}
		if (e.getSource()==local) {
			like.setVisible(false);
			outside.setVisible(false);
		//	model.setVisible(false);
			local.setVisible(false);
			listScroller.setBounds(0,100,550,150);
			locallabel.setText("????????????");
			locallabel.setBounds(210,20,65,80);
			comeback.setBounds(10,15,65,80);
			comeback.setVisible(true);
			
		}
		if (e.getSource()==comeback) {
			
			local.setVisible(true);
			listScroller.setBounds(0,0,0,0);
			listScroller2.setBounds(0,0,0,0);
			locallabel.setBounds(0,0,0,0);
			comeback.setVisible(false);
		//	model.setVisible(true);
			like.setVisible(true);
			outside.setVisible(true);
			
		}
		if (e.getSource()==next){
			  
			if(Btn1.getText().equals("????????????")){
         // play2();
				  if(check.equals("??????")){
				int s=list.getSelectedIndex();
		       System.out.println(s);
		       if(s>=0){
		    	   number++;
		   String     PATH=data[s+number];
		        single=s+number;
	        System.out.println(number);
		        number2--;
		    	play(PATH);
		    	  time(PATH);
				}
			       if(s<0){
			    	 
			     String PATH=data[0+number1];
			     number1++;
			    	   single=0+number1;
			    		play(PATH);
			    		  time(PATH);
		    		 
			       }
		       }
			  
			  if(check.equals("??????")){
				//  String name=(String)list2.getSelectedValue();//???????????????????????????
				//	System.out.println(name);
				//	String f=filepath+name; 
					int s1=list2.getSelectedIndex();
					if(s1>=0){
						tnumber++;
					String n=data2[s1+tnumber];
					tsingle=s1+tnumber;
					String f=filepath+n; 
					play(f);
					time(f);
			  }
					if(s1<0){
					
						String t=data2[0+tnumber1];
						tnumber1++;
						String f1=filepath+t; 
						play(f1);
						time(f1);
						
					}
			  }
			}
		}
		if(e.getSource()==last){
			
			
		if(Btn1.getText().equals("????????????")){	
			
			//play2();
			
			  if(check.equals("??????")){
			 int s=list.getSelectedIndex();
		       System.out.println(s);
		       if(s>=0){
		    	   
		    	   number--;
		    String  PATH=data[s+number];
		        single=s+number;
		    	play(PATH);
		    	  time(PATH);
		    	}
		       if(s<0){
		    	   number1--;
		     String  PATH=data[0+number1];
		    	   single=number1;
		    		play(PATH);
		    		  time(PATH);
		    				    			   	
		       }
		       
		}
			  if(check.equals("??????")){
					 int s2=list2.getSelectedIndex();
					 System.out.println(s2+"wei");
					 if(s2>=0){
						 tnumber--;
					 String t1=data2[0+tnumber];
						String f2=filepath+t1; 
						tsingle=s2+tnumber;
						play(f2);
						time(f2);
					 }
					 if(s2<0){
						 tnumber--;
						 String t1=data2[0+tnumber];
						 tsingle=tnumber;
							String f2=filepath+t1; 
							play(f2);
							time(f2);
					 }
			  }
			  
			  
		}
		}
		if(e.getActionCommand().equals("????????????")){
			sequenceplay.setText("????????????");
			
		}
		if(e.getActionCommand().equals("????????????")){
			sequenceplay.setText("????????????");
			
		}
		if(e.getActionCommand().equals("????????????")){
			sequenceplay.setText("????????????");
			
		}
		
		if(e.getActionCommand().equals("????????????")){
	//	if (e.getSource()==Btn1) {
		Btn1.setText("????????????");
	
	 int s=list.getSelectedIndex();
	 System.out.println(s);	 
			if(s<0){
		play(data[0]);
		single=0;
		String p=data[0];
	time(p);
			}
			if(s>=0){
			
				play(data[s+number1+number]);
				single=s+number1+number;
				String p=data[s+number1+number];
				time(p);
			}
 
		}
			
	
	if(e.getActionCommand().equals("????????????")){
		//  if (e.getSource() == Btn2) {
			//	int a = comboBox.getSelectedIndex();
			  //	if (g1 != 0) {
			//		g1 = 0;
			//		sound1.stop();
			//  jf.dispose();
			//		Btn1.setVisible(true);
					
			//	}
			//	if (g2 != 0) {
			//		g2 = 0;
			//		sound2.stop();
		 Btn1.setText("????????????");  
					play2();
				//	 imagelabel.setBounds(0,0,0,0);
			//		Poster p=new Poster();
			//		 jf.setBounds(0, 0, 0,0);
					
			//  player.close();
					 imagelabel.setBounds(0,0,0,0);
			 // listScroller.setBounds(0,0,0,0);
			//	Btn2.setVisible(false);
			//		Btn1.setVisible(true);
				//new picture();
					
					 
				
					//  imagelabel1.setBounds(400,50,700,900);
				        
				}
	
	
		}
	private String getFileLabel(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	private byte[] getMP3Image(File mp3File2) {
		// TODO Auto-generated method stub
		return null;
	}
/*
 * ???????????????????????????????????????
 */
	
private void photo(String path){
	
	File file1 = new File(path);
	 
//	getMP3Image(file1);
	 byte[] imageData = null;
        try {
            MP3File mp3file = new MP3File(file1);
            AbstractID3v2Tag tag = mp3file.getID3v2Tag();
            AbstractID3v2Frame frame = (AbstractID3v2Frame) tag.getFrame("APIC");
            FrameBodyAPIC body = (FrameBodyAPIC) frame.getBody();
            imageData = body.getImageData();
//        }catch (Exception e1) {
//            e1.printStackTrace();
//        }
	File mp3File = new File(path);
	// File mp3File = file1;
	 String mp3ImageSavePath = "D:"; 
 
	 boolean cover;
	        //??????mp3????????????
	        String mp3FileLabel = getFileLabel(mp3File.getName());
	        String mp3ImageFullPath = mp3ImageSavePath + ("\\" + mp3FileLabel + ".jpg");
 
	        //?????????????????????????????????????????????????????????????????????
//	        if( !cover ) {
//	            File tempFile = new File(mp3ImageFullPath) ;
//	            if(tempFile.exists()) {
//	                return mp3ImageFullPath;
//	            }
//	        }
 
	 //       byte imageData[] = getMP3Image(mp3File);
	        File saveDirectory = new File(mp3ImageSavePath);
	        saveDirectory.mkdirs();
	        FileOutputStream fos = null;
	//        try {
	            fos = new FileOutputStream(mp3ImageFullPath);
	            fos.write(imageData);
	            fos.close();
	            System.out.println("??????????????????");
//	            ImageIcon image1=new ImageIcon("D:/null.jpg");
//	        	//ImageIcon image=new ImageIcon("src/Picture/001.jpg");
//	            ImageIcon image1=new ImageIcon("D:\null.jpg");
//			      imagelabel1 = new JLabel(image1);
//			      imagelabel1.setBounds(400,50,700,900);
	        } catch(Exception e1) {
	            e1.printStackTrace();
	        }
	
	
	
}
	
/*
 * ??????????????????????????????????????????
 */
private void time(String p){
		try {
		
			RandomAccessFile raf = new RandomAccessFile(p, "rw");
			
			MP3File mp3File;
			
				try {
				//	mp3File = new MP3File("C:\\Users\\?????????\\Music\\?????? - 123?????????.wav");
					mp3File = new MP3File(p);
					MP3AudioHeader header = mp3File.getMP3AudioHeader();
					System.out.println("??????: " + header.getTrackLength()); //????????????
		  int s= header.getTrackLength();
		  int eachPlayTime=(710/s)/2;
		  int e=s*eachPlayTime;
		  playtime1.setBounds(20,680,e,3);//???????????????
		  timerfun(s);
	      int s1=s/60;
	      int s2=s%60;
	     String t1=Integer.toString(s1);
	     String t2=Integer.toString(s2);
			System.out.println("??????"); //????????????
					time.setText(t1+":"+t2);
				//	System.out.println(s);
					
				} catch (TagException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ReadOnlyFileException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidAudioFrameException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
			
			byte buf[] = new byte[128];
			byte buf1[] = new byte[4];
			raf.seek(raf.length() - 128);
			raf.read(buf);
			raf.seek(45);// ???????????????45??????????????????46???????????????
			raf.read(buf1);
			if (buf.length != 128) {
				System.err.println("MP3?????????????????????????????????!");
			}
			if (!"TAG".equalsIgnoreCase(new String(buf, 0, 3))) {
				System.err.println("MP3?????????????????????????????????!");
			}
			String SongName = new String(buf, 3, 30,"gbk");
			System.out.println("?????????" + SongName);
			String Singer = new String(buf, 33, 30,"gbk");
			String s=SongName;
			String s1=Singer;
		
			System.out.println("?????????" + Singer);
			name.setText(s);
			name2.setText(s1);
			String Album = new String(buf, 63, 30,"gbk");
			System.out.println("?????????" + Album);
			System.out.println("???????????????" + raf.length());
			raf.close();
		} catch (IOException e) {
			System.err.println("????????????:" + e);
			e.printStackTrace();
		}
		
	
		
	}
public void timerfun(final int nplaytime){//?????????,?????????????????????
	if(nTimer!=null){
		nTimer.cancel();
	}
	nTimer=new Timer();
	nTimer.schedule(new TimerTask(){
    int eachPlayTime=710/nplaytime;
    int starttime=0;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			playtime.setBounds(20,680,(starttime+=eachPlayTime)/2,3);
			
		    String t1=Integer.toString(Time);
		  
		    if(Time==60){
		    	Time=0;
		    	second++;
		    }
		     String t2=Integer.toString(second);
	       time1.setText(t2+":"+t1+"/");
	       Time++;
		}
		
	},0,1000);
}
 
 
public void timerstop(){//???????????????
	if(nTimer!=null){
		nTimer.cancel();
	}
	Time=0;
	second=0;
	playtime.setBounds(20,628,0,3);
}
 
public void closemusic(final int playtime){//?????????,????????????????????????????????????
	if(nTimer2!=null){
		nTimer2.cancel();
	}
	nTimer2=new Timer();
	nTimer2.schedule(new TimerTask(){
  //  int eachPlayTime=710/nplaytime;
   // int starttime=0;
		@Override
		public void run() {
			// TODO Auto-generated method stub
		//	playtime.setBounds(20,680,(starttime+=eachPlayTime)/2,3);
			
		//    String t1=Integer.toString(Time);
		  if(Time2==playtime){
			  System.out.println("?????????");
			  Btn1.setText("????????????");
			  play2();
			  timerstop2();
			  timerstop();
			  System.exit(0);
			
		  }
		  Time2++;
	//	    if(Time==60){
	//	    	Time=0;
	//	    	second++;
	//	    }
		//     String t2=Integer.toString(second);
	  //     time1.setText(t2+":"+t1+"/");
	   //    Time++;
		}
		
	},0,1000);
}
 
public void timerstop2(){
	if(nTimer2!=null){
		nTimer2.cancel();
	}
	Time2=0;
	
}
 
/*
 * ??????????????????
 */
 
	private void play(String path) {
		//String path=data[3];	
        try {
 
            isStop = true;// ??????????????????
 
            // ????????????????????????
 
           
 
            while (!hasStop) {
 
          //      System.out.print(".");
              
 
                try {
 
                    Thread.sleep(10);
 
                } catch (Exception e) {
 
                }
 
            }
 
            System.out.println("");
        //    File file=new File("src\\Music\\????????? - ??????????????? (Live).mp3");
            File file = new File(path);
 
          //  labelfilename.setText("???????????????" + filename);
 
 
 
            // ?????????????????????
 
            audioInputStream = AudioSystem.getAudioInputStream(file);
 
            audioFormat = audioInputStream.getFormat();
 
            // ??????mp3????????????
 
            if (audioFormat.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
 
                audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
 
                        audioFormat.getSampleRate(), 16, audioFormat
 
                                .getChannels(), audioFormat.getChannels() * 2,
 
                        audioFormat.getSampleRate(), false);
 
                audioInputStream = AudioSystem.getAudioInputStream(audioFormat,
 
                        audioInputStream);
 
            }
 
 
 
            // ??????????????????
 
            DataLine.Info dataLineInfo = new DataLine.Info(
 
                    SourceDataLine.class, audioFormat,
 
                    AudioSystem.NOT_SPECIFIED);
 
            sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
 
            sourceDataLine.open(audioFormat);
 
            sourceDataLine.start();
 
 
 
            // ??????????????????????????????
 
            isStop = false;
 
            Thread playThread = new Thread(new PlayThread());
 
            playThread.start();
 
        } catch (Exception e) {
 
            e.printStackTrace();
 
        }
 
    }
	/*
	 * ??????????????????
	 */
	private void play2() {
 
        try {
 
           isStop = true;// ??????????????????
 
            // ????????????????????????
 
           
 
            while (!hasStop) {
 
           //     System.out.print(".");
 
                try {
 
                    Thread.sleep(10);
//                    Thread playThread = new Thread(new PlayThread());
//
//                    playThread.start();
 
                } catch (Exception e) {
 
                }
 
            }
            
            System.out.println("55");
 
 
            // ??????????????????????????????
 
            isStop = false;
 
            Thread playThread = new Thread(new PlayThread());
 
//            playThread.start();
 
        } catch (Exception e) {
 
            e.printStackTrace();
 
        }
 
    }
	/*
	 * ??????????????????
	 */
	class picture extends JFrame implements ActionListener{
		JLabel Imagelabel3 ;
		JLabel bgp=new JLabel();
	//	JFrame jf2=new JFrame();
		JButton retu=new JButton("??????");
		
		
		public picture(){
		jf.setTitle("???????????????");
	
		jf.setBounds(100, 150, 500, 800);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setLayout(null);
	//	jf2.setUndecorated(true);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		
		listScroller.setBounds(0,0,0,0);
		listScroller2.setBounds(0,0,0,0);
		locallabel.setBounds(0,0,0,0);
		comeback.setVisible(false);
		 
		imagelabel2.setBounds(0,0,0,0);
		imagelabel3.setBounds(0,0,0,0);
				   
		retu.setBounds(10,50,100,100);
		
		retu.setBounds(10,15,65,80);
		retu.setBackground(new Color(30, 144, 255));
		retu.setOpaque(false);
		retu.setBorder(null);	
		retu.setForeground(Color.white);
	
		
        retu.addActionListener(this);
        jf.add(retu);
	ImageIcon image1=new ImageIcon("D:/null.jpg");
	//ImageIcon image1=new ImageIcon("src/Picture/001.jpg");
	   if (nightmode.getText().equals("????????????")){
		 ImageIcon image3=new ImageIcon("src/picture/????????????.jpg");
		 Imagelabel3 = new JLabel(image3);
		   }
		   if (nightmode.getText().equals("????????????")){
			   ImageIcon image3=new ImageIcon("src/picture/????????????2.png");
				 Imagelabel3 = new JLabel(image3);
			   }
	//ImageIcon image3=new ImageIcon("src/picture/????????????5.jpg");
    
  // Imagelabel3 = new JLabel(image3);
	    imagelabel1 = new JLabel(image1);
	    imagelabel1.setBounds(50,30,430,750);
	   Imagelabel3.setBounds(0,0,500,800);
	   
	   // jf.setBounds(100, 100, 1300, 1000);
	    jf.add(imagelabel1);
	   jf.add(Imagelabel3);
		   
		jf.setVisible(true);
	}
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == retu) {
				//	jf.dispose();
				//	zhuye z=new zhuye();
					System.out.println("25522");
					//z.jf.setBounds(100, 100, 1300, 1000);
				//jf2.dispose();
		
					  imagelabel1.setBounds(0,0,0,0);
					   Imagelabel3.setBounds(0,0,0,0);
					   if (nightmode.getText().equals("????????????")){
					   imagelabel2.setBounds(0,0,500,800);
					   }
					   if (nightmode.getText().equals("????????????")){
						   imagelabel3.setBounds(0,0,500,800);
						   }
					   
						retu.setVisible(false);
						like.setVisible(true);
						outside.setVisible(true);
						//model.setVisible(true);
						local.setVisible(true);
					  
				}
		}
 
	
	}
 
	
	
	
class PlayThread extends Thread {
 
    byte tempBuffer[] = new byte[320];
 
 
 
    public void run() {
 
        try {
 
            int cnt;
 
            hasStop = false;
           
 
            // ???????????????????????????
 
            while ((cnt = audioInputStream.read(tempBuffer, 0,
 
                    tempBuffer.length)) != -1) {
 
                if (isStop)
 
                    break;
 
                if (cnt > 0) {
 
                    // ??????????????????
 
                    sourceDataLine.write(tempBuffer, 0, cnt);
 
                }
 
            }
 
            // Block?????????????????????????????????
 
            sourceDataLine.drain();
 
          sourceDataLine.close();
 
            hasStop = true;
            String s=Btn1.getText();
            System.out.println(s);
        	timerstop();
          if(s.equals("????????????")){
        	  
        	//  if(panduanliebiao==0){
            if(sequenceplay.getText().equals("????????????")){
            
            	System.out.println("yes");
            	SequencePlay();
            	
            }
            if(sequenceplay.getText().equals("????????????")){
            	suijibofang();
            
            	
          }
            if(sequenceplay.getText().equals("????????????")){
            	danquxunhuan();
            
            	
       //   }
          }
          }
//            Thread playThread = new Thread(new PlayThread());
//             playThread.start();
  //          String s="src\\Music\\?????????.wav";
   //         play(s);
        } catch (Exception e) {
 
            e.printStackTrace();
 
            System.exit(0);
 
        }
 
    }
 
}
private void SequencePlay(){//??????????????????
	//n++;
	  if(check.equals("??????")){
	int s=list.getSelectedIndex();
	 System.out.println(s);	 
	 number2++;
	 if(s>=0){
	
	
	String s1=data[number2+s+number+number1];
	time(s1);
	play(s1);
	 }
	 if(s<0){
	String s1=data[number2+number+number1];
	play(s1);
	time(s1);
	
}
	  }
	 
	  if(check.equals("??????")){
				int s1=list2.getSelectedIndex();
				tnumber2++;
				if(s1>=0){
				String n=data2[s1+tnumber2+tnumber+tnumber1];
				String f=filepath+n; 
			
				play(f);
				time(f);
		  }
				if(s1<0){
					String n1=data2[tnumber2+tnumber+tnumber1];
					String f1=filepath+n1; 
					play(f1);
					time(f1);
				}
	  }
	  
	  
	  
}
	 private void suijibofang(){//??????????????????
		 
	 Random rd=new Random();
	 
	 int num=rd.nextInt(4);
	 System.out.println("s????????????"+num);
	 
	 if(check.equals("??????")){
	 String s=data[num];
	 play(s);
	 time(s);
	 }
	  if(check.equals("??????")){
		  Random rd1=new Random(); 
			 int num1=rd1.nextInt(10);
		  String s1=data2[num1];
		  String f1=filepath+s1; 
		  play(f1);
		  time(f1);
	  }
}
	 
	 
	 private void danquxunhuan(){//??????????????????
		 if(check.equals("??????")){
		 String s=data[single];
		 play(s);
		 time(s);
		 }
		 if(check.equals("??????")){
			 
			 String s2=data2[single];
			 String f2=filepath+s2; 
			 play(f2);
			 time(f2);
		 }
	 }
	 
	/*
	 * ????????????????????????
	 */
	 private void open() {
 
		   
 
	        FileDialog dialog = new FileDialog(this, "Open", 0);
 
	        dialog.setVisible(true);
 
	        filepath = dialog.getDirectory();
 
	        if (filepath != null) {
 
	          //  labelfilepath.setText("???????????????" + filepath);
 
	 
 
	            // ??????????????????
 
	            list.removeAll();
 
	            File filedir = new File(filepath);
 
	            File[] filelist = filedir.listFiles();
 
	            for (File file : filelist) {
 
	                String filename = file.getName().toLowerCase();
 
	                if (filename.endsWith(".mp3") || filename.endsWith(".wav")) {
 
	                 //   list2.add(filename);
	                  //   n=0;
	                //	  listModel2 = new DefaultListModel();
	            		
	            	
	                	String s=filename;
	            	    data2[n] =s;
	            	    
//	                    for(int i=0;i<data1.length;i++){
	           // 		   listModel.add(i, data2[i]);//?????????????????????????????????
//	                   	 }
	                    
	                   // for(int i=0;i<data2.length;i++){
	             		   listModel2.add(n, data2[n]);
	             		   System.out.println(s);
	      //      			list2 = new JList(listModel);
	       //      		  listScroller2 = new JScrollPane(list2);
	             	//	  }
	             	//	list = new JList(listModel);
	             	//	list2 = new JList(listModel2);
                       n++;
          //             jf.add(listScroller2);
	                }
 
	            }
 
	        }
 
	    }
	  
	 
}
