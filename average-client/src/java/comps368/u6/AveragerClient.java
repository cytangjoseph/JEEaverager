package comps368.u6;
import javax.ejb.EJB;

public class AveragerClient {
    @EJB
    private static AveragerRemote averager;
    //private static AdderRemote addByRemote;
    public static void main(String[] args) {
        //System.out.println("sum is: "+ addByRemote.add(1,2,3,4));
        System.out.println(averager.average(1,2,3,4));
    }
}
