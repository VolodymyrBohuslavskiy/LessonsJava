package Test;


import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MAIN {
    static int id = 0;

    public static void main(String[] args) throws IOException {


        TEST user1 = new TEST("Kaka", "Byaka");
        TEST user2 = new TEST("Kakao", "Chokolate");
        TEST user3 = new TEST("Coffe", "Annan");
        TEST user4 = new TEST("Coffe", "Annan");


        int[] arr = {1, 4, 5, 6, 14, 234, 6454, 453232, 45543};
        int[] arr1 = {1, 4};


        System.out.println(Arrays.toString(ololol(ololol(arr, 456), 1)));
        System.out.println(Arrays.toString(ololol(ololol(arr1, 666), 999)));


//Запис

        File file1 = new File("G:\\Project on git\\IdeaProjects\\LessonsJava\\File\\foo.txt");
        if (!file1.exists()) file1.createNewFile();
        FileOutputStream outputStream = new FileOutputStream(file1, true);
        outputStream.write("hjsdkjwehjksawd".getBytes());
        outputStream.close();


//Читання
        File file = new File("G:\\Project on git\\IdeaProjects\\LessonsJava\\File\\foo.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        String s = new String(bytes);
        System.out.println(s);


    }

    private static int[] ololol(int[] arrOld, int r, int q, int w) {
        int[] arrnew = new int[arrOld.length + 3];
        for (int i = 0, arrOldLength = arrOld.length; i < arrOldLength; i++) {
            arrnew[i] = arrOld[i];
        }
        arrnew[arrnew.length - 3] = r;
        arrnew[arrnew.length - 2] = q;
        arrnew[arrnew.length - 1] = w;
        return arrnew;
    }

    private static int[] ololol(int[] arrOld, int r) {
        int[] arrnew = new int[arrOld.length + 1];
        for (int i = 0, arrOldLength = arrOld.length; i < arrOldLength; i++) {
            arrnew[i] = arrOld[i];
        }
        arrnew[arrnew.length - 1] = r;
        return arrnew;
    }


}
