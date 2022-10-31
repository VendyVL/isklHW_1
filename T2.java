// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? 

public class T2 {
    public static int sum2d(String[][] arr){ /*Какие-то проблемы с входным массивом, он трёхмерный или не строковый */
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < 5; j++) { /*выход за границу массива */
                int val = Integer.parseInt(arr[i][j]); /*Строку нельзя преобразовать в целое число */
                sum += val; 
            } 
        } return sum; 
    }

    
}
