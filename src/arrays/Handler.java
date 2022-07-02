package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.jar.Attributes.Name;
import java.util.ArrayList;

public class Handler {

  public static void main(String[] args) {
    // 		String[] names = {"Ivan", "Serg", "Mary", "Mark", "Ann"};
    // 		double[] marks = {10.5, 9.8, 9.5, 10.9, 11.3};
    // 		int[] dates = {28, 1, 2, 8, 4, 23, 29, 17, 20, 11};
    // 		//! index		0 1	 2	3	4	5	6	7
    // 		//todo average & summa of dates
    // 		for (int i = 0; i < dates.length; i++) {		//! i==index	якщо замість і++ написати і = і+2 (або і-2) виведуться тільки парні числа
    // 			System.out.print(dates[i] + " ");
    // 		}
    // 		System.out.println();
    // 		for (int i = dates.length-1; i > -1; i--) {
    // 			System.out.print(dates[i] + " ");
    // 		}
    // 		int sum = 0;
    //		int  maxOfDates = (int)Double.NEGATIVE_INFINITY , minOfDates = (int)Double.POSITIVE_INFINITY;
    // 		for (int i = 0; i < dates.length; i ++){
    // 			sum = sum + dates[i];
    // 		}
    // 		System.out.println("Summa of dates = " + sum);
    // 		double average = (double)sum / dates.length;
    // 		System.out.println("Average = " + average);
    // 		// todo max of dates
    // 		for (int i = 0; i < dates.length; i++){
    // 			if ( dates[i] > maxOfDates & dates[i] % 2 == 0) {
    // 				maxOfDates = dates[i];
    // 			}
    // 			if (dates[i] < minOfDates){
    // 				minOfDates = dates[i];
    // 			}
    // 		}
    // 		System.out.println("Max of paired dates = " + maxOfDates);
    // 		System.out.println("Min of dates = " + minOfDates);
    // 		int[] array1 = {7, 12, 8, 4};
    // 		int[] array2 = {9, 3, 11, 8, 5};
    // 		int[] result = new int[array1.length];
    // 		for (int i = 0; i < array1.length; i++) {
    // 			result[i] = array1[i] + array2[i];
    // 		}
    // 		 for (int i = 0; i <result.length; i++) {
    // 		 	System.out.print(result[i] + " ");
    // 		 }
    // 		System.out.println(Arrays.toString(result));
    // 		//todo Конкатенація двох масивів
    // 		//* 7, 12, 8, 4, 9, 3, 11, 8, 5;
    // 		int[] konktResult = new int[array1.length + array2.length];
    // 		for (int i = 0; i < array1.length; i++) {
    // 			konktResult[i] = array1[i];
    // 		}
    // 		for (int i = 0; i < array2.length; i++) {
    // 			konktResult[i + array1.length] = array2[i];
    // 		}
    // 		System.out.println(Arrays.toString(konktResult));
    //TODO: Поділ масиву цілих чисел на масив з додатніх і від'ємних
    int[] array = { 13, 29, -19, 7, -30, -2, 5, -18 };
    int[] arrayPos, arrayNeg;
    int posCount = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        posCount++;
      }
    }

    arrayPos = new int[posCount];
    arrayNeg = new int[array.length - posCount];
    int posI = 0;
    int negI = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        arrayPos[posI] = array[i];
        posI++;
      }
      if (array[i] < 0) {
        arrayNeg[negI] = array[i];
        negI++;
      }
    }

    System.out.println(Arrays.toString(arrayPos));
    System.out.println(Arrays.toString(arrayNeg));
    // String o = "-";
    // switch ("FRED".toLowerCase().substring(1, 3)) {
    //   case "yellow":
    //     o += "y";
    //   case "red":
    //     o += "r";
    //   case "green":
    //     o += "g";
    // }
    // System.out.println(o);
    ArrayList list = new ArrayList();
  }

}
