package comps368.u6;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class Averager implements AveragerRemote {
    @EJB
    private AdderLocal adder; //how to access?
    
    @Override
    public double average(int... numbers) {
        int total = adder.add(numbers);
        return (double) total / numbers.length;
    }
}
