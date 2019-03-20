package com.ssm.pojo;

public class OrdersUser extends User {
    private Integer oid;
    private String oname;
    private Double price;

    @Override
    public String toString() {
        return "OrdersUser{" +
                super.toString()+
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", price=" + price +
                '}';
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
}
