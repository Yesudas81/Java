package Demo.com.virtusa;

import java.util.Scanner;

import Demo.com.virtusa.validate.Validate;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String uname=s.next();
        String passwd=s.next();
        Validate.validate(uname, passwd);

    }
}
