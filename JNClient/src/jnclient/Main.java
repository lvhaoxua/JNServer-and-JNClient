package jnclient;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a, b;
        Integer c, d, e;
        System.out.print("����IP:");
        a = sc.next();
        System.out.print("����Port:");
        c = sc.nextInt();
        System.out.print("������IP:");
        b = sc.next();
        System.out.print("������Port:");
        d = sc.nextInt();
        System.out.print("��Ҫ������Port:");
        e = sc.nextInt();
        JNClient jnc = new JNClient(a, c, b, d, e);
        jnc.start();
    }

}
