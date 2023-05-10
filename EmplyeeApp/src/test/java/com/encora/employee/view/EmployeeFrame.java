package com.encora.employee.view;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EmployeeFrame extends Frame {

    private Label employeeIdLbl;
    private TextField employeeIdTxt;
    private Label employeeNameLbl;
    private TextField employeeNameTxt;
    private Label employeeGenderLbl;
    private Checkbox maleOption;
    private Checkbox FemaleOption;
    private Checkbox OtherOption;
    private Label employeePerksLbl;
    private Checkbox pfOption;
    private Checkbox mealCardOption;
    private Checkbox gradutiyOption;
    private Checkbox npsOption;
    private  Checkbox MediclaimOption;
    private CheckboxGroup genderGroup;
    private Choice location;
    private Label LocationLbl;
    private Label employeeAddLbl;
    private TextField employeeAddTxt;

    private  Label employeeSalaryLbl;
    private TextField employeeSalaryTxt;

    private Button saveButton;
    private Button searchButton;
    private Button updateButton;
    private  Button deleteButton;

    private  Button firstButton;
    private Button nextButton;
    private Button previousButton;
    private Button lastButton;


    public EmployeeFrame(){
        setBounds(50,50,700,500);
        setTitle("Employee Information");
        setVisible(true);
        setLayout(null);

        genderGroup =new CheckboxGroup();

        employeeIdLbl =new Label("Employee Id");
        employeeIdLbl.setBounds(20,50,100,20);
        add(employeeIdLbl);

        employeeIdTxt =new TextField();
        employeeIdTxt.setBounds(140,50,100,20);
        add(employeeIdTxt);

        employeeNameLbl = new Label("Employee Name");
        employeeNameLbl.setBounds(20,90,100,20);
        add(employeeNameLbl);

        employeeNameTxt = new TextField();
        employeeNameTxt.setBounds(140,90,100,20);
        add(employeeNameTxt);

        employeeGenderLbl =new Label("Employee Gender");
        employeeGenderLbl.setBounds(20,130,150,20);
        add(employeeGenderLbl);

        maleOption =new Checkbox("Male",true,genderGroup);
        maleOption.setBounds(190,130,80,20);
        add(maleOption);

        FemaleOption =new Checkbox("Female",false,genderGroup);
        FemaleOption.setBounds(290,130,80,20);
        add(FemaleOption);

        OtherOption =new Checkbox("Other",false,genderGroup);
        OtherOption.setBounds(390,130,80,20);
        add(OtherOption);

       employeePerksLbl = new Label("Employee Perks");
       employeePerksLbl.setBounds(20,170,100,20);
       add(employeePerksLbl);

       pfOption =new Checkbox("PF");
       pfOption.setBounds(140,170,60,20);
       add(pfOption);

       gradutiyOption =new Checkbox("Gradutity");
       gradutiyOption.setBounds(220,170,120,20);
       add(gradutiyOption);

       mealCardOption =new Checkbox("MealCard");
       mealCardOption.setBounds(340,170,120,20);
       add(mealCardOption);

       MediclaimOption=new Checkbox("Mediclaim");
       MediclaimOption.setBounds(460,170,120,20);
       add(MediclaimOption);

       npsOption=new Checkbox("NPS");
       npsOption.setBounds(580,170,120,20);
       add(npsOption);

       LocationLbl =new Label("Location");
       LocationLbl.setBounds(20,210,100,20);
       add(LocationLbl);

       location= new Choice();
       location.setBounds(140,210,100,20);
       location.add("pune");
       location.add("Delhi");
       location.add("Mumbai");
       location.add("Bangalore");
       location.add("Hubli");
       this.add(location);

       employeeAddLbl =new Label("Employee Address");
       employeeAddLbl.setBounds(280,210,100,20);
       add(employeeAddLbl);


       employeeAddTxt = new TextField();
       employeeAddTxt.setBounds(400,210,200,120);
       add(employeeAddTxt);

       employeeSalaryLbl =new Label("Employee Salary");
       employeeSalaryLbl.setBounds(20,360,100,20);
       add(employeeSalaryLbl);

       employeeSalaryTxt = new TextField();
       employeeSalaryTxt.setBounds(150,360,120,30);
       add(employeeSalaryTxt);

       saveButton =new Button("Save");
       saveButton.setBounds(20,440,100,30);
       add(saveButton);

       searchButton =new Button("Search");
        searchButton.setBounds(150,440,100,30);
       add(searchButton);

       updateButton = new Button("Update");
        updateButton.setBounds(280,440,100,30);
       add(updateButton);

       deleteButton = new Button("Delete");
        deleteButton.setBounds(410,440,100,30);
       add(deleteButton);

        firstButton =new Button("First");
        firstButton.setBounds(20,520,100,30);
        add(firstButton);

        nextButton =new Button("Next");
        nextButton.setBounds(150,520,100,30);
        add(nextButton);

        previousButton = new Button("Previous");
        previousButton.setBounds(280,520,100,30);
        add(previousButton);

        lastButton = new Button("Last");
        lastButton.setBounds(410,520,100,30);
        add(lastButton);














        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               EmployeeFrame emf =( EmployeeFrame)e.getSource();
               emf.dispose();
            }
        });
    }
}
