public class Fan {
    int speed = 1;
    boolean on = false;
    int radius = 5;
    String color = "blue";
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        if (!on)return "fan is off";
        return "fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
class chay{
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setSpeed(2);
        fan2.setColor("yellow");
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setSpeed(2);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
