import java.awt.*;
import java.applet.*;
import java.util.Scanner;

public class DrawTriangle extends Applet {

    int pts;
    int [] nXpts, nYpts;

    public void init() {
        Scanner sc = new Scanner(System.in);
        this.pts = sc.nextInt();
        this.nXpts = new int[pts];
        this.nYpts = new int[pts];
        for (int i = 0; i < this.pts; i++) {
            System.out.print(i+"(x,y): ");
            this.nXpts[i] = sc.nextInt();
            this.nYpts[i] = sc.nextInt();
        }
        sc.close();
    }

	public void paint(Graphics g) {
      /*To draw a triangle, we first
        create two int arrays, one for
        the x coordinates, and one for
        the y coordinates */
        
		// int []nXpts = {30,50,60,30};
		// int []nYpts = {70,50,90,30};
		g.setColor(Color.red);
      
      //the last argument is the number of corners
        g.fillPolygon(nXpts,nYpts,pts);
        
	}
}

/* 
<applet code="DrawTriangle.class" width="500" height="500">
            Alt Text "Hello World"
</applet>
*/