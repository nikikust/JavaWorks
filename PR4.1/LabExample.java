import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab41 extends JFrame
{
    JButton buttonAC = new JButton("AC Milan");
    JButton buttonRM = new JButton("Real Madrid");

    JLabel Score = new JLabel("Result: 0 X 0");
    JLabel LastScorer = new JLabel("Last Scorer: N/A");
    JLabel Result = new JLabel("Winner: DRAW");

    int[] ScoreInt = new int[2];

    public Lab41()
    {
        super("Buttonssssss!");
        setSize(300,300);

        setLayout(new FlowLayout());
        add(buttonAC);
        add(buttonRM);

        buttonAC.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                ScoreInt[0]++;
                Score.setText("Result: " + ScoreInt[0] + " X " + ScoreInt[1]);
                LastScorer.setText("Last Scorer: AC Milan");

                if(ScoreInt[0] > ScoreInt[1])
                    Result.setText("Winner: AC Milan");
                else if(ScoreInt[0] == ScoreInt[1])
                    Result.setText("Winner: DRAW");
                else
                    Result.setText("Winner: Real Madrid");

            }
        });

        buttonRM.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                ScoreInt[1]++;
                Score.setText("Result: " + ScoreInt[0] + " X " + ScoreInt[1]);
                LastScorer.setText("Last Scorer: Real Madrid");

                if(ScoreInt[0] > ScoreInt[1])
                    Result.setText("Winner: AC Milan");
                else if(ScoreInt[0] == ScoreInt[1])
                    Result.setText("Winner: DRAW");
                else
                    Result.setText("Winner: Real Madrid");

            }
        });

        add(Score);
        add(LastScorer);
        add(Result);

    }
    public static void main(String[]args)
    {
        new Lab41().setVisible(true);
    }
}