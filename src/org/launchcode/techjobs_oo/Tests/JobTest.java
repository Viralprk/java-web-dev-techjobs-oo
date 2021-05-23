import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.assertFalse;

public class JobTest {

    Job Job1;
    Job Job2;

    @Before
    public void createJobObject() {
        Job1 = new Job();
        Job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertFalse(Job1.getId() == Job2.getId());
    }

}
