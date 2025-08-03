package com.example;

import org.apache.commons.lang3.StringUtils;

public class TextAnalyzer {
    private final String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public boolean isBlank() {
        return StringUtils.isBlank(text);
    }

    public String reverse() {
        return StringUtils.reverse(text);
    }

    public boolean isNumeric() {
        return StringUtils.isNumeric(text);
    }

    public String capitalize() {
        return StringUtils.capitalize(text);
    }

    public String deleteWhitespace() {
        return StringUtils.deleteWhitespace(text);
    }
}
