import java.awt.*;



import javax.swing.JPanel;

import javax.swing.*;





public class SimpleTab extends JFrame {



JTabbedPane jtp;



public SimpleTab() {

super("JTabbedPane");

setSize(200, 200);

Container contents = getContentPane();

jtp = new JTabbedPane();


    

    jtp.add("Morning",new Morning());
    jtp.add("Evening",new Evening());
    jtp.add( "SysAndOnline", new SysAndOnline());
    jtp.add("OtherAct", new OtherAct( ) ) ;
    jtp.add("library", new library( ) ) ;
    jtp.add("Non Routine", new NonRoutine( ) ) ;
    jtp.add("Anti_porn_tasks", new Antiporn() ) ;


contents.add(jtp);





setVisible(true);

}



public static void main(String args[]) {

SimpleTab st = new SimpleTab();
st.setTitle("My swing frame");
st.setSize(700,2000);
st.setVisible(true);
st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}

    class Antiporn extends JPanel {

        public Antiporn() {
            
            JLabel b1 = new JLabel("add words to black olst ");
    JLabel b2 = new JLabel("timer");
           JLabel b16 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b3 = new JLabel("disconnect net");
            JLabel b17 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b5 = new JLabel("face monitor to open side");
            JLabel b18 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b6 = new JLabel("snamaz and dua");
            JLabel b19 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b7 = new JLabel("wear a rubber band");
            JLabel b20 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b8 = new JLabel("sleep early");
            JLabel b27 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b9 = new JLabel("dont be alone");
            JLabel b21 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b10 = new JLabel("do exercise");
            JLabel b22 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b11 = new JLabel("wear belt and sleep");
            JLabel b23 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b12 = new JLabel("eat less or fast");
            JLabel b24 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b13 = new JLabel("read books and find out methods");
            JLabel b25 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b14 = new JLabel("read books and find out methods");
            JLabel b26 = new JLabel("________________________________________________________________________________________________________________"+"\n");

    JLabel b15 = new JLabel("dont sleep up side down");
    
            
 //   JLabel b3 = new JLabel("");
    add(b1);
    add(b16);
    
    add(b2);
    add(b17);
    add(b3); 
    add(b18);
    
    add(b19);
    add(b5);
    add(b20);
    add(b6);
    add(b21);
    add(b7); 
    add(b22);
    add(b8);
    add(b23);
    add(b9);
    add(b24);
    add(b10);
    add(b25);
    add(b11);
    add(b26);
    add(b12);
    add(b27);
    add(b13);
    //add(b28);
    add(b14);
   // add(b29);
    add(b15); 
        }

        
    }

 
/*import javax.swing.JPanel;

import javax.swing.*;

public class PERSONAL_ORG extends JApplet  
{
  public void init()   
  {
    JTabbedPane jt = new JTabbedPane();
    

    jt.add("Morning",new Morning());
    jt.add("Evening",new Evening());
    jt.add( "SysAndOnline", new SysAndOnline());
    jt.add("OtherAct", new OtherAct( ) ) ;
    jt.add("library", new library( ) ) ;
    jt.add("Non Routine", new NonRoutine( ) ) ;
    getContentPane().add(jt);
    
  }
}*/
class Morning extends JPanel   
{
  public Morning()   
  {
        JLabel cb1 = new JLabel("wake up early morning");
        JLabel cb2 = new JLabel("do excercise 5 minutes");
        JLabel cb3 = new JLabel("get ready:brush,bath,latrine,dress up");
        JLabel cb4 = new JLabel("EVENING");
        JLabel cb5 = new JLabel("read news papers");
        JLabel cb6 = new JLabel("write down dairy");
        JLabel cb8 = new JLabel(" sleep before 10 pm");
        JLabel cb9 = new JLabel("PRODUCTIVITY"+" VISUALIZE DOING VARIOUS EXCERCISES.  EXCERCISE { WALKING , JOGGING  RUNNING, PULLUP ,PUSH UP ,STRECHING, CRUNCHES}"); 
        add(cb2);  
        add(cb3) ;
        add(cb4) ;
        add(cb5) ;
        add(cb6) ;
        add(cb8);
        add(cb9);
  }  
}
  class Evening extends JPanel   
{
  public Evening()   
  {
        JLabel cb1 = new JLabel("RELAXATION/STRESS MANAGEMENT"+"\n");
        JLabel cb24 = new JLabel("________________________________________________________________________________________________________________"+"\n");
        JLabel cb2 = new JLabel("BREATHING EXCERCISE ");
        JLabel cb25 = new JLabel("________________________________________________________________________________________________________________");
        JLabel cb3 = new JLabel("READ SOME RELIGIOUS ARTICLES TO RELAX.");
        JLabel cb26 = new JLabel("________________________________________________________________________________________________________________");
        JLabel cb4 = new JLabel("LAUGHTER MAY RELAX YOU,READ JOKES.");
        JLabel cb27 = new JLabel("________________________________________________________________________________________________________________");
        JLabel cb5 = new JLabel("POSITIVE AFFIRMATIONS MAY RELAX YOU.");
         JLabel cb28 = new JLabel("________________________________________________________________________________________________________________");
        
        JLabel cb6 = new JLabel("VISUALIZE POSITIVE SCEENS");
        JLabel cb29 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb8 = new JLabel("ATIVITES TO WAKE UP EARLY:");
        JLabel cb30 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb9 = new JLabel("SET ALARM BEFORE SLEEP;KEEP MOBILE FULLY CHARGED;DO NOT TURN OFF ALARM WHEN YOU WAKE UP");
             JLabel cb31 = new JLabel("________________________________________________________________________________________________________________"); 
      
        JLabel cb10 = new JLabel("WASH YOUR BODY BEFORE YOU GO TO SLEEP");
       JLabel cb32 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb12 = new JLabel("GO TO BED EARLY; DO NOT WATCH TV TO NIGHT AFTER 10:30 PM. ");
         JLabel cb33 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb13 = new JLabel("COVER YOUR EYES WITH CLOTH;KERCHIEF;POLLUTION CONTROL CLOTH");
         JLabel cb34 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb14 = new JLabel("WASH YOUR FACE ONCE YOU WAKE UP,KEEP A WATER BOTTLE BESIDE YOU BEFORE SLEEP");
         JLabel cb35 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb15 = new JLabel("AFTER YOU WAKE UP;GET OUT OF BED AND DO EXCERCISE");
         JLabel cb36 = new JLabel("________________________________________________________________________________________________________________");
      
        JLabel cb16 = new JLabel("ONE WAY TO GET GOOD SLEEP IS TO RELAX AFTER DAYS WORK");
          JLabel cb37 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb18 = new JLabel("STOP WORKING ONLINE TO NIGHT.");
        JLabel cb39 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb19 = new JLabel("USE CLEAN BED SHEETS ON BED");
         JLabel cb40 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb20 = new JLabel("VISUALIZE:1]YOU ARE GETING UP EARLY WASHING YOUR FACE GET OUT OF HOUSE,WALKING AROUND STREET.");
         JLabel cb41 = new JLabel("________________________________________________________________________________________________________________");
       
        JLabel cb21 = new JLabel("SIT AT A PLACE AND CLOSE EYES AND VISUALIZE POSITIVE SCEENS TO CLAMN DOWN.");
         JLabel cb42 = new JLabel("________________________________________________________________________________________________________________");
        
        JLabel cb22 = new JLabel("CHANGE YOUR CLOTHES,WEAR LIGHT CLOTHES LIKE PYJAMA,TSHIRT.");
        JLabel cb43 = new JLabel("________________________________________________________________________________________________________________");
      
        JLabel cb23 = new JLabel("SWITCH THE LIGHTS OFF TO KEEP THE ROOM DARK.");
        JLabel cb44 = new JLabel("________________________________________________________________________________________________________________");
      
     ////////////////////////////////////////////////////////////////////////   
        
        
        
          //  JLabel cb24 = new JLabel("a");
        
    
        add(cb2); 
        add(cb24);
        add(cb3) ;
        add(cb25); 
        add(cb4) ;
        add(cb26) ;
        add(cb5) ;
        add(cb27) ;
        add(cb6) ;
         add(cb29) ;
        
        add(cb8);
        add(cb28) ;
      
        add(cb9);
        add(cb44) ;
        add(cb12);
        add(cb30);
        add(cb13) ;
        add(cb31);
        add(cb14) ;
        add(cb32);
        add(cb15) ;
         add(cb33) ;
        add(cb16) ;
        add(cb34) ;
        add(cb18);
         add(cb35) ;
        add(cb19);
        add(cb36) ;
        add(cb20);
         add(cb37);
        add(cb21) ;
        add(cb39);
        add(cb22);
        add(cb40);
        add(cb23);
         add(cb41) ;
        add(cb42);
        add(cb43);
        
        
         
        
        
        
       
        
        
          
       
        
       
        
       
        
        
       
  } 
}
class SysAndOnline extends JPanel   
{
  public SysAndOnline()   
  {
    JLabel b1 = new JLabel("SOCIAL NETWORK");
    JLabel b2 = new JLabel("Facebook");
    JLabel b3 = new JLabel("LinkedLn");
    JLabel b4 = new JLabel("Google+");
    JLabel b5 = new JLabel("Twitter");
    JLabel b6 = new JLabel("SYSTEM WORK");
    JLabel b7 = new JLabel("practise:html,flash,java,image editing,etc");
    JLabel b8 = new JLabel("downoad &install softwares,projects ");
    JLabel b9 = new JLabel("work on blog");
    
    
   add(b1);    add(b2);    add(b3);
    add(b4);add(b5);add(b6); 
    add(b7); 
    add(b8); 
    add(b9); 
  }
}
class onlineAct extends JPanel   
{
  public onlineAct()   
  {
    JLabel b1 = new JLabel(" Armoor");
    JLabel b2 = new JLabel(" nizamabad");
    JLabel b3 = new JLabel(" Khammam (municipal office)");
    JLabel b4 = new JLabel("Anathpur.");
    JLabel b5 = new JLabel(" mahbubnagar");
    JLabel b6 = new JLabel(" madhyapradesh,bhopal");
    JLabel b7 = new JLabel(" madhyapradesh,umriya");
    add(b1);    add(b2);    add(b3);
    add(b4);add(b5);add(b7);
     
  }  
  
}
class OtherAct extends JPanel   
{
  public OtherAct()   
  {
    JLabel b1 = new JLabel("charge mobile,kindle,laptop");
    JLabel b2 = new JLabel("candle meditation");
    JLabel b3 = new JLabel("walking");
    JLabel b4 = new JLabel("exercise");
    JLabel b5 = new JLabel("Declutter");
    JLabel b6 = new JLabel("Planing to and fro to library");
    JLabel b7 = new JLabel("wash your clothes");
    JLabel b8 = new JLabel("wash your plate");
    JLabel b9 = new JLabel("hair cutting ,shaving, clear armpit and p.hair");
    JLabel b10 = new JLabel("draw,sketch,paint");
       
    add(b1);
    add(b2); 
    add(b3); 
    add(b4); 
    add(b5); 
    add(b6); 
    add(b7); 
    add(b8); 
    add(b9); 
    add(b10); 
    
  } 
  }
class library extends JPanel   
{
  public library()   
  {
    JLabel b1 = new JLabel("To do lists");
    JLabel b2 = new JLabel("Questions and Answers");
    JLabel b3 = new JLabel("prepare for exams applied");
    add(b1); 
    add(b2); 
    add(b3); 
  } 
  }

class NonRoutine extends JPanel   
{
  public NonRoutine()   
  {
    JLabel b1 = new JLabel("view the file using notepad program");
    JLabel b2 = new JLabel("search for a folder called :notepad");
 //   JLabel b3 = new JLabel("");
    add(b1); 
    add(b2); 
   // add(b3); 
  } 
}
  


   









 
