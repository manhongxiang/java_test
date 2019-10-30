package com.number;

public class Decode {
    public static void main(String[] args) {
        String password = RandomString.randomString(3);
        System.out.println(password);
        // method 1
        for (int i = 0; i < RandomString.allChars.length(); i++) {
            for (int j = 0; j < RandomString.allChars.length(); j++) {
                for (int k = 0; k < RandomString.allChars.length(); k++) {
                    char[] pwd = new char[3];
                    pwd[0] = RandomString.allChars.charAt(i);
                    pwd[1] = RandomString.allChars.charAt(j);
                    pwd[2] = RandomString.allChars.charAt(k);
                    String curPwd = new String(pwd);
//                    System.out.println(curPwd);
                    if (password.equals(curPwd)){
                        System.out.printf("password found: %s, ijk:%d %d %d", curPwd, i, j, k);
                    }
                }
            }
        }

        // method 2
//        for ()
    }
}
