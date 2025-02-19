//the code in this cell is sample code --please edit this to perform as asked in the question


// Class ShapeG is created which implements ShapeY
class ShapeG  implements ShapeY {
 public String base = "This is Shape3";
      public void display1() {
        System.out.println("Circle: " + ShapeX.base); // Prints "This is Shape1"
        System.out.println("Circle: " + ShapeY.base); // Prints "This is Shape2"
    }

    // Overriding method in ShapeY interface
    public void display2() {
        System.out.println("Circle: " + this.base); // Prints "This is Shape3"
        System.out.println("Circle: " + this.base); // Prints "This is Shape3"
    }
}
