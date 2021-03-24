package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void ageAndHeightAllowed() {
        Visitor youngVisitor = new Visitor(14, 170, 50.00);
        assertTrue(rollerCoaster.isAllowedTo(youngVisitor));
    }

//    @Test
//    public void priceForRollerCoaster(Visitor visitor){
//        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.00);
//    }

    @Test
    public void canCharge200cmVisitorsDouble() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.00);
    }


    @Test
    public void priceForTallPeople() {
        Visitor tallVisitor = new Visitor(30, 210, 50.00);
        assertEquals(16.80, rollerCoaster.priceFor(tallVisitor), 0.00);
    }
}