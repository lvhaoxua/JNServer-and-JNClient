package jnserver;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("��͸�ͻ��˿��ŵ�Port:");
        Integer port = sc.nextInt();
        System.out.println("run...");
        JNServer jns = new JNServer(port);
        jns.start();
    }

}
