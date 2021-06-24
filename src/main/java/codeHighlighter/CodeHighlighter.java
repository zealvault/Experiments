package codeHighlighter;

import java.util.HashMap;
import java.util.Map;

public class CodeHighlighter {

    private Map<String, Style> keywordStyleMap = new HashMap();

    public CodeHighlighter(Map<String, Style> keywordStyleMap) {
        this.keywordStyleMap = keywordStyleMap;
    }

    public String highlight(String inputCode) {

        StringBuilder builder = new StringBuilder();

        keywordStyleMap.forEach((keyword, style) -> {
            if(inputCode.contains(keyword))
                builder.append(inputCode.replace(keyword, style.tag(keyword)));

        });

        String result = builder.toString();
        return result.length() == 0 ? inputCode : result;
    }

}
