import java.util.Scanner;

public class Circle {
    int x;
    int y;
    int r;
    static int count = 1;
    Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
        count++;
    }
    static View comp(Circle circle1, Circle circle2){
        final double dist = Math.sqrt(Math.pow((circle2.x - circle1.x),2) + Math.pow((circle2.y - circle1.y),2));
        if(dist == circle1.r+circle2.r){
            return View.touch;
        }
        if(dist > circle1.r + circle2.r){
            return View.dontIntersect;
        }
        if(dist == 0 & circle1.r == circle2.r){
            return View.coincidence;
        } else if(dist + circle1.r < circle2.r ){
            return View.firstInSecond;
        } else if(dist + circle2.r < circle1.r ){
                return View.secondInFirst;
                    }else if(dist < circle1.r + circle2.r){
                        return View.interTwice;
                        }

        return null;
    }
    public static Circle keybordInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a x: ");
        int x = in.nextInt();
        System.out.print("Input a y: ");
        int y = in.nextInt();
        System.out.print("Input a r: ");
        int r = in.nextInt();

        System.out.println("круг " + Circle.count + " создан");
        return new Circle(x,y,r);
    }
    public static void main(String[] args) {
        Circle O = keybordInput();
        Circle ki = keybordInput();
        System.out.println(comp(O,ki));
        DrawLine.DrawThis(O, ki);
    }
}
enum View {interTwice,coincidence,touch,dontIntersect, firstInSecond,secondInFirst}