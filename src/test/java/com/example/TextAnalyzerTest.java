package com.example;

import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TextAnalyzerTest {
    public void testIsBlank() {
        TextAnalyzer textAnalyzer = new TextAnalyzer("  ");
        assertTrue(textAnalyzer.isBlank());
    }

    public void testIsNumeric() {
        TextAnalyzer textAnalyzer = new TextAnalyzer("123");
        assertTrue(textAnalyzer.isNumeric());
    }

    public void testReverse() {
        TextAnalyzer textAnalyzer = new TextAnalyzer("Hello");
        assertEquals("olleH", textAnalyzer.reverse());
    }

    public void testCapitalize() {
        TextAnalyzer textAnalyzer = new TextAnalyzer("hello");
        assertEquals("Hello", textAnalyzer.capitalize());
    }

    public void testDeleteWhitespace() {
        TextAnalyzer textAnalyzer = new TextAnalyzer("a b c");
        assertEquals("abc", textAnalyzer.deleteWhitespace());

    }
}