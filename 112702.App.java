package pac;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Yzz {
    JPanel Mypanl = new JPanel();
    JLabel label_fs=new JLabel();

    JLabel Label_1=new JLabel();

    int score=0,score1=0,score2=0,score3=0,score4=0;

    public Yzz() {
        Label_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX()+"."+e.getY());
                super.mouseClicked(e);
                if (e.getX()<147&&e.getX()>102 && e.getY()<89&&e.getY()>80) {
                    score1=1;
                    score=score1+score2+score3+score4;
                    label_fs.setText(String.valueOf(score));

                }if (e.getX()<175&&e.getX()>145 && e.getY()<171&&e.getY()>147) {
                    score2=1;
                    score=score1+score2+score3+score4;
                    label_fs.setText(String.valueOf(score));
                }if (e.getX()<372&&e.getX()>317 && e.getY()<362&&e.getY()>301) {
                    score3=1;
                    score=score1+score2+score3+score4;
                    label_fs.setText(String.valueOf(score));
                }

            }
        });
    }
    //显示窗体的方法
    void go(){

        java.net.URL imgURL=Yzz.class.getResource("zhbutong.jpg");
        Label_1.setIcon(new ImageIcon("src/zhbutong.jpg"));
        Label_1.setBounds(0,0,1000,800);



        label_fs.setText("得分：0");
        label_fs.setBounds(485,0,100,50);
        Mypanl.add(label_fs);
        Mypanl.add(Label_1);
        Mypanl.setLayout(null);

        JFrame frame = new JFrame("一起来找茬");
        frame.setContentPane(Mypanl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,800);
        //frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Yzz().go();
    }
}
