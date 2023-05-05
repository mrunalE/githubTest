package JavaTraining;

import java.awt.*;
import java.awt.Label;

public class MyFrame extends Frame {
 private static final long serialVersionUID =1L;
    public MyFrame(boolean visible,String title, int x,int y, int width, int height){
        this.setVisible(visible);
        this.setTitle(title);
        this.setBounds(x, y, width, height);

        Label FirstLbl = new Label("FirstNo");
        FirstLbl.setBounds(50,50,80,30);

        Label SecondLbl = new Label("SecondNo");
        SecondLbl.setBounds(250,50,80,40);

        Label AnswerLbl = new Label("Answer is ");
        AnswerLbl.setBounds(50,100,80,40);

        TextField FirstNo = new TextField();
        FirstNo.setBounds(150,50,80,30);

        TextField SecondNo = new TextField();
        SecondNo.setBounds(350,50,80,30);

        TextField Answer =new TextField();
        Answer.setBounds(150,100,80,30);

        Button AddButton =new Button("Add");
        AddButton.setBounds(100,150,80,30);

         Button SubButton = new Button("Subtract");
         SubButton.setBounds(200,150,80,30);

         Button MultiplyButton = new Button("Multiply");
         MultiplyButton.setBounds(300,150,80,30);

         Button DivisionButton = new Button("Division");
         DivisionButton.setBounds(400,150,80,30);


         add(FirstLbl);
         add(SecondLbl);
         add(AnswerLbl);
         add(FirstNo);
         add(SecondNo);
         add(Answer);
         this.add(AddButton);
         this.add(SubButton);
         this.add(MultiplyButton);
         this.add(DivisionButton);


         this.setLayout(null);

         AddButton.addActionListener(new ActionHandler(FirstNo,SecondNo,Answer));
         SubButton.addActionListener(new ActionHandler(FirstNo,SecondNo,Answer));
         MultiplyButton.addActionListener(new ActionHandler(FirstNo,SecondNo,Answer));
         DivisionButton.addActionListener(new ActionHandler(FirstNo,SecondNo,Answer));

         this.addWindowListener(new WindowHandler());
         this.addWindowListener(new MasterWindowHandler());
         this.addMouseListener(new MasterWindowHandler());
         this.addMouseMotionListener(new MasterWindowHandler());

        this.addWindowListener(new WindowHandler());
    }

//    public MyFrame(boolean visible,String title ,int x,int y,int width,int height)
//        this.setVisible(visible);
//        this.setTitle(title);
//        this.setBounds(x, y, width, height);
//        this.addWindowListener(new WindowListener());



}
