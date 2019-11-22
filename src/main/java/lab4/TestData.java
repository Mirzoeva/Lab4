package lab4;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TestData implements Serializable {
    private TestPackage parentPackage;
    private String testName;
    private String actualResult;
    private String rightresult;
    private Object[] parameters;

    public TestEntity(@JsonProperty("testName")

    )

}
