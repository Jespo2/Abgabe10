import java.util.ArrayList;
import java.util.List;

public class OrderedSet <T extends Comparable<T>> {
    ArrayList<T> arrayList = new ArrayList<>();

    OrderedSet(){};

    public void print(){
        System.out.println(arrayList);
    }

    public void insert(T type){
        if (arrayList.isEmpty()) {
            arrayList.add(0, type);
        }
        if(!arrayList.contains(type)) {
            for (int i = 0; i < arrayList.size(); i++) { // while schleife weil sonst unendlich

                int e = type.compareTo(arrayList.get(i));
                if (e > 0) {
                    arrayList.add(i, type);

                }
            }

        }else
                System.out.println("hab keine Exception gefunden und wollte keine eigene schreiben , naja deine Zahl gibts auf jeden Fall schon");

    }
    public void remove(T type){

            if (arrayList.contains(type)) {
                arrayList.remove(type);
            }else
                System.out.println("Gibts net");


    }

    public void uniteWith(OrderedSet liste){

    }





    public boolean isSubsetOf(List<T> list){
        return false;
    }

    public boolean isSupersetOf(){return false;}
}
