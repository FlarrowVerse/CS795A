import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileOperations extends Applet implements ActionListener {

    TextField file;
    TextArea text;

    public void init() {
        setBackground(Color.white);
        setLayout(null);

        Label label = new Label("File Name :");
        label.setBounds(100,0,100,40);
        this.add(label);    

        file = new TextField();
        file.setBounds(200,0,200,40);
        this.add(file);

        text = new TextArea("",0,0,TextArea.SCROLLBARS_NONE);
        text.setBounds(50,75,400,300);
        this.add(text);   

        Button read = new Button("Read From File");
        read.setBounds(75,400,150,25);
        this.add(read);
        read.addActionListener(this);    

        Button write = new Button("Write To File");
        write.setBounds(275,400,150,25);
        this.add(write);
        write.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        String button = e.getActionCommand();

        if(button.equals("Read From File")) {
            read();
        } else {
            write();
        }
    }

    public void read() {
        try {

            FileReader obj = new FileReader(file.getText());
            int i;
            text.setText("");
            while((i=obj.read())!= -1) {
                text.setText(text.getText()+(char)i);
            }
            obj.close();
        } catch(Exception E) {
            text.setText(E.getMessage());		
        }
    }

    public void write() {
        try {
            FileWriter obj = new FileWriter(file.getText());
            obj.write(text.getText());
            obj.close();
            text.setText("File Written Successfully");
        } catch(Exception E) {
            text.setText(E.getMessage());
        }
    }

}

/*
<applet code = FileOperations.class width=500 height=500>
</applet>
*/