package parsingJsonString;

import java.util.List;

public class PanelReferenceData {
    private String key;
    private List<ReferenceData> referenceDataList;
    private List<String> dataType;

    public void setKey(String key) {
        this.key = key;
    }

    public void setReferenceDataList(List<ReferenceData> referenceDataList) {
        this.referenceDataList = referenceDataList;
    }

    public void setDataType(List<String> dataType) {
        this.dataType = dataType;
    }

    public void addReferenceData(ReferenceData referenceData){
        this.referenceDataList.add(referenceData);
    }
}
