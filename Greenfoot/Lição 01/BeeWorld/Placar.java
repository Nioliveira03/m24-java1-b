import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Esta classe vai representar um placar no jogo BeeWorld
 * 
 * @author Nicoly Oliveira
 * @version 2024-05-11
 */
public class Placar extends Actor
{
    //Fields ou campo sou Variaveis de instãncia
    private String texto;
    private int tamanhoTexto;
    private Color corFonte;
    //Constructor   
    public Placar (){
        texto = "Score:0";
        tamanhoTexto = 35;
        //corFonte = Color.PINK;
        corFonte = new Color(0, 0, 255, 50);
        atualizarImagem();
        }
        //Getters (acessadores de campos) e Setters (modificadores de campos)
        public String getTexto(){
            return texto;
        }
        public void setTexto(String value){
            texto = value;
            atualizarImagem();
        }
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void atualizarImagem(){  
    GreenfootImage img = new GreenfootImage(tamanhoTexto * texto.length(), tamanhoTexto);
    img.setColor(corFonte);
    //                  Nome fonte,  bold, italic, tamanho
    img.setFont(new Font ("Arial", true, false, tamanhoTexto));
    img.drawString(texto, 0,tamanhoTexto);
    setImage(img);

}

}

