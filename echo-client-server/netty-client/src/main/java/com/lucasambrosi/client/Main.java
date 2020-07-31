package com.lucasambrosi.client;

public class Main {

    private static final String HOST = "localhost";
    private static final int PORT = 8080;

    public static void main(String[] args) throws Exception {
        new EchoClient(HOST, PORT).start();
    }
}
