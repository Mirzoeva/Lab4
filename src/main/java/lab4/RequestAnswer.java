package lab4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class RequestAnswer implements Serializable {
    private  String packageId;
    private List<TestResult> tests;

    @JsonCreator
    public RequestAnswer(@JsonProperty("packageId") String packageId,
                         @JsonProperty("tests") List<TestResult> tests){
        this.packageId = packageId;
        this.tests = tests;
    }

    public String getPackageId(){
        return  this.packageId;
    }

    public List<TestResult> getTests(){
        return this.tests;
    }

    public void setPackageId(String packageId){
        this.packageId = packageId;
    }

    public void setTests(List)


}
