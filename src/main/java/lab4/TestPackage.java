package lab4;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class TestPackage implements Serializable {
    private String packageId;
    private String jsFunctionName;
    private String jsCode;
    private List<TestData> tests;

    public TestPackage(@JsonProperty("packageId") String packageId,
                       @JsonProperty("jsCode") String jsCode,
                       @JsonProperty("jsFunctionName") String jsFunctionName,
                       @JsonProperty("tests") List<TestData> tests){
        this.packageId = packageId;
        this.jsFunctionName = jsFunctionName;
        this.jsCode = jsCode;
        this.tests = tests;
    }

    public String getPackageId(){
        return this.packageId;
    }

    public String getJsFunctionName(){
        return this.jsFunctionName;
    }

    public String getJsCode(){
        return this.jsCode;
    }

    public List<TestData> getTests(){
        return this.tests;
    }

}
