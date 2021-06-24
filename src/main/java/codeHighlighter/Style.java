package codeHighlighter;

public class Style {

    private String color;

    public Style(String color) {
        this.color = color;
    }

    String openTag() {
        return "[" + color + "]";
    }

    String closeTag() {
        return "[/" + color + "]";
    }

    String tag(String keyWord){
        return openTag() + keyWord + closeTag();
    }
}
