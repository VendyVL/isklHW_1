import java.util.Scanner;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class T1 {
    
    public void voi1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("a = ");
        int a = scan.nextInt();
        if (a==0) {System.out.println("Страшная ошибка!!!");}
        else;{
            double x = 10/a;
            System.out.printf("10/a = %d", x);
        scan.close();
        }
    }

    public int voi2(int[]array, int a) {
        if (a > array.length){return -1;}
        if (a< 0){return -2;}
        else; return array[a];
    }

    public int voi3(String [] array, int a){
        int res = Integer.parseInt(array[a]);/*Тут тоже может быть выход за границу массива, а может быть невозможно преобразовать в int только как это проверить?
        про exception вроде было на следующем занятии */
        return res;
    }

    // public static void main(String[] args) {
    //     voi1();
    // }
}
