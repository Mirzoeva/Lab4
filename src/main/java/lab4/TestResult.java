package lab4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TestResult implements Serializable {
    private String actualResult;
    private String expectedResult;
    private Boolean succes;

    @JsonCreator
    public TestResult(@JsonProperty("expected") String expectedResult,
                      @JsonProperty("actual")String actualResult,
                      @JsonProperty("success") Boolean succes){
        this.expectedResult = expectedResult;
        this.actualResult = actualResult;
        this.succes = succes;
    }

}
