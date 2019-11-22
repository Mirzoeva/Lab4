package lab4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TestData implements Serializable {
    private TestPackage parentPackage;
    private String testName;
    private String actualResult;
    private String rightResult;
    private Object[] parameters;

    @JsonCreator
    public TestEntity(@JsonProperty("testName")String testName,
                      @JsonProperty("rightResult")String rightResult,
                      @JsonProperty("parameters")Object[] parameters){
        this.testName = testName;
        this.rightResult = rightResult;
        this.parameters = parameters;
    }

    public void setActualResult(String actualResult){
        this.actualResult = actualResult;
    }

    public void setParentPackage(TestPackage parentPackage){
        this.parentPackage = parentPackage;
    }

    public String getActualResult(){
        return this.actualResult;
    }

    public TestPackage getParentPackage(){
        return this.parentPackage;
    }

    public  String getTestName(){
        return this.testName;
    }

    public  String getRightResult(){
        return this.rightResult;
    }

    public Object[] getParameters(){
        return this.parameters;
    }



}
