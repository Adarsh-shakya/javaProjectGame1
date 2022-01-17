import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
// number game by java.
public class game2
{
    private JTextField textname1;
    private JTextField textname2;
    private JTextField textscore1;
    private JTextField textscore2;
    private JTextField textTurn;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    JPanel main2;
    JPanel main22;
    private JButton playButton;
    private JTextField resultTextField;
    private JTextField textWin;
    int score1=0;
    int score2=0;
    int i=1;



    public game2()
    {
        Random rand=new Random();
        playButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textTurn.setText(textname1.getText());
                textscore1.setText(String.valueOf(score1));
                textscore2.setText(String.valueOf(score2));
            }
        });

            a1Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int n = rand.nextInt(3) + 1;
                 if(score2<10 && score1<10) {
                     if (n == 1) {
                         if (i % 2 == 0) {
                             textscore2.setText(String.valueOf(score2 += 1));
                         } else {
                             textscore1.setText(String.valueOf(score1 += 1));
                         }
                     }
                     if (i % 2 == 0) {
                         textTurn.setText(textname1.getText());
                     } else {
                         textTurn.setText(textname2.getText());
                     }
                     resultTextField.setText("Number is " + String.valueOf(n));
                     i += 1;
                 }
                 else{
                     score1=0;
                     score2=0;
                     textscore2.setText(String.valueOf(score2));
                     textscore1.setText(String.valueOf(score1));
                     if(score2>score1){
                         textWin.setText(textname2.getText());
                     }
                     else{
                         textWin.setText(textname1.getText());
                     }
                 }
                }
            });
            a2Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int n = rand.nextInt(3) + 1;
                if(score1<10 && score2<10) {
                    if (n == 2) {
                        if (i % 2 == 0) {
                            textscore2.setText(String.valueOf(score2 += 1));
                        } else {
                            textscore1.setText(String.valueOf(score1 += 1));
                        }
                    }
                    if (i % 2 == 0) {
                        textTurn.setText(textname1.getText());
                    } else {
                        textTurn.setText(textname2.getText());
                    }
                    resultTextField.setText("Number is " + String.valueOf(n));
                    i += 1;
                }
                else{
                    score1=0;
                    score2=0;
                    textscore2.setText(String.valueOf(score2));
                    textscore1.setText(String.valueOf(score1));
                    if(score2>score1){
                        textWin.setText(textname2.getText());
                    }
                    else{
                        textWin.setText(textname1.getText());
                    }
                }
                }
            });
            a3Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int n = rand.nextInt(3) + 1;
                if(score2<10 &&score1<10) {
                    if (n == 3) {
                        if (i % 2 == 0) {
                            textscore2.setText(String.valueOf(score2 += 1));
                        } else {
                            textscore1.setText(String.valueOf(score1 += 1));
                        }
                    }
                    if (i % 2 == 0) {
                        textTurn.setText(textname1.getText());
                    } else {
                        textTurn.setText(textname2.getText());
                    }
                    resultTextField.setText("Number is " + String.valueOf(n));
                    i += 1;
                }
                else{
                    score1=0;
                    score2=0;
                    textscore2.setText(String.valueOf(score2));
                    textscore1.setText(String.valueOf(score1));
                    if(score2>score1){
                        textWin.setText(textname2.getText());
                    }
                    else{
                        textWin.setText(textname1.getText());
                    }
                }
                }
            });
        }
    }
class main
{
    public static void main(String[] args)
    {
        game2 Adarsh=new game2();
        JFrame frame1=new JFrame("Adarsh");
        frame1.setContentPane(Adarsh.main22);
        frame1.pack();
        frame1.setVisible(true);
    }
}
