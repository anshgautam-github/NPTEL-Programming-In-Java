class ShapeG implements ShapeY  {
 @Override
    public void display1() {
        System.out.println("Circle: " + ShapeX.base); // Accessing ShapeX.base explicitly
    }

    // Overriding method in ShapeY interface
    @Override
    public void display2() {
        System.out.println("Circle: " + ShapeY.base); // Accessing ShapeY.base explicitly
    }}
