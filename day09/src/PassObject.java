public class PassObject{
    public void printAreas(Circle c, int time){
        for (int i = 0; i < time; i++) {
            c.radius = i + 1;
            System.out.println("Radius:" + c.radius + '\t' + "Areas: " + c.findArea());
        }
        System.out.println("the new radius is" + time);
    }
}