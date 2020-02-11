package com.example.testjpa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
//@Table
@Data
@AllArgsConstructor
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
//restcontroller中直接返回entity对象并不能转换为json，需要上面这句
public class Person {
    public Person() {
    }
    public Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;
}
