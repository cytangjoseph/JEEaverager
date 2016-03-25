package comps368.u6;
import javax.ejb.Stateless;

@Stateless
public class Adder implements AdderLocal {

    @Override
    public int add(int... numbers) {
        int total = 0;
        for (int number : numbers){
            total += number;
        }
        return total;
    }
}
