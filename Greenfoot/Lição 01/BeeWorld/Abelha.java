import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo BeeWorld.
 * 
 * @author Nicoly Oliveira
 * @version 2024-04-20
 */
public class Abelha extends Actor
{
    /**
     * Método que será executado quando apertado o botão Act ou Run.
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        //Se teclar para a esquerda, gira menos 10 graus.
        if (Greenfoot.isKeyDown("left")){
            turn(-10);
        }
        //Se teclar para a direita, gira 10 graus.
        if (Greenfoot.isKeyDown("right")){
            turn(10);
        }
    }

}
