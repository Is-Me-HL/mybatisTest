package club.hl.bean;

public class Order {
    private Integer id;

    private String ordername;

    private String ordercode;

    private Integer tabletestid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    public Integer getTabletestid() {
        return tabletestid;
    }

    public void setTabletestid(Integer tabletestid) {
        this.tabletestid = tabletestid;
    }
}