import javax.swing.*;
import java.awt.*;

public class mainGame extends JFrame{


    mainGame(){
        JPanel leftBlackVoid = new JPanel();
        JPanel rightBlackVoid = new JPanel();
        JPanel middleMainGame = new JPanel();

        leftBlackVoid.setBackground(Color.BLACK);
        leftBlackVoid.setPreferredSize(new Dimension(100,800));

        rightBlackVoid.setBackground(Color.BLACK);
        rightBlackVoid.setPreferredSize(new Dimension(100,800));

        middleMainGame.setPreferredSize(new Dimension(800,800));


        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.add(leftBlackVoid);
        this.add(middleMainGame);
        this.add(rightBlackVoid);

        this.pack();

        this.setLocationRelativeTo(null);

        this.setVisible(true);

    }
}
