package com.lucasambrosi.server;

public class Main {

    private static final String HOST = "localhost";
    private static final int PORT = 8080;

    public static void main(String[] args) throws Exception {
        new EchoClient(HOST, PORT).start();
    }
}
