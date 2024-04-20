import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo BeeWorld.
 * 
 * @author Richard Brosler 
 * @version 2024-04-20
 */
public class Abelha extends Actor
{
    /**
     * Método que será executando quando apertado o botão Act ou Run.
     * 
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        //Se teclar para esquerda, gira -10º
        if (Greenfoot.isKeyDown("left")){
            turn(-10);
        }
        //Se teclar para direita, gira 10º
        if (Greenfoot.isKeyDown("right")){
            turn(10);
        }
    }
}
