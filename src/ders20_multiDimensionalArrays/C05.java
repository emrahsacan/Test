package ders20_multiDimensionalArrays;

public class C05 {
    public static void main(String[] args) {
        int[][] arr={{5,7}, {5, 8, 9},{0,1}};

        // Soru 4- Verilen 2 katli bir array’de bulunan
        // tum sayilarin carpinini bize donduren bir method olusturun.

        System.out.println(elementleriCarp(arr));


    }
    public static int elementleriCarp(int[][] arr){

        int carpim=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim *=arr[i][j];

            }

        }
        return  carpim;
    }


}