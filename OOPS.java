class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Write something");
    }

    public void printColor(){
        System.out.println("Color: " + this.color);
    }

    // default constructor
    Pen() {
        
    }

    // parametrised constructor
    Pen(String a, String b){
        this.color = a;
        this.type = b;
    }
}



public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "ink";

        Pen pen2 = new Pen();
        pen2.color = "blue";
        pen2.type = "ball";

        pen1.printColor();
        pen2.printColor();

        pen1.write();
    }
}
