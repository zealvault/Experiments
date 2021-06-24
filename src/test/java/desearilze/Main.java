package desearilze;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String json = "{\n" +
                "  \"id\": 1,\n" +
                "  \"name\": \"Vishal\"\n" +
                "}";

        User itemWithOwner = new ObjectMapper().readValue(json, User.class);
        System.out.println(itemWithOwner);
    }
}
