import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    public int pX = 1;
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(pX);
        if (isAtEdge()){
            pX *= -1; // pX = pX * -1;
            setLocation(getX(), getY()+30);
        }
        //Se tocar a nave, é fim de jogo
        if (isTouching(Nave.class)){
            getWorld().showText("GAME OVER", 400, 300);
            Greenfoot.stop();
        }
    }
}
