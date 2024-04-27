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
        //Vereficando se está nos cantos
        verificarPosicao();
        // veridic ase toca em uma mosca
        capturaMosca();
        
    }
    /**
     * Método que verifica se está na direita do mundo
     */
    
    public boolean isNaDireita(){
        if (getX() > getWorld().getWidth()-10){
            return true;
        }
        return false;
    }
    /**
     * Método que verifica se está na esquerda no mundo
     */
    public boolean isNaEsquerda(){
        
        return(getX() < 10);
    }
    
    /**
     * Método que verifica se está na base do mundo
     */
    public boolean isNaBase(){
        return ( getY() > getWorld().getHeight()-10);
    }
    /**
     * Método que verifica se está no topo do mundo
     */
    public boolean isNoTopo(){
        return(getY() < 10);
    }
    /**
     * Método que verifica se abelha está nos cantos e reposiciona ela 
     */
    public void verificarPosicao(){
        //vereficando se está na direita
        if (isNaDireita()){
            setLocation(10, getY());
        }
        //verifica se está na esquerda
        if (isNaEsquerda()){
            setLocation(getWorld().getWidth()-10, getY());
        }
        //verefica se está no topo do mundo
        if (isNoTopo()){
            setLocation(getX(), getWorld().getHeight()-10);
            
        }
        //vererfica se está na sabe do mundo
        if (isNaBase()){
            setLocation(getX(), 10);
            
        }
    }
    /**
     * Método que captura mosca
     */
    public void capturaMosca(){
        //verificando se tocou em uma mosca
        if (isTouching(Mosca.class)){
            //remove a mosca tocada
            removeTouching(Mosca.class);
            //adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX, pY);
            
        }
    }

}
