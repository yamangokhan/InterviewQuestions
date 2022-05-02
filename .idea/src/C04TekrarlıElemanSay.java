import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static sun.security.jca.ProviderList.newList;

public class C04TekrarlıElemanSay {
    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin

    public static void main(String[] args) {

        List<Integer> newList = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
        List<Integer> bosList = new ArrayList<>();

        System.out.println(newList);
        int sayac = 0;
        for (int i = 0; i < newList.size(); i++) {
            boolean ekliMi = bosList.contains(newList.get(i));
            if (!ekliMi) {
                sayac++;
                newList.add(bosList.get(i));


                System.out.println("tekrar eden rakamlardan " + i + "adedi : " + sayac + " kadardır");

            }


        }
        System.out.println("tekrar eden rakamlardan " + bosList + "adedi : " + sayac + " kadardır");
    }
}
