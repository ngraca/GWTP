package com.gwtplatform.carstore.shared.domain;

import java.util.Date;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;
import com.gwtplatform.carstore.server.dao.objectify.Deref;

@Index
@Entity
public class CarProperties extends BaseEntity {
    private String someString;
    private Integer someNumber;
    private Date someDate;
    @Load
    private Ref<Car> car;

    public CarProperties() {
        this.someString = "";
        this.someNumber = 0;
        this.someDate = new Date();
    }

    public CarProperties(String someString, Integer someNumber, Date someDate) {
        this.someString = someString;
        this.someNumber = someNumber;
        this.someDate = someDate;
    }

    public Car getCar() {
        return Deref.deref(car);
    }

    public void setCar(Car car) {
        this.car = Ref.create(car);
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public Integer getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(Integer someNumber) {
        this.someNumber = someNumber;
    }

    public Date getSomeDate() {
        return someDate;
    }

    public void setSomeDate(Date someDate) {
        this.someDate = someDate;
    }
}
