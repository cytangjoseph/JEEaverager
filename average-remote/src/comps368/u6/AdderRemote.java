package comps368.u6;

import javax.ejb.Local;

@Local
public interface AdderRemote {
    int add(int... numbers);
}
