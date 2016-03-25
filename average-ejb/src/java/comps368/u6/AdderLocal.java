package comps368.u6;

import javax.ejb.Local;

@Local
public interface AdderLocal {
    int add(int... numbers);
}
