package com.company;

public class Main {
    public static void main(String[] args) {
        Robot x5=new Robot("X5");
        System.out.println(x5);
        Robot osama = new Robot("Osama","Nord",5,5);
        System.out.println(osama);
        osama.avance();
        System.out.println(osama);
        osama.droite();
        System.out.println(osama);
        RobotNG ong=new RobotNG("OsamaNG","Nord",5,5);
        ong.avance(5);
        System.out.println(ong);
        ong.avance();
        System.out.println(ong);
        ong.gauche();
        System.out.println(ong);
        ong.demi_tour();
        System.out.println(osama);
    }
}
class Robot{
    protected String nom;
    protected int x,y;
    protected String direction;
    public void avance() {
        switch (direction)
        {
            case("Est"):
                x++;
                break;
            case("Nord"):
                y++;
                break;
            case("Ouest"):
                x--;
                break;
            case("Sud"):
                y--;
                break;
        }
    }
    public void droite(){
        switch (direction)
        {
            case("Est"):
                direction="Sud";
                break;
            case("Nord"):
                direction="Est";
                break;
            case("Ouest"):
                direction="Nord";
                break;
            case("Sud"):
                direction="Ouest";
                break;
        }
    }
    public String toString(){
        return "Robot named " + nom+" in postion (x: "+x+ " , y: "+y+") facing "+direction;
    }
    public Robot(String nom){
        this.nom=nom;
        x=y=0;
        direction="Est";
    }
    public Robot(String nom,String direction,int x,int y){
        this.x=x;
        this.y=y;
        this.nom=nom;
        this.direction=direction;
    }
}
class RobotNG extends Robot{
    RobotNG(String nom,String direction,int x,int y){super(nom,direction,x,y);}
    RobotNG(String nom){super(nom);}
    public void avance(int pas){
        x+=pas;
        y+=pas;
    }
    public void gauche(){
        switch (direction)
        {
            case("Est"):
                direction="Nord";
                break;
            case("Nord"):
                direction="Ouest";
                break;
            case("Ouest"):
                direction="Sud";
                break;
            case("Sud"):
                direction="Est";
                break;
        }

    }
    public void demi_tour(){
        gauche();
        gauche();
    }
}