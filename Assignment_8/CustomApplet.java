import java.applet.Applet;
import java.awt.*;
import java.net.*;
import java.awt.event.*;
import java.awt.Desktop.*;

public class CustomApplet extends Applet implements ActionListener {
    // instance variables
    String bannerString;
    Button btnLink;

    @Override
    public void init() {
        setLayout(null);
        setBackground(Color.yellow);

        this.bannerString = "This is a sample banner";        

        this.btnLink = new Button("Google");
        this.btnLink.setBounds(500,420,50,40);
        this.btnLink.setBackground(Color.green);
        this.btnLink.addActionListener(this);
        this.add(btnLink);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String url = "https://www.google.com";
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 1000, 200);        

        g.setColor(Color.YELLOW);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString(this.bannerString, 300, 100);

        g.setColor(Color.BLUE);
        int[] xCoords = {100,130,160,260,160,130,100,0};
        int[] yCoords = {300,200,300,330,360,460,360,330};        
        g.fillPolygon(xCoords, yCoords, 8);

        g.fillOval(350,300,100,100);
        g.fillRect(550,300,200,100);

        
    }
}

/* 
<applet code="CustomApplet.class" width="1000" height="1000">
            Alt Text "Hello World"
</applet>
*/