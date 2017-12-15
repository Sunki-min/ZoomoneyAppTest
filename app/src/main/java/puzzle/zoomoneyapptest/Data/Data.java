package puzzle.zoomoneyapptest.Data;

import java.io.Serializable;

/**
 * Created by simstealer on 2017-12-13.
 */

public class Data implements Serializable {

    public String input_first;

    public Data(String account){
        this.input_first = account;
    }

}
