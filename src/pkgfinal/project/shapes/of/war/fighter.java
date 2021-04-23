
package pkgfinal.project.shapes.of.war;


import java.awt.*;


public class Fighter extends MapSpawn
{

    public int rank;

    public Fighter( int rank )
    {
        super( 0, 0, 10 );
        this.rank = rank;
    }

    
     //@return if it should be hit
     
    public boolean getHit()
    {
        rank--;
        return rank == 0;
    }

    public double getSpeed()
    {
        return rank;
    }

    public void draw( Graphics2D g )
    {
        Color color = Color.WHITE;
        switch ( rank )
        {
            case 1:
                color = Color.RED;
                break;
            case 2:
                color = Color.BLUE;
                break;
        }
        g.setColor( color );
        g.fillOval(
                getX() - getWidth(),
                getY() - getWidth(),
                getWidth() * 2,
                getWidth() * 2 );
        g.setColor( Color.WHITE );
        g.drawOval(
                getX() - getWidth(),
                getY() - getWidth(),
                getWidth() * 2,
                getWidth() * 2 );
    }
}

    

