package codeHighlighter;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class CodeHighlighterSpecs {
    private List<String> keywords = new ArrayList<>();
    Map<String, Style> syntaxHighligherMap = new HashMap<>();
    private CodeHighlighter codeHighlighter;

    @Before
    public void setUp() throws Exception {
        keywords = Arrays.asList("class", "public");
        codeHighlighter = new CodeHighlighter(syntaxHighligherMap);
        syntaxHighligherMap.put("throws", new Style("red"));
        syntaxHighligherMap.put("public", new Style("yellow"));
        syntaxHighligherMap.put("class", new Style("yellow"));
    }

    @Test
    public void highlightClassInYellow() {
        //given
        String input = "class";
        List<String> keywords = Arrays.asList("class");

        String result = codeHighlighter.highlight(input);

        //then
        String expected = "[yellow]class[/yellow]";
        assertEquals(expected, result);
    }

    @Test
    public void highlightPublicInYellow(){
        //given
        String input = "public";

        //when
        String result = codeHighlighter.highlight(input);

        //then
        String expected = "[yellow]public[/yellow]";
        assertEquals(expected, result);
    }

    @Test
    public void highlightThrowWithRedColor() {
        String input = "throws Exception";

        String result = codeHighlighter.highlight(input);

        String expected = "[red]throws[/red] Exception";

        assertEquals(expected, result);
    }

    @Test
    public void highlightThrowWithColorAndBold() {
        String input = "throws Exception";

        String result = codeHighlighter.highlight(input);

        String expected = "[red]throws[/red] Exception";

        assertEquals(expected, result);
    }

}
