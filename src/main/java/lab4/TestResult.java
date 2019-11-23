package lab4;

import java.io.Serializable;

public class TestResult implements Serializable {
    private String actualResult;
    private String rightResult;
    private Boolean succes;



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
