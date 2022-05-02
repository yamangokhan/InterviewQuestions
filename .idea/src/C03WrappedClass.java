public class C03WrappedClass {
    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class: Integer

    // int kabul eden bir metot yarat
    // ve bu int'nin iki katını döndürür
    // bu yöntemi wrapper sınıfıyla overload et : Integer
    public static void main(String[] args) {
        System.out.println(" primitive : " + twice(5));
        Integer sayi = 10;
        System.out.println("Wrapper Class overload :" + twice(sayi));
        twice(5);

    }


    public static int twice (int sayi){
        return sayi*2;
    }
    public static Integer twice (Integer sayi){
        return sayi*2;
    }
}

