import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssignmentTwoTest {

    private AssignmentTwo assingm;
    private int string;

    @org.junit.Before
    public void setUp() throws Exception {
        assingm =new AssignmentTwo();
    }


    @Test
    public void testObjectEquality(){
        String results = assingm.strings("x","x");
        Assert.assertEquals(results,true,true == true);
    }

    private String strings(String x, String x1) {
        return x;
    }

    @Test
    public void testObectIdentity(){
        String results = assingm.strings("xy","yz");
        Assert.assertNotSame(results,true);
    }
    @Test(timeout=1000)
    public void testTimeOut(){
        int results =assingm.stringLenght("String1");
        assertEquals(results,7);}

    private int stringLenght(String string1) {
        return  string;
    }

    @Test
    public void testFail(){
        AssignmentOne test = new AssignmentOne();
        int result = test.calculate(10, 5);
        assertEquals(11, result);
    }
    @Ignore
    @Test
    public void testDisabling(){
        int results = assingm.stringLenght("String1");
        assertEquals(results,0);
    }



//    @org.junit.After
//    public void tearDown() throws Exception {
//    }
//
//    @org.junit.Test
//    public void concatenation() {
//    }
//
//    @org.junit.Test
//    public void stringLenght() {
//    }
//
//    @org.junit.Test
//    public void strings() {
//    }
//

}