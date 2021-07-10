package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SummingDataProvider extends BaseTest{

    @Test(dataProvider = "summingCalcParameters")
    public void firstParameterPlusSecond(long a, long b, long expectedParameter){
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, expectedParameter, "Invalid sum operation");
    }

    @DataProvider(name = "summingCalcParameters")
    public Object[][] parametersForSumming(){
        return new Object[][]{
            {10,10,20},
            {55,60,115},
            {-10,-30,-40}
        };
    }
}