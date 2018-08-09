package ua.jvdevpro.smlnk;

import java.io.ByteArrayInputStream;

public class Main {

    public static void main(String[] args) {

        String str = "Hello Serg!";
        byte[] mass = str.getBytes();

        // Создание ByteArrayInputStream;
        ByteArrayInputStream b = new ByteArrayInputStream(mass);

        int c = 0;

        for (; ; ) {
               if (c == -1) {
                break;
            }
            c = b.read(); // Использование стандартного метода InputStream;
            System.out.println((char) c + "  " + c);
        }

    }
}
