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

        }else if(!arrayList.contains(type)) {
            int i = 0;
            while(i<arrayList.size()){

                int e = type.compareTo(arrayList.get(i));

                if(e<0){
                    arrayList.add(i,type);
                    break;
                }
                i++;
                if(i==arrayList.size()){
                    arrayList.add(type);
                    break;
                }

            }

        }else
            System.out.println(type + " gibts  schon in der Liste");

    }
    public void remove(T type){

        if (arrayList.contains(type)) {
            arrayList.remove(type);
        }else
            System.out.println("Gibts net");


    }

    public void uniteWith(OrderedSet liste){
        for(int i = 0 ; i < liste.arrayList.size() ; i++){
            
        }
    }





    public boolean isSubsetOf(List<T> list){
        return false;
    }

    public boolean isSupersetOf(){return false;}
}
