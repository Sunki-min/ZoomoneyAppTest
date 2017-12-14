package puzzle.zoomoneyapptest.Data;

import java.io.Serializable;

/**
 * Created by simstealer on 2017-12-13.
 */

public class Data implements Serializable{

    public String id;
    public String pw;

    public Data(String account){
        this.id = account;
        this.pw = account;
    }

}
