package parsingJsonString;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParsingDriver {
    public static void main(String[] args) throws IOException {

        String response = new String(Files.readAllBytes(Paths.get("./src/main/resources/MetaDataResponse.json")));
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode root = (objectMapper.readTree(response)).get("properties");

        List<PanelReferenceData> panelReferenceDataList = new ArrayList<>();


        root.fields().forEachRemaining(node -> {
            if(node.getValue().has("enum")){
                PanelReferenceData panelReferenceData = new PanelReferenceData();
                panelReferenceData.setKey(node.getValue().get("label").get("sv").asText());
                panelReferenceData.setReferenceDataList(new ArrayList<>());
                node.getValue().get("options").get("sv").forEach(ref -> {
                    panelReferenceData.addReferenceData(new ReferenceData(ref.get("value").asText(),ref.get("label").asText()));
                });
                panelReferenceDataList.add(panelReferenceData);
            }
        });

        System.out.println(panelReferenceDataList);


    }
}
