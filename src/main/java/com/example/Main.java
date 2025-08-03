package com.example;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer textAnalyzer = new TextAnalyzer("abcd1432");
        textAnalyzer.isBlank();
        textAnalyzer.reverse();
        textAnalyzer.isNumeric();
        textAnalyzer.capitalize();
        textAnalyzer.deleteWhitespace();
    }
}
