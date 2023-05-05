package JavaTraining;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {


    private TextField firstTf;
    private TextField secondTf;
    private TextField AnswerTf;

    public ActionHandler(TextField firstNo ,TextField secondNo ,TextField  answer){
        this.firstTf =firstNo;
        this.secondTf =secondNo;
        this.AnswerTf =answer;
    }

    public void actionPerformed(ActionEvent e) {
        int i =Integer.parseInt(firstTf.getText());
        int j =Integer.parseInt(secondTf.getText());
        int result;

        if (e.getActionCommand().endsWith("Add"))
        {
            result = i+j;
            AnswerTf.setText(String.valueOf(result));
        }
        else if (e.getActionCommand().equalsIgnoreCase("Subtract"))
        {
            if(i > j)
            {
                result= i-j;
                AnswerTf.setText(String.valueOf(result));
            }
            else
                result=j-i;
            AnswerTf.setText(String.valueOf(result));
        }

        else if (e.getActionCommand().equalsIgnoreCase("Multiply"))
        {
            result=i*j;
            AnswerTf.setText(String.valueOf(result));
        }
        else if (e.getActionCommand().equalsIgnoreCase("Division"))
        {
            result = i/j;
            AnswerTf.setText(String.valueOf(result));
        }
    }
}
