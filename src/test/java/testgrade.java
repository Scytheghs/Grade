import org.junit.Test;
import static org.junit.Assert.*;

public class testgrade {

    grades t = new grades();

    @Test
    public void gradeA(){
        assertEquals("A",t.grade(91));
    }
    @Test
    public void gradeC(){
        assertEquals("C",t.grade(70));
    }
}