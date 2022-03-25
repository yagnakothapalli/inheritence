import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GrandDaughter grandDaughter = new GrandDaughter("luthra", "Canada", 654, "running");
        grandDaughter.getAssetValue();

        List<Father> list = givelist();

        for (Father father : list) {
            father.whatToCookForDinner();
        }
    }

    public static List<Father> givelist() {
        ArrayList<Father> l = new ArrayList<>();
        List<Father> list = new ArrayList<>();

        list.add(new Father("luthra", "Canada", 800));
        list.add(new Son("Sharma", "Canada", 654, "reading"));
        list.add(new Daughter("Sharma", "Canada", 654, "reading"));
        return list;
    }
}


//    Father father = new Father("luthra", "Canada", 800);
//         father.whatToCookForDinner();
//
//    father=new
//
//    Daughter("Sharma","Canada",654,"reading");
//         father.whatToCookForDinner();
//
//    father=new
//
//    Son("Sharma","Canada",654,"reading");
//         father.whatToCookForDinner();

