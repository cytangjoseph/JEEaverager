package comps368.u6;
import javax.ejb.Remote;

@Remote
public interface AveragerRemote {
    double average(int... numbers);
}
