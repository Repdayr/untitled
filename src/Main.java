import javax.crypto.spec.PSource;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int chint = (int) sc.next().charAt(0);
        if (chint > 96){
            System.out.println((char)(chint - 32));
        } else {
            System.out.println((char)(chint + 32));
        }*/


        int a = sc.nextInt();
        int[][] m = new int[a][a];
        String s = sc.nextLine();
        for (int i = 0; i < a; i++) {
            s = sc.nextLine();
            String[] s1 = s.split(" ");
            for (int j = 0; j < a; j++) {
                m[i][j] = Integer.parseInt(s1[j]);
            }
        }
        int [][] ma = transposeMatrix(m, a, a);
        boolean f = true;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (!Objects.equals(ma[i][j], m[i][j])){
                    f = false;
                    break;
                }
            }
        }
        if (f){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


        /*int a = sc.nextInt();
        int b = sc.nextInt();
        String[][] m = new String[a][b];
        String s = sc.nextLine();
        for (int i = 0; i < a; i++) {
            s = sc.nextLine();
            String[] s1 = s.split(" ");
            for (int j = 0; j < b; j++) {
                m[i][j] = s1[j];
            }
        }
        String[][] ma = new String[b][a];

        for (int j = 0; j < b; j++) {
            String[] l1 = new String[b];
            for (int i = 0; i < a; i++) {
                l1[i] = m[j][i];
            }
            for (int e = 0; e < b; e++) {
                ma[j][e] = l1[e];
            }
        }

        System.out.println("ma = " + ma);

        



        /*int[] l = {200, -5555, 4852, -5555, 15, 78, 65};

        System.out.println(Arrays.toString(minToBegin(l)));*/
    }
    public static int [][] transposeMatrix(int [][] matrix, int width, int height){
        int[][] ma = matrix.clone();
        for (int i = 0; i < width; i++) {
            for (int j = i + 1; j < height; j++) {
                int tmp = ma[i][j];
                ma[i][j] = ma[j][i];
                ma[j][i] = tmp;
            }
        }

        return ma;
    }
    public static void printStringMatrix(String [][] matrix) {
        for (String[] ints : matrix) {
            for (String anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void printIntMatrix(int [][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }


    public static int[] minToBegin(int[] l){
        int n = l.length;
        int mn = l[0];
        for (int j : l) {
            if (j < mn) {
                mn = j;
            }
        }
        boolean f = false;
        int[] anw = new int[n];
        anw[0] = mn;
        int j = 0;

        while (l[j] != mn){
            anw[j + 1] = l[j];
            j++;
        }
        j++;
        while (j < l.length){
            anw[j] = l[j];
            j++;
        }
        /*for (int i = 0; i < n; i++) {
            if (l[i] == mn){
                f = true;
                continue;
            }
            else {
                if(!f){anw[i + 1] = l[i];}
                else {anw[i] = l[i];}

            }
        }*/
        return anw;
    }


    public static int sumOfDigits(int a){
        int s = 0;
        while (a > 0){
            s += a % 10;
            a = a / 10;
        }
        return s;

    }


}






    /*public static String getchar(int a, int index){
        try{ return String.valueOf(String.valueOf(a).toCharArray()[index]);}
        catch (java.lang.ArrayIndexOutOfBoundsException IndexOutOfBoundsException){
            return "0";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float res = (float) a / b;

        if (res == Double.POSITIVE_INFINITY || res == Double.NEGATIVE_INFINITY || res == 0){
            System.out.println("no such x");
        }
        else if (res < 0){
            if (a > b){
                System.out.println("x<"+(float)b/a+" or x>"+(-(float)b/a));
            } else if (a < b) {
                System.out.println((float) a/b+"<x<"+(-(float)b/a));
            }
        } else if (res > 0) {

        }*/




