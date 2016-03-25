package comps368.u6;

import javax.ejb.Remote;

@Remote
public interface AdderRemote {
    int add(int... numbers);
}
