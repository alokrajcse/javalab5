//LAB QUESTION2

class Point{

    int xco,yco;


    Point()
    {

        xco=0;
        yco=0;

    }
    void printPoint()
    {
        System.out.println("printPoint method");
    }

}
class Circle extends Point{

int radius;
Circle() 
{

    super();
    radius=0;
}

void printCircle()
{
    System.out.println("print circle method");
}


}
class Cylinder extends Circle{

int height;
Cylinder(){


    super();
    height=0;
}
void printCylinder()
{
    System.out.println("printCylinder method");
}


}

class main{

    public static void main(String[] args) {
        Cylinder c1= new Cylinder();

        c1.printPoint();
        c1.printCircle();
        c1.printCylinder();




    }
}
