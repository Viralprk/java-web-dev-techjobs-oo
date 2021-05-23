import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

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
        assertEquals(Job2.getId()-Job1.getId(),1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job jbFields = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        //checking each property of an object set correctly through each object constructor
        assertEquals(jbFields.getName(), "Product tester");
        assertEquals(jbFields.getEmployer().getValue(), "ACME");
        assertEquals(jbFields.getCoreCompetency().getValue(), "Persistence");
        assertEquals(jbFields.getPositionType().getValue(), "Quality control");
        assertEquals(jbFields.getLocation().getValue(), "Desert");

        //checking each property of an object set correctly through each object constructor
        assertTrue(jbFields.getEmployer() instanceof Employer);
        assertTrue(jbFields.getLocation() instanceof Location);
        assertTrue(jbFields.getPositionType() instanceof PositionType);
        assertTrue(jbFields.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job cvsJob1 = new Job("ABC",new Employer("CVS"),new Location("STL"),new PositionType("Pharmacist"),
                new CoreCompetency("chemist"));
        Job cvsJob2 = new Job("ABC",new Employer("CVS"),new Location("STL"),new PositionType("Pharmacist"),
                new CoreCompetency("chemist"));

        //Check if cvsJob1 id is not equal to cvsJob2 id
        assertFalse(cvsJob1.getId() == cvsJob2.getId());

        //Check if same object pass in equal
        assertTrue(cvsJob1.equals(cvsJob1));
        //check if cvsJob1 and cvsJob2 are not same
        assertFalse(cvsJob1.equals(cvsJob2));
    }

    @Test
    public void testNewLines() {
        Job cvsJob1 = new Job("ABC",new Employer("CVS"),
                new Location("STL"),new PositionType("Pharmacist"),
                new CoreCompetency("chemist"));
         assertTrue(cvsJob1.toString().contains("ABC\n"));
         assertTrue(cvsJob1.toString().contains("STL\n"));
    }

    @Test
    public void testEmptyData() {
        //No Employer pass
        Job cvsJob1 = new Job("ABC",new Employer(),
                new Location("STL"),new PositionType("Pharmacist"),
                new CoreCompetency("chemist"));
        assertTrue(cvsJob1.toString().contains("Employer :Data not available\n"));
    }




}
