package GUI;

import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import GUI.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class JPanelTest extends JPanel {

    public static String[] getPQ(String path) throws IOException {
        Scanner sc = new Scanner(new File(path));
        String[] a = sc.nextLine().split("\\|");

        return a;
    }

    @Override
    public void paintComponent(Graphics g) {
        // Draw Tree Here
        String[] lPQ = null;
        String fPQ = "src/GUI/PQ.txt";

        try {
            lPQ = getPQ(fPQ);
        } catch (IOException ex) {
            Logger.getLogger(JPanelTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int n = lPQ.length;
        float a = (float) Math.log(n);
        int h = (int) a;
        int dem = 0;
//        for(int i=0; i<=h; i++){
//            int x = (int) (800/(pow(2, i) +1));
//            for(int j=0; j < (int) pow(2, i); j++){
//                g.drawOval(x*(j+1), 100*i, 80, 40);
//                g.drawString(lPQ[dem], x*(j+1)+20, 100*i+20);
//                if(h>0){
//                    int tmp = (int) (800/(pow(2, i-1) +1));
//                    g.drawLine(tmp*(j+1)+40, 100*(i-1)+40, x*(j+1)+40, 100*i);
//                }
//                
//                dem++;
//                if(dem > n)
//                    break;
//            }
//        }
//        System.out.println(n);
        int[] s = {0, 380, 200, 100};
        int[] y = {40, 180, 330, 530};
        if (n == 1) {
            g.drawString(lPQ[0], 470, 40);
        } else {
            for (int i = 0; i <= h + 1; i++) {
                int x = (int) (920 / (pow(2, i) + 1));
                for (int j = 0; j < (int) pow(2, i); j++) {
                    g.drawString(lPQ[dem], x + j * s[i], y[i]);
                    dem += 1;
                    if (dem == n) {
                        break;
                    }
                }
            }
        }

        g.drawOval(450, 10, 100, 60);
//        ----------------------------
        g.drawOval(250, 150, 100, 60);
        g.drawOval(650, 150, 100, 60);
//        ----------------------------        
        g.drawOval(150, 300, 100, 60);
        g.drawOval(350, 300, 100, 60);
        g.drawOval(550, 300, 100, 60);
        g.drawOval(750, 300, 100, 60);
//        -----------------------------
        g.drawOval(100, 500, 100, 60);
        g.drawOval(200, 500, 100, 60);
        g.drawOval(300, 500, 100, 60);
        g.drawOval(400, 500, 100, 60);
        g.drawOval(500, 500, 100, 60);
        g.drawOval(600, 500, 100, 60);
        g.drawOval(700, 500, 100, 60);
        g.drawOval(800, 500, 100, 60);
//        -----------------------------
        g.drawLine(500, 70, 300, 150);
        g.drawLine(500, 70, 700, 150);

        g.drawLine(300, 210, 200, 300);
        g.drawLine(300, 210, 400, 300);
        g.drawLine(700, 210, 600, 300);
        g.drawLine(700, 210, 800, 300);

        g.drawLine(200, 360, 150, 500);
        g.drawLine(200, 360, 250, 500);
        g.drawLine(400, 360, 350, 500);
        g.drawLine(400, 360, 450, 500);
        g.drawLine(600, 360, 550, 500);
        g.drawLine(600, 360, 650, 500);
        g.drawLine(800, 360, 750, 500);
        g.drawLine(800, 360, 850, 500);
    }

    public static void mainz() {
        JFrame jFrame = new JFrame();
        jFrame.add(new JPanelTest(), BorderLayout.CENTER);
        jFrame.setSize(1000, 800);
        jFrame.setVisible(true);
//        JButton b1 = new JButton("CLOSE");
//        b1.setBounds(700, 40, 40, 40);
//        jFrame.add(b1);
////        jFrame.dispose();
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
    }

}
