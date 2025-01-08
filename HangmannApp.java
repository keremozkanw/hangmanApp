package com.hangmanApp;

import java.io.FileNotFoundException;

public class HangmannApp {

    public static void main(String[] args) throws FileNotFoundException {
        GameService gameService = new GameService();
        gameService.start();
    }
}
