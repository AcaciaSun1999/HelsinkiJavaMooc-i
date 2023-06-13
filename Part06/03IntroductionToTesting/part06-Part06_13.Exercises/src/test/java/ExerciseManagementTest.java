
import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    // @Before
    public void initialize(){
        management = new ExerciseManagement();
    }
    
    @Test
    public void excerciseListIsEmpty(){
       
        assertEquals(0, management.exerciseList().size());
    
    }
    @Test
    public void addingExerciseGrowsListByOne(){
        
         management.add("write a test");
         assertEquals(1, management.exerciseList().size());
    }
     @Test
    public void addedEcerciseIsInList(){
         
         management.add("write a test");
         assertTrue(management.exerciseList().contains("Writea a test"));
    }
    
    @Test
    
    public void exerciseCanBeMarkedACompleted(){
        management.add("new exercise");
        management.markAsCompleted("new exercise");
        assertTrue(management.isCompleted("new exercise"));
    }
    
}