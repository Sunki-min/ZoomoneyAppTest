package puzzle.zoomoneyapptest;

/**
 * Created by min on 2018-02-03.
 */

public class list_item {

    private String date;
    private String place;
    private String money;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public list_item(String date, String place, String money) {
        this.date = date;
        this.place = place;
        this.money = money;
    }
}
