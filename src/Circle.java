import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Circle implements Shape{

    @Override
    public void draw(){
        System.out.println("Hey i can also draw circle");
    }
    public void testing() {
        System.out.println("testing in rectangle");
    }

    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.draw();

//        List<Shape> list=new ArrayList<>();
//         int ar[]={1,55,3,2,77,2};
//        Arrays.sort(ar);
//        System.out.println(Arrays.binarySearch(ar,2));
//        Object[]arr={1,false};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));





    }
}
