package Main;

public class Main {
    public static void main(String[] args) {

        MovablePoint point1 = new MovablePoint(0,0,3,5);
        MovablePoint point2 = new MovablePoint(3,-3,2,6);

        System.out.print("The first point before moveable = ( "+point1.getX()+","+point1.getY()+" ) ");
        point1.moveUp();
        point1.moveRight();
        System.out.println(", and after move right "+point1.getxSpeed()+" and move down "+point1.getySpeed()+ " = ( "+point1.getX()+" , "+point1.getY()+" ) ");
        System.out.println("---------------------------");
        System.out.print("The Second point before moveable = ( "+point2.getX()+","+point2.getY()+" ) ");
        point2.moveDown();
        point2.moveLeft();
        System.out.println(", and after move left "+point2.getxSpeed()+" and move down "+point2.getySpeed()+" = ( "+point2.getX()+" , "+point2.getY()+" ) ");
    }
}