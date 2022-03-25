import java.io.File;
import java.util.Locale;

public class ExceptionDemo {
    public static void main(String[] args) {

        ExceptionDemo demo=new ExceptionDemo();
        try {
            demo.checkEligibility();
        } catch (NotEligibleException e) {
            e.printStackTrace();
        }


        Shape shape= new Rectangle();
        ((Rectangle)shape).testing();
        System.out.println("Yagna");
        try{

        }
        catch(ArithmeticException e){
            System.out.println("something wrong happened");
        }
        catch (NumberFormatException e){
            System.out.println("sorry wrong input cant be divided by 0");
        }
        catch (Exception e){
            System.out.println("something wrong happened");
        }
        finally {

        }
        String name="Yagna";
        System.out.println(name.toUpperCase());
    }

    public void checkEligibility() throws NotEligibleException{
        int age=13;
        int weight= 24;
        if(age>25&&weight>45){
            System.out.println("eligible for blood donation");
        }
        else{
            throw new NotEligibleException("not eligible for blood donation");
        }
    }
}
class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}
