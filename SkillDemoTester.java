import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester{
    @Test
    public void testEmailChecker(){
        assertTrue("Checks whether email belongs to student",SkillDemo.emailChecker("njobe@ucsd.edu"));
    }
}
