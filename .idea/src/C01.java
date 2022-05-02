import java.util.*;


public class C01 {
//  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(10, 20, 30, 10, 20, 50));
        //System.out.println(arrList); // [10, 20, 30, 10, 20, 50]


        Set<Integer> set = new HashSet<>();
        // System.out.println("set : " + set);

        ArrdenSeteEkle(arrList, set);
        System.out.println("sete ekleme yaptıktan sonra : " + set);

        ///2. bolum

        Set<Character> karakterSet = new HashSet<>();
        System.out.println("karakter set,ne eklendikten sonra : " + karakterSet);
        karakterleriSeteEkle(karakterSet, 'A', 'v', 'c', 'ı');
    }

    public static void ArrdenSeteEkle(ArrayList<Integer> arrList, Set<Integer> set) {
        for (Integer sayi : arrList) {
            set.add(sayi);

        }


    }

    public static void karakterleriSeteEkle(Set<Character> karakterSet, Character ...chars){
        for (int i = 0; i <chars.length ; i++) {
            karakterSet.add((char) i);
        }

        }
    }


