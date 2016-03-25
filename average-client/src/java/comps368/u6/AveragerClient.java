package comps368.u6;
import javax.ejb.EJB;

public class AveragerClient {
    @EJB
    private static AveragerRemote averager; 
    public static void main(String[] args) {
        System.out.println(averager.average(1,2,3,4));
    }
}
