package lab4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TestResult implements Serializable {
    private String actualResult;
    private String rightResult;
    private Boolean succes;

    @JsonCreator
    public TestResult(@JsonProperty("right") String rightResult,
                      @JsonProperty("actual")String actualResult,
                      @JsonProperty("success") Boolean succes){
        this.rightResult = rightResult;
        this.actualResult = actualResult;
        this.succes = succes;
    }


    public String getActualResult(){
        return this.actualResult;
    }

    public String getRightResult(){
        return this.rightResult;
    }

    public void setActualResult(String actualResult){
        this.actualResult = actualResult;
    }

    public void setRightResult(String rightResult){
        this.rightResult = rightResult;
    }

    public Boolean getSucces(){
        return this.succes;
    }


}
