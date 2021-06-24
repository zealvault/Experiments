package exploringEnums;

public class Language {

    private String language;

    public String getLanguage() {
        if(language.equals("sv") || language.equals("en")){
            return language;
        }else{
            return "sv";
        }

    }
}
