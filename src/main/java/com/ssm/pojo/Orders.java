package com.ssm.pojo;

public class Orders {
    private Integer oid;
    private String oname;
    private Double price;
    private Integer uid;

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", price=" + price +
                ", uid=" + uid +
                '}';
    }

    public Orders() {
    }

    public Orders(Integer oid, String oname, Double price, Integer uid) {
        this.oid = oid;
        this.oname = oname;
        this.price = price;
        this.uid = uid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
