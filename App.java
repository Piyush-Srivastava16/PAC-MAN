import java.awt.Frame;


import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        
        int rowCount = 21; 
        int columnCount = 19;
        int tileSize = 32;
        int boarderWidth=columnCount* tileSize;
        int boarderHeight =rowCount* tileSize;


//-------------------------------------FRAMING WINDOWN-------------------------------------------------------------
        JFrame frame = new JFrame("Pac Man"); //TITLE OF WINDOW 
        //frame.setVisible(true); ///WINDOW VISIBLE 
        frame.setSize(boarderWidth,boarderHeight);  //FRAME SIZE 
        frame.setLocationRelativeTo(null);  //WINDOW ALING IN CENTRE OF THE SCREEN
        frame.setResizable(false);  //FIXED SIZED WINDOW  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //TO CLOSE THE GAME WINDOW

        PacMan pacmanGame=new PacMan(); //Instance of jpannel
       frame.add(pacmanGame);//Adding the panel to our window 
       frame.pack();//TO get the full size of jpanel  
       pacmanGame.requestFocus();
       frame.setVisible(true); 
    }
}
