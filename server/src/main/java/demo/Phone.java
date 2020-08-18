package demo;

/**
 * Author:BYDylan
 * Date:2020/8/18
 * Description:
 */
public class Phone {
    private String name;//操作系统名
    private String owner;//拥有者
    private int total;//市场占有率

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    public int getTotal() {
        return total;
    }

    void setTotal(int total) {
        this.total = total;
    }
}