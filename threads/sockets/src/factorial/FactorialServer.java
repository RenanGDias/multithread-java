package factorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) {

        try {
            System.out.println("Waiting for clients...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection established");
            
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Factorial of " + number + " is: " + calculateFactorial(number));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int calculateFactorial(int number) {
        int fact = 1;
        for(int i = 1; i <=number;i++) {
            fact = fact*i;
        }
        return fact;
    }
}
